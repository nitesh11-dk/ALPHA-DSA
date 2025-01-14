import java.util.* ;

public class assignment5 {

    public static void main(String args[]){
Scanner scnr = new  Scanner(System.in);


// ! Question 1 : Write a Java method to compute the average of three numbers..

// avg3(scnr);


// Question 2 : Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your
// method.

//  boolean res = isEven(11);

//  System.out.println(res);



// Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.

// isPalindrome(122);


// Question 4 : READ & CODE EXERCISE
// Search about(Google) & use the following methods of the Math class in Java:
// a. Math.min( )

// int res = Math.min((2,3),5); 
//  can just apss 2 argument for 3 u can 

// int res = Math.min(Math.min(2,3),5); 
// b. Math.max( ) --- lly for math.max()

// c. Math.sqrt( ) -- its always return double
// double res =  Math.sqrt(44);
// int res = (int) Math.sqrt(44);

// d. Math.pow( ) ---- double lly for this 

// e. Math.avg( )

// int res = Math.avg(2,3,4);  -- does not exist  

// f. Math.abs( )
// double res = Math.abs(-100.000);

// System.out.println(res); 


// ! Question 5 :
// Write a Java method to compute the sum of the digits in an integer.

// sumOfDigit(23);


    }

public static void avg3(Scanner scnr){

int num1 = scnr.nextInt();
int num2 = scnr.nextInt();
int num3 = scnr.nextInt();
System.out.println( "The avg is " +(num1 + num2 + num3)/3);



}



public static boolean isEven(float num){

 if(num % 2 == 0 )  {

    return true ;
 } else {
    return false ;

 }
}


public static void isPalindrome(int num){
 int reverseNumber = 0 ;
 int cpynum = num ;
while(num > 0 ){
 int lastDigit = num % 10 ;
 reverseNumber = reverseNumber * 10 +  lastDigit ;
 num /= 10 ;
}

    System.out.println(reverseNumber);
if(reverseNumber  == cpynum ){
    System.out.println("the number is palindrome");
} else{

    System.out.println("the number is not palindrome");
}

}


public static void sumOfDigit(int num){

 int sumDigit = 0 ;

while(num > 0 ){
 int lastDigit = num % 10 ;
 sumDigit +=lastDigit ;
 num /= 10 ;
}

System.out.println("the sum of digit in the given number is " + sumDigit);

}

}