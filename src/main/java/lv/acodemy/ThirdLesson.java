package lv.acodemy;

public class ThirdLesson {
    public static void main(String[] args) {

        //  Loop!?
        // for loop
        /*
        for (counter; condition; counter change) {

        }
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");
        }

        // Print numbers from 1 to 5

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Print from 10 to 0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        String[] arrayOfNames = {"Nathan", "Matthew", "Irada", "Lars", "Irina", "Natalie"};
        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.println(arrayOfNames[i]);
        }

        // for each
        for (String name : arrayOfNames) {
            System.out.println(name);
        }

        String[] countries = {"United States",
                "Canada",
                "United Kingdom",
                "Germany",
                "France",
                "Australia",
                "Japan",
                "India",
                "China",
                "Brazil"
        };
        // Goal: Fina Japan in the list
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Japan")) {
                System.out.println("Sensei");
                break;
            }
            //System.out.println(countries[i]);
        }

        // 3 number array
        int[] firstArray = {1, 2, 3, 4, 5, 7, 4};
        int[] secondArray = {3, 4, 5, 6, 7, 10, 12};
        int[] thirdArray = {5, 6, 7, 8, 9, 13, 11};
        for (int numberOfFirstArray : firstArray) {
            for (int numberOfSecondArray : secondArray) {
                for (int numberOfThirdArray : thirdArray) {
                    if (numberOfFirstArray == numberOfSecondArray && numberOfSecondArray == numberOfThirdArray) {
                        System.out.println(numberOfFirstArray);
                    }
                }
            }
        }

        // from 0 to 100
        // print even numbers
        // for -> iterate from 0 to 100
        // if -> if this is even number, we print it

        int number = 50;
        boolean isEven = number % 2 == 0;
        System.out.println(isEven);

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


        // while! -> do while!
        /*
        while (condition) {
            execute code block
        }
         */

        int i = 0;
        while (i <= 10) {
            System.out.println(i++);
        }

        // Calculate the sum of numbers from 1 to 5 using while loop

        int x = 1;
        int summa = 0;
        while (x <= 5) {
            summa = summa + x;
            System.out.println(summa);
            x++;
        }

        // print even numbers from 0 to 20

        int y = 0;
        while (y <= 20) {
            System.out.print(y + " ");
            y = y + 2;
        }


        /*
        do {
            execute code block
        } while (condition);
         */

        int z = 1;
        do {
            System.out.println(z++);
        } while (z <= 5);


    }
}
