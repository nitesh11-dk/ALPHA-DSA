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

public static void prefixArray(int arr[]){
    // prefix array 
    int pre[] = new int[arr.length] ;
    int max = Integer.MIN_VALUE;
    pre[0]= arr[0] ;
    for(int i = 1 ; i < arr.length ; i++){
        pre[i] = pre[i-1] + arr[i] ;
    }

    for(int i = 0 ; i < arr.length ; i++){

        for(int j=0 ; j< arr.length ; j++){
         int sum = i ==0 ? pre[j] : pre[j] - pre[i-1] ; 
            if(max < sum){
                max = sum ;
            }
        }
    }
    System.out.println("Max Sub Array : " + max);
}

public static void kadaneArray( int arr[]){
    int cs = 0 ;
    int max = Integer.MIN_VALUE;
    for(int i = 0 ; i < arr.length ; i++){
        cs += arr[i] ;
        if(max < cs){
            max = cs ;
        }
         if(cs < 0){
            cs = 0 ;
        }
    }
    System.out.println("Max Sub Array : " + max);
}


public static void trappedWater(int heights[]){

//   right auxillary array
//  left auxillary array
// ? loop  
//  waterlevel  =min(leftmax, rightmax)
// trapped water =( waterlevel - current height) * width ;


// !  left auxillary array 
int lft[]= new int[heights.length] ;
lft[0] = heights[0] ;
for(int i = 1 ; i < heights.length ; i++){
    lft[i] = Math.max(lft[i-1], heights[i]);
}

//! right auxillary array
int rft[]= new int[heights.length] ;
rft[heights.length-1] = heights[heights.length-1] ;
for(int i = heights.length-2 ; i >= 0 ; i--){
    rft[i] = Math.max(rft[i+1], heights[i]);
    }

// ! ? Loop a
int trappedwater = 0 ; 
for(int  i =0 ; i < heights.length ; i++){
    int waterlevel = Math.min(lft[i], rft[i]);
     trappedwater += waterlevel - heights[i] ;
}
System.out.println("Trapped Water : " + trappedwater);
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

// ? 12 & 13(BruteForce) Print Sub arrays 
// a continouse part of array 
//  subArray(new int []{1,-2,6,-1,3}); // *  tc = o(n**3)
// hete the toal subarrays = sum of n numbers = n(n+1)/2

//!   ? 14  prefix array 
 prefixArray(new int []{ 1,-2,6,-1,3});
//  ? tc = o(n**2) 

// !   15  Kadane's Algorithm
//  +ve + +ve == +ve
// +Ve + ve = +ve
// +ve + -Ve = -ve
// agar choti si negaive number ari hai to yusko zero hii consider karlo 
// kadaneArray(new int[]{-2,-3,4,-1,-2,1,5,-3}); 
//  * tc = o(n)
//  ? drawback is if all the numbers are -ve then it doesn't work 
// ? yak loop lagake check karlo ki sare negaive number hain kya , then vo array me se  smaallest negaive number nikalo 
// ? tc = o(n)

// ! Tadakata badhakta
// ?  Trapping Rainwater
// Given n non-negative integers representing an elevation
// map where the width of each bar is 1, compute how much
// water it can trap after raining.


//  trapped water = (waterlevel - bar height) * width ;
// ? to calulate water level  we have to take the right maax and leftmax then mimnimum of them 
//  * waterlevel =  min(leftmax , rightmax) 
trappedWater(new int []{4,2,0,6,3,2,5});
//  * tc = o(n)
//  ? to claulate the max right and maxleft stuff we sue auxillary array  / helper array 


    }
}
