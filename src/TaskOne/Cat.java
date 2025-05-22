package TaskOne;
public class Cat extends Animals{
//Створили підклас Cat

    //Викликали в підклас конструктор з Animals
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void makeSound() {
        System.out.println("Meowe!");
    }
}
