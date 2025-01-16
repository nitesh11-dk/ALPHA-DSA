# Sum of Even and Odd Integers

## Problem Statement
Write a program that reads a set of integers and prints the sum of even and odd integers separately.

---

## Solution 1: Using a `do-while` Loop
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        
        do {
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character
        } while (choice == 1);
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
```

---

## Solution 2: Using a `for` Loop for a Range of Numbers
```java
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter the range limit: ");
        int num = scnr.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Even sum till n numbers is: " + evenSum);
        System.out.println("Odd sum till n numbers is: " + oddSum);
    }
}
```

