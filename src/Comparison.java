import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        //Порівняння рядків за змістом
        String s1  = "Привіт!";
        String s2 = "ПРИВІТ!";
        String s3 = s1.toUpperCase();

        System.out.println("s1.equals(s2), отримуємо різні");
        System.out.println(s1.equals(s2));
        System.out.println("s1.equals(s3), отримуємо різні");
        System.out.println(s1.equals(s3));
        System.out.println("s2.equals(s3), отримуємо одинакові але адреси різні");
        System.out.println(s2.equals(s3));

        //зчитує з клавіатури два рядки й видає повідомлення щодо того, чи однакові ці рядки.
        System.out.println("Внеси два рядки з значеннями типу рядок");
        Scanner word = new Scanner(System.in);
        String word1 = word.nextLine();
        String word2 = word.nextLine();
        System.out.println("Результат відповідності при співставленні:");
        if (word1.equals(word2)) {
            //напишіть тут ваш код
            System.out.println("рядки однакові");
        }else{
            //напишіть тут ваш код
            System.out.println("рядки різні");
        }


        //Порівняння рядків без урахування регістру
        System.out.println("Порівняння двох однакових значень за допомогою equalsIgnoreCase");
        String si1 = "Привіт";
        String si2 = "ПРИВІТ";
        String si3 = s1.toUpperCase();

        System.out.println("Порівняння значень без урахування регістрів si1 = si2");
        System.out.println(si1.equalsIgnoreCase(si2));
        System.out.println("Порівняння значень коли si3 = + toUpperCase.si1 змінено на великі регістри, якщо si1=si3");
        System.out.println(si1.equalsIgnoreCase(si3));
        System.out.println("Порівняння значень коли всі регістри великі, та коли si3 = + toUpperCase.si1 змінено на великі регістри, якщо si2=si3");
        System.out.println(si2.equalsIgnoreCase(si3));

        //Перевірка значення при введенні
        System.out.println("Введення пароль для розблокування доступу, ігнорує верхні регістри (пароль = Qwerty123)");
        System.out.println("Веди пароль:");
        String secretKey = "Qwerty123";

        Scanner password = new Scanner(System.in);
        String savePas = password.nextLine();
        if (secretKey.equalsIgnoreCase(savePas)) {
            System.out.println("Доступ дозволено, пароль вірний");
        } else {
            System.out.println("В доступі відмовлено!");
        }

    }
}
