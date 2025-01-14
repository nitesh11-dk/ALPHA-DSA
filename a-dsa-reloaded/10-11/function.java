import java.util.Scanner;

public class function {
    public static int add(int a, int b) { // parameters , formal parameters
        return a + b; 
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
    
    public static void main(String[] args) {

        // System.out.println(add(22, 3)); // actual parameters ,arguments

        System.out.println(bc(5, 3));   
    }
}