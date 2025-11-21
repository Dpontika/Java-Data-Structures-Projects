/**
 * Parentheses Checker using Stack
 * Checks for parentheses (), brackets [], and braces {} position
 */

public class ParenthesesChecker {

    // Return true if parentheses are balanced, false otherwise
    public static boolean checkParentheses(String expression) {
        ArrayStack stack = new ArrayStack(expression.length());

        System.out.println("Checking expression: " + expression);
        System.out.println("Length: " + expression.length());

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            // If it's an opening bracket, push to stack
            if (isOpeningBracket(currentChar)) {
                // Push both the character and its position
                String bracketInfo = currentChar + ":" + i;
                try {
                    stack.push(bracketInfo);;
                } catch (StackFullException e) {
                    System.out.println("Error: Stack overflow");
                    return false;
                }
            }
            // If it's a closing bracket, check for match
            else if (isClosingBracket(currentChar)) {
                if (stack.isEmpty()) {
                    System.out.println("Unexpected closing bracket '" + currentChar +
                            "' at position " + i + " - no matching opening bracket");
                    return false;
                }

                try {
                    String topInfo = (String) stack.pop();
                    char openingBracket = topInfo.charAt(0);
                    int position = Integer.parseInt(topInfo.substring(2));

                    System.out.println("Popped opening bracket '" + openingBracket + "' from position " + position);

                    if (!bracketsMatch(openingBracket, currentChar)) {
                        System.out.println(" Mismatched brackets at positions " +
                                position + " and " + i);
                        System.out.println("  Expected: " + getMatchingBracket(openingBracket) +
                                ", Found: " + currentChar);
                        return false;
                    } else {
                        System.out.println("Matched: '" + openingBracket + "' at position " +
                                position + " with '" + currentChar + "' at position " + i);
                    }
                } catch (StackEmptyException e) {
                    System.out.println("Unexpected closing bracket '" + currentChar +
                            "' at position " + i);
                    return false;
                }
            }
        }

        // If stack is not empty, there are unmatched opening brackets
        if (!stack.isEmpty()) {
            try {
                String unmatchedInfo = (String) stack.pop();
                char unmatchedBracket = unmatchedInfo.charAt(0);
                int position = Integer.parseInt(unmatchedInfo.substring(2));
                System.out.println("Unmatched opening bracket '" + unmatchedBracket +
                        "' at position " + position);
            } catch (StackEmptyException e) {
                // Should not happen since we checked isEmpty
            }
            return false;
        }
        return true;
    }

    // Checks characters

    private static boolean isOpeningBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private static boolean isClosingBracket(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private static boolean bracketsMatch(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    // Return  the matching closing bracket for an opening bracket

    private static char getMatchingBracket(char open) {
        switch (open) {
            case '(': return ')';
            case '[': return ']';
            case '{': return '}';
            default: return ' ';
        }
    }

    /**
     * Enhanced version that provides detailed analysis
     */
    public static void analyzeExpression(String expression) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ANALYZING EXPRESSION: " + expression);
        System.out.println("=".repeat(50));

        boolean isValid = checkParentheses(expression);

        System.out.println("\nFINAL RESULT:");
        System.out.println("Expression: " + expression);
        System.out.println("Valid: " + (isValid ? "YES ✓" : "NO ✗"));

        if (isValid) {
            System.out.println("All parentheses, brackets, and braces are properly balanced!");
        } else {
            System.out.println("Found errors in parentheses/brackets/braces placement.");
        }
        System.out.println("=".repeat(50));
    }
}