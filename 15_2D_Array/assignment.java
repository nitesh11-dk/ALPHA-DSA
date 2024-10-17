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

int res = duplicateIn2DArray(new int[][]{{4, 7, 8}, {8, 7, 7}}, 7);
        System.out.println(res);
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