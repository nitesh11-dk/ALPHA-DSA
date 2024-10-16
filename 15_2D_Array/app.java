import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Taking input in a 2x2 matrix
        int arr[][] = new int[2][2];
        System.out.println("Enter 4 elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scnr.nextInt();
            }
        }

        // Display the matrix
        System.out.println("Matrix:");
        Arrays.stream(arr).forEach(x -> System.out.println(Arrays.toString(x)));

        // Example: Searching in 2D matrix (Uncomment if needed)
        // System.out.print("Enter the target number: ");
        // int target = scnr.nextInt();
        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 2; j++) {
        //         if (target == arr[i][j]) {
        //             System.out.println("Found at: (" + i + "," + j + ")");
        //         }
        //     }
        // }

        // Example of a larger 4x4 matrix for spiral traversal
        int largeArr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Spiral Order:");
        spiralMatrix(largeArr);
    }

    // Method to print the matrix in spiral order
    public static void spiralMatrix(int arr[][]) {
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Top row
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(arr[rowStart][i] + " ");
            }

            // Right column
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");
            }

            // Bottom row (if applicable)
            if (rowStart < rowEnd) {
                for (int i = colEnd - 1; i >= colStart; i--) {
                    System.out.print(arr[rowEnd][i] + " ");
                }
            }

            // Left column (if applicable)
            if (colStart < colEnd) {
                for (int i = rowEnd - 1; i > rowStart; i--) {
                    System.out.print(arr[i][colStart] + " ");
                }
            }

            // Move to the inner layer
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        System.out.println(); // Print a newline at the end
    }
}
