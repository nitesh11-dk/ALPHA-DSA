import java.util.*;
public class java1{

public static void main(String args[]){
Scanner scnr = new Scanner(System.in);
// long n = scnr.nextLong();
// long r = scnr.nextLong();


// System.out.println(binoCoff(n ,r));
System.out.println(sum(2,3));
System.out.println(sum(2f,3f));


}

public static long binoCoff(long n , long r){


long nfact = factorial(n);
long rfact = factorial(r);
long nrfact = factorial((n-r));
long ncr = nfact / (rfact * nrfact) ;

return ncr ;
}


public static long factorial(long a) {
    long f = 1;
    for (int i = 1; i <= a; i++) {
        f *= i;
    }
    return f;
}


// function overloading depends only on parameter , like type of paramter and no of parameters onlly

public static int sum(int  a , int  b){

return a + b;
}


public static boolean sum(float a , float b  ){

return true  ;
}



}














// public static --> access modifier -- in loop
//  vo function jo hum classes ye yander likh hai yuse hum methods kahate hai


//  parameter is what when you create while creating the function is called formal parameter of parameter

//  argument is what when you call the function , and what values you pass with the fcuntion is called as actual parameter or argument
// java me hamesa  call by value diya jata hai function me


//  function overolading
// me same class there are   multiple function with the same name but with different parameter
