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


    public static void main (String args[]){

//  * Bubble Sort
// large elements come to the end of array by swapping with adjacentelements
//  if array is by deault sorted then , the in first turn only no swapping is done do return from there only 
int arr[] =new int[]{1,2,3,20,44}; 
// bubbleSort(arr);

// ? BUBBLE SORT ME HUM BADE ELEMENT KO LAST ME RAKHTE HAI
//  ? SLEECTION SORT ME HUM SMALL ELEMENT KO FIRST ME RAKHTE HAI 
//  ? selection me jada swaping nahi hoti hai 
//  * selection sort me hum pahale chote element dhunde hai then yusko swap karte hai , jisase ki  am  swaping hoti hai ,ha  hum ye chiz bubble sort me vhi kar sakte hai ... 

//  * sELECTION SORT 
// pick the smallest (from unsorted), put it at the beginning
//  selectionSort(arr);


// * Insertion sort 
// Pick an element(from unsorted part) & place in the right pos in sorted part
insertionSort(arr);



for(int  j: arr){
            System.out.print(j);
        }

    }
}