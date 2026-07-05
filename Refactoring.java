public class Refactoring {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if (isFizz && isBuzz)
            return "FizzBuzz";

        if (isFizz)
            return "Fizz";

        if (isBuzz)
            return "Buzz";

        return number + "";
    }

    public static void main(String[] args) {

        System.out.println("10 + 5 = " + calculate(10, 5, ADDITION));

        System.out.println("10 - 5 = " + calculate(10, 5, SUBTRACTION));

        System.out.println("10 * 5 = " + calculate(10, 5, MULTIPLICATION));

        System.out.println("10 / 5 = " + calculate(10, 5, DIVISION));

        System.out.println("10 / 5 = " + calculate(10, 5, DIVISION));

        for (int i = 1; i <= 15; i++) {
            System.out.println("Số " + i + ": " + fizzBuzz(i));
        }
    }
}