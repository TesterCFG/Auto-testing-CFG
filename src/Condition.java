import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        //Перевірку віку відвідувача
        System.out.println("Виконуємо перевірку користувача на повноліття 18+ для доступу на ресур");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи свій вік");
        //Умова перевірки на вік
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Доступ дозволено юначе/дівице:)");
        }else {
            System.out.println("В доступі відмовлено, підрости ще трошки і не ображайся!");
        }


        //Перевірка температури
        System.out.println("Індикатор температури");
        Scanner temp = new Scanner(System.in);
        System.out.println("Введи поточну температуру С");
        int comfTemp = 10;
        //Умова перевірки на допустимої температури в теплиці
        int outTemp = temp.nextInt();
        if (outTemp < comfTemp) {
            System.out.println("температура критична і нижча за min дозволену)");
        }else {
            System.out.println("Температура в межах дозволеного");
        }

        //Умова віку для призову
        System.out.println("Виконуємо перевірку призовника до служби і оновлюємо дані, для категорії 18-26 років");
        String militaryCommissar = ", з'явіться до військомату";
        Scanner scannername = new Scanner(System.in);
        System.out.println("Введи своє ім'я призовник");
        String name = scannername.nextLine();
        Scanner scannerage = new Scanner(System.in);
        System.out.println("Введи свій вік");
        //Умова перевірки на вік
        int agev2 = scannerage.nextInt();
        if (agev2 >= 18 && age <= 26) {
            System.out.println(name + militaryCommissar);
        }else {
            System.out.println("Не годиться");
            System.out.println("Ти ще дитина");//напишіть тут ваш код
        }


        int temperature = 9;

        if (temperature > 20)
            System.out.println("одягти сорочку");
        else // тут температура не вища за 20
            if (temperature > 10)
                System.out.println("одягти светр");
            else // тут температура не вища за 10
                if (temperature > 0)
                    System.out.println("одягти плащ");
                else // тут температура менша за 0
                    System.out.println("одягти пальто");


                //Перевірка умови на більше значення
        System.out.println("Веди своє ромдомне число, версія A");
        Scanner console = new Scanner(System.in);  // створюємо об'єкт Scanner
        int a = console.nextInt();  // зчитуємо з клавіатури перше число
        System.out.println("Повтори введення іншого ромдомного числа вверсівя В");
        int b = console.nextInt();  // зчитуємо з клавіатури друге число
        if (a < b)                   // якщо a менше за b
            System.out.println("виводимо значення числа А як меншого до числа В, оскільки А=" + a);
        else                         // інакше
            System.out.println("виводимо значення числа В як більшого до числа А, оскільки В=" + b);


        //Дослідження типу boolean
        int step1 = 236;
        int step2 = 550;
        boolean step3 = (step1 > step2);

        boolean isHigh;
        boolean isLow;
        System.out.println("Отримання поточної температури тілав грідусас С");
            Scanner scanner = new Scanner(System.in);
            double bodyTemperature = scanner.nextDouble();
            isHigh = bodyTemperature > 36.8;
            isLow = bodyTemperature < 36.2;
            if (isHigh) {
                System.out.println("температура тіла висока, Вам необхідна консультація лікаря");
            } else if (isLow) {
                System.out.println("температура тіла низька");
            } else {
                System.out.println("температура тіла нормальна");
            }

        //Виводить однакові значення якщо вони повторюються у випадку з трьох введень
        System.out.println("Введи три довільні числа, програма виводить однакові значення якщо вони повторюються у серед введених");
        Scanner scannerV2 = new Scanner(System.in);
        int number1 = scannerV2.nextInt();
        int number2 = scannerV2.nextInt();
        int number3 = scannerV2.nextInt();

        if (number1 == number2) {
            if (number1 == number3) {
                System.out.println(number1 + " " + number2 + " " + number3);
            } else {
                System.out.println(number1 + " " + number2);
            }
        } else if (number1 == number3) {
            System.out.println(number1 + " " + number3);
        } else if (number2 == number3) {
            System.out.println(number2 + " " + number3);
        }


//Конвертація швидкості вітру з м/с в км/в год
        System.out.println("Введи значення швидкості вітру в м/с");
        Scanner scanSpeed = new Scanner(System.in);
        double speedInMetersPerSecond = scanSpeed.nextInt();
        int speedInKilometersPerHour = (int) Math.round(speedInMetersPerSecond * 3.6);
        System.out.println("Швидкість вітру перевдоно з м/с в км/год згідно конвертації = " + speedInKilometersPerHour +" якщо 1 м/с = 3,6 км/год");
        System.out.println(speedInKilometersPerHour);


        //Тест на оптиміста/писимввіста
        System.out.println("Введи значення boolean для щоб зрозуміти чи стакан на половину повний чи на половину пустий1");
        double glass = 0.5;
        Scanner scann = new Scanner(System.in);
        boolean isOptimist = scann.nextBoolean();
        int result;
        if (isOptimist) {
            result = (int) Math.ceil(glass);
        } else {
            result = (int) Math.floor(glass);
        }
        System.out.println(result);
    }

}


