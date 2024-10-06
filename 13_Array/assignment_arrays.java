public class assignment_arrays {
    public static void main(String[] args) {       

// ?         Question 1: Given an integer array nums, return true if any value appears at least twice in the  array, and return false if every element is distinct.
// if  duplicate --> true , not false 
// System.out.print(Duplicate_Num(new int[]{2,3,4,5,}));

// ? Question 2: There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
// *  Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums. You must write an algorithm with O(log n) runtime complexity.

// Haan, bilkul sahi samjha! Tumhe sirf yeh check karna hai ki nums array mein target value exist karti hai ya nahi. Tumhe rotate operation nahi karna hai; bas check karna hai ki agar target array mein hai, toh uska index return karo. Agar target nahi hai, toh -1 return karo.
// Isko efficient tarike se O(log n) time complexity mein karna hoga,
// System.out.println(TargetExist(new int []{2,3,4,5,6}, 11));


// The question is as follows:
// !  Question 3: You are given an array prices, where prices[i] is the price of a given stock on the i-th day. You need to return the maximum profit you can achieve from this transaction.
// Note: You can only buy and sell the stock once. If you cannot achieve any profit, return 0.
// Input:
// An array prices[] of integers where each element represents the stock price on a specific day.
// Output:
// An integer representing the maximum profit you can achieve from one transaction (buy and then sell). If no profit can be made, return 0.
// System.out.println(
// Max_Profit(new int[] {7,2,5})
// );


// Question 4: Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.


System.out.println(
Trapped_water(new int[] {4,2,0,3,2,5}));

// pythyon - 14 , 15 , 16 ,


// *  Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j],
// nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets





    }

public static int Trapped_water(int height[]){
// Lmax - 
int Lmax[] = new int[height.length];
Lmax[0] = height[0] ;
for(int i = 1 ; i< height.length ; i++){
Lmax[i] = Math.max(Lmax[i-1] , height[i]);
}

//  Rmax 
int Rmax[] = new int[height.length];
Rmax[height.length-1] = height[height.length-1];
for(int i = height.length -2 ; i>=0 ; i--){
    Rmax[i] = Math.max(Rmax[i+1] , height[i]);
}

int tw = 0 ;
for(int i = 0 ; i < height.length ; i++){
    // waterLevel = min(Lmax[i] , Rmax[i])
     int wl = Math.min(Lmax[i] , Rmax[i]) ; 
    // trapped water = waterLevel - height[i]
    tw += wl - height[i];
    
}

return tw ;


}
public static int Max_Profit(int prices[]){
 int buy_prce = Integer.MAX_VALUE ;
 int maxpf = 0 ;

for(int i : prices){
if(buy_prce < i){
 int pf = i - buy_prce;
maxpf = Math.max(maxpf , pf);
} else {
    buy_prce = i ;
}
}

return maxpf  ;

}

public static int TargetExist(int arr[] , int  target){
int start =0 ;
int  end = arr.length -1 ;

while ( start <= end){
    // int mid = start + end / 2 ;  // this is not right due to occurcen predence in java bacuse shere end/2 is evalualted first 
    int mid = (start + end )/ 2 ;
    //   int mid = start + (end - start) / 2;
       
       if(arr[mid] == target){
        return mid ;
       } else if (arr[mid] > target){
        end  = mid -1 ;
       } else {
        start = mid + 1;
       }

}

return -1 ;

}


public static boolean Duplicate_Num(int arr[]){
for(int i = 0 ; i <arr.length;i++){
    for(int j = i+1 ; j<arr.length;j++){
        if(arr[i] ==arr[j]){
            return true;
        }
}
}
return false ;
}
}