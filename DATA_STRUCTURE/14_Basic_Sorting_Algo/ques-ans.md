# Sorting Algorithms in Descending Order

This document demonstrates how to sort an array in **descending order** using the following sorting algorithms:

1. **Bubble Sort**  
2. **Selection Sort**  
3. **Insertion Sort**  
4. **Counting Sort**

We use the example array:
```java
int arr[] = {13, 6, 2, 10, 7, 48, 3, 11};
```

---

## 1. **Bubble Sort (Descending Order)**
```java
public static void bubbleSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] < arr[j + 1]) {  // Sort in descending order
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }  
    }
}
```
### Explanation:
- Compare adjacent elements and swap if the current element is less than the next element.
- Repeat this process for all elements until the array is fully sorted.

---

## 2. **Selection Sort (Descending Order)**
```java
public static void selectionSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
        int maxPos = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[maxPos] < arr[j]) {
                maxPos = j;
            }   
        }
        // Swap maxPos and i
        int temp = arr[maxPos];
        arr[maxPos] = arr[i];
        arr[i] = temp;
    }
}
```
### Explanation:
- Find the maximum element in the unsorted part of the array.
- Swap it with the first element of the unsorted part.
- Repeat until the entire array is sorted.

---

## 3. **Insertion Sort (Descending Order)**
```java
public static void insertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
        int curr = arr[i];
        int prev = i - 1;
        while (prev >= 0 && arr[prev] < curr) {
            arr[prev + 1] = arr[prev];
            prev--;
        }
        arr[prev + 1] = curr;
    }
}
```
### Explanation:
- Take each element and insert it into its correct position in the sorted part of the array.
- Maintain a descending order by shifting elements greater than the current element.

---

## 4. **Counting Sort (Descending Order)**
```java
public static void countingSort(int arr[]) {
    int max = Integer.MIN_VALUE;

    // Find the maximum element in the array
    for (int i = 0; i < arr.length; i++) {
        max = Math.max(arr[i], max);
    }

    // Frequency counter
    int count[] = new int[max + 1];
    for (int i = 0; i < arr.length; i++) {
        count[arr[i]]++;
    }

    // Sorting in descending order
    int j = 0;
    for (int i = count.length - 1; i >= 0; i--) {  // Iterate backward
        while (count[i] > 0) {
            arr[j] = i; // Place the value `i`
            j++;
            count[i]--;
        }
    }
}
```
### Explanation:
- Find the maximum element to determine the size of the counting array.
- Count the occurrences of each element.
- Populate the original array in descending order by iterating the counting array backward.

---

## **Example Output:**
For the input array:
```
{13, 6, 2, 10, 7, 48, 3, 11}
```
Each sorting algorithm will produce:
```
48, 13, 11, 10, 7, 6, 3, 2
```

### Notes:
- Ensure the appropriate sorting function is called in the `main()` method.
- Example usage:
```java
bubbleSort(arr);
```
- Print the sorted array using:
```java
for (int i : arr) {
    System.out.print(i + ", ");
}
```

