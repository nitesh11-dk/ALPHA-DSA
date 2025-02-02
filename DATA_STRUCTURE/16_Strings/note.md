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
