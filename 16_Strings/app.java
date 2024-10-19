import java.util.*;
public class app {

    public static void main(String[] args) {
        

     //  String 
    //   ? String ka immutable hai
     char arr[] = {'a','b','c','d','e'};

     String str = "abcd";
     String str2 = new String("xyz");
     String str3 = new String(arr);

    //  System.out.println(str);
    //  System.out.println(str2);
    //  System.out.println(str3);

    Scanner sc = new Scanner(System.in);
    // String str4 = sc.next(); // only accept single word 
    // String str5 = sc.nextLine(); // accept multiple words or a line 
    // System.out.println(str4);
    // System.out.println(str5);

    //  ? String Length 

    // System.out.println(str.length());
    //  Array.length
    // System.out.println(str2.length());

// ? String CharAt
String strconcat = str + str2;

// System.out.println(strconcat);


// ? palindrome or not 
// System.out.print(isPalindrome("madam"));
//  T 0(n)


    }


    public static boolean isPalindrome(String str) {    
        for(    int i = 0; i < str.length() / 2; i++) {

            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }       
        }
        return true;
    }
}