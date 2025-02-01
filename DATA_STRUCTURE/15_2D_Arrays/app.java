import java.util.*;

public class app {
    public static void main(String args[]) {

        // Spiral matrix example
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Calling the spiral matrix function
        // spiralMat(matrix);

        // ? Diagonal SUm 
        // *  only n =m 
        //  > LT to BR --> Primary diagonal  == i ==j
        // RT to LB --> Secondary diagonal == i+j ==n-1 
        diagonalSum(matrix);
        
    }

    public static void spiralMat(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                // Avoid duplicate row print
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }

            // Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                // Avoid duplicate column print
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }

            // Move the boundaries inward
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }


public static void diagonalSum(int arr[][]){ 
    int sum = 0 ;

// ? brute force method  o(n**2)
    // for(int i = 0 ; i < arr.length;i++){
    //     for(int  j  =0;j<arr[0].length;j++){
    //         if(i==j){
    //             sum+= arr[i][j];
    //         } else if (i+j ==arr.length-1) {
    //             sum+= arr[i][j];
    //         }
    //     }
    // } 

//  ? better aproach --> o(n)
for(int i = 0; i<arr.length;i++){
    // ?pd 
    sum+=arr[i][i];
    //sd including common case 
    if(i != arr.length -1-i)
        sum+=arr[i][arr.length-i-1]; // i+j ==n-1 , tf j = n-1-i
}
    // System.out.print(sum);
}


}
