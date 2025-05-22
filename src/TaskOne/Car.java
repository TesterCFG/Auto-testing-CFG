package TaskOne;

public class Car implements Movable{
    @Override
    public String toString() {
        return "Car{}";
    }

    @Override
    public void move() {
        System.out.println("A car is a vehicle that moves due to an engine");

    }
}
