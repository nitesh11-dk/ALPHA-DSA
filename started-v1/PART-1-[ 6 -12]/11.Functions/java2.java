public class java2 {
    public static void main (String args[]){

//  boolean res = isPrime(97);
// System.out.println(res);

// primesInRange(100);
// toDecimal(1111);


toBinary(10);

    }





public static void primesInRange(int num ){

    for(int i = 2 ; i <num ; i++){
        if(isPrime(i)){
            System.out.println(i);
        }
    }
}





    public static boolean isPrime(int num ){
//  called as corner cases 
if(num <1){
    return false ;
}
for(int i = 2 ; i <= Math.sqrt(num) ; i++){
    if(num % i == 0){
        // System.out.println("hello");
        return false ;
    }
}
return true ;
    }
    
public static void toDecimal(int bynry){
    int power = 0 ;
    int decimalNum =  0 ;

    while (bynry > 0 ){
     int lD = bynry % 10 ;
     decimalNum = decimalNum +( lD * (int) Math.pow(2,power));
     bynry = bynry / 10;
     power ++;


    }

    System.out.println(decimalNum);
}


public static void toBinary(int deci){
 int power = 0 ;
 int binaryNum = 0 ;

 while (deci > 0){
int rem = deci %2 ;
binaryNum += rem * (int) Math.pow(10 , power);
power ++ ;
deci = deci/2 ;
 }
 
System.out.println(binaryNum);
}
 



}


