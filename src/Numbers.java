import java.sql.SQLOutput;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int x = 500;
        int y = 350;
        int z = 12;

        //Оголошення константи
        final double pi = 3.14;
        System.out.println(pi);
        //Арифметичні розрахунки
        //Ділення
        int division = x / z;
        System.out.println("Проведено дію ділення Х 500/Z 12 і отримуємо результат" + " " + division);

        //Множення і дія додавання
        int multiplication = y * z + 200;
        System.out.println(("Виконано дію множення y*z і тримали" + " " + multiplication));

        //Дія додавання
        int sum = x + y + z;
        System.out.println("(x=500, y=350, z=12) В результат додавання отримаємо результат x + y + z" + " " + sum);

        //Залишок від ділення

        int fraction = y % 15;
        System.out.println("Виводимо залишок ділення від /y % 15/" + " = " + fraction);

        //Визначення рівності
        boolean less = x <= y;
        System.out.println("Чи x =< y ? Відповідь = " + less);

        boolean equality = x == y;
        System.out.println("Чи дорівнює значення x = y ? Відповідь = " + equality);


        //Переприсвоєння значення
        int change = x = y;
        System.out.println("Переприсвоїли x = y і х=" + change);

        //Регістри ВЕЛИКІ
        System.out.println(("виведення напису регістрами великих літер".toUpperCase()));

        //Регістри малі
        System.out.println(("ВИВЕДЕННЯ НАПИСУ РЕГІСТРАМИ МАЛИХ ЛІТЕР".toLowerCase()));

        // Інкрімент постфікс
        System.out.println("Декрімент-Інкрімент");
        int w = 999;
        w++;
        System.out.println("Збільшено значення постфіксом на +1 = " + w);
        //Префікс
        ++w;
        int v = w;
        System.out.println("Збільшено значення префіксом на +1 = " + v);

//Декрімент
        w--;
        System.out.println("Зменшення значення w на -1 і =" + w);

        //Комбіновані операції
        System.out.println("комбіновані операції".toUpperCase());

        //Оператори комріновані, присвоєння
        int r = 999;
        int s = 33;

        r += s;
        System.out.println("Операнотор присвоєння з сумою, r+s=" + r);

        s -= r;
        System.out.println("Операнотор присвоєння з різницею, s-r=" + s);

        //Логічні оператори
        //"!" оператор не
        boolean t = false;
        System.out.println("(Використовуємо оператор !)Чи є шанс українцям роздовбати москаля? Відповідь:" + !t);

        //оператор "&&"
        System.out.println("Оператором & перевіряємо чи обидва операнда істина 100 > 10 && 100 > 200 =" + (100 > 10 && 100 > 200));
        System.out.println("Оператором & перевіряємо чи обидва операнда істина 100 > 50 && 100 >= 100 =" + (100 > 50 && 100 >= 100));

        //оператор "||"
        System.out.println("Оператором || перевіряємо чи обидва операнда істина 100 > 50 || 100 >= 100 =" + (100 > 50 || 100 <= 100));


        //Перевірка існування трикутника за умови = Якщо в кожному порівнянні сторона менше суми двох інших, то трикутник із такими сторонами існує.
        //Якщо принаймні в одному випадку порівняння одна сторона виявиться більшою за суму двох інших або дорівнюватиме їй, то трикутника з такими сторонами не існує.
        System.out.println("Внеси три значення сторін трикутника");
        String TRIANGLE_EXISTS = "трикутник існує";
        String TRIANGLE_NOT_EXISTS = "трикутник не існує";
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        if ((sideA < sideB + sideC) && (sideB < sideC + sideA) && (sideC < sideA + sideB)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }

        //Оператори порівння
        System.out.println("Якщо значення age лежить у межах від 18 до 65 тоді:");
        int age = 35;
        if (age >= 18 && age <= 65)
            System.out.println("Ви можете працювати");

        //Виведення номера координатної чверті згідно внесених координат
        Scanner sca = new Scanner(System.in);
        int xx = sca.nextInt();
        int yy = sca.nextInt();
        if (xx > 0 && yy > 0) {
                    System.out.println(1);
                } else if (xx < 0 && yy > 0) {
                    System.out.println(2);
                } else if (xx < 0 && yy < 0) {
                    System.out.println(3);
                } else if (xx > 0 && yy < 0) {
                    System.out.println(4);
                }

//Тернальний оператор
        System.out.println("Використання Тернального оператор. Внеси число, для порівняння більшого значення");
        Scanner scan = new Scanner(System.in);
        int numberAA = scan.nextInt();
        int numberBB = scan.nextInt();
        System.out.println(numberAA > numberBB ? numberAA : numberBB);

        //Переприсвоєння значення
        String text = "New messege";
        String mesagge = text;


}


}
