package TaskOne;

public class Bird implements Movable {
    public Bird() {
        String state = "alive";
    }

    @Override
    public String toString() {
        return "Bird{}";
    }

    @Override
    public void move() {
        System.out.println("A bird is a living being, a mammal");
    }

}
