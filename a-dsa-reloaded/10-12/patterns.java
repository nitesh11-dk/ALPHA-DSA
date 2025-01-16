public class patterns {

     public static void HOLLOWRECT(){
        int row = 4 ;
        int col = 5 ;
        for(int i = 0 ; i < row ; i++){
  for(int j = 0 ; j<col ;j++){

    if( i == 0 || i ==row -1 || j==0 || j==col-1){
        System.out.print("*");
    } else {
        System.out.print(" ");
    }
  }
        System.out.println();
        }

     }

public static void INVERTEDROTATEDHALFPYRAMID(){
  int row = 4 ;
  int col = 4 ;
  for (int i  = 0 ; i < row ; i++){ 
      for(int k = 0 ;k <col- i +1 ; k++){
          System.out.print(" ");
      }
      for(int l = 0 ;l < i +1 ;l++){
          System.out.print("*");
      }
          System.out.println("");
  }

}

public static  void INVERTEDHALFPYRAMIDwithNumbers (int n){
    for(int i = 0 ; i< n ; i++){
        for(int j = 0 ; j < n -i ; j++){
            System.out.print(j+1);
        }
            System.out.println();

    }
}
public static  void FLOYDSTriangle(int n){
        int count  = 1 ;
    for(int i = 0 ; i< n ; i++){
        for(int j = 0 ; j < i+1 ; j++){
            System.out.print(count);
            count++;
        }
            System.out.println();

    }
}
public static void ZERO_ONETRIANGLE (int n ){
    for(int i = 0 ; i<n ; i++){
        for(int j=0 ; j< i+1 ; j++){
            if((i+j) % 2 ==0){ // operatror precenence 
                System.out.print(1);
            }else {
                System.out.print(0);
            }
        }
                System.out.println();
    }
}

public static void BUTTERFLY_PATTERN(int n){

    for(int i = 0 ; i< n ;i++){
    //   stars  
for ( int j = 0 ; j< i+1 ; j++){
System.out.print("*");
}

    //  spcaes
    for(int j = 0 ; j< 2*(n - i-1) ; j++){
System.out.print(" ");
    }


    // stars 
for ( int j = 0 ; j< i+1 ; j++){
System.out.print("*");
}

System.out.println();
    }

    //  below part 
     for(int i = n-1 ; i>-1 ;i--){
    //   stars  
for ( int j = 0 ; j< i+1 ; j++){
System.out.print("*");
}

    //  spcaes
    for(int j = 0 ; j< 2*(n - i-1) ; j++){
System.out.print(" ");
    }


    // stars 
for ( int j = 0 ; j< i+1 ; j++){
System.out.print("*");
}

System.out.println();
    }
}
public static void SOLIDRHOMBUS(int n){
    for(int i = 0 ; i<n ;i++){
        //  spaces 
        for(int j =0;j<n-i-1;j++){
            System.out.print(" ");
        }
        //  sTARS
         for(int j =0;j<n;j++){
            System.out.print("*");
        }
            System.out.println("");
    }
}

public static void HOLLOWRHOMBUS(int n){
    for(int i = 0 ; i<n ;i++){
        //  spaces 
        for(int j =0;j<n-i-1;j++){
            System.out.print(" ");
        }

        //  sTARS
         for(int j =0;j<n;j++){
           if(j == 0 || j ==n-1 ||i==0 || i ==n-1){ // boundaries condition
            System.out.print("*");
           } else {
            System.out.print(" ");
           }
        }
            System.out.println("");
    }
}

public static void DIAMONDPATTERN( int n){
    for(int i = 0; i< n;i++){
          for(int j =0;j<n-i-1;j++){
            System.out.print(" ");
        }

        for(int j =0 ;j< (2*i-1);j++){
            System.out.print("*");
         
        }
            System.out.println("");
    }
      for(int i = n-1; i>0;i--){
          for(int j =0;j<n-i-1;j++){
            System.out.print(" ");
        }

        for(int j =0 ;j< (2*i-1);j++){
            System.out.print("*");
         
        }
            System.out.println("");
    }
}

public static  void NUMBERPYRAMID(int n ){
    for(int i = 0; i< n ; i++){
         //  spaces 
        for(int j =0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int j = 0 ; j<i+1;j++){
            System.out.print(i+1 + " ");
        }
            System.out.println();
        
    }
}

public static void PALINDROMENUMBERPATTERN(int n){
for(int i = 0; i< n ; i++){
     //  spaces 
        for(int j =0;j<n-i-1;j++){
            System.out.print(" ");
        }
        
        for(int j = i+1 ; j>0  ; j--){
            System.out.print(j);
        }
                for(int j = 2 ; j<i+2   ; j++){
            System.out.print(j);
        }
            System.out.println();
}

}
    
    public static void main(String args[]){
        //   HOLLOWRECT();
        // INVERTEDROTATEDHALFPYRAMID();
        // INVERTEDHALFPYRAMIDwithNumbers(5);
        // FLOYDSTriangle(5);
        //  ZERO_ONETRIANGLE(5);
        // BUTTERFLY_PATTERN(5);
        //  SOLIDRHOMBUS(5);
        // HOLLOWRHOMBUS(5);
        //  DIAMONDPATTERN(5);
    //   NUMBERPYRAMID(5);
    //  PALINDROMENUMBERPATTERN(5);

    }
}