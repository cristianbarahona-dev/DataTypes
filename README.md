# Data Types Example in Java

This project demonstrates the use of different data types in Java, including both primitive and object types.

## Description

The program showcases various Java data types by storing personal information and displaying it. It serves as an educational example for understanding how different data types work in Java.

## Features

- Demonstrates primitive data types:
  - `int` for integers
  - `double` for floating-point numbers
  - `boolean` for true/false values
  - `char` for single characters
  - `long` for large integers
- Shows object data type with `String` class
- Simple output displaying the stored values

## Code Explanation

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Data Types");

        // Primitive data type declarations
        int age = 26;              // Stores integer values
        double height = 1.72;      // Stores decimal numbers
        boolean programmer = true; // Stores true or false
        char initial = 'C';        // Stores single character
        long number = 1234567890;  // Stores large integers

        // Object data type (String)
        String name = "Cristian";   // Stores sequence of characters

        // Output the stored values
        System.out.println("Personal Data");
        System.out.println("My name is: " + name);
        System.out.println("My initial is: " + initial);
        System.out.println("My age is: " + age);
        System.out.println("My height is: " + height);
        System.out.println("I am a programmer: " + programmer);
        System.out.println("My number is: " + number);
    }
}
```

## How to Run

1. Make sure you have Java JDK installed on your system
2. Compile the program:
   ```
   javac Main.java
   ```
3. Run the compiled program:
   ```
   java Main
   ```

## Expected Output

```
Data Types
Personal Data
My name is: Cristian
My initial is: C
My age is: 26
My height is: 1.72
I am a programmer: true
My number is: 1234567890
```

## Data Types Information

| Data Type | Description | Example |
|-----------|-------------|---------|
| `int`     | 32-bit integer values | `int age = 26;` |
| `double`  | 64-bit floating-point numbers | `double height = 1.72;` |
| `boolean` | true/false values | `boolean programmer = true;` |
| `char`    | Single 16-bit Unicode character | `char initial = 'C';` |
| `long`    | 64-bit integer values | `long number = 1234567890L;` |
| `String`  | Sequence of characters (object type) | `String name = "Cristian";` |

## License

This project is open source and available under the [MIT License](LICENSE).
