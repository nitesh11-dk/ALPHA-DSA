class app{

    public static void main(String args[]){


// ? Bubble sort
// bubbleSort(new int[]{4,9,15,17,5,8});
bubbleSortM2(new int[]{1,2,3,4,5,6}); // also handles for average case 
//  agar pahale hi trun me yak bar vhi swaping nahi hoti hai to break kardo loop se
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