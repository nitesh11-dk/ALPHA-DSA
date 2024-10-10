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