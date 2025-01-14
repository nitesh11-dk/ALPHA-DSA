import java.util.*;

public class app {
    public static void main(String[] args){

// ! fIRST  data structure   " Array" ;
// List of Elements of the same type placed in a contiguous memoty location 


// int marks[] = new int[50];

// int  marks[] = {1,2,3};

// int[] marks = {1,2,3,4};
// int marks[] = {1,2,3,4};
// int  marks[] = {};
// int marks[50];❌
// int marks[] = new int[]; //❌
// int marks[] =   int[];//❌
// int marks[] =  new int[30];//❌


// int[] temparr; // Declaring the array
// temparr = new int[10]; // Initializing with size
// temparr[0] = 5; // Now you can add elements
// temparr[1] = 10;



// String fruits[] = {"apple" , "banana" ,"Grapes"};
// System.out.print(marks);
// System.out.print(fruits[0]);

//  ! input /output ;

Scanner scnr = new Scanner(System.in);

// int marks[] = new int[100] ;
// int[] marks = new int[100] ;

// marks[0] = scnr.nextInt();
// marks[1] = scnr.nextInt();
// marks[2] = scnr.nextInt();

// marks[2] += 1;
// System.out.println(marks[0]);

// System.out.println(marks.length);


// ? arry as argument in method , but it  called by reference only ;


int div[] = {97 ,99 ,100};


//  for (int i = 0 ; i <div.length ; i++){
//          System.out.print(div[i] +",");
//         }
//          System.out.println();

// incByOne(div);
//          System.out.println();

//  for (int i = 0 ; i <div.length ; i++){
//          System.out.print(div[i] +",");
//         }
//   hence proved it is call by reference only 


// ?  Linear search ;

//  String res = LinearSearch(9);
//  System.out.println(res);


//  ! largest and smallest from the array 

//   int[]  res = FindLargeSmall(new int[]{2,3,4,21313,5,6,7});


//   System.out.println(res[0]);
//   System.out.println(res[1]);


// ! Binary search 
// System.out.print(binarySearch(new int[]{2,4,6,8,10}, 12));

//  ! Reverse a Array : - 
// 


int arr[] = {2, 3, 4, 5, 6};
        // int temparr[] = new int[arr.length];

        // for (int i = arr.length - 1; i >= 0; i--) {
        //     temparr[arr.length - 1 - i] = arr[i];
        // }

        // arr = temparr;

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }


//  yaha par T O(n) and S O(n) ;

//!  Another way
//  ? by using swaping 

int first = 0 ;
int last = arr.length -1;
while (first < last){
int temp = arr[last];
arr[last] = arr[first];
arr[first] = temp ;
last-- ;
first ++ ; 
} 

//  for (int i = 0; i < arr.length ; i++) {
//             System.out.print(arr[i]+" ");
//         }
//  yaha par T O(n/2)==> O(n) and S O(1) ;

 

//  ! Pairs in an array 
// PairsInAnArray(new int[]{2,3,4,5,6,7,2});

// ! Print Subarrays 
//! MaxSubarray Sum
//  means a continuous part of array 
//  [2,,4,6,8,10]
//  [2,4,6] ❌
//  [2,4,6,10]❌
// SubArrays(new int[]{2,4,6,8,10});

//  ! O(n **3) , very bad 

// ? max Subarray Sum  - by prefix  array 

//  prefix arry = 
//  [2,3,4,5,6] ===== [2,5,9,14,20] ---- prefix[i-1](previous sum ) + arr[i]
// in loop  prefix[end] - prefix[start -1]
// SubArraysPrefixSum(new int[]{2,4,6,8,10});

// time comp is O(n**2) 

// ||| Kadane's Algo -- IMP 
KadaneAlgo(new int[] {-2  ,-3,  4 });
//  T O(n) --- better 

//  ?  there is the issue if all the eleme in array is negative it give  o as a max sum 


//!  Trapping Rainwater
// Given n non-negative integers representing an elevation
// map where the width of each bar is 1, compute how much
// water it can trap after raining.

// water traped  = (wl - bar height) * width ;
// water level = min(max left boundry , max right boundry);


// Auxillaries array  / Helper array 



    }




public static void  KadaneAlgo(int arr[]){
int cs  =0;
 int  ms= Integer.MIN_VALUE ;

for(int i = 0 ; i < arr.length ; i++){
cs = cs + arr[i];

 if(cs < 0){
    cs = 0 ;
 } 

 ms = Math.max(cs , ms);

}
System.out.println(ms);


}


public static void SubArraysPrefixSum(int[] arr){
int maxSum = Integer.MIN_VALUE ;
int minSum = Integer.MAX_VALUE ;
int prefix[] = new int[arr.length];

prefix[0] = arr[0];
// calulating the prefix 
for(int i = 1 ; i < prefix.length ; i++){
    prefix[i] = prefix[i-1] + arr[i]; 
}

for(int i = 0 ; i< arr.length;i++){

 int start =  i ; 

    for( int j = i ; j < arr.length ; j++ ){
    int end  = j ;
    int sum = start == 0 ?   prefix[end] : prefix[end] - prefix[start-1];
// agar start  = 0 huya to error milega 
    

    if(sum > maxSum){
        maxSum = sum ;
    } 
    
     if (sum < minSum) {
        minSum = sum ;
    }
    System.out.println();

    }
}
System.out.print( maxSum + " ," + minSum);

}


public static void SubArrays(int[] arr){
int maxSum = Integer.MIN_VALUE ;
int minSum = Integer.MAX_VALUE ;

for(int i = 0 ; i< arr.length;i++){

 int start =  i ; 

    for( int j = i ; j < arr.length ; j++ ){
    int end  = j ;
    int sum = 0;

    for(int k = start ; k <=end ; k++){
        System.out.print(arr[k] +" ,");
        sum +=arr[k];
    }
    if(sum > maxSum){
        maxSum = sum ;
    } 
    
     if (sum < minSum) {
        minSum = sum ;
    }
    System.out.println();

    }
}
System.out.print( maxSum + " ," + minSum);

}


public static void PairsInAnArray( int[] arr){

int tp= 0 ;
int tpo = (arr.length *(arr.length -1))/2; 
for(int i = 0  ; i < arr.length; i++){

    for(int j  = i+1  ; j<arr.length; j++){

        System.out.print("(" + i + "," + j +")");
        tp++;
    }
    System.out.println();
}
    System.out.println(tp);
    System.out.println(tpo);

}


// ! Binary search 
// prerequistie -- Sorted Arrays 

public static int binarySearch(  int[] numbers , int key){


 int start = 0 ;
 int end = numbers.length -1 ;

 while(start <= end){

 int mid =( start + end)/2 ;

 if(numbers[mid]== key ){
    return mid ;
 } else if ( numbers[mid] < key){
    start = mid + 1 ;
 }else {
    end = mid - 1 ;
 }

 }

 return -1 ;


}



 public static int[] FindLargeSmall(int arr[]){

int largest = Integer.MIN_VALUE ;
int smallest = Integer.MAX_VALUE ;

    for(int i = 0 ; i < arr.length; i++){
        if( largest < arr[i]){
            largest = arr[i];
        }

        if(smallest > arr[i]){
            smallest = arr[i];
        }
    }

    return  new int[]{largest , smallest};
 }


















     public static  void incByOne(int marks[]){

        for (int i = 0 ; i <marks.length ; i++){
            marks[i] += 1;
        }

        
        for (int i = 0 ; i <marks.length ; i++){
         System.out.print(marks[i] +",");
        }

     }

public static String LinearSearch(int key) {
    int marks[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    
    for (int i = 0; i < marks.length; i++) {
        if (marks[i] == key) {
            return "Yes, we found it at index " + i;
        }
    }
    
    return "Oh!! no, the key does not exist in the database.";
}

    




}