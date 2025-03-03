public class app {
    public static void printNum(int num){
        if(num ==1 ){ // Base case , that is end of recursion 
            System.out.print(num);
            return;
        }
        System.out.print(num + " ");
        printNum(num -1);
    }
    public static void main (String args []){
        printNum(10);
    }
}