package lv.acodemy;

public class MethodExercises {
    public static void main(String[] args) {

        System.out.println(Math.round(fahrenheitConverter(120)));

        System.out.println(currencyConverter("CZK", 50));
        System.out.println(currencyConverter("PLN", 25));

        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("madam"));

        String word = "civic";
        System.out.println(word.charAt(3));

        System.out.println(numbers("+", 10, 15));
        System.out.println(numbers("-", 10, 15));
        System.out.println(numbers("*", 10, 15));
        System.out.println(numbers("/", 10, 15));
    }

    // Fahrenheit to Celsius
    public static double fahrenheitConverter(double fahrenheit) {
        return (fahrenheit - 32) / 1.8000;
    }

    // Create currency converter from X currency to EUR
    public static double currencyConverter(String currency, double money) {
        double convertedAmount;
        switch (currency) {
            case "PLN":
                convertedAmount = money * 4.45;
                break;
            case "CZK":
                convertedAmount = money * 24.55;
                break;
            case "GBP":
                convertedAmount = money * 0.87;
                break;
            default:
                throw new RuntimeException("Unsupported currency: " + currency);
        }
        return convertedAmount;
    }

    // Palindromes: civic, radar, level, rotor, kayak, madam, and refer
    // Hardcore version
    public static boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed.equals(word);
    }

    // create calculator, that receives operation symbols (-, +, /, *) and two numbers
    public static double numbers(String symbol, double firstNumber, double secondNumber) {
        double result = 0;
        switch (symbol) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }
        return result;
    }
}
