package TaskOne;
public class Dog extends Animals{
//Створили підклас Dog


    //Викликали в підклас конструктор з Animals
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
 }
    @Override
    public void makeSound() {
        System.out.println("WOOF");
    }
}
