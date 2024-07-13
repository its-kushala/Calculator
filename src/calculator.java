import java.util.Scanner;

public class calculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            double a = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double b = scanner.nextDouble();

            System.out.println("Select the operation: 1:+ 2:- 3:* 4:/ 5:%");
            int operation = scanner.nextInt();

            double result = 0;

            switch (operation) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    if (b != 0) {
                        result = a % b;
                    } else {
                        System.out.println("Error: Modulo by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation selected.");

            }

            System.out.println("The result is: " + result);
            scanner.close();
        }
    }

