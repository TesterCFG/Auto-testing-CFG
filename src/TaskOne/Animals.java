package TaskOne;
public class Animals {
//Створили клас Animals з певними полями
    public String name;
    public int age;
    public String gender;

    public Animals(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void InfoAnimals() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + "Стать:" + gender);
    }
//Створюємо метод який виведе текст
public void makeSound(){
        System.out.println("Some generic animal sound");


    }
}
