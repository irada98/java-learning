package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        System.out.println("This is Variables.java file");

        int myCurrentAge = 25; // int (integral number)
        System.out.println("My age: " + myCurrentAge);

        byte myWeight = 75; // byte data type; weight is ew
        System.out.println("My weight: " + myWeight);

        short salary = 2367; // short data type
        System.out.println("The salary: " + salary);

        char myFirstLetterOfName = 105; // ASCII i = 105
        System.out.println("My first letter of my name: " + myFirstLetterOfName);

        long populationOfLatvia = 1900000; // long type data
        System.out.println("Population of Latvia: " + populationOfLatvia);

        double numberPi = Math.PI; // PI number
        double classicFloatingNumber = 294849493.293933992;
        float randomNumber = 34949.2229933f; // to make it float number add f
        System.out.println("PI number: " + numberPi);
        System.out.println("Classic floating number: " + randomNumber);
        System.out.println("Random number: " + randomNumber);

        // Boolean true/false is, has
        // Example: isSummer, isAdult, hasEnoughAge, hasProperValue

        boolean isSummer = false;
        boolean isAutumn = true;

        /*
        var age = 25;
        var currentWeight = 75.9;
         */

        // Exercise 1
        // Create 2 variables for each data type
        // Variable should be meaningful as it possible
        // Variable name should contain at least two words
        // print all variables
        // lower camel case

        // kebab case: my-kebab-case
        // snake case: my_snake_case
        // lower camel case: lowerCamelCase
        // constants: int MY_AGE = 10;

        int weatherTemperature = 20;
        System.out.println("Weather temperature today: " + weatherTemperature + " degree");

        byte amountOfJobAvailable = 100;
        System.out.println("Amount of jobs available now: " + amountOfJobAvailable);

        short howMuchTicketsDone = 468;
        System.out.println("Amount of tickets done for today: " + howMuchTicketsDone);

        char managersFirstLetter = 'M';
        System.out.println("Manager's first letter: " + managersFirstLetter);

        long peopleInTheCompany = 350909;
        System.out.println("Amount of people in the company: " + peopleInTheCompany);

        double ceoSalary = 40598.22;
        System.out.println("CEO's salary: " + ceoSalary);

        float moodInNumbers = 66.6f;
        System.out.println("The mood in numbers: " + moodInNumbers);

        boolean isItHotToday = true;
        System.out.println("Is it hot today? " + isItHotToday);

        boolean isItColdToday = false;
        System.out.println("Is it cold today? " + isItColdToday);

        int x, y, z;
        x = 10;
        y = 4;
        z = 8;

        int summa = x + y + z;
        System.out.println("Summa: " + summa);

        // 2a(a + b);
        int a, b;
        a = 4;
        b = 3;
        int result = 2 * a * (a + b);
        System.out.println("result: " + result);

        int remainder = 10 % 3;
        System.out.println(remainder);

        // String
        String firstName = "Irada";
        String lastName = "Rzajeva";
        System.out.println(firstName + " " + lastName);

        System.out.printf("My full name is: %s %s\n", firstName, lastName);
        System.out.println("Welcome to the Void!");

        // Exercise 2
        // Create two-three String variables
        // combine
        // Print result out
        // example: Today is Monday. Soon I will go home;

        String typeOfDay = "Today";
        String weekDay = "Monday";
        String soonPlace = "home";

        System.out.printf("%s is %s. Soon I will go %s\n", typeOfDay, weekDay, soonPlace);
        System.out.println("Hope dinner will be good");


    }
}
