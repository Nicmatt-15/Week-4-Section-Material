# Return Practice Specification

## Program Behavior

Example run of the program:

```
Input a number > 139
Input a number > 277
Input a number > -35
Input a number > 4
Your biggest number is: 277
Category of biggest number: Very big
```

> The first four number (`139`, `277`, `-35`, and `4`) are all user input.
>
> The number `277` in the line `Your biggest number is: ` is <u>**NOT**</u> user input.

---

## Starter Code

```java
import java.util.*;

public class ReturnPractice {
    public static void main(String[] args) {
        // TODO: Your code here
    }

    public static /*TODO*/ findBiggest(/*TODO*/) {
        // TODO: Your code here
    }

    // Note: This method should not be called from findBiggest()
    // method. It should only be called from main.
    public static /*TODO*/ categorizeNumber(/*TODO*/) {
        // TODO: Your code here
    }
}

```

---

## Program Description

- In your first method, you are being asked to prompt the user for 4 numbers (integers), find the biggest number, and print out the biggest number.
- In your second method, you are being asked to analyze which category the user biggest number falls into. The category is as follow:

  - \> 250, print out `very big`
  - \>= 0 and <= 250, print out `Big`
  - \>= -250 and < 0, print out `Small`
  - < -250, print out `Very small`

- You <u>**SHOULD NOT**</u> call `categorizeNumber()` method from `findBiggest()` method.
