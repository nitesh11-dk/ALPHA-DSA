### Java me `0010` ko Octal kyun samjhta hai?  
- Java me **`0` se start hone wale numbers** ko **Octal (base-8)** treat kiya jata hai.  
- Octal me valid digits: `0` se `7`.  
- Example:  
  - `0010` (Octal) = \( 1 \times 8^1 + 0 \times 8^0 = 8 \) (Decimal).  

---

### Binary Input dene ka sahi tareeka:
1. **Binary Literals ka Use** (`Java 7 ke baad`):  
   Prefix: **`0b`**  
   ```java
   int res = bianryToDecimal(0b0010); // Correct Binary Input
   ```
   
2. **String ke roop me Binary Input**:  
   ```java
   int res = binaryToDecimal("0010"); // Process karega as Binary
   ```

---

### Important Notes:
- `0010` (Octal) ≠ `0b0010` (Binary).  
- Octal ke liye prefix: `0`  
- Binary ke liye prefix: `0b`  

By ensuring correct input format, aapke algorithm ke results sahi aayenge.

# Math.pow() gives double in the result , so be sure about that 