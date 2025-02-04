import java.util.Arrays;

public class ans{
    public static int countVowels(String str){
        int count = 0 ;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'|| str.charAt(i)=='u'){
                  count++;
            }
        }
        return count ;
    }


   public static boolean anagrams(String str1, String str2) {
        // Check if the lengths are the same first
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays, sort them, and compare
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String args[]){
    
        // Question 1 
    //    System.err.println( countVowels("Apples"));

    // ? Question 2 , output guess
    // String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));

        // Question 3 , op guess 
        // System.err.println(str1.replace('l', 't'));
        // ? replace usse karne sse jitne vhi occurece hoge  vo replace ho jayege ,yak hi char ko hum replace method me use kar sakte hai 
        String str = "ApnaCollege".replace("l", "");
        // System.out.println(str);


        // Question 4
        // Determine if two Strings are anagrams of each other.
        // If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider "race" and "care". In this case, "race"'s characters can be formed into "care", or "care"'s characters can be formed into "race".
        //    System.err.println(anagrams("races","cares"));

// ! Intern() , string pool , heap reference 
        String s1 = new String("hello"); // Heap memory
        String s2 = "hello"; // String pool
        String s3 = s1.intern(); // Pool reference return karega
        System.out.println(s1 == s2); // false (heap vs pool)
        System.out.println(s2 == s3); // true (same pool reference)

        
    }
}