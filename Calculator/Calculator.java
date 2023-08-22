package Calculator;

public class Calculator {
    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <operand1> <operator> <operand2>");
            return;
        }

        try {
            // Parse the command-line arguments
            double operand1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double operand2 = Double.parseDouble(args[2]);

            // Perform the operation and store the result
            double result = 0;
            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    System.out.println("Error: Invalid operator. Supported operators are +, -, *, /.");
                    return;
            }

            // Print the result
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid operand. Please provide valid numbers.");
        }
    }
}