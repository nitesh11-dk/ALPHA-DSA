## **Answers to the String Questions**

---

### **Question 1**  
**Count how many times lowercase vowels occurred in a String entered by the user.**

**Answer:**  
```java
public static int countVowels(String str){
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
            str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
            count++;
        }
    }
    return count;
}
```

**Example:**  
Input: `"Apples"`  
Output: `2`  

---

### **Question 2**  
**What will be the output of the following code?**
```java
public class Solution {
    public static void main(String args[]) {
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));
    }
}
```

**Answer:**  
Output:  
```
false true
```

**Explanation:**  
- `str.equals(str1)` compares `"ShradhaDidi"` with `"ApnaCollege"`, which are not equal, so it returns `false`.  
- `str.equals(str2)` compares `"ShradhaDidi"` with `"ShradhaDidi"`, which are equal, so it returns `true`.

---

### **Question 3**  
**What will be the output of the following code?**
```java
public class Solution {
    public static void main(String args[]) {
        String str = "ApnaCollege".replace("l", "");
        System.out.println(str);
    }
}
```

**Answer:**  
Output:  
```
ApnaCoege
```

**Explanation:**  
- All occurrences of the character `'l'` are removed from `"ApnaCollege"`. Hence, the output becomes `"ApnaCoege"`.

---

### **Question 4**  
**Determine if two Strings are anagrams of each other.**

**Answer:**  
```java
public static boolean anagrams(String str1, String str2) {
    if (str1.length() != str2.length()) {
        return false;
    }
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    return Arrays.equals(arr1, arr2);
}
```

**Example:**  
Input: `"race"` and `"care"`  
Output: `true`  

**Explanation:**  
- Both strings contain the same characters in different orders, so they are anagrams.

---

### **Question 5**  
**Search and read about:**  
1. **`intern()` method in String:**  
   - `intern()` method returns a reference to a string from the **string pool** if it already exists there.  
   - If the string is not in the pool, it adds the string to the pool and returns its reference.

   **Example:**
   ```java
   String s1 = new String("hello"); // Heap memory
   String s2 = "hello"; // String pool
   String s3 = s1.intern(); // Returns pool reference
   System.out.println(s1 == s2); // false (heap vs pool)
   System.out.println(s2 == s3); // true (same pool reference)
   ```

2. **`StringBuffer`:**  
   - A **mutable, thread-safe** class for creating and manipulating strings.  
   - Methods like `append()`, `insert()` are synchronized, making it slower than `StringBuilder`.  

   **Example:**  
   ```java
   StringBuffer sb = new StringBuffer("Hello");
   sb.append(" World");
   System.out.println(sb); // Output: Hello World
   ```