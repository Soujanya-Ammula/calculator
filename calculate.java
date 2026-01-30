import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        System.out.println("Simple Java Console Calculator");

        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero not allowed.");
                    
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
               
                scanner.close();
                return;
        }

        
        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);

       
        scanner.close();
    }
}
