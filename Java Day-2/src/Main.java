
import Classes.Rectangle;
import Classes.Square;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangle rc = new Rectangle(1.6f,2.4f);
        Square sq = new Square(2.5f);
        System.out.println(sq);
        System.out.println(rc.calculateArea());
        System.out.println(rc.calculatePerimeter());
        System.out.println(rc.sideCount());
        System.out.println(sq.calculateArea());
        System.out.println(sq.calculatePerimeter());
        System.out.println(sq.sideCount());



    }
}