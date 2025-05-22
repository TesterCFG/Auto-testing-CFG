package TaskFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Lambda {


    public static class User implements Comparable<User>{
            private String name;

        @Override
        public int compareTo(User o) {
            return name.compareTo(o.getName());
        }

        private String email;
            private boolean isActive;

            public User(String name, String email, boolean isActive) {
                this.name = name;
                this.email = email;
                this.isActive = isActive;
            }

            public String getName() { return name; }

            @Override
            public String toString() {
                return "User{" +
                        "email='" + email + '\'' +
                        '}';
            }

            public String getEmail() { return email; }
            public boolean isActive() { return isActive; }



    }



    }
//Завдання:
//1. Створіть список користувачів з кількома записами (5–7), деякі з них неактивні або мають null у полі email.
//2. Використовуючи Stream API:
//•	- Відфільтруйте лише активних користувачів.
//•	- Витягніть email-адреси цих користувачів.
//•	- Зберіть результат у List<String>.
//3. Опрацювання null через Optional:
//•	- Реалізуйте метод:
//  public static Optional<String> getEmailIfActive(User user)
//  який повертає Optional.of(email) лише якщо користувач активний та email не дорівнює null.
//•	- Продемонструйте використання цього методу на прикладі списку користувачів.
//4. Виведіть результат на екран:
//•	- Email-адреси активних користувачів.
//•	- Список Optional, який показує, для яких користувачів є email, а для яких — порожній Optional.
//Підказки:
//•	- Для фільтрації: filter(user -> user.isActive())
//•	- Для мапінгу: map(User::getEmail)
//•	- Для Optional: Optional.ofNullable(...) + .filter(...)
//Приклад очікуваного результату:
//Active user emails: [john@example.com, anna@company.com]
//Optionals: [Optional[john@example.com], Optional.empty, Optional[anna@company.com], Optional.empty]
