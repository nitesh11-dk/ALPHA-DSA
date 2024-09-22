public class app {
    public static void main (String args[]){



// ! Hollow Rectangle 


// ! Better  more better 
// hollowRect(5,5); 

// Inverted_half_pyramid_with_numbers(5);


// Floyds_Triangle(5);


// Binary_Triangle(5);

// Butter_pattern(15);

// Solid_Rhombus(10);

// Hollow_Rhombus(5);

// Diamond_Pattern(5);

// Numbers_Pyramid(5);
Palindrome_Number(5);

    }

//  ! Boundry condition ; 
//   1  to total row 
//  1 to totcol 


public static void hollowRect(int totcol , int totrow){
for( int i = 1 ; i <= totrow ; i++){ 
    for(int j  = 1  ; j <=totcol ; j++){
        if( i ==1 || j  == 1 || i==totrow ||  j ==totcol){
            System.out.print("*");
        } else {
            System.out.print(" ");
            
        }
    }
    System.out.println("");
}
}


public static void  INVERTED_ROTATED_HALF_PYRAMID(int totrow  , int  totcol){

for(int line = 1 ; line <= totrow ; line++){
    for(int star = 1 ; star <= totcol ;star++){
        if(star <=totcol-line){
 System.out.print(" ");
        } else {
 System.out.print("*");
        }
    }
 System.out.print("\n");

}
}

public static void Inverted_half_pyramid_with_numbers(int num){

for( int i = 1 ; i <=num ; i ++){

    for(int j = 1 ; j <= num - i +1 ;  j++){
        System.out.print(j);
    }
        System.out.print("\n");
}

}



public static void  Floyds_Triangle(int num){

  int counter = 1 ;
for( int i = 1 ; i <=num ; i ++){
    for(int j = 1 ; j <= i ;  j++){
        System.out.print(counter + "  ");
        counter++ ;
    }
        System.out.print("\n");
}

}

public static void  Binary_Triangle(int num){

for( int i = 1 ; i <=num ; i ++){
    for(int j = 1 ; j <= i ;  j++){
       if((i + j) % 2 == 0){
        System.out.print(1);
       } else{
        System.out.print(0);

       }
    }
        System.out.print("\n");
}

}


public static void  Butter_pattern(int num){

for( int i = 1 ; i <=num ; i ++){
       for (int star1 = 1; star1 <= i; star1++) {
            System.out.print("*");
        }
     
for( int spaces = 1 ; spaces <= (num-i)*2 ; spaces++){
System.out.print(" ");
}
      for (int star2 = 1; star2 <= i; star2++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    for( int i = num ; i>=1 ; i--){
       for (int star1 = 1; star1 <= i; star1++) {
            System.out.print("*");
        }
     
for( int spaces = 1 ; spaces <= (num-i)*2 ; spaces++){
System.out.print(" ");
}
      for (int star2 = 1; star2 <= i; star2++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}

public static void Solid_Rhombus(int num){

    for(int i =  0 ; i < num ; i++){

      for(int j = 0 ; j <num - i-1 ; j++ ){
        System.out.print(" ");
      }



      for(int j = 0 ; j <num  ; j++ ){
        System.out.print("*");
      }

        System.out.println("");
      
    }
}


public static void Hollow_Rhombus(int num){

   for(int i =  0 ; i < num ; i++){

      for(int j = 0 ; j <num - i-1 ; j++ ){
        System.out.print(" ");
      }



      for(int j = 0 ; j <num  ; j++ ){
          if ( j ==0 || j == num-1 || i == 0 ||  i == num-1 ){
            System.out.print("*");
          }else {
            System.out.print(" ");
          }
      }

      System.out.println("");
    }
}



public static void Diamond_Pattern(int num ){

for(int i = 0 ;  i < num ; i++){

    for(int j = 0 ; j < num - i -1 ; j++ ){
        System.out.print(" ");
    }

    for ( int  j = 0 ; j < 2*i +1 ; j ++){
        System.out.print("*");

    }
        System.out.println();

}


for(int i = num -1   ;  i >=  0; i--){

    for(int j = 0 ; j < num - i -1 ; j++ ){
        System.out.print(" ");
    }

    for ( int  j = 0 ; j < 2*i +1 ; j ++){
        System.out.print("*");

    }
        System.out.println();

}


}


public static void Palindrome_Number(int num) {
    for (int i = 0; i < num; i++) {

        // Print leading spaces
        for (int j = 0; j < num - i - 1; j++) {
            System.out.print(" ");
        }

        // Print descending numbers
        for (int j = i + 1; j >= 1; j--) {
            System.out.print(j );
        }

        // Print ascending numbers (starting from 2)
        for (int j = 2; j <= i + 1; j++) {
            System.out.print(j);
        }

        // Move to the next line
        System.out.println();
    }
}

} 