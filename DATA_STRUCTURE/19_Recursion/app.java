public class app {
    public static void printNum(int num){
        if(num ==1 ){ // Base case , that is end of recursion 
            System.out.print(num);
            return;
        }
        printNum(num -1);
        System.out.print(num + " ");

        // !  for decreaesing 
        // System.out.print(num + " ");
        // printNum(num -1);
    }

    public static  int fact(int num){
      if(num <= 1 ){ // Base case , that is end of recursion 
            return 1;
        }
    //  int factorial = 1;
    int fn = num * fact(num -1); 
         return fn;
    }

      public static  int sumOfN(int num){
      if(num == 1 ){ 
            return 1;
        }

    int fn = num + sumOfN(num -1); 
         return fn;
    }

    public static void main (String args []){

        // ! increasing and decresing order 
        // printNum(10);

         //  ! factorial of a number 
        // System.out.print(fact(4));
        //  ! sum of n numbers 
        // System.out.print(sumOfN(3));

        // * +++++++++++++++++++++
        
        // ? fibonaccii series 
         System.out.print(fib(22));
        
    }

    public static  int fib(int n ){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2 ;
        return fn ;
        
    }
}

//  1 to 10 