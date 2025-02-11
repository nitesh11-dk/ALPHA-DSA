### 📌 **Java Class & Encapsulation Notes**  

## **📖 Definition of a Class in Java**  
A **class** in Java is a blueprint or template for creating objects. It defines the **attributes (variables)** and **methods (functions)** that an object of that class can have.  

### **Syntax of a Class in Java**
```java
class ClassName {
    // Attributes (Variables)
    DataType variableName;
    
    // Methods (Functions)
    ReturnType methodName() {
        // Method body
    }
}
```

### **Example of a Class in Java**
```java
class Student {
    String name;
    int roll_no;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + marks);
    }
}
```

### no class in java can be private or  protected , but you can creaate nested classes 
## parent ref = child obj , child ref != parent obj 
---

## **🛠️ Understanding Encapsulation in Java**  
🔹 **Encapsulation** is the process of **wrapping data (variables) and methods into a single unit (class)**.  
🔹 It helps in **data hiding** by restricting direct access to some variables using the `private` keyword.  
🔹 We provide access to these private variables using **getter** and **setter methods**.  

### **Advantages of Encapsulation**  
✅ **Data Hiding** – Prevents direct access to sensitive data.  
✅ **Better Control** – The class has control over its attributes.  
✅ **Modularity** – The code is more organized and manageable.  
✅ **Security** – Prevents unintended modifications.  

### **Example of Encapsulation in Java**
```java
class BankAccount {
    public String username; // Public attribute
    private String password; // Private attribute
    private String id = "Nite1109"; // Private ID

    // Setter method to assign a password
    public void setPass(String pass) {
        password = pass;
    }

    // Getter method to retrieve ID
    String getId() {
        return this.id;
    }
}
```
### **Explanation**  
- `password` and `id` are `private`, so they cannot be accessed directly.  
- `setPass(String pass)` is a **setter** method to modify the password.  
- `getId()` is a **getter** method to retrieve the private `id`.  

---

## **📌 Key Points to Remember**  
✅ A **class** is a template for creating objects.  
✅ **Objects** are instances of a class that reserve memory.  
✅ **Encapsulation** hides data using private access and allows controlled access via getter & setter methods.  
✅ **Data Hiding** ensures that sensitive data is not accessible directly from outside the class.  

### 📌 **Java Access Modifiers - Notes**  

Access modifiers in Java define the **scope (visibility)** of variables, methods, and classes. The four types of access modifiers are **Private, Default, Protected, and Public**.  

---

## **🔹 Access Modifiers Table**  

| Access Modifier | Within Class | Within Package | Outside Package (Subclass Only) | Outside Package |
|---------------|-------------|---------------|------------------------------|---------------|
| **Private**   | ✅ Yes       | ❌ No        | ❌ No                        | ❌ No        |
| **Default**   | ✅ Yes       | ✅ Yes       | ❌ No                        | ❌ No        |
| **Protected** | ✅ Yes       | ✅ Yes       | ✅ Yes                        | ❌ No        |
| **Public**    | ✅ Yes       | ✅ Yes       | ✅ Yes                        | ✅ Yes       |

---

## **📖 Explanation of Each Modifier**  

### 🔹 **1. Private**  
- Accessible **only within the same class**.  
- **Not accessible outside the class, even in the same package.**  
- **Example:**  
  ```java
  class Bank {
      private int accountNumber = 12345; // Private variable
  
      private void showAccount() { // Private method
          System.out.println("Account Number: " + accountNumber);
      }
  }
  ```

---

### 🔹 **2. Default (No Modifier)**  
- Accessible **within the same package**.  
- **Not accessible outside the package, even in subclasses.**  
- **Example:**  
  ```java
  class Bank {
      int balance = 5000; // Default variable
  
      void displayBalance() { // Default method
          System.out.println("Balance: " + balance);
      }
  }
  ```

---

### 🔹 **3. Protected**  
- Accessible **within the same package**.  
- Accessible **outside the package, but only in subclasses** (via inheritance).  
- **Example:**  
  ```java
  class Bank {
      protected String branch = "Delhi"; // Protected variable
  
      protected void showBranch() { // Protected method
          System.out.println("Branch: " + branch);
      }
  }
  
  class SubBank extends Bank {
      void showDetails() {
          System.out.println("Inherited Branch: " + branch); // Accessible
      }
  }
  ```

---

### 🔹 **4. Public**  
- Accessible **everywhere (within class, package, and outside the package).**  
- **No restrictions.**  
- **Example:**  
  ```java
  class Bank {
      public String bankName = "SBI"; // Public variable
  
      public void showBankName() { // Public method
          System.out.println("Bank Name: " + bankName);
      }
  }
  ```

---

## **📌 Key Takeaways**  
✅ **Private:** Most restrictive, used for data security.  
✅ **Default:** Package-private, accessible only within the same package.  
✅ **Protected:** Accessible within the package + by subclasses in other packages.  
✅ **Public:** Least restrictive, accessible everywhere.  

### 📌 **Java OOPs Concepts - Notes**  

---

## **🔹 Constructors in Java**  
A **constructor** is a special method in Java that is used to **initialize objects** when they are created. It has the same name as the class and **does not have a return type**.  

### **🛠️ Types of Constructors in Java**  
1. **Parameterized Constructor** – Takes arguments to initialize variables.  
2. **Non-Parameterized Constructor** – Does not take any arguments.  
3. **Constructor Overloading** – Multiple constructors with the same name but different parameters.  
4. **Copy Constructor** – Creates a new object by copying properties from another object. *(Not available by default in Java but can be manually implemented.)*  

### **🔹 Constructor Overloading Example**
```java
class Student {
    String name;
    int roll;
    int[] marks;

    // Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks; // Reference of marks array is copied
    }

    // Parameterized Constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
```

### **🛠️ Key Takeaways**  
✅ **Constructors have the same name as the class.**  
✅ **They do not have a return type.**  
✅ **Used to initialize objects.**  
✅ **Java does not provide a default copy constructor like C++.**  

---

## **🔹 Inheritance in Java**  
**Inheritance** is a mechanism in Java where one class acquires the properties and behaviors of another class.  

### **🛠️ Types of Inheritance in Java**  
1. **Single-Level Inheritance** – A child class inherits from a single parent class.  
2. **Multi-Level Inheritance** – A class inherits from another derived class.  
3. **Hierarchical Inheritance** – Multiple classes inherit from a single parent class.  
4. **Hybrid Inheritance** – A combination of multiple types of inheritance (Achieved using **interfaces** in Java).  
5. **Multiple Inheritance (via Interfaces)** – A class can inherit from multiple interfaces but not multiple classes.  

### **🔹 Example of Inheritance**
```java
class Animal {
    String color;
    void eat() {
        System.out.println("Eats food");
    }
}

class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("Swims in water");
    }
}
```

### **🛠️ Key Takeaways**  
✅ **Inheritance promotes code reusability.**  
✅ **Java does not support multiple class inheritance to avoid ambiguity.**  
✅ **Interfaces help achieve multiple inheritance in Java.**  

---

## **🔹 Polymorphism in Java**  
Polymorphism means "**one name, many forms**." It allows the same function to behave differently in different situations.  

### **🛠️ Types of Polymorphism**  
1. **Compile-Time Polymorphism (Method Overloading)** – Multiple methods with the same name but different parameters.  
2. **Run-Time Polymorphism (Method Overriding)** – A subclass provides a specific implementation of a method that is already defined in its parent class.  

### **🔹 Example of Method Overloading**
```java
class MathOperations {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }
}
```

### **🔹 Example of Method Overriding**
```java
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}
```

### **🛠️ Key Takeaways**  
✅ **Method overloading occurs within the same class.**  
✅ **Method overriding occurs between parent and child classes.**  
✅ **Overloading is resolved at compile-time, overriding is resolved at runtime.**  

---

## **🔹 Packages in Java**  
A **package** is a collection of related classes and interfaces. It helps organize the code and prevents name conflicts.  

### **🛠️ Types of Packages**  
1. **Built-in Packages** – Predefined Java libraries (e.g., `java.util`, `java.io`).  
2. **User-Defined Packages** – Custom packages created by the user.  

### **🔹 Example of a User-Defined Package**
```java
package mypackage;

class Example {
    void display() {
        System.out.println("This is a user-defined package.");
    }
}
```

### **🛠️ Key Takeaways**  
✅ **Packages help in organizing Java code.**  
✅ **They prevent class name conflicts.**  
✅ **`import` keyword is used to access packages in Java.**  

---

## **📌 Final Summary**  
✅ **Constructors** – Initialize objects, support overloading, and can be copied.  
✅ **Inheritance** – Enables code reuse and supports multiple inheritance via interfaces.  
✅ **Polymorphism** – Achieved through method overloading and overriding.  
✅ **Packages** – Help in code organization and prevent naming conflicts.  
