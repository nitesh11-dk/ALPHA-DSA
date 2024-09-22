public class java1 {
    public static void main(String args[]){



// ! line number ke hisab se start print karawa hai 
        // for(int i = 0; i < 4 ; i++){

        //     for(int j = 0; j <= i;j++){
        //         System.out.print("*");
        //     }
        //         System.out.print("\n");

        // }


// ? inverse the pattern  n-i+1
        // for(int i = 1; i <= 4 ; i++){

        //     for(int j = 1; j <=4-i+1 ;j++){
        //         System.out.print("*");
        //     }
        //         System.out.print("\n");

        // }


// for(int i = 1; i <= 4 ; i++){
// // char 
//             for(int j = 1; j <= i;j++){
//                 System.out.print(j);
//             }
//                 System.out.print("\n");

//         }



// int number = 65 ;
char alphabet = 'A';

for (int i = 1; i <= 6; i++) {
    for (int j = 1; j <= i; j++) {

        // char alphabet = (char) number;
        // System.out.print(alphabet);
        // number++;

        System.out.print(alphabet);
        alphabet++;
        
    }
    System.out.print("\n");
}



    }
}