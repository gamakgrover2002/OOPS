package Classes;

import java.awt.*;

public abstract class Shape{

     void say(){
         System.out.println("Parent Class of Shapes");
     }

    abstract  int sideCount();
    abstract float calculateArea();
    abstract float calculatePerimeter();

}
