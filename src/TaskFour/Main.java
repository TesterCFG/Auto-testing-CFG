package TaskFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //2. Використовуючи Stream API:
        //•	- Відфільтруйте лише активних користувачів.
        //•	- Витягніть email-адреси цих користувачів.
        //•	- Зберіть результат у List<String>.
        List<Lambda.User> users = new ArrayList<>();

        users.add(new Lambda.User("Sara Conor", "sara@gmail.com", true));
        users.add(new Lambda.User("Ira Vitik", null, true));
        users.add(new Lambda.User("Rob Efron", "rob@gmail.com", true));
        users.add(new Lambda.User("Ron Gir", null, false));
        users.add(new Lambda.User("Tom Travolta", "tom@gmail.com", true));
        users.add(new Lambda.User("Vika Simon", null, false));

        List<String> activeEmails = users.stream()
                .filter(user -> user.isActive() && user.getEmail() !=null)  //Відбриваємо за допомогою лямбда виразу активних користувачів. Проходжуся по списку user і в списку проходжуся по user.isActive
                .map(user -> user.getName() + " <" + user.getEmail() + ">")             // перетворює один тип даних в інший. Конвеєрний метод.
                .sorted()
                .collect(Collectors.toList());          // вираховує всі дані з потоку і повертає їх в вигляді колекції. Термінальний метод

      //  activeEmails.forEach(System.out::print);

        //4. Виведіть результат на екран:
        //•	- Email-адреси активних користувачів.
        //•	- Список Optional, який показує, для яких користувачів є email, а для яких — порожній Optional
        //Виводжу значення використавши Stream API
        System.out.println("Active user emails: " + activeEmails);
        //Виводжу результат використавши Optionals
        System.out.println("\nOptionals (getEmailIfActive results):");
        users.forEach(user -> System.out.println(getEmailIfActive(user)));


        }
    //3. Опрацювання null через Optional:
//•	- Реалізуйте метод:
//  public static Optional<String> getEmailIfActive(User user)
//  який повертає Optional.of(email) лише якщо користувач активний та email не дорівнює null.
//•	- Продемонструйте використання цього методу на прикладі списку користувачів.

    public static Optional<String> getEmailIfActive(Lambda.User user) {   //обгортає user в Optional
        return Optional.ofNullable(user)//якщо user = null тоді Optional.empty, інакше Optional.of(user)
                .filter(Lambda.User::isActive)//тут перевіряється чи user.isActive() = true
                .map(Lambda.User::getEmail)// тут переводимо в String Optional<User>
                .filter(Objects::nonNull); // відбирає в списку null значення за логікою Object.equals(Object). true, якщо аргументи рівні один одному, та false в іншому випадку
    }


    }
