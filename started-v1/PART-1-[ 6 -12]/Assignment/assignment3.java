import java.util.*;




//!  Question 1 : Write a Java program to get a number from the user and print whether it is
// positive or negative.

// public class assignment3 {
//  public static void main (String args[]){
//     Scanner scnr = new Scanner(System.in) ;

//     // int num = scnr.nextInt();

//     // if(num > 0){
//     //     System.out.println("this given number is postiive number");
//     // } else {

//     //     System.out.println("this given number is negative number");

//     // }

//  }

// } 



// ! Question 2 : Finish the following code so that it prints You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever

// public class assignment3 {
// public static void main(String[] args) {
// double temp = 103.5;

// if (temp < 100){
//     System.out.println("You dont have fever") ;
// } else {
//     System.out.println("You  have fever");

// }


// }


// }



// ! Question 3 : Write a Java program to input week number(1-7) and print day of week name
// using switch case.



// public class assignment3 {
//  public static void main (String args[]){
//     Scanner scnr = new Scanner(System.in) ;


// int dayNum = scnr.nextInt();


// switch(dayNum){
//     case  1: System.out.println("monday");
//             break; 
//      case  2: System.out.println("tuesday");
//             break;
//                 case  3: System.out.println("wednesday");
//             break; 
//      case  4: System.out.println("thursday");
//             break;
//                 case  5: System.out.println("friday");
//             break; 
//      case  6: System.out.println("satruday");
//             break;
//                 case  7: System.out.println("sunday");
//             break; 
//   default :  System.out.println("enter the valid inoput");
// }

//  }

// } 




// ! Question 4 : What will be the value of x & y in the following program:


// public class assignment3 {
// public static void main(String args[]) {

// int a = 63, b = 36;

// boolean x = (a < b ) ? true : false;

// int y= (a > b ) ? a : b;


// // x = flase ;
// //   y = a ;

// }
// }



// ! Question 5 : Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.




public class assignment3 {
 public static void main (String args[]){
    Scanner scnr = new Scanner(System.in) ;

   
   System.out.println("enter the year you want to check it is leap year or not ");

   int year = scnr.nextInt();


   if(year%4 == 0 &&( year%100 != 0 || year%400 ==0) ){
 System.out.println("the year is a leap year");
   } else {
 System.out.println("the year is not a leap year");

   }

 }

} 
