# Return Application

Another big ideas of Take-Home Assessment 4 is how to use return effectively. In this Take-Home Assessment, you need to use return to avoid something called "chaining".

Chaining happens when one unrelated method calls another unrelated method, which calls another unrelated method, and so on...

_Example of chaining:_

```java
public class Demo {
    public static void main(String[] args) {
        method1();
    }

    // Assume all methods below are unrelated to each other
    public static void method1() {
        // ...<maybe some code here>
        method2();
        // ...<maybe more code here>...
    }

    public static void method2() {
        // ...<maybe some code here>
        method3();
        // ...<maybe more code here>...
    }

    public static void method3() {
        // ...<some code here>
    }
}
```

Key observations:

1. Chaining looks like a long chain of method calls. There are cases where this is fine (if the method is actually very closely relevant to each other). **However, this is considered bad if you are calling two methods that do not have a lot of relation to each other.**

   > An example of chaining is one method call that is supposed to print the "intro" section calling another method that calculates the person expense / income. Both of the "intro" method and the "expense / income method" can stand on their ownselves. For this reason, it does not make sense to call one from the other. You should call both from main!

2. Chainign causes your main method to look "empty". Often times, you end up with only one or two method calls in main due to chaining. This causes your main-method to no longer be a concise summary of your code.

---

You will realize that in Take-Home Assessment 4, there are a few different parts of the program that needs the value calculated in the previous parts. However, this can lead to chaining if you are not careful enough!

One way to avoid this is to `return` any calculation result that a method does into the `main` method. The `main` method will then pass it to another method that needs it as a `parameter`.

_Example:_

```java
public class Demo {
    public static void main(String[] args) {
        int result = calculateThreePower(7);
        printNamesTimes("Nic", result);
    }

    public static int calculateThreePower(int number) {
        return number * number * number;
    }

    public static void printNamesTimes(String name, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(name);
        }
    }
}
```

Key observation:

Notice that the `printNamesTimes()` method needs the value calculated in the `calculateThreePower()` method!

---

**Instead of calling my `printNamesTimes()` method from my `calculateThreePower()` method**, I returned the value from `calculateThreePower()` method back to `main` first _(line 3 & 8)_.

---

The `main` method will then call `printNamesTimes()` and pass in the value that `main` just received from the `calculateThreePower()` method.
