import java.util.Scanner;

public class function {
    public static int add(int a, int b) { // parameters , formal parameters
        return a + b; 
    }

      public static int add(int a, int b ,int c) { // parameters , formal parameters
        return a + b+c; 
    }
      public static double add(double a, double b ,double c) { // parameters , formal parameters
        return a + b+c; 
    }


    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int bc(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, hence not prime
            }
        }
        return true; // n is prime
    }

    public static void printPrimesInRange(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        // System.out.println(add(22, 3)); // actual parameters ,arguments

        // Binomial Coefficient
        // System.out.println(bc(5, 3));   

        
// * Function overloading
//  ! depends on the function formal parameters or paramters only 
//  * - no of formal parameters
//  * - data type of formal parameters
        // System.out.println(add(22, 3,5)); 
        System.out.println(add(22.4, 3.5,5)); 

        //  is prime or not
        // System.out.println(isPrime(22));

        //  ? primes in range
        printPrimesInRange(1, 100);


    }
}