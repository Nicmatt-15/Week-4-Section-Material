import java.util.*;

public class ReturnPractice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int biggestNumber = findBiggest(console);
        categorizeNumber(biggestNumber);
    }

    /**
     * Prompts the user for 4 numbers and find the biggest number.
     *
     * @param console - pass in a Scanner object for user input
     * @return the biggest number from user input
     */
    public static int findBiggest(Scanner console) {
        int biggestNumber = -999999;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Input a number > ");
            int userNumber = console.nextInt();

            if (userNumber > biggestNumber) {
                biggestNumber = userNumber;
            }
        }

        System.out.println("Your biggest number is: " + biggestNumber);

        return biggestNumber;
    }

    /**
     * Find the category that the user biggest number fall into.
     *
     * @param biggestNumber - pass in the user input biggest number
     */
    public static void categorizeNumber(int biggestNumber) {
        System.out.print("Category of biggest number: ");

        if (biggestNumber > 250) {
            System.out.println("Very big");
        } else if (biggestNumber >= 0) {
            System.out.println("Big");
        } else if (biggestNumber >= -250) {
            System.out.println("Small");
        } else {
            System.out.println("Very small");
        }
    }
}
