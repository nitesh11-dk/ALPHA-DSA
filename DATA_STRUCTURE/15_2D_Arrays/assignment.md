### **Question 1: Print the number of 7’s in the 2D array**

**Solution:**  
```java
public class CountSevens {
    public static void main(String[] args) {
        int[][] array = { {4, 7, 8}, {8, 8, 7} };
        int count = 0;

        for (int[] row : array) {
            for (int num : row) {
                if (num == 7) {
                    count++;
                }
            }
        }

        System.out.println("Number of 7's: " + count);
    }
}
```

**Output:**  
```
Number of 7's: 2
```

---

### **Question 2: Sum of the numbers in the second row**

**Solution:**  
```java
public class RowSum {
    public static void main(String[] args) {
        int[][] nums = { {1, 4, 9}, {11, 4, 3}, {2, 2, 3} };
        int sum = 0;

        // Assuming the second row index is 1
        for (int num : nums[1]) {
            sum += num;
        }

        System.out.println("Sum of second row: " + sum);
    }
}
```

**Output:**  
```
Sum of second row: 18
```

---

### **Question 3: Transpose of a Matrix**

**Solution:**  
```java
public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transposed Matrix:");
        for (int[] row : transpose) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
```

**Output:**  
```
Transposed Matrix:
1 4 
2 5 
3 6 
```