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

    public static void main (String args[]){

//  * Bubble Sort
// large elements come to the end of array by swapping with adjacentelements
//  if array is by deault sorted then , the in first turn only no swapping is done do return from there only 
int arr[] =new int[]{1,2,3,4,5,6}; 
// bubbleSort(arr);





// for(int  j: arr){
//             System.out.print(j);
//         }

    }
}