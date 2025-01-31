import java.util.Arrays;
import java.util.Collections;

public class app{

    public static int bubbleSort(int arr[]){
for (int turn = 0 ; turn< arr.length -1 ;turn++){
    int swap =0;
for (int j = 0 ; j< arr.length -1-turn; j++){
       if(arr[j] >arr[j+1 ]){ 
    int temp = arr[j];
    arr[j]= arr[j+1];
    arr[j+1]=temp;
    swap++;
       }    
}
       if (swap ==0 && turn==0){
System.out.print("already sorted");
    return  0;
}
}
    return 1;
    }

public static void selectionSort(int arr[]){
for(int i =0;i<arr.length -1;i++){
    int minPos = i ;
    for(int j = i+1 ; j<arr.length;j++){
    if(arr[minPos] > arr[j]){
        minPos = j;
    }
    }
    int temp = arr[minPos];
    arr[minPos]= arr[i];
    arr[i]=temp;
}
}


public static void insertionSort(int arr[]){
    for(int i = 1 ; i<arr.length;i++){
        int curr= arr[i];
        int prev  = i -1 ;
        while(prev >=0 && arr[prev] > curr){
            arr[prev +1] =arr[prev];
            prev-- ;
        }
        //  insertion
        arr[prev+1] = curr ;
    }
}




public static void  countingSort(int arr[]){
   int largest = Integer.MIN_VALUE;
   for(int i = 0;i<arr.length; i++){
    largest = Math.max(largest,arr[i]);
   }
   int count[] =  new int[largest+1]; // staring from zero ,tf
   for(int i = 0;i<arr.length;i++){
    count[arr[i]]++;
   }
//    sorting 
int j = 0 ;
for(int i = 0;i<count.length;i++){
    while(count[i] >0){
   arr[j]= i;
   j++;
   count[i]--;
    }
}

}


    public static void main (String args[]){

//  ! Bubble Sort
// large elements come to the end of array by swapping with adjacentelements
//  if array is by deault sorted then , the in first turn only no swapping is done do return from there only 
int arr[] =new int[]{1,245,4}; 
// bubbleSort(arr);

// ? BUBBLE SORT ME HUM BADE ELEMENT KO LAST ME RAKHTE HAI
//  ? SLEECTION SORT ME HUM SMALL ELEMENT KO FIRST ME RAKHTE HAI 
//  ? selection me jada swaping nahi hoti hai 
//  * selection sort me hum pahale chote element dhunde hai then yusko swap karte hai , jisase ki  am  swaping hoti hai ,ha  hum ye chiz bubble sort me vhi kar sakte hai ... 

//  ! sELECTION SORT 
// pick the smallest (from unsorted), put it at the beginning
//  selectionSort(arr);


// ! Insertion sort 
// Pick an element(from unsorted part) & place in the right pos in sorted part
// insertionSort(arr);


// ! Java Inbuild Sorting
// int arr2[] = new int[]{10,6,5,8,4};
// Arrays.sort(arr2);
// Arrays.sort(arr2,0,2); //? (arrayname , startIndex , endIndex)

// * Reverse sorting is done Using Collections
// int arr2[] = {10,6,5,8,4}; // get errore when reverse order int[] is not applicable
// ? ReverseOrder work on Objects types not on primitive types 
Integer arr2[] = {10,6,5,8,4}; 
Arrays.sort(arr2,Collections.reverseOrder());
// ?  by deafult reverseOrder uses comparator 

//  ! Counnting sort 
//  ? it is used where , the number we want to sort are not too big 
// ? +ve , minumun range , we can say the range is small 
int arrr[] = {2,3,5,32,6,23,52};
 countingSort(arrr);
//  ? agar -ve negative number huya to
//  yunko +ve jaise treat kare , aur yunko yak naye arr me dal le  
//  then yus arryako count sort karle then yunko decesending  me  kar le 
// to then negative wale numbers ko +ve walo ko sat front me  concat karde then negative wale array ko -ve sign dede 
// ? but the counting sort is done on +ve numbers only and also the range of numbers should be low no matter what is the quantity of the numbers 



for(int  j: arrr){
            System.out.print(j + ",");
        }

    }
}