import java.util.*; // nodemon error dera hai agar * use kiya to like code ko repeated way mee run kiya to  

public class app {


    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        //  ! Decelaring array 
     int arr[] = new int[10];
    //     arr[0] = scnr.nextInt();
    //     arr[1] = scnr.nextInt();
    //  arr[1] += 23;
    //     System.out.println( "your arrays is " + arr[0]);
    //     System.out.println( "your arrays is " + arr[1]);
    //     sncr.close();
        

// ? 2.  array as argument , in this senerio , array is passed by reference 

//  invlaid
// update( new int{2,3,4,5,6}); 
// update(  int[20]); 
// update(  int[]{2,3,4,5,6}); 

// update(new int[20]); 
// update(scnr ,  new int[]{2,3,4,5,6}); 


// ?  preinting array method; 
// printArr(new int [30]);
// printArr(new int [] {2,3,4,5});
// printArr(new int [40]);




// ? Linear  Search

// int arr2[] = {2,3,4,5,6};

// int target = 0 ;
// LinearSearch(arr2 , target);
// LinearSearch(new int[]{2,3,4,5,6} , 2);

//  int res = LargestInArray(new int[]{2,89,4,5,6});
//  System.out.println(res);

// ! BinarySearch(arr2 , target);
// BinarySearch( new int[]{2,3,4,5,6,7}, 4);
// T o(log n) 

//  ! reverse an array 
// ? method one // o(n) , o(n)
// ReverseArrayM1(new int[]{2,3,4,5,6});
// ? method two // by using binary search concept 
int[] originalArray = new int[]{2,3,4,6,6,6,5,5,5,5,5,5,5,5,5,5,5,3,63,6,36,3,56,36,3,6,3,63,6,3,6,3,6,36,36,3,6,36,3,6,3,63,6,3,6,3,63,6,3,63,6,3,63,6,36,3,6,36,3,63,6,34,5,6};
// ReverseArrayM2(originalArray);


// ! pairs in array
// PairInArray(new int[]{2,3,4,5,6,7}); // total number of parus = n(n-1) /2


// ! sub array && max of the SUbarray Method - 1 (Brute Force)
// SubArray(new int[]{1,-2,6,-1,3});
 // T o(n**3)
// n(n+1) /2

// ! max Subarray , METHOD - 2 (Prefix array)
// SubArray1(new int[]{1,2,3,4,5});
// T o(n**2)  , so optimized than brute force

//  ! KADANE 'S ALGO , T o(n) -- more efficient
//  sare negative numbers agar huye to kam nahi akrega kadane 
// Kadane(new int[]{-1,-2,-3});
// KadaneBetter(new int[]{-1,-2,-3,3,5});

//  ! Trapping ka
Trapping_Rain_Water(new int[]{6,5,4,3});

    }

    public static void Trapping_Rain_Water( int arr[]){
          int leftMaxBoundariesArray[] = new int[arr.length];
          int rightMaxBoundariesArray[] = new int[arr.length];

 int max = Integer.MIN_VALUE ; 
//  int max = arr[0]; 
          for(int i = 0 ; i< arr.length ; i++){
              if(max < arr[i]){
               leftMaxBoundariesArray[i] = arr[i];
               max = arr[i];
              }else {
               leftMaxBoundariesArray[i] = max;

              }
          }

//   max = arr[arr.length-1]; 
max = Integer.MIN_VALUE ;
          for(int i = arr.length -1 ; i >= 0 ; i--){
              if(max < arr[i]){
               rightMaxBoundariesArray[i] = arr[i];
               max = arr[i];
              }else {
               rightMaxBoundariesArray[i] = max;

              }
          }
int wl[] = new int[arr.length];
         for ( int i = 0 ; i<arr.length ; i++){
              wl[i] = Math.min(leftMaxBoundariesArray[i],rightMaxBoundariesArray[i]);
         }
         for(int i : wl){
            System.out.print(i);
         }



    }

 public static void KadaneBetter(int arr[]){
int ms = Integer.MIN_VALUE ;
int cs = 0 ;

boolean isAllNegative = true ;
for( int i :arr){
    if( i > 0 ){
        isAllNegative = false ;
        break; // gpt 
    }
}

if(isAllNegative){
   for(int i : arr){
    ms = Math.max(ms ,i);
   }
} else {
for(int i = 0 ; i <arr.length ; i++){
    cs = cs + arr[i];
    if(cs  <0){
        cs = 0;
    }
    ms = Math.max(cs ,ms) ;
}
}
System.out.print(ms);

    }


    public static void Kadane(int arr[]){
int ms = Integer.MIN_VALUE ;
int cs = 0 ;

for(int i = 0 ; i <arr.length ; i++){
    cs = cs + arr[i];
    if(cs  <0){
        cs = 0;
    }
    ms = Math.max(cs ,ms) ;
}
System.out.print(ms);

    }

public static void SubArray1(int arr[]){
    int preArr[] = new int[arr.length];

    //     int sum0 = 0 ;
    // for(int i = 0; i<preArr.length ;i++){
    //     sum0 += arr[i];
    //     preArr[i] = sum0 ;
    // }

    // better way to calculate prefix array 

    preArr[0] = arr[0] ;
    for(int  i =1 ; i< arr.length ; i++){

        preArr[i]= preArr[i-1]+arr[i];
    }

int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;
for(int i = 0;i<arr.length ; i++){

    for(int j = 0 ;j<arr.length ;j++){
    int sum = i == 0 ? preArr[j] : preArr[j] - preArr[i-1];
    if(sum > max){
        max = sum;
    }
    if(sum < min){
            min = sum ;
    }

    }

}
    System.out.println(max);

    // for(int i : preArr){
    //     System.out.print(i + " ");
    // }

}

public static void SubArray(int arr[]){
int ts = 0;
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;

    for(int i=0; i<arr.length; i++){
        for (int j = i  ; j<arr.length ;j++){
        int sum = 0 ;    
for(int k = i ;k <= j; k++){
    System.out.print(arr[k] + " "); // sub array 
    sum += arr[k]; 
    ts++;
}
if(sum > max){
    max = sum;
}
if(sum < min ){
    min = sum;
}

            System.out.println();
        }
            System.out.println();
    }
            System.out.println( " min is " + min );
            System.out.println( " max is "  + max);

}

public static void PairInArray(int arr[]){
int tp = 0 ;
    for(int i = 0 ; i < arr.length -1; i++){
        for(int j = i +1 ; j < arr.length  ; j++){
            System.out.print("(" + arr[i] + "," + arr[j] + ")");
            tp++;
        }
            System.out.println();
    }
            System.out.println(tp);
}

public static void ReverseArrayM2(int arr[]){
 int start = 0 , end = arr.length -1 ;
 for(int i = start ; i <= (start + end)/2 ; i++){
    int temp = arr[i];
    arr[i] = arr[end ];
    arr[end ] = temp;
  
  start++ ;
  end--;
 }
 for(int i : arr){
    System.out.print(i + " ");
 }

}

    public static void ReverseArrayM1(int arr[]){
        int revarr[] = new int[arr.length];
        for(int i = 0 ; i < arr.length ;    i++){   
           revarr[arr.length -i-1] = arr[i]  ; 
 
        }
        
        for(int i : revarr){
            System.out.print(i + " ");
        }
    }

    public static int BinarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
         
         while(start <=end){
            //  int mid = start + end / 2 ;
            int mid = start +(end - start) / 2;

           if(arr[mid] ==key){
            System.out.println(" we found key at " + mid);
            return mid;
           } else if(arr[mid] > key){
            end = mid -1 ;
           } else {   
            start = mid + 1 ;
           }
         }

            System.out.println(" we dont found  key " + key);
return -1 ;
    }

public static  int LargestInArray(int num[] ){
int max = Integer.MIN_VALUE;
for(int i: num){
    if( i> max ){
    max = i ;
    }
}
return max ;

}


public static void LinearSearch(int arr[] ,int target){

    for (int i : arr){
        if( i == target){
            System.out.println("we find that array ");
            return;
        } 
    }
     System.out.println("we dont find the target");
}

public static void  printArr(int arr[]){
System.out.print("[");
    for (int i : arr) {
            System.out.print(i + " ");
        }

System.out.println("]");
}


public static void update(Scanner scnr , int marks[]){
// Scanner scnr = new Scanner(System.in);
    for(int i = 0 ; i < marks.length ; i++){
        System.out.println("Enter the vlaue for index " + i);
   marks[i] = scnr.nextInt();     
    }

    //  for(int i = 0 ; i < marks.length ; i++){
    //     System.out.print(" the vlaue are " + marks[i]);
    // }

            System.out.println("The elements in the array are :-");
for (int i : marks) {
            System.out.print(i + " ");
        }
            System.out.println("");

}



}
