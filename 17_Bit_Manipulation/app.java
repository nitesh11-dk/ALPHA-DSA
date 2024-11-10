public class app {

    public static void main(String[] args) {
        // System.out.print(2 | 1);
        // System.out.print(2 & 1);
     //TODO:   // System.out.print(~); // negation nahi hoga 2's complement ho ajayega , sign depend karta hai MSB par if 1  then negative if 0 then positive 

// ?  left shift << 
//   a<<b  = a * 2^b
// System.out.print(<<2);
// ?  right shift >> 
//   a>>b  = a / 2^b
// System.out.print(>>2);
 
 int n = 0;
if((n&1)==1){
    System.out.print("odd");
}else{
    System.out.print("even");
    
}
    }
}
