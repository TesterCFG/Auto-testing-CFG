package TaskThree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        //Завдання 1: Пошук і виділення
        System.out.println("Завдання 1: Пошук і виділення");
        //Опис:
        //Напиши метод, який отримує рядок у форматі:
        //"Name: John, Age: 25, City: Vienna"
        //і повертає окремо:
        //Name: John
        //Age: 25
        //City: Vienna
        //Підказка:
        //Використай методи substring, indexOf.
        StringBuilder data = new StringBuilder("Name: John, Age: 25, City: Vienna");
        String step1 = data.substring(0, 9);
        System.out.println("За допомогою substring який повертає підрядок, визначений інтервалом, виводим значення;" + "\n");
        System.out.println(step1);

        String step2 = data.substring(12, 19);
        System.out.println("За допомогою substring який повертає підрядок, визначений інтервалом, виводим значення частига друга;" + "\n");
        System.out.println(step2);

        String step3 = data.substring(21, 33);
        System.out.println("За допомогою substring який повертає підрядок, визначений інтервалом, виводим значення частига третя;" + "\n");
        System.out.println(step3);


        //Використовуємо для розбиття рядка на масив рядків метод split(String regex) Як роздільник виступає рядкове регулярне вираз regex
        String[] transformData = data.toString().split(", ");
        for (String step : transformData) {
            System.out.println("Рядок розбили на підрядки за допомогою методу split(String regex):" + step);
        }

        //Ормаємо інекс по значенню
        int pos = data.indexOf("Name");
        System.out.println(pos);

        //Завдання 2: Перевірка на ключове слово
        System.out.println("Завдання 2: Перевірка на ключове слово");
        //Опис:
        //Реалізуй метод, який перевіряє, чи містить рядок слово "error" (без урахування регістру).
        //Приклад:
        //containsError("Critical ERROR occurred"); // true
        //Підказка:
        //toLowerCase(), contains().
        System.out.println("Внеси слово ERROR");
        Scanner someScan = new Scanner(System.in);
        String word = someScan.nextLine();
        boolean result1 = word.contains("ERROR");
        boolean result2 = word.equalsIgnoreCase("ERROR");
        System.out.println("Перевірки на наявність значення ERROR у виразі враховуючи регістри (contains) = " + result1);
        System.out.println("Перевірки на наявність значення ERROR у виразі не враховуючи регістри (word.equalsIgnoreCase) = " + result2);


        //Завдання 3: Цензурування
        System.out.println("3: Цензурування");
        //Опис:
        //Напиши метод, який замінює всі слова зі списку на "***".
        //Вхідні дані:
        //String input = "This is a damn bad idea!";
        //List<String> badWords = Arrays.asList("damn", "bad");
        //Результат:
        //"This is a *** *** idea!"
        //Підказка:
        //replace() або replaceAll().
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();
        System.out.println("Введе довільний текст але врахуй що слова \"damn\", \"bad\" цензуруються:");
        List<String> badWords = Arrays.asList("damn", "bad");

        for (String word1 : badWords) {
            if (path.contains(word1)) {
                path = path.replace(word1, "***");
            }
        }

        System.out.println(path);


        //Завдання 4: Побудова великого рядка
        System.out.println("Завдання 4: Побудова великого рядка");
        //Опис:
        //Згенеруй 1000 рядків:
        //Line 1
        //Line 2
        //...
        //Line 1000
        //•	Спочатку реалізуй з використанням оператора +

        System.out.println("Реалізація з використанням оператора");
        String someSentences = "";
        for (int i = 1; i <= 1000; i++) {
         someSentences = someSentences + "Line " + i + "\n";
        }
        System.out.println(someSentences);

        //•	Потім реалізуй через StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 1000; i++) {
            stringBuilder.append("Line ");
            stringBuilder.append(i);
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);

        //•	Поясни, чому StringBuilder ефективніший

      //  String s = null;
      //  System.out.println(s.toString());
    }

}
