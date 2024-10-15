import java.util.*;

public class app {

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
           
        //  ? taking input in 2d matrix 
        int arr [][] = new int [2][2];
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = scnr.nextInt();
            }
        }
        //   Arrays.stream(arr).forEach(x-> System.out.println(Arrays.toString(x)));        
        Arrays.stream(arr).forEach(x-> System.out.println(Arrays.toString(x)));

//  ? searching in 2d matrix

System.out.print("Enter the target number : ");

int target = scnr.nextInt();

      for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                if(target == arr[i][j]){
                     System.out.print("("+i+","+j+")");
                     
                }
            }
        }
          

//    ? Spiral Matrix 



            
       


    }
}