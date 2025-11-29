package Classes;

public class Car {
     private String brand,model, color;
     private int year;
     private float mileage,distance;
     private boolean isRunning;

     public Car(String model,String brand,String color,int year,float mileage){
         this.brand = brand;
         this.model = model;
         this.color = color;
         this.year = year;
         this.distance = 0;
         this.mileage = mileage;
         this.isRunning = false;
     }

     public String  stop(){
        this.isRunning = false;
        return "this car has stopped running";

     }

     public String start(){
         this.isRunning = true;
         return "this car is now start";
     }
     public String drive(int distanceCovered){
         if(this.isRunning){
         this.distance += distanceCovered;
         return  "you have covered " + distanceCovered+ " km of distance";}
         return "Start the car first";

     }
     public String getDetails(){
         return "brand: " + this.brand+" model: "+ this.model +" color: "+ this.color +" mileage: "+ this.mileage+" year: "+ this.year+" distance: "+ this.distance;
     }
     public  String getModel(){
         return  this.model;
     }
     public float getMileage(){
         return this.mileage;
     }

    public String getBrand() {
        return this.brand;
    }
}
