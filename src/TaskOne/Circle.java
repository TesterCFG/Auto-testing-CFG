package TaskOne;

public class Circle extends Shape {
   private double radius;


   //Виклик конструктора від наслідуваного класу
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " Area is " + calculateArea() +
                '}';
    }
}
