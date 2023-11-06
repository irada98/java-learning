package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {

        int[] numbers = {2, 6, 7, 8, 16, 17};
        int myNumber = numbers[4];
        System.out.println(myNumber);

        // determine size of array
        System.out.println(numbers.length);

        // change number in array
        numbers[5] = 1337;
        System.out.println(numbers[5]);
        System.out.println(Arrays.toString(numbers));

        // create empty array
        int[] emptyArray = new int[13];
        System.out.println(Arrays.toString(emptyArray));

        // update empty array with numbers
        emptyArray[0] = 6;
        emptyArray[2] = 8;
        emptyArray[4] = 10;
        emptyArray[6] = 12;
        emptyArray[8] = 14;
        emptyArray[10] = 16;
        emptyArray[12] = 18;

        System.out.println(Arrays.toString(emptyArray));

        // String [] array
        String[] fruitBasket = {"apple", "banana", "strawberry", "melon", "kiwi", "pear", "pineapple", "blackberry"};
        System.out.println(Arrays.toString(fruitBasket));

        String myFruit = fruitBasket[3];
        System.out.println(myFruit);
        System.out.println(fruitBasket[5]);

        // Logic in java (if conditions)

        if (10 > 5) {
            System.out.println("This statement is true");
        }

        if (10 < 9) {
            System.out.println("This statement is true");
        }

        if (fruitBasket[0].equals("apple")) {
            System.out.println("This is true!");
        }

        // if else
        boolean isSummer = false;
        if (isSummer) {
            System.out.println("Going to swim in the sea");
        } else {
            System.out.println("Watch Netflix");
        }

        // if-else-if-else
        // String light = "RED";   // traffic color

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the traffic light color: ");
        String light = myScanner.next();
        if (light.equals("green")) {
            System.out.println("GO, RUUUUUN");
        } else if (light.equals("yellow")) {
            System.out.println("WAIT, YOU LITTLE WORM");
        } else if (light.equals("red")) {
            System.out.println("DON'T MOVE, IDIOT");
        } else {
            System.out.println("NOT WORKING");
        }


    }
}
