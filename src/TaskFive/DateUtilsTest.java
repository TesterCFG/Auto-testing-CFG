package TaskFive;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateUtilsTest {
//	5. Створіть тестовий клас DateUtilsTest:
//- Покрийте метод isValidDate різними варіантами вхідних даних.

   @BeforeEach
 public void beforeEach() {
       System.out.println("Старт тесту");
   }

   @AfterEach
  public void afterEach() {
           System.out.println(("Кінець тестування"));
       }
       @Test
       public void testValidTests(){
       assertTrue (DateUtils.isValidDate("01-01-2020"));
       assertTrue (DateUtils.isValidDate("01-01-2020"));

    }
}
