import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {

            //Виводимо в консоль значення
        Scanner scanner = new Scanner("Немає поля, то буде воля.\n" +
                "Немає пари, то будуть хмари.\n" +
                "В цьому, напевно, правда пташина\n" +
                "А як же людина? А що ж людина?\n" +
                "Живе на землі. Сама не літає.\n" +
                "А крила має. А крила має!");
            String s = scanner.nextLine();
            System.out.println(s);
            s = scanner.nextLine();
            System.out.println(s);
            s = scanner.nextLine();
            System.out.println(s);
            s = scanner.nextLine();
            System.out.println(s);

            //Використовуємо клас Scanner для введення з консолі
            Scanner version2 = new Scanner(System.in);
            System.out.println("Введи число");
            int number = version2.nextInt(); // - команда сканує і повертає число що ми внесемо завідомо кроком раніше
            System.out.println("Твоє число = " + number);

        //Використовуємо клас Scanner та перевіряємо тип введеного значення
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число");


        System.out.println("Виконуємо введення за допомогою Scanner  і додаємо умову на тип даних");
        //Умова перевірки на тип внесених даних
        if (sc.hasNextInt()) {
            int number3 = sc.nextInt();
            System.out.println("Введене число =" + number3);
        }else {
            System.out.println("То явно не число!");
        }
    }
}
