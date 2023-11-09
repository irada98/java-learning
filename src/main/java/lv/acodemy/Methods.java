package lv.acodemy;

public class Methods {
    public static void main(String[] args) {

        // Hello world x 5
        String acodemy = "Acodemy";
        printSomeText(2, acodemy);
        printSomeText(3, "STAR");

        System.out.println(calculateSumOfTwoNumbers(5, 6));
        int sumOfTwoNumbers = calculateSumOfTwoNumbers(10, 50);
        System.out.println(sumOfTwoNumbers);

        userInfo("Irada", "Rzajeva", 25);
        userInfo("John", "Paul", 45);
    }

    // void does not return anything
    public static void printSomeText(int loopCount, String text) {

        for (int i = 0; i < loopCount; i++) {
            System.out.println("Hello world! " + text);
        }
    }

    public static int calculateSumOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // Create a method that accepts (String name, String lastName, int age)
    // Method should print out text: My name is "name". My surname is "lastName". I am "age" years old.
    // If your name equals = John -> print: you fool

    public static void userInfo(String firstName, String lastName, int age) {
        if (firstName.equals("John")) {
            System.out.println("YOU FOOL");
        } else {
            System.out.printf("My name is %s. My surname is %s. My age is %s.\n",
                    firstName, lastName, age);
        }
    }

}
