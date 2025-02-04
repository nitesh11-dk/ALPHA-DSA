Sure! Let's break down your code and explain each part with the associated question.

### **1. Check if a number is odd or even**
You can use the **bitwise AND** operator to check if the least significant bit (LSB) is `1` (odd) or `0` (even).

```java
int bitMask = 1; 
int num = 0; 
if ((num & bitMask) == 1) { 
    System.err.println("odd"); 
} else { 
    System.err.println("even"); 
}
```

Explanation:
- If the LSB of `num` is `1`, the number is odd, else even.
- `num & 1`: This masks the number with `1`, and if the result is `1`, then the number is odd, otherwise it's even.

### **2. Get the ith bit**
This checks the value of the bit at a given position.

```java
public static void getBit(int n, int pos) {
    int bitMask = 1 << pos;
    if ((n & bitMask) == 0) {
        System.err.println(0); 
    } else {
        System.err.println(1); 
    }
}
```

Explanation:
- `1 << pos` creates a mask with a `1` at the position you want to check.
- `n & bitMask` gives the value of the bit at position `pos` (0 or 1).

### **3. Set the ith bit**
This sets a specific bit to `1`.

```java
public static int setBit(int n, int pos) {
    int bitMask = 1 << pos;
    return n | bitMask; // Set the bit at position pos to 1
}
```

Explanation:
- `1 << pos` creates a bitmask with a `1` at position `pos`.
- `n | bitMask` uses the **bitwise OR** operator to set the bit at `pos` to `1`.

### **4. Clear the ith bit**
This clears (sets to `0`) the bit at position `pos`.

```java
public static int clearBit(int n, int pos) {
    int bitMask = ~(1 << pos); 
    return n & bitMask; // Clear the bit at position pos
}
```

Explanation:
- `1 << pos` creates a bitmask with a `1` at position `pos`.
- `~(1 << pos)` inverts the bitmask, setting the bit at `pos` to `0`.
- `n & bitMask` clears the bit at position `pos` in `n`.

### **5. Update the ith bit (set or clear it)**
You can either set or clear a bit at position `pos` depending on the `newBit` value.

```java
public static int updateBit(int n, int pos, int newBit) {
    n = clearBit(n, pos); // First clear the bit at position pos
    int bitMask = newBit << pos; // Shift the new bit to the position
    return n | bitMask; // Set or clear the bit based on newBit
}
```

Explanation:
- First, we clear the bit at `pos` using the `clearBit` method.
- Then, we shift `newBit` to the desired position and set it using `n | bitMask`.

### **6. Clear last `i` bits**
Clears the last `i` bits (from LSB to `i`-th position).

```java
public static int clearIBits(int n, int pos) {
    int bitMask = ~0 << pos;
    return n & bitMask; // Clear the last `pos` bits
}
```

Explanation:
- `~0` creates a mask where all bits are `1`.
- `~0 << pos` shifts the mask to the left, clearing the last `pos` bits of `n`.

### **7. Clear bits in a range (from i to j)**
Clears the bits in the range between `i` and `j` (both inclusive).

```java
public static int clearIBits(int n, int i, int j) {
    int a = (-1) << (j + 1); // Create a mask to clear bits from j to 0
    int b = (1 << i) - 1; // Create a mask to keep bits from 0 to i-1
    int bitMask = a | b; // Combine the two masks
    return n & bitMask; // Clear the bits in the range [i, j]
}
```

Explanation:
- `(-1) << (j + 1)` creates a mask with `0` from the `j`-th bit down to `0`.
- `(1 << i) - 1` creates a mask with `1` from the `i`-th bit down to `0`.
- Combining the two masks clears the bits from position `i` to `j`.

### **8. Check if a number is a power of 2**
A number is a power of 2 if `n & (n - 1) == 0` and `n > 0`.

```java
public static boolean powerOf2(int n) {
    return (n & (n - 1)) == 0 && n > 0;
}
```

Explanation:
- If `n` is a power of 2, then `n & (n - 1)` will be `0` because the binary representation of powers of 2 has only one `1` bit, and subtracting `1` makes all bits to the right `1`.

### **9. Count set bits (1 bits)**
Counts the number of set bits (1 bits) in the binary representation of `n`.

```java
public static int countSet(int n) {
    int count = 0;
    while (n > 0) {
        if ((n & 1) != 0) { // Check LSB
            count++;
        }
        n = n >> 1; // Right shift to check the next bit
    }
    return count;
}
```

Explanation:
- For each iteration, the least significant bit is checked, and if it is `1`, we increment the count.
- Then we right shift `n` to check the next bit.

### **10. Fast Exponentiation**
Exponentiation by squaring to compute `n^pow` efficiently in logarithmic time (`O(log n)`).

```java
public static int fastExpo(int n, int pow) {
    int ans = 1;
    while (pow > 0) {
        if ((pow & 1) != 0) { // If the current bit of the exponent is 1
            ans = ans * n;
        }
        n = n * n; // Square the base
        pow = pow >> 1; // Right shift the exponent
    }
    return ans;
}
```

Explanation:
- The idea is to break the exponentiation process down into smaller powers by squaring the base and reducing the exponent by half at each step.

### **Conclusion:**
This code covers several common bitwise operations in Java, including checking bits, setting bits, clearing bits, and performing fast exponentiation. Each method works by manipulating the individual bits of the number, which is an efficient way to solve certain types of problems.
