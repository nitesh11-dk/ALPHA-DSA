// import java.util.*;
public class app {

    public static void main(String[] args) {

        // String
        // ? String ka immutable hai
        // char arr[] = {'a','b','c','d','e'};

        String str = "abcd";
        String str2 = new String("xyz");
        // String str3 = new String(arr);

        // System.out.println(str);
        // System.out.println(str2);
        // System.out.println(str3);

        // Scanner sc = new Scanner(System.in);
        // String str4 = sc.next(); // only accept single word
        // String str5 = sc.nextLine(); // accept multiple words or a line
        // System.out.println(str4);
        // System.out.println(str5);

        // ? String Length

        // System.out.println(str.length());
        // Array.length
        // System.out.println(str2.length());

        // ? String CharAt
        String strconcat = str + str2;

        System.out.println(strconcat);

        // ? palindrome or not
        // System.out.print(isPalindrome("madam"));
        // T 0(n)

        // ? Question 2
        // Given a route containing 4 directions (E, W, N, S),
        // find the shortest path to reach destination.
        // Math.sqrt retrun a type double so make sure you do type casting
        // System.out.print(getShortestDist("EEENNNN"));

        // ? comparsion
        // System.out.print("Hello" == "Hello");
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        System.out.println(s1 == s2); // true --> because when we are decelaring this two string withour new keyword
                                      // so both the string is pointing towarech each other
        System.out.println(s1 == s3); // false -- > here it is false due to new keyword so the adress of both of the
                                      // string is differnt
        // the concept used is interning
        // == checks at object level to compare the values and not the address
        // so we use method as equals

        // System.out.println(s1.equals(s3)); // now it is comparing the values not the
        // adress of the obejct

        // ? Substring
        // continue part of the string
        // System.out.println(str.substring(1,4)); // here 3 is excluded

        // * Question 3
        // For a given set of Strings, print the largest string.
        // "apple", "mango", "banana"
        // lexicographically , like alphabetical order

        // compareTo --> A != a
        // compareToIgnoreCase --> A == a

        // printLargest(new String[]{"apple", "mango", "banana"});
        // T O (n * m)

        // ? Interning

        // ? due to immutablity nature os string there is a differnt data structure
        // caleeed stringbuilder
        StringBuilder sb = new StringBuilder("Hello ");
        System.out.println(sb);
        System.out.println(sb.append("World"));
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }
        // System.out.println(sb); // TO(n) , if you are using a string here then the
        // time complexity will be O(n *n)
        // System.out.print(sb.length());

        // we can use .tostring methods on objects , just rememeber on object it means
        // it will only work for Integer not for int okay

        // Question 4
        // For a given String convert each the first letter of each
        // word to uppercase.
        // "hi, i am shradha"
        // System.out.print(toUpper("hello keses ho app "));

        // Question 5
        // String Compression
        // "a3b2c3d2"
        // "aaabbcccdd"
        // agar single time ara hai to direct print karna hai
        System.out.print(compress("aaaaaabbcccdd"));

    }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++; // yaha par i++ kiya hai so Time o(n)hoga qkii loop string ke legth ke barabar
                     // hii chal raha hai
            }
            ;
            if (count == 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append(str.charAt(i)).append(count);
            }
            count = 1;
        }
        return sb.toString();
    }

    public static String toUpper(String str) {
        StringBuilder sb = new StringBuilder("");

        char c = Character.toUpperCase(str.charAt(0));
        sb.append(c);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));

            }
        }

        return sb.toString();

    }

    public static void printLargest(String[] fruits) {

        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];

            }
        }
        System.out.print(largest);
    }

    public static float getShortestDist(String path) {
        int y = 0;
        int x = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }

        return (float) Math.sqrt(x * x + y * y);
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}