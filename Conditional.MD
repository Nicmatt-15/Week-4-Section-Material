# Conditional

## Table of Content

---

- [What is a Conditional?](#what-is-a-conditional)
- [What is an `if-else` structure?](#what-is-an-if-else-structure)
- [Example of `if-else` structure](#example-of-if-else-structure)
- [Additional Concept](#additional-concept)

---

## What is a Conditional?

Conditional is a statement that can be evaluated to either `true` or `false`.

For this week's material, it will be used with a structure called `if-else`.

---

## What is an `if-else` structure?

An if-else structure is a structure used to allow your program to do different things depending on the "situation".

Here is a "non-java" example:

```
if the player drinks a healing potion
    then add the player's health by 25
else if the player gets hit
    then reduce the player's health by 10
else
    then the player's health remain the same
```

Here is a "non-java" template:

```
if the first condition is true
    then do something
else if the second condition is true
    then do something else
else
    then do something different
```

> Note that the first condition has to fail in order to reach the second conditional. This also means that the first and second conditional has to fail in order to reach the third conditional!

---

The way the above is very similar to how Java writes conditinal. Take a look below at Java's template of `if-else` structure:

```java
if (/*1st conditional statement here*/) {

} else if (/*2nd conditional statement here*/) {

} else {

}
```

> Your program will enter one of the three branch, depending on which conditional statement evaluates to `true`. If there are more than one condtiinal statement that evaluates to `true`, the first one to be checked will be entered!

> Note that the above template is used if you have 3 different situation and outcome. The examples below show how you can modify your structure depending on the amount of situation and outcome.

---

_2 different situations:_

```java
if (/*1st conditional statement here*/) {

} else {

}
```

_4 different situations:_

```java
if (/*1st conditional statement here*/) {

} else if (/*2nd conditional statement here*/) {

} else if (/*3rd conditional statement here*/) {

} else {

}
```

---

## Example of `if-else` structure

Here is an example on how to check whether a number is even or odd:

```java
int number = 70;

if (number % 2 == 0) {
    System.out.println("The number is even");
} else {
    System.out.println("The number is odd");
}
```

Key details:

1. An even number will not have any remainder if we divide it by 2. As a result, we can check if a number is even or not using the `%` _(mod / modulus)_ operator.

   > Recall that the %` _(mod / modulus)_ operator gives us the **remainder** of a division.

2. A number can only be either even or odd. If it is even, then it won't be odd and vice versa. As a result, we don't need to check whether `number % 2 == 1` again. If the first conditional fails (number is not even), then the number will definitely be odd. In other words, if `number % 2 == 1` will always be `true` if the first conditional fails.

---

## Additional Concept

```java
if (...) {
    // your code here
} else if (...) {
    // your code here
}
```

In the example above, if the program enters the first conditional branch, it won't look at the second conditional branch at all.

Compare the above code against:

```java
if (...) {
    // your code here
}

if (...) {
    // your code here
}
```

In the example above, even if the program enters the first conditional branch, it will still look at the second conditional branch.
