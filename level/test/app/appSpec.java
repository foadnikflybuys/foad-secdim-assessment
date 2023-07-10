package app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

@DisplayName("Usability unit tests")
public class appSpec {

    @Test
    public void testRenderTemplate_ValidInput() {
        String name = "John Doe";
        int age = 25;
        
        String expectedTemplate = "<html><body><h1>Hello, John Doe!</h1><p>Your age is 25.</p></body></html>";
        
        String actualTemplate = Main.renderTemplate(name, age);
        
        Assertions.assertEquals(expectedTemplate, actualTemplate);
    }

    @Test
    public void testRenderTemplate_EmptyName() {
        String name = "";
        int age = 30;
        
        String expectedTemplate = "<html><body><h1>Hello, !</h1><p>Your age is 30.</p></body></html>";
        
        String actualTemplate = Main.renderTemplate(name, age);
        
        Assertions.assertEquals(expectedTemplate, actualTemplate);
    }
}
