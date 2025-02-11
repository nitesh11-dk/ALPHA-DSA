# **📌 Abstraction in Java - Complete Explanation**  

## **🔹 What is Abstraction?**  
**Abstraction** is one of the four pillars of **Object-Oriented Programming (OOPs)**. It is the process of **hiding unnecessary details and showing only the essential features** of an object.  

🔹 **Example in Real Life:**  
- When you drive a car, you only use the **steering wheel, accelerator, and brakes**. You **don't need to know how the engine works internally**.  
- Similarly, in Java, **abstraction hides complex implementations** and provides only relevant information to the user.  

---

## **🔹 How Abstraction is Achieved in Java?**  
Java provides **two ways** to achieve abstraction:  
1. **Abstract Classes** (Achieves partial abstraction)  
2. **Interfaces** (Achieves full abstraction)  

---

## **🔹 Abstract Class in Java**  
An **abstract class** in Java:  
✅ Cannot be instantiated (i.e., you cannot create objects of an abstract class).  
✅ Can contain **both abstract and non-abstract methods**.  
✅ Can have **constructors**.  
✅ Must be **inherited** by subclasses to provide method implementations.  

### **🛠️ Example of an Abstract Class**
```java
abstract class Animal {  
    String color;  

    // Constructor
    Animal() {  
        color = "Red";  
    }  

    // Non-abstract method (normal method)
    void eat() {  
        System.out.println("Animals eat food");  
    }  

    // Abstract method (must be implemented in subclasses)
    abstract void walk();  
}

// Subclass that extends the abstract class
class Horse extends Animal {  
    @Override
    void walk() {  
        System.out.println("Horse walks on four legs");  
    }  

    // Method to change color
    void changeColor() {  
        color = "Brown";  
    }  
}

public class AbstractionExample {  
    public static void main(String[] args) {  
        Horse h = new Horse();  // Creating an instance of the Horse class
        h.walk();  // Calls the overridden method
        System.out.println("Color: " + h.color);  // Accessing the inherited variable
    }  
}
```
### **🛠️ Explanation of the Above Code:**  
1. `Animal` is an **abstract class** because it contains an **abstract method (`walk()`)**.  
2. `Horse` **inherits** from `Animal` and provides an **implementation** for `walk()`.  
3. We **cannot create an object of `Animal`**, but we can create an object of `Horse`.  

---

## **🔹 Why Use Abstract Classes?**  
✅ To achieve **partial abstraction** (some methods can be fully implemented).  
✅ To provide **a base class** for other classes to inherit from.  
✅ To enforce the implementation of certain methods in child classes.  

---

## **🔹 Key Features of Abstract Classes**  
✅ **Can have constructors**, even though instances cannot be created.  
✅ **Can have both abstract & non-abstract methods**.  
✅ **Cannot be instantiated directly**.  
✅ **Used when some common functionality needs to be shared across multiple classes**.  

---

## **📌 Summary**  
🔹 **Abstraction** helps hide unnecessary details and provides only essential information.  
🔹 **Abstract classes** can contain both abstract and concrete (normal) methods.  
🔹 **We cannot create objects of abstract classes**, but we can **inherit** them.  
🔹 **The child class must implement all abstract methods of the parent class**.  

# **📌 Interface in Java - Complete Explanation**  

## **🔹 What is an Interface?**  
An **interface** in Java is a **blueprint for creating classes** that defines a **set of abstract methods** (methods without implementation). Any class that implements the interface **must provide implementations for all its methods**.  

✅ **100% Abstraction** - All methods in an interface are **public, abstract, and do not have a body**.  
✅ **Multiple Inheritance Support** - A class can implement **multiple interfaces**, which is not possible with regular class inheritance.  
✅ **Method Implementation in Implementing Classes** - Unlike abstract classes, interfaces do **not contain method implementations** (before Java 8).  

---

## **🔹 Why Use Interfaces?**  
1. **Achieves Total Abstraction** - Only method declarations, no method bodies.  
2. **Supports Multiple Inheritance** - Java **does not support multiple class inheritance**, but multiple interfaces can be implemented in a single class.  
3. **Ensures Loose Coupling** - Interfaces allow **different classes** to work together without tightly depending on each other.  
4. **Better Code Organization** - Helps maintain a clean separation of concerns between different functionalities.  

---

## **🔹 Key Features of an Interface**  
✅ **All methods are public and abstract (implicitly).**  
✅ **All variables in an interface are public, static, and final (constants).**  
✅ **Classes implementing an interface must provide implementations for all its methods.**  
✅ **Cannot create objects of an interface.**  

---

## **🔹 Example of an Interface**  
### **🛠️ Basic Interface Implementation**
```java
// Defining an interface
interface Animal {
    void makeSound();  // Abstract method (must be implemented by subclasses)
}

// Implementing the interface in a class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Implementing the interface in another class
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Output: Dog barks: Woof Woof!

        Cat cat = new Cat();
        cat.makeSound();  // Output: Cat meows: Meow Meow!
    }
}
```
### **🛠️ Explanation of the Above Code:**  
- **`Animal` is an interface** with an abstract method `makeSound()`.  
- **`Dog` and `Cat` classes implement `Animal`**, providing their own versions of `makeSound()`.  
- **We can create objects of `Dog` and `Cat`, but not `Animal` (interface).**  

---

## **🔹 Interface and Multiple Inheritance**  
Java **does not support multiple inheritance with classes**, but interfaces can be used to achieve this.  

### **🛠️ Example of Multiple Inheritance using Interfaces**
```java
// First interface
interface Father {
    void showFatherTraits();
}

// Second interface
interface Mother {
    void showMotherTraits();
}

// Child class implementing both interfaces
class Child implements Father, Mother {
    @Override
    public void showFatherTraits() {
        System.out.println("Child has Father’s traits: Strong and Disciplined.");
    }

    @Override
    public void showMotherTraits() {
        System.out.println("Child has Mother’s traits: Caring and Intelligent.");
    }

    public void showChildTraits() {
        System.out.println("Child has unique traits: Creative and Curious.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.showFatherTraits();  // Output: Child has Father’s traits: Strong and Disciplined.
        child.showMotherTraits();  // Output: Child has Mother’s traits: Caring and Intelligent.
        child.showChildTraits();   // Output: Child has unique traits: Creative and Curious.
    }
}
```
### **🛠️ Explanation of the Above Code:**  
- `Father` and `Mother` are **two different interfaces**.  
- `Child` class **implements both interfaces**, inheriting behavior from both.  
- This is how **multiple inheritance is achieved in Java using interfaces**.  

---

## **🔹 Interface Variables (Static & Final by Default)**  
- **All variables inside an interface are `public static final` by default.**  
- **They cannot be changed after initialization.**  

### **🛠️ Example of Interface Variables**
```java
interface Game {
    int PLAYERS = 2;  // This is a final, static variable
}

public class InterfaceVariables {
    public static void main(String[] args) {
        System.out.println("Total players: " + Game.PLAYERS);
        // Game.PLAYERS = 4;  // ERROR! Cannot modify final variable
    }
}
```
---

## **🔹 Default and Static Methods in Interfaces (Since Java 8+)**  
Before **Java 8**, interfaces **could not** have method implementations.  
From **Java 8 onwards**, interfaces **can have default and static methods** with implementations.  

### **🛠️ Example of Default & Static Methods in Interface**
```java
interface Vehicle {
    // Abstract method
    void start();

    // Default method (provides implementation)
    default void showDetails() {
        System.out.println("This is a vehicle");
    }

    // Static method (provides implementation)
    static void displayType() {
        System.out.println("Vehicles can be cars, bikes, trucks, etc.");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key");
    }
}

public class InterfaceMethods {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();         // Output: Car starts with a key
        myCar.showDetails();   // Output: This is a vehicle

        Vehicle.displayType(); // Output: Vehicles can be cars, bikes, trucks, etc.
    }
}
```
### **🛠️ Explanation of the Above Code:**  
- `start()` is an **abstract method** that `Car` implements.  
- `showDetails()` is a **default method** in the interface, which can be called without overriding.  
- `displayType()` is a **static method** in the interface, which is called using `Vehicle.displayType()`.  

---

## **📌 Summary**  
🔹 **Interfaces** allow 100% **abstraction** in Java.  
🔹 **All methods are public and abstract by default** (except default/static methods from Java 8+).  
🔹 **All variables are public, static, and final** (constants).  
🔹 **Interfaces support multiple inheritance** (unlike classes).  
🔹 **From Java 8 onwards, interfaces can have `default` and `static` methods** with implementations.  

### **✅ When to Use an Interface?**  
✅ When you need **full abstraction**.  
✅ When you want to **enforce common behavior** across multiple classes.  
✅ When multiple classes **need to inherit multiple behaviors** (multiple inheritance).  
✅ When defining a **contract that different classes must follow**.  
