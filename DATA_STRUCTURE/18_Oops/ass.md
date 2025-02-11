Here are the questions properly formatted in markdown without the answers:

---

## OOPS Questions

### Question 1: 
Print the sum, difference, and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.

---

### Question 2: 
What is the output of the following program?

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

A. Driving vehicle  
B. Driving electric car  
C. Driving car  
D. The code does not compile  

---

### Question 3:
Look at the following code and choose the right option for the word:

**Shape.java**
```java
public class Shape {
    protected void display() {
        System.out.println("Display-base");
    }
}
```

**Circle.java**
```java
public class Circle extends Shape {
    < access-modifier > void display() {
        System.out.println("Display-derived");
    }
}
```

- a. Only protected can be used.
- b. public and protected both can be used.
- c. public, protected, and private can be used.
- d. Only public can be used.

---

### Question 4:
What is the output of the following program?

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

A. 23451  
B. 12354  
C. 13245  
D. The code does not compile  

---

### Question 5:
Read up about the basics of exception handling from here:

[Java Exception Handling - W3Schools](https://www.w3schools.com/java/java_try_catch.asp)

---