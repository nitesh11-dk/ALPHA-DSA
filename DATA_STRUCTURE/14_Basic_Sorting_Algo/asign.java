public class asign{

public static void bubbleSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] < arr[j + 1]) {  // Sort in decreasing order
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }  
    }
}

public static void selectionSort(int arr[]){
    for(int i= 0; i<arr.length-1;i++){
        int minpos = i;
        for(int j = i+1 ; j<arr.length ;j++){
         if(arr[minpos] < arr[j]){
            minpos = j ;
         }   
        }
        //  swapping minpos and i 
        int temp = arr[minpos];
        arr[minpos] =  arr[i];
        arr[i] = temp;
    }
}


public static void insertionSort(int arr[]){
    for(int i = 1 ;i<arr.length;i++){
        int curr = arr[i] ;
        int prev = i -1;
        while(prev >=0 && arr[prev] < curr){
            arr[prev+1] = arr[prev];
            prev --;
        }
        arr[prev+1] = curr ; 
    }
}

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
    // Sorting
    int j = 0;
    for (int i = count.length - 1; i >= 0; i--) {  // Iterate backward
        while (count[i] > 0) {
            arr[j] = i; // Place the value `i`
            j++;
            count[i]--;
        }
    }
}


 public static void main(String args[]){

//  ! BUbble sort 
// int arr[] = new int[]{1,2,3,82,6,7,8,9};
int arr[] = new int[]{13, 6, 2, 10, 7, 48, 3, 11};
// ? muje agar pahale se hii aray sorted hai to yuske liye kam nahi hora hai 
// bubbleSort(arr); 


// ! Selection Sort 
// selectionSort(arr);

//  ! Insertion Sort 
// insertionSort(arr);

// ! Counting Sort 
 countingSort(arr);

for( int i:arr){
    System.out.print(i + ",");
}      
    }
}