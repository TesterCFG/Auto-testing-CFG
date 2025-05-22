package TaskTwo;

import java.util.*;

import static java.awt.AWTEventMulticaster.add;

public class Collections {
    public static void main(String[] args) {

        //Завдання 1.1.
        System.out.println("Завдання 1.1: Об’єднання двох списків" + "\n");
        //Створи два ArrayList<String>: один із іменами, другий із прізвищами.
        //Створи третій список, у якому кожен елемент — повне ім’я (ім’я + пробіл + прізвище).

        ArrayList<String> someName = new ArrayList();
        someName.add("Sem");
        someName.add("Yurii");
        someName.add("Jambo");

        ArrayList<String> sureNames = new ArrayList();
        sureNames.add("Vitkof");
        sureNames.add("Stetsyshyn");
        sureNames.add("Jekson");

        ArrayList<String> fullName = new ArrayList();
        for (int i = 0; i < someName.size(); i++) {
            fullName.add(someName.get(i) + " " + sureNames.get(i));
        }
        System.out.println("Виводимо об'єднані листи " + fullName);
        System.out.println(fullName.get(1));

        //Завдання 1.2.Фільтрація елементів
        System.out.println("Завдання 1.2.Фільтрація елементів"+ "\n");
        //Створи List<Integer>.
        ArrayList<Integer> numbersValume = new ArrayList(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));
        numbersValume.add(2);
        numbersValume.add(47);
        numbersValume.add(9);
        numbersValume.add(15);
        numbersValume.add(6);
        numbersValume.add(5);
        numbersValume.add(3);
        numbersValume.add(55);
        System.out.println("Виводимо значення масиву:" + numbersValume);

        //Видали всі числа менші за 10.
        //Використай removeIf() або Iterator.
        numbersValume.removeIf(n -> n < 10); // - лямда-ператор він дозволить передавати функцію як об'єкт без додаткового класу

        System.out.println("Значення після фільтрації масиву" + numbersValume);

        //1.3Пошук індексів
        System.out.println("1.3 Пошук індексів" + "\n");
        //Створи ArrayList<String> і додай декілька елементів "test".
        ArrayList<String> list = new ArrayList<>(Arrays.asList("bim", "bom", "din", "test", "don", "start", "test"));

        //Знайди перший і останній індекс "test" методом indexOf() і lastIndexOf().
        int firstPos = list.indexOf("test");
        int lastPos = list.lastIndexOf("test");
        int somePos = list.lastIndexOf("dodik");

        //Виводимо індекси з масиву значень, по заданим вище умовам
        System.out.println("Виводимо індекс значення \"test\" по пошуку значення = " + firstPos);
        System.out.println("Виводжу індекс останнього значення \"test\" = " + lastPos);
        System.out.println("Спроба вивести індекс останнього значення \"dodik\", якого немає в масиві = " + somePos);


        //Завдання 2.1: Збір унікальних значень
        System.out.println("Завдання 2.1: Збір унікальних значень" + "\n");
        //Є масив рядків: {"apple", "banana", "apple", "orange", "banana", "apple"}.
        //Створи Set<String>, щоб отримати тільки унікальні значення.
        //Виведи розмір колекції

        //Є масив рядків: {"apple", "banana", "apple", "orange", "banana", "apple"}.
        String[] someFruits = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Set<String> onlyUniqueFruits= new HashSet<>(Arrays.asList(someFruits));
        System.out.println("Виводимо унікальні назви фруктів; " + onlyUniqueFruits);
        System.out.println("Розмір колекції становить; " + onlyUniqueFruits.size());

        //Завдання 2.2: Сортування унікальних значень
        System.out.println("Завдання 2.2: Сортування унікальних значень" + "\n");

        //Створи TreeSet<String>, додай туди міста.
        //Перевір, що вони виводяться у відсортованому порядку.
        TreeSet<String> city = new TreeSet<>();
        city.add("Lviv");
        city.add("Ternopil");
        city.add("Odesa");
        city.add("Rivne");
        city.add("Kherson");
        city.add("Kyiv");
        city.add("Alushta");
        city.add("Kherson");
        System.out.println("Виводжу назви міст які посортовані колекцією TreeSet " + city);

       //Завдання 2.3: Перевірка входження
        System.out.println("Завдання 2.3: Перевірка входження" + "\n");
        //Створи два HashSet<String>. Один — доступні ролі користувача, інший — ролі, які потрібно надати.
       //Ролі наявні в користувача
        HashSet<String> availableUserRoles = new HashSet<>();
        availableUserRoles.add("Базові права");
        availableUserRoles.add("Обмін даними");
        availableUserRoles.add("Запуск обробок");
        availableUserRoles.add("Мобільна охорона");


        //Ролі нові що треба додати
        HashSet<String> newUserRols = new HashSet<>();
        newUserRols.add("Адміністратор мобільної охорони");
        newUserRols.add("Адміністратор ключів посад");
        newUserRols.add("Запуск обробок");
        newUserRols.add("Обмін даними");

        //З'ясуй, чи всі потрібні ролі вже є у користувача.
        //Створюю нову колекцію на основі колекцї з нових ролей
        Set<String> missingRoles = new HashSet<>(newUserRols);

        //З колекції скопійованої вичислення не наданих ролей, видаляю вже надані ролі прирівнявши до колекції availableUserRoles
        missingRoles.removeAll(availableUserRoles);


        System.out.println("Вивожу список ролей які ще не присвоєні користувачеві:" + "\n" + missingRoles);


        //Завдання 3.1: Підрахунок частоти слів
        System.out.println("Завдання 3.1: Підрахунок частоти слів");
        //Є масив рядків: {"apple", "banana", "apple", "orange", "banana", "apple"}.
        //Використай HashMap<String, Integer> для підрахунку кількості кожного слова.
        String[] someWords = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Integer> repeatabilityMap = new HashMap<>();


        //Перевіряє, чи вже є таке слово (someWords) у Map,containsKey(...) повертає true, якщо Map вже має цей ключ.

        //І записуємо нове значення — збільшуємо на 1:
        for (String list1: someWords){
            if (repeatabilityMap.containsKey(list1)) {
             repeatabilityMap.put(list1, repeatabilityMap.get(list1) + 1);//Якщо слово вже було — ми зчитуємо поточне значення (кількість входжень):
               // get(list1) отримуємо значення і записуємо нове значення — збільшуємо на 1
             repeatabilityMap.put(list1, 1);
            }
        }

        System.out.println("Виводжу результат підрахунку частоти слів в списку");
        for (Map.Entry<String, Integer> entry : repeatabilityMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }


        //Завдання 3.2: Оновлення значень
        System.out.println("Завдання 3.2: Оновлення значень");
        //У мапі Map<String, Integer> зберігаються оцінки студентів.
        //Підвищ усі оцінки на 10%. Використай forEach() або entrySet().
        HashMap<String, Integer> rating = new HashMap<>();
        rating.put("Sem", 90);
        rating.put("Zak", 65);
        rating.put("Sara", 80);
        rating.put("Ivan", 85);
        rating.put("Ron", 70);

        rating.forEach((student, mark) -> {
            int updated = (int) Math.round(mark * 1.10);
            rating.replace(student, updated);
        });
        System.out.println("Результат підвищення оцінок користувачам на 10% складатиме:" + rating);


        //Завдання 3.3: Сортування за значенням
        //Створи HashMap<String, Integer>, відсортуй її за значенням (наприклад, за оцінками).
        System.out.println("Завдання 3.3: Сортування за значенням" + "\n");
        Map<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Sem", 90);
        lhm.put("Zak", 65);
        lhm.put("Sara", 80);
        lhm.put("Ivan", 85);
        lhm.put("Ron", 70);

        //Створює список копій пар Map з яким можна і їх сортувати.
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(lhm.entrySet());
        sorted.sort(Map.Entry.comparingByValue());

        //Виведи пари у форматі "Ім’я - Оцінка" у порядку зростання оцінки.
        for (Map.Entry<String, Integer> entry : sorted) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



//🔹 Queue
//Завдання 4.1: Моделювання черги
        System.out.println("Завдання 4.1: Моделювання черги" + "\n");
//Створи Queue<String>, додай 5 клієнтів.
        Queue<String> queue = new LinkedList<>();

        queue.add("Клієнт 1");
        queue.add("Клієнт 2");
        queue.add("Клієнт 3");
        queue.add("Клієнт 4");
        queue.add("Клієнт 5");
        queue.add("Клієнт 6");

//Виведи першого без видалення (peek), потім обслугай 2 клієнтів (poll).

        System.out.println("Перший у черзі (peek): " + queue.peek());

        // потім обслужи 2 клієнтів (poll).
        System.out.println("Обслуговуємо: " + queue.poll());
        System.out.println("Обслуговуємо: " + queue.poll());

        // Фінальний стан черги
        System.out.println("Залишилось у черзі: " + queue);


        //Завдання 4.2: Пріоритетна черга
        System.out.println("//Завдання 4.2: Пріоритетна черга"+ "\n");
        //Використай PriorityQueue<Integer>, додай набір випадкових чисел.
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>();
        priorityQueue.offer(56);
        priorityQueue.offer(68);
        priorityQueue.offer(555);
        priorityQueue.offer(32);
        priorityQueue.offer(8);
        priorityQueue.offer(55);

        System.out.println("Виводжу список всіх значень" + priorityQueue);

        //Виведи всі числа по черзі, використовуючи poll().
        System.out.println("Вивід всіх числ по черзі, використовуючи poll():");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll() + ", ");
        }

        //Ітерація через колекції
        //Завдання 5.1: Ітерація трьома способами
        System.out.println("Завдання 5.1: Ітерація трьома способами");
        //Створи List<Integer> із числами від 1 до 10.
        List<Integer> listTen = new ArrayList<>();

        //Пройдись по ньому:
        //•	за допомогою for
        System.out.print("Ітерація за for:");

        for (int i = 0; i < 10; i++) {
            listTen.add(i);
            System.out.print(listTen.get(i) + " ");
        }

        //•	for-each
        System.out.print("Ітерація за for-each:" + "\n");
        for (int n :listTen){
            System.out.print(n + " ");
        }

        //•	Iterator
        System.out.print("Ітерація за Iterator:" + "\n");
        Iterator iterator = listTen.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

//Додатково: видали всі непарні елементи з використанням Iterator.
        System.out.print("видали всі непарні елементи з використанням Iterator:" + "\n");
        Iterator<Integer> iterator1 = listTen.iterator();
        while (iterator1.hasNext()){
            int n1 = iterator1.next();
            if (n1 % 2 != 0) {
                iterator1.remove();
            }
        }
        System.out.println(listTen);


//Завдання 5.2: Ітерація по Map
        System.out.print("Завдання 5.2: Ітерація по Map" + "\n");
//Створи Map<String, Integer> і пройдись по ньому, виводячи кожну пару "ключ - значення".
//Map.Entry<String, Integer> entry = mapIterator.next();
 //System.out.println("Key: " + entry.getKey());
        //    System.out.println("Value: " + entry.getValue());
        System.out.print("Створюю Map<String, Integer> і проходжуся по ньому, виводячи кожну пару \"ключ - значення" + "\n");
        for (Map.Entry<String, Integer> entry : rating.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }



        // Порівняння структур
        //Завдання 6.1: ArrayList vs LinkedList
        //Створи два списки по 100_000 елементів.
        //Заміряй час вставки в середину для кожного типу.
        //Зроби висновки щодо ефективності.
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int sizeList = 100000;
        for (int i = 0; i < sizeList; i++) {
            arrayList.add(i);
            linkedList.add(i);

    //        System.out.println(arrayList.size());

        }


        //Завдання 6.2: HashMap vs TreeMap
        //Створи HashMap і TreeMap з однаковими даними.
        //Виведи:
        //•	HashMap — порядок довільний
        //•	TreeMap — відсортовано за ключами
        //Додатково: заміряй час пошуку за ключем.


        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        int sizeMap = 100000;

        for (int i = 0; i < sizeMap; i++) {
            String value = "Value" + i;
            hashMap.put(i, value);
            treeMap.put(i, value);

          //  System.out.println(hashMap);
        }

        //Завдання 7.1: Основні методи List
        System.out.println("Завдання 7.1: Основні методи List");
        //Створи список. Продемонструй методи:
        List<String> vegetables = new ArrayList<>();

        //•	add,
        System.out.println("Демонстрація методу add");
        vegetables.add("Помідори");
        vegetables.add("Огірки");
        vegetables.add("Кабачки");
        vegetables.add("Картопля");
        vegetables.add("Броколі");

        // addAll,
        System.out.println("Демонстрація методу addAll,");
        List<String > othersPosition = Arrays.asList("Капуста", "Селера", "Баклажани", "Броколі", "Огірки");
        vegetables.addAll(othersPosition);
        System.out.println(vegetables);

        // remove,
        System.out.println("Демонстрація методу remove");
        vegetables.remove("Картопля");
        System.out.println("Вивід списку без Картоплі:" + vegetables);

        // removeAll,
        vegetables.removeAll(Arrays.asList("Огірки"));
        System.out.println("Демонстрація методу removeAll " + vegetables);

        // contains,(перевіряє наявність елемента)
        System.out.println("Демонстрація методу contains = " + vegetables.contains("Селера"));

        // indexOf,
        System.out.println("Виводимо індекс першого шуканого значення:");
        System.out.println(vegetables.indexOf("Броколі"));
        // size.
        System.out.println("Ромір масиву = " + vegetables.size());

        // clear,
        vegetables.clear();
        System.out.println("Виводимо список після очищення" + vegetables);



        //Завдання 7.2: Робота з Map
        System.out.println("Завдання 7.2: Робота з Map");
        //Створи Map<String, Integer> і протестуй:
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Sem", 90);
        students.put("Zak", 65);
        students.put("Sara", 80);
        students.put("Ivan", 85);
        students.put("Ron", 70);

        //•	putIfAbsent,
        students.putIfAbsent("Jek", 55);
        students.putIfAbsent("Sem", 90);
        System.out.println("Виводимо список значень при додаванні з putIfAbsent  " + students);

        // replace,
        students.replace("Jek", 80);
        System.out.println("Замінюємо значення за допомогою replace  " + students);

        //getOrDefault, коли значення невідомо і по дефолту заповнено, отримуємо результат
        int sara = students.getOrDefault("Sara", 0);
        System.out.println("Вивидимо значення по ключу через getOrDefault: " + sara);


        // containsKey,
        System.out.println("Булевна перевірка containsKey на наявність ключа в мапі по ключу: " + students.containsKey("Sem"));
        // containsValue,
        System.out.println("Булевна перевірка containsValue на наявність ключа в мапі по значенню: " + students.containsValue(80));
        // remove.
        students.remove("Ivan");
        System.out.println("Вилучення remove по ключу, виводимо список:" + students);
    }
}
