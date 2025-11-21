
public class TestParenthesesChecker {
    public static void main(String[] args) {
        System.out.println("=== PARENTHESES CHECKER ===");

        String[] testExpressions = {
                // Valid expressions
                "(1+3)*3*(2+2)",                    // Simple parentheses
                "{[()()]}",                         // Mixed brackets
                "a*(b+c)-d/(e-f)",                  // Arithmetic expression
                "(([]){})",                         // Complex nested
                "x",                                // No brackets

                // Invalid expressions
                "1+3)*3*(2+2)",                     // Missing opening
                "((1+2)*3",                         // Missing closing
                "([)]",                             // Mismatched order
                "({[}])",                           // Incorrect nesting
                ")(()",                             // Wrong order
                "{(})"                              // Mixed up brackets
        };

        // Test all expressions
        for (String expression : testExpressions) {
            ParenthesesChecker.analyzeExpression(expression);
        }

    }
}