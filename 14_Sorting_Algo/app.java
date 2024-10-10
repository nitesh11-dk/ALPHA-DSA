 import java.util.Arrays;
import java.util.Collections;

class app{

    public static void main(String args[]){

 
// ? Bubble sort
// bubbleSort(new int[]{4,9,15,17,5,8});
// bubbleSortM2(new int[]{1,2,3,4,5,6}); // also handles for average case 
//  agar pahale hi trun me yak bar vhi swaping nahi hoti hai to break kardo loop se
// best case -- o(n) 
// wrost case -- o(n**2) 

//  ? Selection Sort 
// int res[]=  slelectionSort(new int[]{2,6,3,9,4,5});
// // wrost case -- o(n**2) 
// for(int i : res){       
//     System.out.println(i);
// }

// ? Insertion sort 
// wrost case -- o(n**2) 
//  int res[]=insertionSort(new int []{5,4,1,2,3});
//  for(int i : res){
//      System.out.println(i);
//  }
 
//  ? Inbuilt Sort
// import java.util.Arrays;
// Arrays.sort(arr)
// Arrays.sort(arr, startingIndex, EndingIndex)
//  O(n log (N))


// int[] res = {4,9,2,-2,17,5,8};
// int[] res =new int[] {4,9,2,-2,17,5,8};
// Arrays.sort(res);
// System.out.print(Arrays.toString(res));

// System.out.println(Arrays.toString(Arrays.sort(new int[]{4,9,15,17,5,8})));
// * You can't write it in one line like that because Arrays.sort() returns void, not an array. It sorts the array in-place, meaning it modifies the original array.
// * So, when you try to pass the result of Arrays.sort() to Arrays.toString(), the compiler complains because Arrays.toString() expects an array, but Arrays.sort() doesn't return anything (void).
//  ? that means Arrays.sort() void retrun karta hai , aur hum arra .srot method ko dete hai vo really me change ya yusko sort kar deta hai 

//  ! Coustom Indexes
// Arrays.sort(arr, startingIndex, EndingIndex)
// Arrays.sort(res, 0,5); // ye shirf pahale 5 values of array ko hii sort karega
// System.out.print(Arrays.toString(res));

//  ? decreasing order me karna hai to we use collections 
// import java.util.Collections ;
// int [] res = new int[]{4,9,2,-2,17,5,8};
//  dekho yaha par collections.reverseOrder() ye method jo hai vo kam karte hai shrif obejcts par  aur hum use kar rahe hai staring se int --> that is primitive time so abb to use int as object we need  to decelare array with "Iterger " 

Integer [] res = {4,9,2,-2,17,5,8};
// Arrays.sort(res,Collections.reverseOrder());
Arrays.sort(res,2,5,Collections.reverseOrder());
System.out.print(Arrays.toString(res));





    }

    public static int[] insertionSort(int arr[]){
        
        for(int i = 1; i< arr.length; i++){

            int curr = arr[i] ;
            int prev = i -1 ;
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            };
            arr[prev+1] = curr ;
        };
        return arr;
    }

 
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

}