public class app{

     public static int bianryToDecimal(int binaryNumber){
         int decimalNumber   = 0 ; 
         int power = 0 ;
         while(binaryNumber > 0){
            int ld = binaryNumber % 10 ;
            decimalNumber +=  ld * (int) Math.pow(2,power) ;
            power++ ;
            binaryNumber /= 10 ;
         }
         return decimalNumber ;
    }

     public static int decimalToBinary(int decimalNumber){
         int binaryNumber = 0 ; 
         int power = 0 ;
         while(decimalNumber > 0){
            int ld = decimalNumber % 2 ;
            binaryNumber +=  ld * Math.pow(10,power);
            power++ ;
            decimalNumber /= 2;
         }
         return binaryNumber ;
    }
    
    public static void main (String args[]){

// Binary to Decimal 
  int res = bianryToDecimal(0010);
   System.out.println(res) ;

   //  ? decimal to binary 
int res = decimalToBinary(2);
System.out.println(res);
   
        
    }
}