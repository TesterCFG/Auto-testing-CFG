import TaskFour.Lambda;
import TaskOne.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      /*  Professor professorAlex = new Professor("Alex ", "Bring", 11);
        professorAlex.mail();

        Professor professorNick = new Professor("Nick ", "Toms", 7);
        professorNick.mail();

        System.out.println(10 / 2);
        String name = "Roma";
        String name2 = name.toUpperCase();
        System.out.println(name2);


        //**Створення class Machinery і наповнення його методами в класі main
        //Створення об'єкту техніка клас Machinery
        Machinery marder = new Machinery();
        marder.type = "Гусинична броня";
        marder.model = "Spartan";
        marder.weight = 40;
        marder.fuelType = "diesel";
        marder.maxSpeed = 65;
        marder.coordinations = new byte[]{24, 35, 20};

        //Створення іншого об'єкту класу Machinery
        Machinery mrap = new Machinery();
        mrap.type = "Колісна броня";
        mrap.model = "Kozak";
        mrap.weight = 18;
        mrap.fuelType = "diesel";
        mrap.maxSpeed = 90;
        mrap.coordinations = new byte[]{20, 40, 20};

        //Використано конструктор для наповнення даними maxxPro з методу fullValue
        Machinery maxxPro = new Machinery();
        maxxPro.fullValue("Колісна броня", "MRAP", 20, "disel", new byte[]{25, 26, 20}, 70);

        //Виведення даних по типах техніки marder
        System.out.println("тип техніки - " + marder.type + "; " + "модель техіки - " + marder.model + "; " + "вага = " + marder.weight + "; " + "тип палива - " + marder.fuelType + "; " + "місце розташування на базі -" + ";");

        //Виведення значень Machinery maxxPro які зеписані через конструктор
        System.out.println(maxxPro.model + " = " + maxxPro.type);

        //Виводимо параметри об'єкту mrap з використанням методу String PrintValue
        System.out.println(mrap.PrintValue());



// *Завдання 1. ООП
        //ЗАВДАННЯ 1.
        // Звертаємося до створеного class Animals
        Animals typeAnimals = new Animals("Killer", 8, "male");
        typeAnimals.name = "tiger";
        typeAnimals.age = 3;
        typeAnimals.gender = "male";

        //Викликаємо мотод makeSound() з класу Animals
        System.out.println("Завдання 1. Виводимо поля і метод з класу Animals" + "\n");
        typeAnimals.makeSound();
        System.out.println("Вид тварини - " + typeAnimals.name + "\n" + "Вік тварини = " + typeAnimals.age + "\n" + "Стать тварини - " + typeAnimals.gender);

        //ЗАВДАННЯ 2.
        // Звертаємося до підкасів Dog і Cat і перевизначаємо makeSound() для кожного індивідуально
        System.out.println("Завдання 2. Звертаємося до Dog і Cat і перевизначаней метод makeSound() викликаємо через Animal[]" + "\n");

        Animals Dog = new Dog("Marfa", 5,"female");
        Animals Cat = new Cat("Sem", 3, "male");

        //Створю масив з індекcом 2 на дві тварини
        Animals[] ArrayAnamals = new Animals[2];
        ArrayAnamals[0] = Dog;
        ArrayAnamals[1] = Cat;
        
        //Додаємо цикл для виведення значень з масиву
        for (Animals animal : ArrayAnamals) {
            animal.makeSound();
        }

        //ЗАВДАННЯ 3.
        // Інкапсуляція. Створи клас Person з приватними полями name і age.
        System.out.println("Створюю клас Person з приватними полями name і age");

        Person person = new Person("Петро", 35);

        //Задаю значення параметру через Setter
        person.setName("Артем");

        //Отримуємо значення поля з класу з модифікатором доступу privat, з зміною параметру
        System.out.println(person.getName() + " віком - " + person.getAge());

        //ЗАВДАННЯ 4.
        // Створи абстрактний клас Shape з методом calculateArea() та полем color
        //Створюємо підкласи Circle і Rectangle в основному класі
        Shape circle = new Circle("Red", 25);
        Shape rectangle = new Rectangle("Green", 25, 40);

        System.out.println(circle);

        //ЗАВДАННЯ 5.
        //Створи інтерфейс Movable з методом move()

        // Додаю об'єкти Car і Bird
        Bird sparrow = new Bird();
        sparrow.move(); //викликаємо метод з класу Bird

        Car ford = new Car();
        ford.move();

        //*Завжання 2. Колекції
        //*/

        List<Lambda.User> users = new ArrayList<>();

        users.add(new Lambda.User("Sara Conor", "sara@gmail.com", true));
        users.add(new Lambda.User("Ira Vituk", null, true));
        users.add(new Lambda.User("Rob Efron", "rob@gmail.com", true));
        users.add(new Lambda.User("Ron Gir", null, false));
        users.add(new Lambda.User("Jon Travolta", "jon@gmail.com", false));
        users.add(new Lambda.User("Sem Escher", null, true));
        users.add(new Lambda.User("Vika Simon", "vika@gmail.com", false));

        List<String> activeEmails = users.stream()
                .filter(user -> user.isActive())                     // тільки активні
                .map(Lambda.User::getEmail)                   // отримуємо email
                .filter(Objects::nonNull)                   // прибираємо null
                .collect(Collectors.toList());

        System.out.println(users);


    }
}