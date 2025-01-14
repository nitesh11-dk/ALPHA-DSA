import java.util.* ;

public class assignment {

    public static void main(String[] args) {




//  ### **Question 1: Count the Number of 7’s in a 2D Array**  
// **Problem:**  
// Print the number of times the digit **7** appears in the given 2D array.

// **Example:**  
// ```
// Input: 
// int[][] array = { {4, 7, 8}, {8, 8, 7} };
// Output: 
// 2

// int res = duplicateIn2DArray(new int[][]{{4, 7, 8}, {8, 7, 7}}, 7);
//         System.out.println(res);



        
// ### **Question 2: Sum of Numbers in the Second Row**  
// **Problem:**  
// Print the sum of the numbers in the second row of the given 2D array.

// **Example:**  
// ```
// Input: 
// int[][] nums = { {1, 4, 9}, {11, 4, 3}, {2, 2, 3} };

// Output: 
// 18
// ```

int[][] nums = { {1, 4, 9}, {11, 4, 3}, {2, 2, 3} };

int sum = SecondRow(nums);
// System.out.print(sum);


// ### **Question 3: Find the Transpose of a Matrix**  
// **Problem:**  
// Write a program to find the **transpose** of a given matrix. Transposing a matrix involves swapping its rows with columns.

// **Example:**  
// For a **2x3 matrix**:

// ```
// Matrix:  
// a11 a12 a13  
// a21 a22 a23  
// ```

// The **transposed matrix** will be:

// ```
// a11 a21  
// a12 a22  
// a13 a23  
// ```

Transpose(nums);
// Arrays.stream(arr).forEach(x -> System.out.println(Arrays.toString(x)));



    }

public static void Transpose(int arr[][]){

 int transpose [][] = new int [arr.length][arr[0].length];

       for (int i =0 ; i<arr.length; i++){
        for(int j =0 ; j<arr[0].length ; j++){
               
                 transpose[j][i] = arr[i][j];
        }
       }    

       Arrays.stream(transpose).forEach(x -> System.out.println(Arrays.toString(x)));


}

public static Integer  SecondRow(int arr[][]){
   int sum = 0 ;
   int arrrow[] = arr[1] ;

   for(int i :arrrow ){
    sum += i ;
   }

   return sum ;
}

  public static Integer duplicateIn2DArray(int[][] arr, int num) {
    int count = 0;

    // Use enhanced for loop to iterate through each row and element
    for (int[] row : arr) {
        for (int element : row) {
            if (element == num) {
                count++;  // Increment if the element matches the target number
            }
        }
    }
    
    return count;
}

}