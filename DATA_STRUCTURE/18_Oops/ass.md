Here are the answers to your OOPS questions with proper explanations:

---

## **Question 1: Complex Number Operations**
**Problem:**  
Create a class `Complex` to perform addition, subtraction, and multiplication on complex numbers.  

### **Solution:**
```java
import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(newReal, newImaginary);
    }

    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input complex numbers
        System.out.print("Enter real and imaginary part of first complex number: ");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        Complex c1 = new Complex(real1, imaginary1);

        System.out.print("Enter real and imaginary part of second complex number: ");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        Complex c2 = new Complex(real2, imaginary2);

        // Perform operations
        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        // Display results
        System.out.print("Sum: ");
        sum.display();

        System.out.print("Difference: ");
        difference.display();

        System.out.print("Product: ");
        product.display();

        scanner.close();
    }
}
```
### **Explanation:**
- **Encapsulation:** The real and imaginary parts are private.
- **Methods for Operations:** `add()`, `subtract()`, and `multiply()` return a new `Complex` object.
- **Constructor:** Used to initialize complex numbers.
- **Display Method:** Prints the complex number.
- **User Input:** Allows the user to enter real and imaginary parts dynamically.

---

## **Question 2: Output of the Given Code**
```java
class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

public class ElectricCar extends Car {
    @Override
    public final String drive() {
        return "Driving electric car";
    }

    public static void main(String[] wheels) {
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}
```
### **Answer:**
✅ **B. Driving electric car**  

### **Explanation:**
1. **Private Methods Are Not Inherited**  
   - `drive()` in `Automobile` is `private`, so it **is not inherited** by `Car`.  
   - The `drive()` method in `Car` is **a new method, not an override**.

2. **Method Overriding**  
   - `Car` defines a `protected` `drive()` method.
   - `ElectricCar` **overrides** it with a `public final` method.

3. **Polymorphism**  
   - `final Car car = new ElectricCar();`  
   - Since `car` refers to an `ElectricCar` object, **method overriding applies**, and `drive()` from `ElectricCar` is called.

Thus, the output is:
```
Driving electric car
```

---

## **Question 3: Access Modifier Choice**
```java
public class Shape {
    protected void display() {
        System.out.println("Display-base");
    }
}

public class Circle extends Shape {
    < access-modifier > void display() {
        System.out.println("Display-derived");
    }
}
```
### **Answer:**
✅ **B. `public` and `protected` both can be used.**  

### **Explanation:**
- **Overriding Rules:**  
  - A subclass method **cannot have a weaker access modifier** than the method in the parent class.
  - The `display()` method in `Shape` is `protected`, so the overriding method in `Circle` must be **either `protected` or `public`**.
- **Why Not `private`?**  
  - `private` would make the method inaccessible outside the class, which is not allowed in overriding.

---

## **Question 4: Output of the Given Code**
```java
abstract class Car {
    static {
        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

public class BlueCar extends Car {
    {
        System.out.print("4");
    }

    public BlueCar() {
        super("blue");
        System.out.print("5");
    }

    public static void main(String[] gears) {
        new BlueCar();
    }
}
```
### **Answer:**
✅ **C. `13245`**  

### **Explanation (Execution Order):**
1. **Static Blocks Run First (Only Once Per Class)**
   ```
   static { System.out.print("1"); }
   ```
   ✅ Output: `1`

2. **Instance Initialization Blocks Execute Before Constructors**
   - `Car`'s instance block runs **before** its constructor.
   ```
   { System.out.print("3"); }
   ```
   ✅ Output: `13`

3. **`Car` Constructor Runs (`super("blue")` is called)**
   ```
   System.out.print("2");
   ```
   ✅ Output: `132`

4. **Instance Initialization Block in `BlueCar` Runs**
   ```
   { System.out.print("4"); }
   ```
   ✅ Output: `1324`

5. **`BlueCar` Constructor Runs**
   ```
   System.out.print("5");
   ```
   ✅ Final Output: `13245`

---

## **Question 5: Exception Handling Basics**
📖 **Read more here: [Java Exception Handling - W3Schools](https://www.w3schools.com/java/java_exceptions.asp)**

### **Key Points:**
1. **What is an Exception?**
   - An exception is an **unexpected event** that occurs during program execution, disrupting the normal flow.

2. **Types of Exceptions:**
   - **Checked Exceptions:** Caught at compile-time (e.g., `IOException`).
   - **Unchecked Exceptions:** Occur at runtime (e.g., `NullPointerException`).

3. **Handling Exceptions Using Try-Catch:**
   ```java
   try {
       int result = 10 / 0; // This will cause an exception
   } catch (ArithmeticException e) {
       System.out.println("Cannot divide by zero!");
   }
   ```
   ✅ Output:
   ```
   Cannot divide by zero!
   ```

4. **Using `finally` Block:**
   ```java
   try {
       System.out.println("Try block executed");
   } catch (Exception e) {
       System.out.println("Exception caught");
   } finally {
       System.out.println("Finally block always runs");
   }
   ```
   ✅ Output:
   ```
   Try block executed
   Finally block always runs
   ```

5. **Throwing Custom Exceptions:**
   ```java
   throw new IllegalArgumentException("Invalid argument provided");
   ```

---

## **Final Thoughts**
🚀 **Great work! You now understand:**  
✅ **Complex number operations** using OOP.  
✅ **Method overriding and access modifiers.**  
✅ **Execution order of static blocks, constructors, and instance blocks.**  
✅ **Exception handling in Java.**  

🔥 Keep practicing! Let me know if you have any doubts. 🚀