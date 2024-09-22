//*   Decelaring array 

//    ? Valid 
 // int arr[] = {2, 4, 5, 6, 7, 8, 9, 10};
 // int[] arr  = {2,4,5,6}	;
// int   arr []    = {2,3,4};
// int arr[] = new int[30] ;
// int arr[] = new int[20];


// ! Invalid tarika hai ye 
// int arr [];
// int [] arr ;
// int arr [] = int{2,4,5,6};
// int arr []   = new int{2,3,4,5,6};


//  * array as argument in function , now array is passed as  reference not as value , that is  it is called by reference 


// ! invlaid
// update( new int{2,3,4,5,6}); 
// update(  int[20]); 
// update(  int[]{2,3,4,5,6}); 

// update(new int[20]); 
// update( new int[]{2,3,4,5,6}); 


// Loops on array 

for (int i : marks) {
    System.out.print(i + " ");
}


 for(int i = 0 ; i < marks.length ; i++){
   marks[i] = scnr.nextInt();     
    }