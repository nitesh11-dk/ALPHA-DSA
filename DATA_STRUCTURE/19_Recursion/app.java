public class app {
    public static void printNum(int num) {
        if (num == 1) { // Base case , that is end of recursion
            System.out.print(num);
            return;
        }
        printNum(num - 1);
        System.out.print(num + " ");

        // ! for decreaesing
        // System.out.print(num + " ");
        // printNum(num -1);
    }

    public static int fact(int num) {
        if (num <= 1) { // Base case , that is end of recursion
            return 1;
        }
        // int factorial = 1;
        int fn = num * fact(num - 1);
        return fn;
    }

    public static int sumOfN(int num) {
        if (num == 1) {
            return 1;
        }

        int fn = num + sumOfN(num - 1);
        return fn;
    }

    public static void main(String args[]) {

        // ! increasing and decresing order
        // printNum(10);

        // ! factorial of a number
        // System.out.print(fact(4));
        // ! sum of n numbers
        // System.out.print(sumOfN(3));

        // * +++++++++++++++++++++

        // ? fibonaccii series
        // System.out.print(fib(22));

        // ? check if the even array is sorted or not
        // System.out.print(isSorted(new int []{2,3,4,5,8,},0));

        // ?? WAF to find a first occurance of an element in an arry
        // System.out.print(firstOccurance(new int []{2,3,4,3,6,7,5},5,0));

        // ?? WAF to find a last occurance of an element in an arry
        // ! dout to nahi hai , but samja nahi indetail
        // System.out.print(lastOccurance(new int []{2,3,4,3,6,7,5,5,5,5,5},5,0));

        // ? x to the power
        // System.out.print(power(2,10));
        // ? x to the power - OPtimized 0(logn)
        // * x^n ==> 2^4 ( n== even) = x ^ n/2 * x ^ n/2
        // * x^n ==> 2^5 ( n== odd) = x * x ^ n/2 * x ^ n/2
        // System.out.print(optimisedPower(2,10));

        // ? Tilling problem
        // Given a "2 x n" board and tiles of size "2 x 1", count the number of
        // ways to tile the given board using the 2 x 1 tiles.
        // (A tile can either be placed horizontally or vertically. )
        // System.out.print(tillingPlat(4));

        // * Remove Duplicates in a string
        // only small alphapet included , if capatial , symbol or number is thhere we
        // can use hash set
        // System.out.print()
        // rmvDup(0 , "hellllllo",new boolean[26],new StringBuilder(""));

        // ! Friends Pairing Problem
        // ? Given n friends, each one can remain single or can be paired up with some
        // other
        // ? friend. Each friend can be paired only once. Find out the total number of
        // ways in
        // ? which friends can remain single or can be paired up.
        // System.out.print(friendParing(3));

        // Binary
        // Strings Problem
        // Print all binary strings of size N without consecutive ones.
        binaryNumber(3, 0, " ");

    }

    public static void binaryNumber(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kamm
        binaryNumber(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            binaryNumber(n - 1, 1, str + "1");
        }

    }

    public static int friendParing(int n) {

        ///base case 
        if (n == 1 || n == 2)
            return n;
        // //option
        // //single
        // int fnm1 = friendParing(n-1);
        // //paired
        // int fnm2 = friendParing(n-2);
        // int pairedTotal = (n-1)* fnm2 ;

        // int totalWays = fnm1 + pairedTotal ;
        // return totalWays ;

        // inshort
        return friendParing(n - 1) + (n - 1) * friendParing(n - 2);

    }

    public static void rmvDup(int index, String str, boolean map[], StringBuilder newStr) {

        // base
        if (index == str.length()) {
            System.out.print(newStr);
            return;
        }

        // kamm
        char currchar = str.charAt(index);
        if (map[currchar - 'a'] == true) {
            rmvDup(index + 1, str, map, newStr);
        } else {
            map[currchar - 'a'] = true;
            rmvDup(index + 1, str, map, newStr.append(currchar));
        }
    }

    public static int tillingPlat(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // choices
        // vertical choices
        int fnm1 = tillingPlat(n - 1);

        // horizontal
        int fnm2 = tillingPlat(n - 2);

        int total = fnm1 + fnm2;
        return total;

    }

    public static int optimisedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimisedPower(x, n / 2);
        // int halfPowerSqr = optimisedPower(x,n/2) * optimisedPower(x,n/2); ye time
        // complexity same hi hoga like 0(n) ekuu kii 2 bar call hori hai stuff
        int halfPowerSqr = halfPower * halfPower;
        // n is odd
        if (n % 2 != 0) {
            halfPowerSqr = x * halfPowerSqr;
        }
        return halfPowerSqr;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1 =power(x,n-1)
        // int xn = x * xnm1;
        // return xn ;

        return x * power(x, n - 1);
    }

    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOccurance(arr, key, i + 1);
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);

    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;

    }
}

// 1 to 10