import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
     /*   //Перевірка циклом while виконання умови
        System.out.println("Внеси своє ключове слово:");
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit)
        {
            String s = console.nextLine();
            System.out.println("Словом для зупинки циклу є stop, цикл завершено");
            isExit = s.equals("stop");
        }



        //Запуск безкінечного циклу який виводить значення задане
        while (true)
            System.out.println("Слава Україні! Синам її слава!");

        //Умова дозволяє введення доки вводяться саме значення типу = число
        System.out.println("Введи довільне число, цикл буде нескінченний доки введення значення = число");
        Scanner console = new Scanner(System.in);
        while(console.hasNextInt()) {
            int x = console.nextInt();
        }

        //Вивід довільного речення 100 разів
        String quote = "Я ніколи не працюватиму за дрібняки друже, цінуй свій час!";
        //напишіть тут ваш код
        int n = 1;
        while (n <= 100){
            System.out.println(quote);
            n++;
        }


        //Вводимо ім'я і виводимо з іменим тест 10 разів
        String text = " любить мене❦";
        //напишіть тут ваш код
        System.out.println("Введи своє ім'я любчику ↓");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int i = 1;
        System.out.println("Виводимо результат з введеним ім'ям");
        while (i <=10){
            System.out.println(name + text);
            i++;
        }

        //Розробка функціоналу сумування, що сумуватиме внесені значення поки не буде використано кодове слово DONE
        System.out.println("Реалізовано функціоналу сумування, що сумуватиме внесені значення поки не буде використано кодове слово DONE");
        System.out.println("Друже внеси довільну кількість числових значень та підтверди внесення словом DONE");
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean isExit = false; // умова виходу з циклу
        while (!isExit) { //*Цикл працює, поки isExit дорівнює false, тобто поки не отримано команду завершити введення.
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;
            } else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();//перевіряєм цим чи є ще введення у вигляді рядка, це дозволяє обробляти текст, наприклад "DONE".
                if (line.equals("DONE")) {
                    isExit = true;
                }
            }
        }
        System.out.println("Сумма введених числ:");
        System.out.println(sum);

//Цикли, виведення значення 4 рази в один рядок
        System.out.println("В одному рядку буде виведено текст 4 рази:");
        int w = 0;
        while (w < 4)
        {
            System.out.print("Дякую за все!");
            w++;
        }
*/
        //Виводимо масив значень 10*10, і нумераці масиві від 1 до 100
        System.out.println("Виводимо масив 10*10, з нумерацією від 1 до 100");
        int n = 0;
        int q = 1;
        //Зовнішній цикл для підрахунку кількості витків циклу.
        while (n < 10)
        {int m = 0;
            //Внутрішній цикл для підрахунку кількості витків циклу в ньому використовується змінна.
            while (m < 10)
            { System.out.print(q++);
                m++; }

            System.out.println();
            n++; }

        //Вимальовуємо квадрат 20*10 а в середині пустий
        int height = 1;
        while (height <= 10) {
            int width = 1;
            int number = 1;
            while (width <= 20) {
                if (height == 1 || height == 10) {
                    System.out.print('0');
                } else if (width == 1 || width == 20) {
                    System.out.print('0');
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }

        //Завершення циклу через break
        System.out.println("Введи довільне текстове значення:");
        Scanner cons = new Scanner (System.in);
        System.out.println("Ввід буде зупинено введенням слова = STOP");
        while (true)
        { String value = cons.nextLine();
            if (value.equalsIgnoreCase("STOP")) {
                break;
            }
        }


        //Виводить суму всіх чисел від одного до 100
        int sum = 0;
        int number = 0;
        while (number <= 100) {
            if (number % 3 == 0) {
                number++;
                continue;
            }
            sum = sum + number;
            number++;
        }
        System.out.println(sum);

        Scanner console = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            int tmp = console.nextInt();
            if (tmp < min) {
                secondMin = min;
                min = tmp;
            } else if (tmp > min && tmp < secondMin) {
                secondMin = tmp;
            }
        }

        System.out.println(secondMin);


        //Цикл for обчислює суму всіх чисел від 0 до 100, які не діляться на 3. Тобто виключає: 0, 3, 6, 9, ...
        System.out.println("Виводить з використанням циклу for числа від 3 до 0, з декріменту");
        for (int i = 3; i >= 0; i--)
        {
            System.out.println(i);
        }


        //Виконання циклу доку не внесеться слово зупинки циклу
        System.out.println("Внеси слово або речення:");
        Scanner console1 = new Scanner(System.in);
        for (boolean isExit = false; !isExit; )
        {
            String s = console1.nextLine();
            System.out.println("Щоб завершити введення внеси слово exit");
            isExit = s.equals("exit");
        }


        for (int i = 2; i < 15; i = i + 2) {
            System.out.println(i);
        }

        //малюємо на екрані трикутник, у першому рядку виводить 10 зірочок, у другому — 9 зірочок, потім 8....
        for (int i = 0; i < 10; i++)
        {
            int starCount = 10 - i;
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            System.out.println();
        }

//Вносимо числа, доки не зупинемо цикл словом exit
        Scanner consol = new Scanner(System.in);
        String s;
        do
        {
            s = consol.nextLine();
        }
        while (!s.equals("exit"));

    }

}



