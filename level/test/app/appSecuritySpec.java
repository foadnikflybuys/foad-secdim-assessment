package app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Assertions;

@DisplayName("Security unit tests")
@Tag("security")
public class appSecuritySpec {

    @Test
    public void testRenderHtml_injection() {
        String name = "<html>&";
        int age = 30;
        
        String expectedTemplate = "<html><body><h1>Hello, &lt;html&gt;&amp;!</h1><p>Your age is 30.</p></body></html>";
        
        String actualTemplate = Main.renderTemplate(name, age);
        
        Assertions.assertEquals(expectedTemplate, actualTemplate);
    }
}
