package Classes;



public class Square extends Shape {
    float side;
    public Square(float side){
        this.side = side;
    }




    @Override
    public int sideCount() {
        return 4;
    }

    @Override
    public float calculateArea() {
    return this.side*this.side;
    }

    @Override
    public float calculatePerimeter() {
        return 4*this.side;
    }
}