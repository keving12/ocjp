import java.util.Formatter;
import java.io.File;
import java.io.FileNotFoundException;
public class StringFormatPrint {

    public static void main(String[] args) {
        String name = "Kevin";
        printf(name);
        printFormatter(name);
        printFormattedBoolean(name);
        printFormattedCharacter(name);
        printFormattedFloat();
        printFormattedInteger();
        printFormattedString(name);
        printFormattedIncorrectArgCount(name);
        printFormattedFlags(name);
        
    }
    
    public static void printf(String name) {
        System.out.printf("Hi there my name is %s\n", name);
    }
    
    public static void printFormatter(String name) {
        try {
            Formatter formatter = new Formatter(new File("formatted.txt"));
            formatter.format("Hi there my name is %s\n", name);
            formatter.flush();    
        }
        catch(FileNotFoundException e) {
            
        }
    }
    
    public static void printFormattedBoolean(String name) {
        // This should print true as it is not null or a boolean or wrapper type.
        System.out.format("Name %b\n", name);
        // This should print false as argument is null but is a Boolean wrapper
        Boolean b = null;
        System.out.format("Boolean value: %b\n", b);
        
        boolean t = true;
        boolean f = false;
        System.out.format("True value: %b\n", t);
        System.out.format("False value: %b\n", f);
    }
    
    public static void printFormattedCharacter(String name) {
        System.out.format("First char of name: %c\n", name.charAt(0));
        // This will throw IllegalFormatConversionException at runtime as a String cannot be converted to a character
        //System.out.format("Character: %c\n", name);
    }
    
    public static void printFormattedFloat() {
        // Print floating point number with default of 6 decimal places
        System.out.format("Here is a floating point value %f\n", 12.345);
        System.out.format("This one has a leading zero %09f\n", 1.2345678);
        System.out.format("Limiting the number of decimal places %.2f\n", 1.234567);
    }
    
    public static void printFormattedInteger() {
        System.out.format("Formatted integer %d\n", 12345);
        // Wrap negative integers in brackets
        System.out.format("Formatted negative integer %(d\n", -77);
    }
    
    public static void printFormattedString(String name) {
        System.out.format("My name is %s\n", name);
        // Here we print out using an argument index to swap location of variable values in a string
        System.out.format("My name is %2s and I am %1s years old\n", name, 25);
    }
    
    public static void printFormattedIncorrectArgCount(String name) {
        String lastName = "blah";
        // lastName is extra argument for which there is no conversion char defined so it's ignored
        System.out.format("Name %s \n", name, lastName);
        // This will throw MissingFormatArgumentException as we have two conversion chars defined but only a single argument
        //System.out.format("First name: %s, last name: %s", name);
    }
    
    public static void printFormattedFlags(String name) {
        // Flag to define minimum width of string as 10. Because true is 4 characters 6 spaces prepended
        System.out.format("Name: %10b\n", name);
        System.out.format("Name %.3b\n", name);
    }

}