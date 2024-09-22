public class java2 {

    public static void main (String args[]){


!  HOLLOW RECTANGLE pattern - 1 
 for(int line = 1 ; line <=4 ; line++){
    for(int star = 1 ; star <=5 ; star++){
if(line ==2 || line ==3){
    if(star ==1 || star ==5){
    System.out.print("*");
    } else{
    System.out.print(" ");
    }
}


else{
    System.out.print("*");
}
 }
    System.out.print("\n");
 }



//!  HOLLOW RECTANGLE pattern - 2 (efficient) 

 for(int line = 1 ; line <=4 ; line++){
    for(int star = 1 ; star <=5 ; star++){
if(line ==1 || line == 4  ||star == 1 ||star  == 5 ){
    System.out.print("*");
} else{
    System.out.print(" ");
}
 }
    System.out.print("\n");
 }

// ! INVERTED & ROTATED HALF-PYRAMID pattern -- 1

for(int line = 1 ; line <= 4 ; line++){
    for(int star = 1 ; star <=4 ;star++){
        if(star <=4-line){
 System.out.print(" ");
        } else {
 System.out.print("*");
        }

    }
 System.out.print("\n");

} 

//! INVERTED HALF-PYRAMID with Numbers pattern 

for(int line = 1 ; line <= 5 ; line++){
    for(int star = 1 ; star <=5-line+1 ;star++){
 System.out.print(star);
    }
 System.out.print("\n");

} 


// !FLOYD'S Triangle pattern --1
int number = 1;
for(int line = 1 ; line <= 5 ; line++){
    for(int star = 1 ; star <= line ;star++){
 System.out.print(number + " ");
 number++;
    }
 System.out.print("\n");

} 






  }
}