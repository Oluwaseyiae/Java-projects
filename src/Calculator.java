import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

                System.out.println("Welcome to Multipurpose Calculator!");
                System.out.println("AVAILABLE OPERATIONS: Addition, Subtraction, Multiplication, Division, Power and Square Root");

                Scanner scanner = new Scanner(System.in);
                System.out.print("What operation would you like to perform? (Add, Sub, Multiply, Div, Power, Sqrt) ");
                String operation = scanner.nextLine().toLowerCase();

                double result = 0;

                switch (operation) {
                    case "add":
                        System.out.print("Enter first number: ");
                        double firstAddNumber = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double secondAddNumber = scanner.nextDouble();
                        result = firstAddNumber + secondAddNumber;
                        System.out.println("The result is " + result);
                        break;

                    case "sub":
                        System.out.print("Enter first number: ");
                        double firstSubNumber = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double secondSubNumber = scanner.nextDouble();
                        result = firstSubNumber - secondSubNumber;
                        System.out.println("The result is " + result);
                        break;

                    case "multiply":
                        System.out.print("Enter first number: ");
                        double firstMultiNumber = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double secondMultiNumber = scanner.nextDouble();
                        result = firstMultiNumber * secondMultiNumber;
                        System.out.println("The result is " + result);
                        break;

                    case "div":
                        System.out.print("Enter first number: ");
                        double firstDivNumber = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double secondDivNumber = scanner.nextDouble();
                        if (secondDivNumber != 0) {
                            result = firstDivNumber / secondDivNumber;
                            System.out.println("The result is " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;

                    case "power":
                        System.out.print("Enter base number: ");
                        double baseNumber = scanner.nextDouble();
                        System.out.print("Enter exponent number: ");
                        double exponentNumber = scanner.nextDouble();
                        result = Math.pow(baseNumber, exponentNumber);
                        System.out.println("The result is " + result);
                        break;

                    case "sqrt":
                        System.out.print("Enter the number: ");
                        double powerNumber = scanner.nextDouble();
                        result = Math.sqrt(powerNumber);
                        System.out.println("The result is " + result);
                        break;

                    default:
                        System.out.println("Invalid operation");
                }

                scanner.close();
    }
}
