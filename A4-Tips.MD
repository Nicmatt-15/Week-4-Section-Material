# Tips for Assessment 4

1. Make sure to combine the method that ask the user for the income and the expense into one!

   You will need the material in [here](Parameter-Application.MD). To make things smoother, you **should** separate this part of the program into its own method:

   ```
   Enter 1) monthly or 2) daily expenses? 1
   ```

2. Avoid chaining using the the material in [here](Return-Application.MD)

3. Make sure to check in the [Additional Style Guide](Additional-Style-Guide.MD) on common mistakes about conditional and **return comments**.

4. You will need the **Total Cumulative Algorithm** to find out the total income / expense. You can find the material [here](Cumulative-Algorithm.MD).

5. The easiest way to streamline your program is to check whether the expense given by the user is _daily_ or _monthly_.

   If the type is _daily_, convert it to monthly by multiplying it by the class constant. Otherwise, don't do anything!

   Later on in your program, you can divide it by the class constant again if you need the daily expense. This may sound redundant, but it will actually help you shorten your code and make the process easier.

6. To round your output to two decimal places:

   1. Multiply the decimal number by `100.0 `first. For example, if you have `56.7898`, then the result should be `5678.98`.

   2. Use `Math.round(...)` to round the method to an integer. Continuing from the example above, `Math.round(5678.98)` will give us `5679`.

   3. Divide the result from step 2 by 100.0. `5679 / 100.0` will give us `56.79`.

   4. Combining the three steps above, we will get the formula:
      ```
      Math.round(someDecimalHere * 100.0) / 100.0;
      ```

   > Make sure you are only rounding right before you print the number. Not when you are doing the calculation!

7. Since you will be doing a lot of rounding, you **should** store this formula in a method. While the method may look **trivial** because it only has one line of code, it actually does multiple things (which means it is actually not trivial)!

   You can copy paste the method below into your code and use it directly:

   ```java
    public static double round2(double num) {
        return Math.round(num * 100.0) / 100.0;
    }
   ```

   > Don't forget to add method, parameter, and return comments!

8. Ideally, you would have 6-7 methods, excluding main. Out of all these methods, all of them will be called from main **except for the method that you use to round to 2 decimal places**.

   > Remember that you should use the same method to prompt and calculate the user income and the user expense. You would need two different method calls from main to achieve this!

9. Remember to use the Scanner method `.nextDouble()` to take in decimals and `.nextInt()` to take in integer / whole number.

   You should not take whole number using `.nextInt()` even if you are able to. This is stylistically frowned upon.

10. Remember, to keep main a concise summary, you should not:

    1. Have any loop in main.
    2. Have any conditional in main.
    3. Have any non-blank println in main.

    > You are allowed to doo some math operations in main.
