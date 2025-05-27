package TaskFive;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static TaskFive.FileUtils.writeResult;


public class main {
    public static void main(String[] args) throws IOException {
       /* Date current = new Date();
        System.out.println(current);

        Date current2 = new Date(89, 2, 21);
        System.out.println(current2);

        Date current3 = new Date(105, 5, 4, 12, 15, 0);
        System.out.println(current3);

        LocalDate today = LocalDate.now();
        System.out.println("Сьогодні = " + today);

        LocalTime time = LocalTime.of(12, 15, 0, 100);
        System.out.println("Час = " + time);
*/

        String filePath = "src/dates.txt";
        String outPath = "src/valid-dates.txt";
        String result1 = "01-01-2020\n15-08-2023";

        List<String> lines = FileUtils.readLines("src/dates.txt"); //викликаємо читання рядків з класу FileUtils

        String result = lines.stream()
                .filter(DateUtils::isValidDate) //через stream фільтруємо рядочки які відповідають методу isValidDate i format
                .collect(Collectors.joining("\n")); // перетворюємо у єдиний рядок масиву

        FileUtils.writeResult(outPath, result); // записуємо результати у новий файл, writeResult запише рядок result у файл, шлях до якого вказано у outPath
    }



}
