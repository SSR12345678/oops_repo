import java.util.InputMismatchException;
import java.util.Scanner;

class Division {

    public double divideNumbers(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }
}

public class ExceptionHandlinginjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division division = new Division();

        try {

            System.out.println("Enter the first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result = division.divideNumbers(num1, num2);
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {

            System.out.println("Error: Invalid input. Please enter numeric values.");

        } finally {
            scanner.close();
        }
    }
}
