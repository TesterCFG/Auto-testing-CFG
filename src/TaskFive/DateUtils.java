package TaskFive;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;

//Кроки виконання:
//	1. Створіть утилітарний клас DateUtils:
//Метод:
//public static boolean isValidDate(String dateStr)
//- Перевіряє, чи дата відповідає формату dd-MM-yyyy.
public class DateUtils {
    public static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");//За допомогою методу ofPattern() створюємо об'єкт
    // DateTimeFormatter на основі рядка-шаблону.

    public static boolean isValidDate(String dateStr) {
        try {
            LocalDate.parse(dateStr, format);//створюємо виключення в якому парсимо вхідні дані до вище описаного формату і ловимо результат
            return true;
        } catch (DateTimeParseException error) {
            return false;
        }
    }


}
