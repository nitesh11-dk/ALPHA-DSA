import java.util.*;

public class java1 {
    public static void  main (String args []){
Scanner scnr = new Scanner(System.in);



// System.out.println( "enter the n numberts you want to print") ;

// ?! while loop 

// int num = scnr.nextInt();
// int sum   = 0;
//         int counter = 0 ;
//         while (counter <= num ){

//                  sum += counter;
//             counter++;
 
//         }
//             System.out.println( sum) ;


// ! For loop
//  ? Print reverse of a number ---  and also save it into a variable

// * number ka last digit chahiye to num % 10 --> remainder se ho jayega
// * number ka  last digit remove karna hoga to divide kardo 10 se num /10 ---> so hume deciaml milega aur hum use karge shirf integer by using the integer data type  

// int num = 1011 ;

// int reverseNumber = 0;

// for(int i = 0 ; num > 0 ; i++  ) {

//   reverseNumber *=  10 ;
//   reverseNumber += num % 10 ;
//  num = num / 10 ;

// }
// System.out.println(reverseNumber );



//  ! do while  / break / continue
// do{
// System.out.println("enter the number to exit enter the number which is multiple of 10 " );
// int num = scnr.nextInt();

// if(num % 10 == 0){
// System.out.println(" you are exit" );
// // break ;
// continue;

// }

// System.out.println(num );

// } while ( true) ;



int num = scnr.nextInt();

boolean isPrime = true ;


if(num <= 1 ){
 isPrime = false;
}

for ( int i = 2 ; i <=  Math.sqrt(num) ; i++){

if(num % i == 0){
    isPrime = false ;
    break;
}


}


if(isPrime){
    System.out.println("the number is prime number");
} else {
    System.out.println("the number is not  prime number");

}






            
    }
}