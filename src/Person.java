public class Person {

//Створив клас Person з приватними полями name і age.
     private String name;
    private int age;

    //Створив конструктор для класу
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }


    //Викликаю геттер для поля age
    public int getAge() {
        return age;

    }

    public String getName() {
        return name;
    }
    //Викликаю сеттер для поля name
    public void setName(String name) {
        this.name = name;
    }
}
