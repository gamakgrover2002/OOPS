package Classes;

public class Rectangle extends Shape{
    float length, breadth;
    public Rectangle(float length,float breadth) {
        super.say();
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public int sideCount() {
        return 4;
    }

    @Override
    public  float calculateArea() {
        return this.length*this.breadth;
    }

    @Override
    public float calculatePerimeter() {
        return 2*(this.length+this.breadth);

    }
}
