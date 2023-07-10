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
        
        String template = "<html><body><h1>Hello, " + name + "!</h1><p>Your age is " + age + ".</p></body></html>";
        
        return template;
    }
}

