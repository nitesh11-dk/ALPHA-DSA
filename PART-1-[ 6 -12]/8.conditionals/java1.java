import java.util.*;

public class java1 {
    public static void main (String args[]){


        // System.out.println("Hello kaise ho ") ;

     Scanner  scnr = new Scanner(System.in) ;

//      System.out.println( " enter your income in lakhs  " ); 


//      float income = scnr.nextFloat();
//  float tax ;




//  if(income < 5){

//  tax = 0 ;
//  } else if(income > 5 && income <= 10 ){

// tax = (float) ( income * 0.2) ;
//  } else {

// tax = (float)     (income * 0.3) ;

//  }


// System.out.println( "your tax is " + tax); 




    //  System.out.println( " enter the 3 number to want to  check tha maximum" );

    //  int a= scnr.nextInt() ;
    //  int b= scnr.nextInt(); 
    //  int c= scnr.nextInt() ;

    //  if( a >= b && a>=c){
    //     System.out.println("The number " + a + " is greater");
    //  } else if(  b>=c){
    //     System.out.println("The number " + b + " is greater");
    //  } else{
    //     System.out.println("The number " + c + " is greater");

    //  }


    //  System.out.println( "number want to check it is even or odd " );

    //  int num  = scnr.nextInt();

    //   String result = (num %2==0) ? "the number is even" : "the number is odd" ;
     
    //  System.out.println( result );


//      System.out.println( "enter the marks out of 100" );

// float  marks = scnr.nextFloat();

//      String res = (marks > 33) ? "pass" : "fail" ;

//      System.out.println(res );


     System.out.println("enter the 2 numbers you want to perform operation" );

     int a= scnr.nextInt();
     int b= scnr.nextInt();

     System.out.println("enter the  operation symbol you want to perform" );


    //  System.out.println("enter the  operation number you want to perform" );
    //  System.out.println("1. addition" );
    //  System.out.println("2. subtraction" );
    //  System.out.println("3. division" );
    //  System.out.println("4. multipliation" );
    //  System.out.println("5. remainder");

char operationNumber = scnr.next().charAt(0); 


    //  switch (operationNumber) {
    //     case 1 : System.out.println(a+b) ;
    //             break;
    //     case 2 : System.out.println(a-b) ;
    //             break;
    //     case 3 : System.out.println(a/b) ;
    //             break;
    //     case 4 : System.out.println(a*b) ;
    //             break;
    //     case 5 : System.out.println(a%b) ;
    //             break;
    //  }


     switch (operationNumber) {
        case '+' : System.out.println(a+b) ;
                break;
        case '-' : System.out.println(a-b) ;
                break;
        case '/' : System.out.println(a/b) ;
                break;
        case '*' : System.out.println(a*b) ;
                break;
        case '%' : System.out.println(a%b) ;
                break;
     }






    }
}