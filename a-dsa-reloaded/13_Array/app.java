import java.util.Scanner;

public class App {

    // Method to process and print the array
    public static int[] printArr(int arr[]) {
        // Multiply each element by 2
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = 2 * arr[i];
        // }

        // Print the array
        System.out.println("The array is: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Return the modified array
        return arr;
    }


public static int[] LinearSearch(int arr[],int target){
    for(int i = 0 ; i< arr.length  ; i++ ){
        if(arr[i]== target){
            return new int[]{i};
        }
    }
    return new int[]{-1} ; 
}

public static int LargestedInTheArray(int arr[]){
  int max  = Integer.MIN_VALUE;
 for ( int ar : arr){
   if( max < ar){
       max = ar ;
   }
 }
 return max ;

}

public static int BinarySearch(int arr[],int target){
    int start  = 0 ;
    int end = arr.length -1 ;
    while(start <=end){
        int mid = (start + end )/2;
        if(arr[mid] == target){
            return mid ;
        } else if(arr[mid] < target ) { //right 
                start = mid + 1 ;
        } else {
                end = mid - 1 ;
        }
    } 
    return -1 ;
}

public static int[]   ReverseArray(int arr[]){
    int  start =  0 ; 
    int last = arr.length - 1 ;

    while(start < last ){
         int temp = arr[start];
         arr[start] = arr[last];
         arr[last] = temp ; 
         start++;
         last --;
    }
    return arr ;
}

public static void PairsArr(int arr[]){
 for(int i  = 0 ; i < arr.length ;  i++){
    for(int j = i+ 1; j < arr.length ; j ++ ){ 
               System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
    }
    System.out.println();
 }

}

public static void subArray(int arr[]){
    int total = 0 ;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i = 0 ; i < arr.length ; i++){
        for(int j =i ; j < arr.length ; j++){
            int sum =0;
            for(int k = i ; k<=j;k++){
                // System.out.print(arr[k] + " ");
                sum += arr[k];
            }
            if(max < sum){
                max = sum ;
            } 
            if(min > sum){
                min = sum ;
            }
            total++;
        }
}

// System.out.println("Total Sub Array : " + total);
System.out.println("Max Sub Array : " + max);
System.out.println("Min Sub Array : " + min);
}


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Array passed by reference
        // int[] re = printArr(new int[]{2, 3, 4, 5});
        // Uncomment to print the reference or elements of the returned array
        // System.out.println(re); // Prints reference ID
        // System.out.println(re[0]); // Prints the first element of the modified array


// ? lINEAR sEARCH 
//  LinearSearch();
// System.out.print(LinearSearch(new int []{2,3,4,5,6,7} ,1)[0]);

// ? Larget elem in the array 
// System.out.print( LargestedInTheArray(new int []{2,3,4,8934,4,4,34,5}));

//  ? Binary Search  // array must be in sorted manner 
// System.out.print( BinarySearch(new int []{2,32,342,2323,6666,77777},77777));
// T(0) -> n ,n/2 ,n/4 ,n/8 ... = n/2**k , n = 2 **k , k =log(n)

// ? Reverse of an array 
// printArr(ReverseArray(new int []{1,2,3,4,5,6}));

// ? 11 Pairs  in an array 
// PairsArr(new int[]{2,4,6,8,10});
// ? sum of total pairs =  n(n-1)/2
// ? tc = o(n**2)

// ? 12 Print Sub arrays 
// a continouse part of array 
 subArray(new int []{2,3,4,5,6,}); // tc = o(n**3)
// hete the toal subarrays = sum of n numbers = n(n+1)/2


    }
}
