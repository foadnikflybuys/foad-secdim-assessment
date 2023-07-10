package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "John Doe";
        int age = 25;
        
        String renderedTemplate = renderTemplate(name, age);
        
        System.out.println(renderedTemplate);
    }
    
    public static String renderTemplate(String name, int age) {
        String escapedName = escapeHtml(name);
        String template = "<html><body><h1>Hello, " + escapedName + "!</h1><p>Your age is " + age + ".</p></body></html>";
        
        return template;
    }
    
    private static String escapeHtml(String input) {
        String escapedInput = input.replace("&", "&amp;")
                                   .replace("<", "&lt;")
                                   .replace(">", "&gt;")
                                   .replace("\"", "&quot;")
                                   .replace("'", "&#39;");
        
        return escapedInput;
    }
}

