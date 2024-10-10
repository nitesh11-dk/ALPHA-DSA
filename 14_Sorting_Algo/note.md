Here is the requested markdown file with proper notes and formatting:

```markdown
# Sorting Algorithms in Java

## 1. Bubble Sort

### Code:
```java
public static void bubbleSort(int arr[]){
    for(int i = 0 ; i < arr.length - 1 ; i++){
        for ( int j = 0 ;  j < arr.length - 1- i ; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    for(int i : arr){
        System.out.println(i);
    }
}
```

### Explanation:
- **Best case**: O(n) — occurs when the array is already sorted, and no swapping happens.
- **Worst case**: O(n^2) — occurs when the array is sorted in reverse order, requiring maximum swaps.
- The outer loop controls how many passes we make over the array, and the inner loop handles the swapping.

## 2. Bubble Sort (Optimized)

### Code:
```java
public static void bubbleSortM2(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
        boolean swapped = false;
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }

    for (int i : arr) {
        System.out.println(i);
    }
}
```

### Explanation:
- This version of bubble sort stops early if no swaps happen in a pass, making it more efficient in the best case.
- **Best case**: O(n), where no swaps are needed.
- **Worst case**: O(n^2).

## 3. Selection Sort

### Code:
```java
public static int[] slelectionSort(int arr[]){
    for(int i = 0 ; i < arr.length - 1 ; i++){
        int minpos = i ;
        for(int j = i+1 ; j <arr.length ; j++){
             if( arr[minpos] >arr[j] ){
                 minpos = j;
             }
        }
        int temp = arr[minpos];
        arr[minpos] = arr[i];
        arr[i] = temp;
    }
    return arr;
}
```

### Explanation:
- **Worst case**: O(n^2), as it requires n passes even for a sorted array.
- The algorithm selects the smallest element from the unsorted part and swaps it with the first unsorted element.

## 4. Insertion Sort

### Code:
```java
public static int[] insertionSort(int arr[]){
    for(int i = 1; i< arr.length; i++){
        int curr = arr[i];
        int prev = i -1;
        while(prev >=0 && arr[prev]>curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev+1] = curr ;
    }
    return arr;
}
```

### Explanation:
- **Best case**: O(n), when the array is already sorted.
- **Worst case**: O(n^2), when the array is sorted in reverse order.
- This algorithm builds the sorted array one element at a time by comparing and inserting the element in its correct position.

---

## 5. Comparison of Sorting Algorithms

| Algorithm      | Time Complexity (Best) | Time Complexity (Worst) | Space Complexity | Stable |
|----------------|------------------------|-------------------------|------------------|--------|
| Bubble Sort    | O(n)                    | O(n^2)                  | O(1)             | Yes    |
| Selection Sort | O(n^2)                  | O(n^2)                  | O(1)             | No     |
| Insertion Sort | O(n)                    | O(n^2)                  | O(1)             | Yes    |

---

## 6. Java Inbuilt Sorting Methods

### Code:
```java
// Sorts the array in-place in ascending order
Arrays.sort(arr);

// Sorts the array in-place within the given range
Arrays.sort(arr, startingIndex, endingIndex);

// Sorts an array of objects in reverse order using Collections
Integer[] res = {4,9,2,-2,17,5,8};
Arrays.sort(res, 2, 5, Collections.reverseOrder());
System.out.print(Arrays.toString(res));
```

### Explanation:
- `Arrays.sort()` is an inbuilt method in Java that sorts arrays efficiently using a **Timsort** algorithm (a hybrid sorting algorithm derived from merge sort and insertion sort).
- **Time Complexity**: O(n log n) for the average and worst cases.
- It works for both primitive types and object arrays. When sorting in reverse order, you need to use `Collections.reverseOrder()` which only works for objects like `Integer[]`.

---
```
