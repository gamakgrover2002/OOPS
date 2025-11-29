import Classes.Car;
import Classes.Garage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   Car car1 = new Car("model1","brand1","red",2002,30);
   Car car2 = new Car("model2","brand1","yellow",2005,20);
   Car car3 = new Car("model1","brand2","red",1987,10);
        Garage garage = new Garage("garage1");

        garage.addCar(car1);
        garage.addCar(car2);
        garage.addCar(car3);
        System.out.println(car1.start());
        System.out.println(car1.drive(10));
        System.out.println(car1.stop());
        System.out.println(car1.drive(20));
        garage.listCars();
        System.out.println(garage.removeCar(car2));
        garage.listCars();
        System.out.println(garage.caculateTotalMilage());
        System.out.println(garage.getCarsByBrand("brand1"));



    }
}