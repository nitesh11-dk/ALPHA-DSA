```markdown
# Java Code with Explanation for Each Question

---

## Question 1: Spiral Matrix Traversal  

### Code:
```java
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
            if (startRow == endRow) break; // Avoid duplicate row print
            System.out.print(arr[endRow][j] + " ");
        }

        // Left
        for (int i = endRow - 1; i >= startRow + 1; i--) {
            if (startCol == endCol) break; // Avoid duplicate column print
            System.out.print(arr[i][startCol] + " ");
        }

        // Move the boundaries inward
        startCol++;
        startRow++;
        endCol--;
        endRow--;
    }
}
```

### Explanation:
1. Start from the outermost boundary of the matrix.
2. Traverse the top row, then the right column, bottom row, and left column in order.
3. Move the boundaries inward and repeat until all elements are traversed.

---

## Question 2: Diagonal Sum  

### Code:
```java
public static void diagonalSum(int arr[][]) {
    int sum = 0;

    // Optimized approach - O(n)
    for (int i = 0; i < arr.length; i++) {
        // Primary diagonal
        sum += arr[i][i];
        // Secondary diagonal (avoiding double-count)
        if (i != arr.length - 1 - i) {
            sum += arr[i][arr.length - i - 1];
        }
    }

    System.out.print(sum);
}
```

### Explanation:
- **Primary Diagonal:** Elements where `i == j`.  
  For example, in a 3x3 matrix, `(0,0), (1,1), (2,2)` belong to the primary diagonal.
  
- **Secondary Diagonal:** Elements where `i + j == n - 1`.  
  For example, in a 3x3 matrix, `(0,2), (1,1), (2,0)` belong to the secondary diagonal.

- **Avoid Double Counting:** Skip the element if it belongs to both diagonals (`i == n - 1 - i`).

---

## Question 3: Staircase Search  

### Code:
```java
public static void stairCaseSearch(int arr[][], int tar) {
    int row = 0;
    int col = arr[0].length - 1;

    while (row < arr.length && col >= 0) {
        if (arr[row][col] == tar) {
            System.out.print("Found at [" + row + " ," + col + "] ");
            return;
        } else if (tar < arr[row][col]) {
            col--; // Move left
        } else {
            row++; // Move down
        }
    }
    System.out.println("Key not found");
}
```

### Explanation:
1. Start from the top-right corner of the matrix.
2. If the target value is smaller than the current element, move left (`col--`).
3. If the target value is larger, move down (`row++`).
4. Continue until the target is found or the search exceeds the matrix boundary.

### Time Complexity:
- **Worst Case:** `O(n + m)` where `n` is the number of rows and `m` is the number of columns.
```