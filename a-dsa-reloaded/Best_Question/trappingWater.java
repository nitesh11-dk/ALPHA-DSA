public class trappingWater {

    public static void trappedWater(int heights[]){

//   right auxillary array
//  left auxillary array
// ? loop  
//  waterlevel  =min(leftmax, rightmax)
// trapped water =( waterlevel - current height) * width ;


// !  left auxillary array 
int lft[]= new int[heights.length] ;
lft[0] = heights[0] ;
for(int i = 1 ; i < heights.length ; i++){
    lft[i] = Math.max(lft[i-1], heights[i]);
}

//! right auxillary array
int rft[]= new int[heights.length] ;
rft[heights.length-1] = heights[heights.length-1] ;
for(int i = heights.length-2 ; i >= 0 ; i--){
    rft[i] = Math.max(rft[i+1], heights[i]);
    }

// ! ? Loop a
int trappedwater = 0 ; 
for(int  i =0 ; i < heights.length ; i++){
    int waterlevel = Math.min(lft[i], rft[i]);
     trappedwater += waterlevel - heights[i] ;
}
System.out.println("Trapped Water : " + trappedwater);
}

    
    public static void main(String[] args) {
        
// ?  Trapping Rainwater
// Given n non-negative integers representing an elevation
// map where the width of each bar is 1, compute how much
// water it can trap after raining.


//  trapped water = (waterlevel - bar height) * width ;
// ? to calulate water level  we have to take the right maax and leftmax then mimnimum of them 
//  * waterlevel =  min(leftmax , rightmax) 
trappedWater(new int []{4,2,0,6,3,2,5});
//  * tc = o(n)
//  ? to claulate the max right and maxleft stuff we sue auxillary array  / helper array 

    }
}