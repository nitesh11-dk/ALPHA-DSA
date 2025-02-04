// Bit-wise Operators
// Binary AND &
// Binary OR
// Binary XOR
// Binary Left Shift <<
// Binary Right Shift

public class app {

    public static void main(String[] args) {
        // Binary One's Complement
        // System.err.println(~5); // -6
        // LSB ,MSB
        // if MSB == 0 , +ve sign , ==1 , -ve sign
        // 5 -->first 1's comp , then 2's comp , then we get 6 ,the -ve sign becoz of
        // msb ==1

        // ? Binary Left shitf <<
        // a <<b = a * 2 ^b
        // System.err.println(5<<4);
        // 32 bit , java me deafult hota hai , so always cosider more thatn 8 bits for
        // calulations
        // ! Binary Right shitf >>
        // System.err.println(5>>4);
        // System.err.println(6>>1);

        // ! QUestion 1 Check if a number is odd or even
        // if odd lsb == 1 , if even the lsb ==0
        // here we will use and opertaor beacuse anynum & 1 ==> anynumber
        // so here the bitMask = 1
        int bitMask = 1;
        int num = 0;
        // if((num & bitMask) ==1){
        // System.err.println("odd");
        // } else{
        // System.err.println("even");
        // }

        // ! sosme opeartions
        // * get ith bit
        // number & 000001 00(1<<i)
        // getBit(5,0);

        // * set ith bit // 0 --> 1
        // number | 000001000(1<<i)
        // System.err.println( setBit(5,3)); // 0 --> 1

        // * clear ith bit // 1 -> 0
        // System.err.println(clearBit(5, 2));

        // ?! Update ith bit 0 or 1
        // System.err.println(updateBit(5,1,1));

        // ! Clear last i bits
        // -1<<<i --> num & 1111000 ( i ==3)
        // System.err.println(clearIBits(15, 2));

        // ! Clear range of bits (16)
        // System.out.println(clearIBits(10, 2,4));

        // ? check if the a number is a power of 2 or not
        // n & n-1 ==0
        // 16 & 15 == 0
        // System.out.println(powerOf2(1024));

        // ? count set bits in a number ( 1 ko count karo ) -asked
        // t (logn) --> logtobase2(n)
        // 16 -- > 10000
        // System.out.println(countSet(7));

        // ? fast Exponentiation //TODO: ghanta nahi smaja
        // normal o(n) , by using bitman o(logn)
        // fastExpo(5,3)
        System.out.println(fastExpo(5,2));


        //  ? modular exponentiation
        
    }

    public static void getBit(int n, int pos) {
        int bitMask = 1 << pos;
        if ((n & bitMask) == 0) {
            System.err.println(0);
        } else {
            System.err.println(1);
        }
    }

    public static int setBit(int n, int pos) {
        int bitMask = 1 << pos;
        return n | bitMask;
    }

    public static int clearBit(int n, int pos) {
        int bitMask = ~(1 << pos);
        return n & bitMask;
    }

    public static int updateBit(int n, int pos, int newBit) {
        // if(newBit ==0){
        // return clearBit(n, pos);
        // } else {
        // return setBit(n, pos);
        // }
        // TODO: understand this
        n = clearBit(n, pos);
        int Bitmask = newBit << pos;
        return n | Bitmask;
    }

    public static int clearIBits(int n, int pos) {
        // int Bitmask = -1 <<pos;
        int Bitmask = ~0 << pos;
        return n & Bitmask;
    }

    public static int clearIBits(int n, int i, int j) {
        int a = (-1) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean powerOf2(int n) {
        return (n & n - 1) == 0;
    }

    public static int countSet(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // check our lsb
                count++;
            }
            ;
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int n, int pow) {
        int ans = 1;
        while (pow > 0) {
            if ((n & 1) != 0) {
                ans = ans * n;
            }
            n = n * n;
            pow = pow >> 1;
        }
        return ans;
    }



}
