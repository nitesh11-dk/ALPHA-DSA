import java.util.*;


public class assignment {

    public static void main (String args[]){

Scanner scnr = new Scanner(System.in);


//! Question 1
// . In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.

// int a = 10 ;
// int b = 20 ;
// int c = 30 ;

// System.out.println((a+b+c)/3);


// !Question 2:
//  In a program, input the side of a square. You have to output the area of the square.

// System.out.println("enter the side of the square");
// int area = scnr.nextInt();

// System.out.println("the area of the square is " + area *area);


//! Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen, and an eraser. You have to output the total cost to the user as their bill.

// (Add-on: You can also try adding '18% GST tax' to the items in the bill as an advanced problem)

float pencilPrice = scnr.nextFloat();
float penPrice = scnr.nextInt(); // implict conversion hai ye 
float eraserPrice = scnr.nextFloat();
 
 float total =  pencilPrice + penPrice + eraserPrice ;

//  we should have to include GST also 
System.out.println( total + (0.18f * total)) ;



// ! Question 4: What will be the type of result in the following Java code?

byte b = 4;
char c = 'a';
short s = 512;
int i = 1000;
float f = 3.14f;
double d = 99.9954;

//  answer is double because it has floationg data also and here double  have the highest size and it is datatype which have deciamal points 

//  double result = (f * b) + (i % c) - (d*s);
//  System.out.println(result);


//!  Question 5: (Advanced) Will the following statement give any error in Java?



// You are correct, the statement int $ = 45; will not give any error in Java. According to the Java Language Specification, identifiers can start with any letter, underscore (_), or dollar sign ($). Therefore, the variable name $ is a valid identifier in Java.

int $ = 45 ; // $12 IS ALSO OKAY 
System.out.println($);





    }
}