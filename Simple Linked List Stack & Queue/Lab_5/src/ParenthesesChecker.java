import Stack.StackEmptyException;

/**
 * Parentheses Checker using LinkedListStack
 * Checks for parentheses position
 */
public class ParenthesesChecker {

    //Checks if the given expression has balanced parentheses
    public static boolean checkParentheses(String expression) {
        LinkedListStack stack = new LinkedListStack();

        System.out.println("Checking expression: " + expression);

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            // If it's an opening parenthesis, push to stack
            if (currentChar == '(') {
                stack.push("(" + i); // Push with position info
                System.out.println("Pushed opening parenthesis at position " + i);
            }
            // If it's a closing parenthesis, check for match
            else if (currentChar == ')') {
                if (stack.isEmpty()) {
                    System.out.println("ERROR: Unexpected closing parenthesis at position " + i);
                    return false;
                }

                try {
                    String topInfo = (String) stack.pop();
                    int position = Integer.parseInt(topInfo.substring(1));
                    System.out.println("Matched parentheses: position " + position + " with " + i);
                } catch (StackEmptyException e) {
                    System.out.println("ERROR: Unexpected closing parenthesis at position " + i);
                    return false;
                }
            }
        }

        // If stack is not empty, there are unmatched opening parentheses
        if (!stack.isEmpty()) {
            try {
                String unmatchedInfo = (String) stack.pop();
                int position = Integer.parseInt(unmatchedInfo.substring(1));
                System.out.println("ERROR: Unmatched opening parenthesis at position " + position);
            } catch (StackEmptyException e) {
                // Should not happen since we checked isEmpty
            }
            return false;
        }

        System.out.println("SUCCESS: All parentheses are properly balanced!");
        return true;
    }

    // Analyzes expression
    public static void analyzeExpression(String expression) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ANALYZING EXPRESSION: " + expression);
        System.out.println("=".repeat(50));

        boolean isValid = checkParentheses(expression);

        System.out.println("\nFINAL RESULT:");
        System.out.println("Expression: " + expression);
        System.out.println("Valid: " + (isValid ? "YES ✓" : "NO ✗"));

        if (isValid) {
            System.out.println("All parentheses are properly balanced!");
        } else {
            System.out.println("Found errors in parentheses placement.");
        }
        System.out.println("=".repeat(50));
    }

    public static void main(String[] args) {
        System.out.println("=== PARENTHESES CHECKER WITH LINKED LIST STACK ===");

        // Test cases
        String[] testExpressions = {
                "(1+3)*3*(2+2)",                    // Valid
                "((1+2)*3)",                        // Valid
                "1+3)*3*(2+2)",                     // Missing opening
                "((1+2)*3",                         // Missing closing
                ")(()",                              // Wrong order
                "()()()",                            // Valid multiple
                "((()))"                             // Valid nested
        };

        // Test all expressions
        for (String expression : testExpressions) {
            analyzeExpression(expression);
        }
    }
}