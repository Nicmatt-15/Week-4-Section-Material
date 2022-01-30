# Additional Style Guide

## Table of Content

- [Return Comments](#return-comments)
- [Empty Conditional Branches](#empty-conditional-branches)
- [Unnecessary Return](#unnecessary-return)
- [Incorrect Conditional Structure](#incorrect-conditional-structure)
- [Unnecessary Test 1](#unnecessary-test-1)
- [Unnecessary Test 2](#unnecessary-test-2)

---

## Return Comments

If your method returns a value, make sure to include a description of what your method returns and **use the word 'Return'**.

_Example_:

```java
// Calculates the passed number to a power of three
// Parameters:
// int number - passes the number that which power of three will be calculated
// Returns:
// The power of three from the passed number
public static int calculateThreePower(int number) {
    return number * number * number;
}
```

_Javadoc Notation Example:_

```java
/**
 * Calculates the passed number to a power of three
 * @param number - passes the number that which power of three
 * @return - the power of three from the passed number
 */
public static int calculateThreePower(int number) {
    return number * number * number;
}
```

> Any method of type `void` (method that does not return anything), should not have a return comment.

---

## Empty Conditional Branches

Take a look at the example below:

```java
public static void convertToEven(int inputNumber) {
    if (inputNumber % 2  == 1) {
        inputNumber++;
    } else {

    }
}
```

Key observations:

1. In the above example, the method goal is to convert any odd number into even number by adding 1 into it. If the number is already even, we don't want to alter the number.

2. Notice the unnecessary **blank / empty** else branches there! You can instead re-write the method as:

   ```java
    public static void convertToEven(int inputNumber) {
        if (inputNumber % 2  == 1) {
            inputNumber++;
        }
    }
   ```

_Anoter version of empty branches:_

```java
public static void convertToEven(int inputNumber) {
    if (inputNumber % 2  == 0) {

    } else {
        inputNumber++;
    }
}
```

> In the example above, we can switch the conditional statement to test for odd number instead of even number. This is a common technique! If you are encountering empty conditional branch, try testing for the opposite case!

---

## Unnecessary Return

Any value returned from a method should be catched by a variable, otherwise, it will be lost.

A method that returns a value that is not caught by a variable **or** if the saved value is not used later on in the program.

_Example:_

```java
public class Demo {
    public static void main(String[] args) {
        calculateThreePower(39);
    }

    public static int calculateThreePower(int number) {
        return number * number * number;
    }
}
```

> Notice on line 3 that I did not catch the return value when I called the method. This will cause the returned value from the `calculateThreePower()` method to be lost. There is no point in returning the value in the first place if it won't be used.

---

## Incorrect Conditional Structure

Take a look at the example below:

```java
public static void checkEvenOrOdd(int inputNumber) {
    if (inputNumber % 2  == 1) {
        System.out.println("odd");
    }

    if (inputNumber % 2  == 0) {
        System.out.println("even");
    }
}
```

Both test on line 2 and line 6 are related to each other! Remember that a number can only be even or odd (not both). If a number is odd (`inputNumber % 2 == 1 is true`), then you don't need to check if the number is even or not anymore (`inputNumber % 2 == 0`).

_Correct Example:_

```java
public static void checkEvenOrOdd(int inputNumber) {
    if (inputNumber % 2 == 1) {
        System.out.println("odd");
    } else {
        System.out.println("even");
    }
}
```

---

## Unnecessary Test 1

Take a look at the example below:

```java
public static void checkEvenOrOdd(int inputNumber) {
    if (inputNumber % 2 == 1) {
        System.out.println("odd");
    } else if (inputNumber % 2 == 0) {
        System.out.println("even");
    }
}
```

Remember, if the number is not odd (the first conditional is `false`), then the number is **definitely** even. In other words, you don't have to check again if the number is even or not.

```java
public static void checkEvenOrOdd(int inputNumber) {
    if (inputNumber % 2 == 1) {
        System.out.println("odd");
    } else {
        System.out.println("even");
    }
}
```

---

## Unnecessary Test 2

Given the following code:

```java
if (number >= 100) {
    System.out.println("big");
} else if (number > 0 && number < 100) {
    System.out.println("medium");
} else if (number <= 0) {
    System.out.println("small");
}
```

There are two mistakes here:

1. If the first conditional fails, that means number is definitely less than 100. For this reason, you don't need to include `number < 100` test in your second conditional, because it will always be true if the program reaches your second conditional.

2. If the number is not bigger than 0, then it is definitely less than or equal to 0. In other words, if the program does not enter the second conditional branch, we don't need to check `number <= 0` in the last conditional branch because it will always be true.

_Correct version:_

```java
if (number >= 100) {
    System.out.println("big");
} else if (number > 0) {
    System.out.println("medium");
} else {
    System.out.println("small");
}
```
