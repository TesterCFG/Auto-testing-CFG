package TaskOne;
public class Rectangle extends Shape{
private double sizeX;
private double sizeY;


    public Rectangle(String color, float sizeX, float sizeY) {
        super(color);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    @Override
    public double calculateArea() {
        return sizeX * sizeY;
    }
}
