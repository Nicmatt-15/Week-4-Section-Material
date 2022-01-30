# Parameter Application

One of the big ideas in Take-Home Assessment 4 is to combine two methods that looks similar. This can be done with the help of parameters. _Take a look below:_

```java
public class Demo {
    public static void main(String[] args) {
        printGreetingOne();
        printGreetingTwo();
    }

    public static void printGreetingOne() {
        System.out.println("Good morning!");
        System.out.println("You must be Nicolas!");
    }

    public static void printGreetingTwo() {
        System.out.println("Good evening!");
        System.out.println("You must be Matthew!");
    }
}
```

Notice how similar the `printGreetingOne()` method is compared to the `printGreetingTwo()?` We are going to combine the two into on method using parameters!

Steps:

1. Find where the difference is at! The difference here is between the word 'morning' <-> 'evening' and 'Nicolas' <-> 'Matthew'. We are going to replace these with a parameter instead in our new method (the method that combines the previous two).

   > Since the difference between the two are `String`, the parameter that we have to use have to be of type `String` too!

2. Call your method as many times as you need. In this case, since I printed two different greetings above, I will have to call my new method twice!

3. When you call your method, make sure to pass in the appropriate value through the parameter to complete each greeting!

   ```java
   public class Demo {
       public static void main(String[] args) {
           printGreeting("morning", "Nicolas");
           printGreeting("evening", "Matthew");
       }

       public static void printGreeting(String time, String name) {
           System.out.println("Good " + time + "!");
           System.out.println("You must be " + name + "!");
       }
   }
   ```
