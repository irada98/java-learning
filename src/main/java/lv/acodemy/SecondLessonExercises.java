package lv.acodemy;

import java.util.Scanner;

public class SecondLessonExercises {
    public static void main(String[] args) {

        // Even or Odd Number Checker:
        // Write a program that takes an integer input from the user
        // and checks if it's even or odd using an if statement.

        // int number = 10;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Write the number: ");
        int number = Integer.parseInt(myScanner.next());
        if (number % 2 == 0) {
            System.out.println("This is even numbers");
        } else {
            System.out.println("This is odd number");
        }


        //Largest of Three Numbers:
        // Create a program that takes three numbers as input and
        // determines which one is the largest using if-else-if statements.
        //&& - and; || - or

        int x = 10;
        int y = 6;
        int z = 20;
        if (x > y && x > z) {
            System.out.println("Largest number: " + x);
        } else if (y > x && x > z) {
            System.out.println("Largest number: " + y);
        } else if (z > x && z > y) {
            System.out.println("Largest number: " + z);
        } else {
            System.out.println("They are all equals or 0s");
        }
//
//        // tricky stuff
        System.out.println(Math.max(10, Math.max(12, 14)));


        //Positive, Negative, or Zero Checker:
        // Create a program that reads a number from the user and determines
        // if it's positive, negative, or zero using an if statement.

        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("Print the number: ");
        int number1 = Integer.parseInt(myScanner2.next());
        if (number1 > 0) {
            System.out.println("Positive");
        } else if (number1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero Checker");
        }


        //BMI (Body Mass Index) Calculator: Take a person's weight and height as input and use an if statement
        // to calculate and display their BMI category (e.g., underweight, normal weight, overweight, or obese).
        // (BMI = weight (kg) / (height (m) * height (m)))

        double weight = 70.4;
        double height = 1.74;
        Scanner myScanner3 = new Scanner(System.in);
        System.out.println("Weight: ");
        System.out.println("Height: ");
        double weight1 = Double.parseDouble(myScanner3.next());
        double height1 = Double.parseDouble((myScanner3.next()));
        double bmi = weight1 / (height1 * height1);

        if (bmi < 18.5) {
            System.out.println("Underweight");
            System.out.println("Minimal health risk");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
            System.out.println("Minimal");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
            System.out.println("Increased");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Obese");
            System.out.println("High");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("severely obese");
            System.out.println("Very high");
        } else {
            System.out.println("Morbidly obese");
            System.out.println("Extremely high");
        }


        //Password Strength Checker: Ask the user to enter a password and
        // then use if statements to determine its strength (e.g., weak, medium, strong)
        // based on criteria such as length, special characters, and uppercase letters.
        //If the password is less than 8 characters, lacks special characters, or lacks uppercase letters, it's considered "weak."
        //If the password is between 8 and 11 characters, it's considered "of medium strength."
        //If the password is 12 or more characters, it's considered "strong."

        int passwordCharacterCount = 12;
        if (passwordCharacterCount < 8) {
            System.out.println("Weak");
        } else if (passwordCharacterCount >= 8 && passwordCharacterCount <= 11) {
            System.out.println("Medium strength");
        } else {
            System.out.println("Strong");
        }


        // Age Category Determiner: Prompt the user to enter their age,
        // and then use an if statement to categorize them as a child, teenager, adult, or senior citizen

        Scanner myScanner4 = new Scanner(System.in);
        System.out.println("Write down your age: ");
        int myAge = Integer.parseInt(myScanner4.next());
        if (myAge <= 12) {
            System.out.println("You are a child");
        } else if (myAge <= 19) {
            System.out.println("You are teenager");
        } else if (myAge <= 60) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are senior");
        }


        // Write a program that accepts a number (1-7) as input and
        // uses if-else statements to determine the corresponding day of the week (e.g., 1 is Sunday, 2 is Monday, etc.)

        Scanner myScanner5 = new Scanner(System.in);
        System.out.println("Write down the number from 1 to 7: ");
        int myNumber = Integer.parseInt(myScanner5.next());
        if (myNumber == 1) {
            System.out.println("Monday");
        } else if (myNumber == 2) {
            System.out.println("Tuesday");
        } else if (myNumber == 3) {
            System.out.println("Wednesday");
        } else if (myNumber == 4) {
            System.out.println("Thursday");
        } else if (myNumber == 5) {
            System.out.println("Friday");
        } else if (myNumber == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }


        //Number Range Checker: Build a program that checks
        //if a given number falls within a specified range (e.g., between 1 and 100) using if-else statements.

        Scanner myScanner6 = new Scanner(System.in);
        System.out.println("Write down the number from 1 to 100: ");
        int myNumber1 = Integer.parseInt(myScanner6.next());
        if (myNumber1 >= 1 && myNumber <= 100) {
            System.out.println("Your number is: " + myNumber1);
        } else {
            System.out.println("GTFO");
        }


    }
}
