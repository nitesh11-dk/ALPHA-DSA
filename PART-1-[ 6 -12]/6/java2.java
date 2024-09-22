// import java.util.* ;
import java.util.*;


public class java2 {
    public static void main (String args[]){



// ! For taking input 
// ! Scanner  , we take  input by using this object , which is imported from module 
Scanner scnr = new Scanner(System.in);


// String input = scnr.next();
// next method shrif stating ke lettes ko leta hai , like space ke bad ka kuch nahi leta hai 
// String input = scnr.nextLine();
 // this is nextLine is used to  include all with spacess and all so we use this 
//  and by deafult  next and nextLine method uses a data type of string 


// int input = scnr.nextInt() ;
// byte input = scnr.nextByte();
// float input = scnr.nextFloat();
// boolean input = scnr.nextBoolean(); //  can accept only capital and small word 'true' and 'false'



//  next
// nextLine
// nextlnt
// nextByte
// nextFloat
// nextDouble
// nextBoolean
// nextShort
// nextLong

// System.out.println( "input is " + input);
  

//  int a = scnr.nextInt();
// int b = scnr.nextInt();

        // System.out.println(a + b);





// ! Type conversion / Widening / Implict conversion 


//?  Type Conversion
//?  Conversion happens when:
//?  a. type compatible
//  yiska matlab hai ki app numbers wala data type ko hii convert kar sakte hai dusare me , like float to int or to long ...  , but you cannot do integer to boolean 

//?  b. destination type > source type
//  yiska matalb hai kii  app bade size wala datatype ko chote size wale datatype me nahi rakh sakte hai , but yiska yulta is possible 

int d= 23 ;
long c = d ;

//  here c is called as destiantion type and d is a source type 

//?  byte -> short -> int -> float -> long -> double

// lossy conversion  --- yaise converison jaha appka data loss ho sakta  hai jese ki  8 byte ka data app 2 byte me dal doge , then there is loss of data in that so this is called lossy converion , but java don't allow to do this . 


//  implict converion 
//  float num = scnr.nextInt(); // by deafult it convert nextInt() into float   , and this conversion is implict

//  System.out.println(num);


// ! Type Casting  // narrowing  conversion // explict converion


//   the type of conversion that java don't allow but , we forcefully want to convert that and this is called as type casting 

// float marks =  99.99f; // yaha par f likhan jaruri hai qkii by deafult ye double hota hai keuu kii float hota hai 32bit (4byte) aur double hota hai  64-bit(8byte)

// int withourDeciMarks =  (int) marks ;
// System.out.print(withourDeciMarks) ;





//  ? charctes ko number me convert kiya ja sakta hai , lekin vo by deaflut diya gaya hai number like for 'a' it is 97 for 'b' it is  98 ... and for 'A' 65 ... 

char chr = 'B';
int number = chr ;
// System.out.println(number) ;






//  !Type Promotion in Expressions

// 1 . Java automatically promotes each byte, short, or char operand to int
// when evaluating an expression.
// 2. If one operand is long, float or double the whole expression is
// promoted to long, float, or double respectively.



   
   char a= 'a';
   char b = 'b';
    //   char s = b-a ; // same error here also 
//    char s = (int) b ; // giving error as  possible lossy conversion from int to char
   char s = (char) b ; // yaha hum type casting kar rahe hai 
//    int s = (int) b ;  // valid 
//    System.out.println( (int) (a) ) ;
//    System.out.println( (int) b ) ;
//    System.out.print(s ) ;


char l = 'c';
// byte byt = (byte) a+b+l ; // yaha par  yaise nahi kar sakte haibind up karna padega sabko

// byte byt = (byte) (a+b+l) ; // menas yah par jo vhi expression hai vo int me convert ho jata hai , yisiliye to error milra hai kii int to byte me convert nahi kar sakta hai

//    System.out.print(byt ) ;

int num1 = 12 ;
float num2= 12.99f ;
long num3 = 15;
double num4 = 19.87;

double res= num1 + num2 + num3 + num4 ;


// yaha par agar hume decial like float aur double vhi use karege to sara chiz double me convert hoga , but agar jab withour decimal point consider karege tab shrif  long me convert hoga 

// System.out.print(res );



// ! wrong
byte ber = 5;
// ber = ber * 2; // yaha par loss y convert ho jaata hai qki by deafult ye b*2 ye expression hai so ye int  me convert hoga , aur int ko hum byte me nahi dal sakte hai 

// ! right
ber = (byte) (ber * 2)

System.out.println(ber);


//? How is our Code Running?

// JDK
// JRE -- java runtime environment
// • Development
// • Libranes
// Tools

 



    }
}