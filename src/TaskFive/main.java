package TaskFive;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class main {
    public static void main(String[] args) {
        Date current = new Date();
        System.out.println(current);

        Date current2 = new Date(89, 2, 21);
        System.out.println(current2);

        Date current3 = new Date(105, 5, 4, 12, 15, 0);
        System.out.println(current3);

            String expected = "3.1415";
            String actual = "3";

            assertEquals(expected, actual);
    }


}
