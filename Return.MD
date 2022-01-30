# Return

## Table of Content

- [What is Return?](#what-is-return)
- [How is Return used?](#how-is-return-used)
- [Return With Parameter](#return-with-parameter)

---

## What is Return?

Return can be seen as the "partner" of parameter. It sends **value** in the opposite direction of parameter.

For example, if you have a parameter sending a value from main to a method called `printNumber()`, return sends the value from `printNumber()` back to main.

> While return is similar to parameter, you should note that you can only send **one value only** through return _(unlike parameter)_.

> Although return can be seend as the partner of parameter, and is often used with parameter, it can be used on its own.

---

## How is Return used?

Return requires the same two steps as parameter:

1. Sending the value (from your method). _Example:_

   ```java
   public static void processNumber() {
       return 8 * 8;
   }
   ```

2. Catching the value: The number sent from a method, through return,will get sent to the method call of that particular method.
   _Example:_

   ```java
   public static void main(String[] args) {
       processNumber();
   }

   public static void processNumber() {
       return 8 * 8;
   }
   ```

   The number returned from the line `return 8 * 8;` will be sent to line 3, the method call `processNumber()`.

   In order to use the value sent, we have to catch the value in a variable. In this case, since we are returning an `int`, `int` will be the type of our catching variable.

   _Update:_

   ```java
   public static void main(String[] args) {
      int someResult = processNumber();
   }

   public static void processNumber() {
      return 8 * 8;
   }
   ```

---

## Return With Parameter

Here is an example of using both parameter and return.

```java
   public static void main(String[] args) {
       int someNumber = 9;
       int someResult = processNumber(someNumber);
       System.out.println("Result is: " + someResult);
   }

   public static void processNumber(int inputNumber) {
       return inputNumber * inputNumber;
   }
```

Key details:

1. I am sending an integer through the parameter. This integer will get multiplied by itself in the method.

2. The `processNumber()` method will return the multiplied integer back to line 65.

3. The returned number will get saved into a variable called `int someResult`, which will be printed on line 66.

> **IMPORTANT:** The type of return and parameter does not have to be the same. You can pass in a `String` through the parameter and return a `char` if you need to.
