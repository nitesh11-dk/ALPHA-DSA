import java.util.*;

public class app {

   public static void main(String args[]) {

      // ? String
      char a[] = { 'a', 'b', 'c', 'd' };
      String str = "abcd";
      String str2 = new String("xyz");
      // System.out.println(a);
      // System.out.println(str);
      // System.out.println(str2);

      // ? Strings are immutable
      Scanner sc = new Scanner(System.in);
      String name;
      // name = sc.next(); // take the first word before the spaces
      // name = sc.nextLine(); // take the whole line
      name = "Nitesh Kushwaha";// take the whole line
      // System.out.println(name.length()); //? string ke yander appko .length()
      // method ya function jese call karna padta hai

      // ? to find the character from the string
      // * chatAt
      // System.out.println(name.charAt(2));
      // pS(name);

      // ! QUestion 1
      // * CHeck if the sting is palindorme or not
      // System.out.print(isPalindrome("nitesh"));

      // ! Question 2
      // * Given a route containing 4 directions (E, W, N, S),
      // * find the shortest path to reach destination.
      // * "WNEENESENNN"
      // System.out.print(shortestDistance("WNEENESENNN"));

      // ! String Comparison
      String s1 = "Tony";
      String s2 = "Tony";
      String s3 = new String("Tony");
      // if(s1 ==s3){
      // System.out.print("hello");
      // }
      // s1 ans s2 are equal , but s1==s2 != s3 , because it is crated by new String
      // and athe concept behind this is interning

      // ? to get rid of this we can use a fucntion called equals that checks only the
      // values stored in that string
      // if(s1.equals(s3)) System.out.println("hello");

      // ! SubString
      // continious part of the string
      // ! subsequence
      // the word which is formed from the letters prenst in the string
      String strr = "niteshKushwaha";
      // System.out.println(strr.substring(0,4));
      // System.out.println(subString(strr,0,4));

      // ! Question 3
      // For a given set of Strings, print the largest string.
      // "apple", "mango", "banana"
      // ? lexicographicorder --> the first which come first is small , a<b
      // * to do this we use .compareTo , in this a & A ar treated differently but in
      // compareToIgnoreCase is treated as same
      // ? s1.compareTo(s2)
      // * 1. == 0 equal
      // * 2. <0 , s1<s2
      // * 3. > 0 , s1>s2
      String fruits[] = { "apple", "grapes", "watermelon", "zedex" };
      // System.err.println(printLargest(fruits));

// ! String Builder 






   }

   public static void pS(String str) {
      for (char i = 0; i < str.length(); i++) {
         System.out.print(str.charAt(i));
      }
   }

   public static boolean isPalindrome(String str) {
      for (char i = 0; i < str.length() / 2; i++) {
         if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            return false;
         }
      }
      return true;
   }

   public static float shortestDistance(String str) {
      int x = 0;
      int y = 0;
      for (char i = 0; i < str.length(); i++) {
         if (str.charAt(i) == 'N')
            y++;
         else if (str.charAt(i) == 'E')
            x++;
         else if (str.charAt(i) == 'S')
            y--;
         else if (str.charAt(i) == 'W')
            x--;
      }
      x = x * x;
      y = y * y;

      return (float) Math.sqrt(x + y);

   }

   public static String subString(String str, int start, int end) {
      String substr = "";
      for (int i = start; i < end; i++) {
         substr += str.charAt(i);
      }
      return substr;
   }

   public static String printLargest(String[] str) {
      String largest = str[0];
      for (int i = 0; i < str.length; i++) {
         if (largest.compareToIgnoreCase(str[i]) < 0) {
            largest = str[i];
         }
      }

      return largest;
   }





}