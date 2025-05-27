package TaskFive;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;


//2. Створіть клас FileUtils:
//Метод:
//public static List<String> readLines(String filePath)
//- Зчитує строки з файлу.
//
//Метод:
//public static void writeResult(String filePath, String result)
//- Записує рядок до нового файлу.

public class FileUtils {
    File inputFile = new File("src/dates.txt");


    public static List<String> readLines(String filePath) throws IOException {
        return Files.readAllLines(Path.of(filePath)); //робить зчитування всіх рядків текстового файлу в список рядків
    }

    public static void writeResult(String filePath, String result) throws IOException {
        Files.write(Path.of(filePath), result.getBytes(), StandardOpenOption.CREATE); //запис текстових даних у файл
        //StandardOpenOption.CREATE -вказує, що якщо файл не існує то його треба створити
        //Якщо файл вже існує, вміст буде перезаписано
    }
}
