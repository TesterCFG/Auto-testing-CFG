package TaskOne;
public abstract class Shape {

    //Створи абстрактний клас Shape з методом calculateArea() та полем color
    private String color;

    //Конструктор
    public Shape(String color) {
        this.color = color;
    }

    //Реалізація мотоду calculateArea()
    public abstract double calculateArea();

    //Реалізація сеттерів

    public String getColor() {
        return color;
    }
}
