package RestAssured;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PropertiesTest {
    @Test
    public void readProperties() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("app.properties"));
        String emailFromPropperty = System.getProperty("email");
        System.out.println(emailFromPropperty);
    }
}
