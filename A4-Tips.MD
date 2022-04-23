# Tips for Assessment 4

## General Tips

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

6. How the `round2()` method works:

   1. Multiply the decimal number by `100.0 `first. For example, if you have `56.7898`, then the result should be `5678.98`.

   2. Use `Math.round(...)` to round the method to an integer. Continuing from the example above, `Math.round(5678.98)` will give us `5679`.

   3. Divide the result from step 2 by 100.0. `5679 / 100.0` will give us `56.79`.

   4. Combining the three steps above, we will get the formula:
      ```
      Math.round(someDecimalHere * 100.0) / 100.0;
      ```

   > Make sure you are only rounding right before you print the number. Not when you are doing the calculation!

---

## Behavior

You <u>**must**</u> have 4 <u>**DIFFERENT**</u> custom messages, one for each category (_big saver, saver, big spender, spender_).

---

## Structure and Design

1. Remember, to keep main a concise summary, you should not:

   - Have any loop in main.
   - Have any conditional in main.
   - Have any non-blank println in main.

   > You are allowed to do some math operations (addition, subtraction, multiplication, division, etc) in main.

2. Method lists:

   - Method for program introduction
   - Method for getting the total income <u>**and**</u> expense
   - Method for getting the expense type and converting daily total expense to monthly
   - Method for printing the total income and expenses
   - Method for printing the spending/earning difference <u>**and**</u> saver/spender category
   - Rounding method (_already provided_)

   > You may find it easier to split the third bullet point into 2 different methods.

3. From the method list above, all of them should be called from the main method, with the following exceptions:

   - Rounding method can (and will most probably will) be called from your other method instead from main
   - The method in the second bullet point will be called twice. You can call it twice from main <u>**OR**</u> once from main and once from your other method.

4. Call the provided `round2()` method to round any decimal output instead of re-writing the formula in multiple places.

---

## Use of Language Feature

1. Make sure to only create your Scanner once in main and pass it to any method that needs it as a parameter.

   > Avoid passing in any parameter (including Scanner) if your method does not need it.

2. Use `double` type only when your variable store decimal number. Do not use `double` type for whole number.

3. Remember to use the Scanner method `.nextDouble()` to take in decimals and `.nextInt()` to take in integer / whole number.

   You should not take whole number using `.nextDouble()` even if you are able to. This is stylistically frowned upon.

   > Your program should have a total of 2 `.nextInt()` and 1 `.nextDouble()`.

4. Use `return` only when necessary!
5. Conditional problems:

   - Empty conditional branches
   - Unnecessary test
   - Incorrect conditional structure
   - Factorable code

   > You can read about these conditional style problems here: [Additional-Style-Guide.MD](/Additional-Style-Guide.MD)

---

## Document and Readability

1. Header, class, and method comment
2. Proper indentation
3. Parameter comment (if applicable)
4. Return comment (if applicable)
5. Lines < 100 characters
6. Blank line between methods
7. Descriptive and <u>**camelCased**</u> method name
8. Descriptive and <u>**camelCased**</u> variable name
