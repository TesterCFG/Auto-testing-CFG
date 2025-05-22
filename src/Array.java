import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

      /*  //Створюємо одновимірний масив
        System.out.println("Створили одновимірний масив на 5 значень одним рядком, і переприсвоїли індексу 2 значення 9:");
        int[] myArray;
        myArray = new int[]{1, 2, 3, 4, 5};
        myArray[2] = 9;
        System.out.println(myArray[1]);


        //Виводимо двовимірний масив
        System.out.println("Створили двовимірний масив який виводить значення масиву в один рядок");
String[][] someWord = {
        {"Один", "Два", "Три", "Чотири", "П'ять"},
        {"М'яч", "Колеса", "Ручки", "Лінійки", "Гривень"},
        {"Аркуш", "Яблука", "Сірники", "Лампочки", "Пальців"},
};
        for (int ryad = 0; ryad < someWord.length; ryad++) {
            {
                for (int stovp = 0; stovp < someWord[ryad].length; stovp++) { //Ставимо умову вивести скільки є елементів в кожному рядочку
                    System.out.println(someWord[ryad][stovp]);
                }
        }

*/

//Створюємо двовимірного масиву 10*10

        int[][] data = new int[10][10];
        int one = 1;

        //Через цикл for наповнюємо масив
        for (int i = 0; i < 10; i++) { //формування рядків
            for (int j = 0; j < 10; j++) { //формування стовбів
                data[i][j] = one++;// значення що заповнить масив з one + 1
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(data[i][j] + " "); //вивід раніше перебраних рідків і стовбців + пробіл між значеннями для вигляду
            }
            System.out.println();

        }

//Свтворення масиву з підрахунком розміру масиву
        System.out.println("Виводимо розмір масиву розрахувавши його y * 2 + 10");
        int y = 100;
        int[] type = new int[y * 2 + 10];
        System.out.println(type.length);






        //Створюємо масив типу змійка
        int[][] array = new int[10][10];
        int size = 10;
        int one1 = 1;
//Верхній рядок
        for (int r = 0; r < 10; r++) {
            array[0][r] = one1++;
        }
//З верху в низ права сторона, пропускаємо перший рядок
        for (int s = 1; s < 10; s++) {
            array[s][size - 1] = one1++;
        }

        // Нижній рядок з права на ліво
        for (int r = size - 2; r >= 0; r--) {
            array[size - 1][r] = one1++;
        }

//З низу в верх ліва сторона, пропускаємо перший рядок
        for (int s = size - 2; s > 0; s--) {
            array[s][0] = one1++;
        }

        //Перебираємо масив і виводимо значення в консоль
        for (int r = 0; r < 10; r++) {
            for (int s = 0; s < 10; s++) {
                System.out.print(array[r][s] + "   ");
            }
            System.out.println();
        }

        //Присвоєння значень в індекси масиву
        System.out.println("Виводимо масив розміром 4, і присвоюємо кожній комірці значення типу рядок");
        String par = "Непарний";
        String nepar = "Парний";
        String[] strings = new String[5];

        strings[0] = par;
        strings[1] = nepar;
        strings[2] = par;
        strings[3] = nepar;
        strings[4] = par;

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);

//Творимо масив в якому задаємо 5 значень, перевіряємо кожен індекс, якщо він парний тоді змінюємо значення на протележне +/-
        System.out.println("Масив на 5 значень, якщо значення парні то знак в них змінено на протилежний");
        int[] arra = new int[]{-1, 2, 3, -4, -5};
        if (arra[0] % 2 == 0) {
            arra[0] = -arra[0];
        }

        if (arra[1] % 2 == 0) {
            arra[1] = -arra[1];
        }

        if (arra[2] % 2 == 0) {
            arra[2] = -arra[2];
        }

        if (arra[3] % 2 == 0) {
            arra[3] = -arra[3];
        }

        System.out.println(arra[0]);
        System.out.println(arra[1]);
        System.out.println(arra[2]);
        System.out.println(arra[3]);
        System.out.println(arra[4]);


//Виводимо масив значень в якому копіюється значення масиві firstArray і secondArray в resultArray
    /*    int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] resultArray;

        resultArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            resultArray[i + firstArray.length] = secondArray[i];
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i] + ", ");
        }


        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = i;
        }

        int[][] multiArray;
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            int size1 = Integer.parseInt(scanner.nextLine());
            multiArray[i] = new int[size1];
        }*/
        String[] stringsQ = new String[]{"I", "love", "Java"};
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

            System.out.println(Arrays.toString(stringsQ));
            System.out.println(Arrays.toString(ints));


         String[][] strings1 = new String[][]{
                {"🙂", "🙂", "🙂", "🙂"},
                {"🙃", "🙃", "🙃", "🙃"},
                {"😋", "😋", "😋", "😋"},
                {"😎", "😎", "😎", "😎"}
        };
       int[][] ints1 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

            System.out.println(Arrays.deepToString(strings1));
            System.out.println(Arrays.deepToString(ints1));


    }

    }


