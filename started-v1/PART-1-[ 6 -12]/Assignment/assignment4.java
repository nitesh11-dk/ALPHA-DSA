
// ! Assignment == 4 

import java.util.*;

// Question 1 : How many times 'Hello' is printed?

// public class Solution {
// public static void main(String[] args){

// for(int i=0; i<5; i++) {

// System.out.println("Hello");

// i+=2; 


// }
// }
// }



//  ! ---> 2 times 

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


// public class assignment4 {
// public static void main(String[] args){

// Scanner  scnr = new Scanner(System.in) ;



//!  Question 3 : Write a program to find the factorial of any number entered by the user.

// int factorial = 1;


// int num = scnr.nextInt();

// for(int i = 1 ; i  <= num ; i++ ){

//     factorial *= i ;
// }


// System.out.println(factorial);

//!  Question 4 : Write a program to print the multiplication table of a number N, entered by the
// ! user.


// int num = scnr.nextInt();
//     System.out.println("enter kaha tak chhaiye appko yus number ka table");
// int end = scnr.nextInt();

// for(int i = 1 ; i  <= end ; i++ ){

//     System.out.println(num * i);
// }






}
}




// public class Solution {
// public static void main(String args[]) {

// for(int i = 0; i <= 5; i++ ) {
//    System.out.println("i = " + i );
//      }
// System.out.println("i after the loop = " + i );
// }
// }
// we cannot acces  that variable that is created in the loops syntax 


// Scope of variable is referred to the part of the program where the variable can be used.
// In this program variable i is declared in the for loop. So scope of variable i is limited to the for
// loop only that is between { and } of the for loop. There is a display statement after the for loop
// where variable i is used which means i is used out of scope. This leads to compilation errors.
// The program given will not run and give an error instead. To correct the program, the variable i
// needs to be declared outside the for loop.




//!  Question 2 : Write a program that reads a set of integers, and then prints the sum of the
// !  even and odd integers


// import java.util.Scanner;

// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;
        
//         do {
//             System.out.print("Enter the number: ");
//             number = sc.nextInt();
            
//             if (number % 2 == 0) {
//                 evenSum += number;
//             } else {
//                 oddSum += number;
//             }
            
//             System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
//             choice = sc.nextInt();
//             sc.nextLine(); // Consume the leftover newline character
//         } while (choice == 1);
        
//         System.out.println("Sum of even numbers: " + evenSum);
//         System.out.println("Sum of odd numbers: " + oddSum);
//     }
// }




// ?! and what i  thinl about the second qestion was 





// public class assignment4 {
// public static void main(String[] args){

// Scanner  scnr = new Scanner(System.in) ;



// int evenSum = 0 ;
// int oddSum = 0 ;


// int num = scnr.nextInt();

// for(int i = 0 ; i <= num ; i++ ){


// if(i % 2 == 0 ){
// evenSum += i ;
// } else {

// oddSum += i ;
// }
// };

// System.out.println( "even sum till n numbers is " +  evenSum);
// System.out.println( "odd sum till n numbers is " +  oddSum);

// }
// }