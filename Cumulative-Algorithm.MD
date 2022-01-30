# Cumulative Algorithm

## Table of Content

- [What is a Cumulative Algorithm](#what-is-a-cumulative-algorithm)
- [Why do we use Cumulative Algorithm](#why-do-we-use-cumulative-algorithm)
- [How does Cumulative Algorithm Works?](#how-does-cumulative-algorithm-work)
- [Translating Cumulative Algorithm into code](#translating-cumulative-algorithm-into-code)
- [Cumulative Algorithm for Smallest Number](#cumulative-algorithm-for-smallest-number)
- [Cumulative Algorithm for Total Number](#cumulative-algorithm-for-total-number)

---

## What is a Cumulative Algorithm?

Cumulative Algorithm is a step-by-step process that allows a computer to easily find the three goals below:

- The total from a collection of numbers
- The biggest number from a collection of numbers
- The smallest number from a collection of numbers

---

## Why do we use Cumulative Algorithm?

We use cumulative algorithm because it is one of the easiest way for a computer to figure out the goals mentioned above. It simulates the process fo human brain trying to achieve one or more of the three goals above.

---

## How does Cumulative Algorithm Work?

Cumulative Algorithm works by comparing two numbers at a time and storing the result. The result will then be compared to another number. For example, if we have the numbers: `3`, `9`, and , `7`, `16`. This is how a computer would find the biggest number:

1. Compare the first two numbers and find the bigger number.

2. `9` is bigger than `3`, so we save the number `9` as the result.

3. Compare `9` (the result) with `7`.

4. Since `9` is bigger than `7`, the computer does not update the result.

5. Compare `9` (the result) with `16`.

6. Since `16` is bigger htan `9`, the computer updates the result to `16`.

> The above process works very similarly to find the smallest number or the total of all the numbers with a slight tweak.

---

## Translating Cumulative Algorithm into code

Here are the steps to use Cumulative Algorithm to find the maximum number (we will use Scanner to get the numbers from user input):

1. Create a "result" variable and set the value into a very small number.

   ```java
   int biggestNumber = -9999;
   ```

2. Get the numbers from the user. In the example below, I will ask the user for 4 numbers:

   ```java
   Scanner console = new Scanner(System.in);

   int biggestNumber = -9999;
   for (int i = 1; i <= 4; i++) {
       System.out.print("Number: ");
       int userNumber = console.nextInt();
   }
   ```

3. Compare whether the number from the user is bigger than the result or not.

   ```java
   Scanner console = new Scanner(System.in);

   int biggestNumber = -9999;
   for (int i = 1; i <= 4; i++) {
       System.out.print("Number: ");
       int userNumber = console.nextInt();

       if (userNumber > biggestNumber) {

       }
   }
   ```

4. If the number from the user is bigger than the result, update the result with the user number.

   ```java
   Scanner console = new Scanner(System.in);

   int biggestNumber = -9999;
   for (int i = 1; i <= 4; i++) {
       System.out.print("Number: ");
       int userNumber = console.nextInt();

       if (userNumber > biggestNumber) {
           biggestNumber = userNumber;
       }
   }
   ```

---

## Cumulative Algorithm for Smallest Number

Here are the steps to use Cumulative Algorithm to find the minimum number (we will use Scanner to get the numbers from user input):

1. _(Slightly Different)_ Create a "result" variable and set the value into a very **big** number.

   ```java
   int smallestNumber = 78493;
   ```

2. _(Same)_ Get the numbers from the user. In the example below, I will ask the user for 4 numbers:

   ```java
   Scanner console = new Scanner(System.in);

   int smallestNumber = 78493;
   for (int i = 1; i <= 4; i++) {
       System.out.print("Number: ");
       int userNumber = console.nextInt();
   }
   ```

3. _(Slightly Different)_ Compare whether the number from the user is smaller than the result or not.

   ```java
   Scanner console = new Scanner(System.in);

   int smallestNumber = -9999;
   for (int i = 1; i <= 4; i++) {
       System.out.print("Number: ");
       int userNumber = console.nextInt();

       if (userNumber < smallestNumber) {

       }
   }
   ```

4. _(Slightly Different)_ If the number from the user is smaller than the result, update the result with the user number.

   ```java
   Scanner console = new Scanner(System.in);

   int smallestNumber = -9999;
   for (int i = 1; i <= 4; i++) {
       System.out.print("Number: ");
       int userNumber = console.nextInt();

       if (userNumber < smallestNumber) {
           smallestNumber = userNumber;
       }
   }
   ```

---

## Cumulative Algorithm for Total Number

Here are the steps to use Cumulative Algorithm to find the total number (we will use Scanner to get the numbers from user input):

1.  _(Slightly Different)_ Create a "result" variable and set the value into 0.

```java
int total = 0;
```

2. _(Same)_ Get the numbers from the user. In the example below, I will ask the user for 4 numbers:

   ```java
   Scanner console = new Scanner(System.in);

   int total = 0;
   for (int i = 1; i <= 4; i++) {
       System.out.print("Number: ");
       int userNumber = console.nextInt();
   }
   ```

3. _(Different)_ Add the user number to the total variable.

   ```java
   Scanner console = new Scanner(System.in);

   int total = 0;
   for (int i = 1; i <= 4; i++) {
       System.out.print("Number: ");
       int userNumber = console.nextInt();

       total += userNumber;
   }
   ```
