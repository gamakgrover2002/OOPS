package Classes;

import java.util.ArrayList;

public class Garage {
String name;
ArrayList<Car> carList;

public Garage(String name){
     this.name = name;
     this.carList = new ArrayList<>();
 }

 public String addCar(Car car){
     carList.add(car);
     return "Car has been added";
 }
 public String removeCar(Car car){
   carList.remove(car);
   return "Car has been removed";
 }
 Car findCar(String model){
    for(Car carAvailable: carList){
        if(carAvailable.getModel().equals(model)){
            return carAvailable;

        }

    }
    return null;
 }

 public void listCars(){
    System.out.println("Cars in the garage are:");
     for(Car car: carList){
         System.out.println(car.getDetails());
     }
 }
public  float caculateTotalMilage(){
     float totalMileage = 0;
     for(Car car: carList){
         totalMileage+= car.getMileage();
     }
     return totalMileage;
 }
 public int getCarsByBrand(String brand){
     int count = 0;
     for(Car car: carList){
         if(car.getBrand().equals(brand)){
          count++;
         }
     }
     return count;
 }





}
