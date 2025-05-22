package TaskThree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        //Тема 2: Обробка винятків (Exceptions)
        System.out.println("Завдання 5: Ділення з обробкою винятку");
        //Завдання 5: Ділення з обробкою винятку
        //Опис:
        //Напиши метод, який ділить два числа. Якщо дільник — 0, виведи повідомлення про помилку, але програма не має завершуватись аварійно.
        //Підказка:
        //Використай try-catch для ArithmeticException.

        try {
            int x = 25 / 0;
        } catch (ArithmeticException er) {
            System.out.println("Помилка валідності виразу: " + er.getMessage());
        } finally {
            System.out.println("Перевірка розрахунку виконана");
        }


        //Завдання 6: Робота з файлами
        System.out.println("Завдання 6: Робота з файлами");
        //Опис:
        //Створи метод, який читає файл з диска (наприклад, через Files.readAllLines). Оброби ситуацію, коли файл не існує або виникає помилка читання.
        //Підказка:
        //IOException — це checked exception. Оброби його через try-catch або додай throws у сигнатуру методу.
        File file = new File("file.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException error) {
            System.out.println("Something went wrong");
            System.out.println(error.getMessage());
        }


        //Завдання 7: Власний виняток
        System.out.println("Завдання 7: Власний виняток");
        // Опис:
        //Створи клас винятку InvalidUserInputException extends Exception. Напиши метод, який приймає вік користувача. Якщо вік < 0 або > 150 — кидай цей виняток.
        //Приклад:
        //if (age < 0 || age > 150) {
        //    throw new InvalidUserInputException("Некоректний вік: " + age);


        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введи значення - вік: ");
            int age = scanner.nextInt();

            // Перевірка на допустимість
            if (age < 0 || age > 150) {
                throw new IllegalArgumentException("Некоректний вік: " + age);
            }

            System.out.println("Вік коректний! " + age);

        } catch (IllegalArgumentException error) {
            System.out.println("Помилка вводу даних: " + error.getMessage());
        } catch (Exception err) {
            System.out.println("Iнша непередбачувана помилка: " + err.getMessage());
        }


        //Завдання 8: Гарантований блок finally
        //Опис:
        //Напиши метод, який відкриває ресурс (наприклад, виводить "Ресурс відкрито"), потім у try блоку симулює помилку, а у finally завжди виконує "Ресурс закрито".
        //Підказка:
        //Навіть якщо в try виник виняток, блок finally виконується завжди.

        String passwor = "Qwerty1234";
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Введи пароль облікового запису для отримання доступу до станні:");
            String resalt = input.nextLine();

            //Перевірка валідності варолю
            if (!resalt.equals(passwor)){
                throw new IllegalArgumentException("Пароль невірний!");

            }

            System.out.println("Ресурс відкрито!");

        } catch (IllegalArgumentException error2) {
            System.out.println("Помилка вводу password: " + error2.getMessage());
        } finally {
            // Цей блок виконується завжди — навіть якщо помилка
            System.out.println("Ресурс закрито! (finally)");
        }



    }
}
