
public class arrass{

public static boolean duplicateArr(int arr[]){
boolean isDuplicate = false;   
for (int i = 0;i< arr.length -1 ;i++){
    if(arr[i] ==arr[i+1]){
        isDuplicate = true;
    }
}
return isDuplicate;
}


public static int binarySearch(int arr[],int target){
    //  we aspect the arr must be sorted 
int start = 0;
int end = arr.length -1;
while(start <= end){
 int mid =( start + end)/2;
 if(arr[mid] ==target){
    return mid;
 } else if(arr[mid] < target) {
    start = mid +1 ;
 }else {
    end = mid -1 ;
 }
}
 return -1 ;
}



public static int buySellStock(int arr[]){
    int buyingPrice = Integer.MAX_VALUE;
    int maxProfit = 0 ;
    for(int i = 0 ; i< arr.length; i++){
        if(buyingPrice < arr[i]){
            int profit = arr[i] - buyingPrice;
         maxProfit = Math.max(profit , maxProfit);
        } else {
            buyingPrice = arr[i];
        }
    }
    return maxProfit;
}

public static int trappingRainWater(int arr[]){
// left auxillary array 
//  right auxillary array 
// loop 
//  waterlevel  =min(leftmax, rightmax)
// trapped water =( waterlevel - current height) * width ;

// left auxillary array ;
int lft [] = new int[arr.length];
lft[0]=arr[0];
for(int i = 1 ; i< arr.length;i++){
    lft[i]= Math.max(lft[i-1],arr[i]);
}
// right auxillary array ;
int rht[] = new int[arr.length];
rht[arr.length -1] = arr[arr.length -1];
for(int i = arr.length -2 ;i>= 0 ; i--){
    rht[i]= Math.max(rht[i+1],arr[i]);
}
//  loop 
int trappedWater = 0 ;
for(int i = 0 ; i< arr.length ; i++){
     int  waterlevel = Math.min(lft[i],rht[i]);
     trappedWater +=( waterlevel - arr[i]);
}
return trappedWater;
}


public static void main(String args[]){
// boolean res = duplicateArr(new int []{2,3,4,4,5,6,7});

// int res = binarySearch(new int []{2,3,4,5,5},4); //! DOUT WILL SOLVE AGAIN 

// int res =buySellStock(new int []{7,1,5,3,4,4});

// int res = trappingRainWater(new int[]{7, 4, 5, 6, 7, 2, 5, 6, 3, 4});
//*  ONE MORE SOULTION 

// int duplicateTriplet(new int []{2,3,4,})
//  ! MORE TECHNIQUE IS REQUIRED TO SOLVE THIS  , WILL SOLVE LATER ON 
// System.out.print(res);
}
}