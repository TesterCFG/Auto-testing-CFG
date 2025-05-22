package TaskOne;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Розробляємо функціонал розрахунку даних");
        System.out.println("Внеси числове значення для розрахунку:");
        Scanner dataUser = new Scanner (System.in);
        double number, number2, rezult;

        //зчитуємо дані внесені користувачем
        number = dataUser.nextDouble();
        //Додаємо обмеження на розмір числа
        if (number < 0 || number > 1000) {
            System.out.println("Число повинно бути в межах від 0 до 1000. Програма завершена.");
            return;
        }
        //Вводимо операцію для обчислень
        System.out.println("Введіть операцію для обчислень (+,-,*,/)");
        char operation = dataUser.next().charAt(0);

        System.out.println("Введіть друге значення для розрахунку:");
        number2 = dataUser.nextDouble();
        //Додаємо обмеження на розмір числа
        if (number < 0 || number > 1000) {
            System.out.println("Число повинно бути в межах від 0 до 1000. Програма завершена.");
            return;
        }


        //Видаємо результат обчислень за умовою +
        if (operation == '+') {
            rezult = number + number2;
            System.out.println("Результат ваших обчислень " + number + " + " + number2 + " = " + rezult);
        } else if (operation == '-') {
            rezult = number - number2;
            System.out.println("Результат ваших обчислень " + number + " - " + number2 + " = " + rezult);
        } else if (operation == '*') {
            rezult = number * number2;
            System.out.println("Результат ваших обчислень " + number + " * " + number2 + " = " + rezult);
        } else if (operation == '/') {
            rezult = number / number2;
            System.out.println("Результат ваших обчислень " + number + " / " + number2 + " = " + rezult);
        } else {
            System.out.println("Дану операцію не підтримується в калькуляторі");
        }


    }
}
