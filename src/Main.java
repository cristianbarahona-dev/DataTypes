/**
 * Data types define what can be stored within a
 * variable and the limits of what can be assigned to it.
 * */

public class Main {
    public static void main(String[] args) {
        System.out.println("Data Types");

        // Primitive data types
        int age = 26;              // Data type for integers
        double height = 1.72;      // Data type for numbers with decimal
        boolean programmer = true; // Data type for true or false
        char initial = 'C';        // Data type for a character
        long number = 1234567890;  // Data type for numbers between (Minimum value: -9,223,372,036,854,775,808 Maximum value: 9,223,372,036,854,775,807)

        // Object data type (String is a class, not primitive)
        String name = "Cristian";  // It is a class (not a primitive type) that represents an immutable sequence of characters (it cannot be modified after its creation).

        System.out.println("Personal Data");
        System.out.println("My name is: " + name);
        System.out.println("My initial is: " + initial);
        System.out.println("My age is: " + age);
        System.out.println("My height is: " + height);
        System.out.println("I am a programmer: " + programmer);
        System.out.println("My number is: " + number);
    }
}