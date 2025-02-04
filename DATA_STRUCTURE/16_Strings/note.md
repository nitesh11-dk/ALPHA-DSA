```markdown
# Java String Operations and Questions with Explanations  

---

## **Question 1: Check if a String is a Palindrome**

### **Code:**
```java
public static boolean isPalindrome(String str) {
   for (char i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
         return false;
      }
   }
   return true;
}
```

### **Explanation:**  
A string is a palindrome if it reads the same backward and forward.  
- Loop through the string until the middle.  
- Compare characters from the beginning and the corresponding characters from the end.  
- Return `false` if any mismatch is found; otherwise, return `true`.

---

## **Question 2: Find the Shortest Path from a Given Route**  

### **Code:**
```java
public static float shortestDistance(String str) {
   int x = 0, y = 0;

   for (char i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'N') y++;
      else if (str.charAt(i) == 'E') x++;
      else if (str.charAt(i) == 'S') y--;
      else if (str.charAt(i) == 'W') x--;
   }

   x = x * x;
   y = y * y;

   return (float) Math.sqrt(x + y);
}
```

### **Explanation:**  
Given a set of directions (`N`, `S`, `E`, `W`):
- Maintain coordinates `(x, y)` starting at `(0, 0)`.  
- Update coordinates based on the direction:
  - `N`: Increase `y`  
  - `E`: Increase `x`  
  - `S`: Decrease `y`  
  - `W`: Decrease `x`  
- Use the formula `√(x² + y²)` to compute the shortest distance from the origin.

---

## **Question 3: Print the Largest String in Lexicographic Order**  

### **Code:**
```java
public static String printLargest(String[] str) {
   String largest = str[0];
   for (int i = 0; i < str.length; i++) {
      if (largest.compareToIgnoreCase(str[i]) < 0) {
         largest = str[i];
      }
   }
   return largest;
}
```

### **Explanation:**  
Lexicographic order compares strings alphabetically (`apple < banana`).  
- Loop through all strings.
- Compare each string with the current largest using `compareToIgnoreCase()`.  
- Update `largest` if a string is lexicographically greater.

---

## **Question 4: Convert the First Letter of Each Word to Uppercase**  

### **Code:**
```java
public static String convetToUc(String str) {
   StringBuilder sb = new StringBuilder("");
   char ch = Character.toUpperCase(str.charAt(0));
   sb.append(ch);

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
```

### **Explanation:**  
- Convert the first character of the string to uppercase.  
- Traverse the string and check for spaces.
- Convert the character after each space to uppercase.

---

## **Question 5: String Compression**  

### **Code:**
```java
public static String stringCompression(String str) {
   StringBuilder sb = new StringBuilder("");

   for (int i = 0; i < str.length(); i++) {
      Integer count = 1;
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
         count++;
         i++;
      }
      sb.append(str.charAt(i));
      if (count > 1) {
         sb.append(count.toString());
      }
   }
   return sb.toString();
}
```

### **Explanation:**  
- Traverse the string and count consecutive identical characters.  
- Append the character followed by its count if it is greater than 1.  
- Example: `"aaabbcccdd"` becomes `"a3b2c3d2"`.

---

## **Additional Notes**

### **String Comparison**
- Direct comparison using `==` compares references, not values.  
- Use `equals()` to compare string values.

### **Substring Function**
```java
public static String subString(String str, int start, int end) {
   String substr = "";
   for (int i = start; i < end; i++) {
      substr += str.charAt(i);
   }
   return substr;
}
```
- Extracts a substring from `start` to `end - 1`.  
- Avoid using `+` in loops for string concatenation; prefer `StringBuilder`.

### **StringBuilder**
- Mutable, efficient for string manipulation.
- Avoids creating new string objects for each modification.
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World!");
```

### **String Pool aur Heap Memory ka Difference**  

#### 1️⃣ **String Pool (Intern Pool)**  
- **Kya hai:** String pool JVM ke andar ka ek special memory area hai jo strings ko store karta hai.  
- **Kaise kaam karta hai:** Jab tum koi string literal (`String s = "hello";`) likhte ho toh JVM check karta hai ki pool me wahi string pehle se hai ya nahi. Agar hai, toh wahi reference de deta hai, nayi memory allocate nahi karta. Agar nahi hai, toh nayi string ko pool me store kar deta hai.  
- **Immutable Strings:** Pool ka benefit tab aata hai jab strings immutable hote hain — unka value badal nahi sakta.

#### Example:
```java
String s1 = "hello";
String s2 = "hello";
System.out.println(s1 == s2); // true (same reference from pool)
```

#### 2️⃣ **Heap Memory**  
- **Kya hai:** Heap memory ek large memory space hoti hai jaha objects dynamically allocate hote hain, including strings created using `new`.  
- **Kaise kaam karta hai:** Jab `new` keyword ka use karke string banate ho (`String s = new String("hello");`), toh JVM hamesha nayi memory allocate karta hai heap me, chahe wahi string pool me already ho ya nahi.  

#### Example:
```java
String s3 = new String("hello");
String s4 = new String("hello");
System.out.println(s3 == s4); // false (different objects in heap)
```

# INtern
1️⃣ **Agar String pool me already hai:**  
- `intern()` us existing string ka **reference** return kar deta hai.  

2️⃣ **Agar String pool me nahi hai:**  
- `intern()` us string ko **pool me add** karta hai aur uska reference return kar deta hai.

---

### **Example Samajho:**
```java
public class InternExample {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";

        // Pool reference lene ki koshish
        String s3 = s1.intern();

        System.out.println(s1 == s2); // false (heap vs pool)
        System.out.println(s2 == s3); // true (pool reference)
    }
}
```

### **Difference Between StringBuffer and StringBuilder**  


-Java mein String immutable hoti hai, matlab uska content change nahi ho sakta. Jab hume mutable string chahiye hoti hai (jo modify ki ja sake) tab hum StringBuffer ka use karte hain.

| **Feature**        | **StringBuffer**               | **StringBuilder**           |
|--------------------|----------------------------------|-----------------------------|
| **Thread Safety**   | Thread-safe (synchronized)     | Not thread-safe            |
| **Performance**     | Slower due to synchronization  | Faster without synchronization |
| **Mutable**         | Yes                            | Yes                         |
| **Introduced In**   | Java 1.0                       | Java 1.5                    |

---

### **In Simple Terms:**  
1. **StringBuffer:**  
   - Safer for multi-threaded environments.  
   - Slower because it synchronizes methods (`append()`, `insert()`, etc.).  

2. **StringBuilder:**  
   - Best for single-threaded operations.  
   - Faster since it doesn't have synchronization overhead.  

---

### **Example:**
```java
public class BufferBuilderExample {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" World");
        System.out.println("StringBuffer: " + sb1); // Output: Hello World

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println("StringBuilder: " + sb2); // Output: Hello World
    }
}
```
