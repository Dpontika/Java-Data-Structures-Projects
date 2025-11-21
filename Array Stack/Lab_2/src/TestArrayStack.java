public class TestArrayStack {
    public static void main(String[] args) {
        System.out.println("=== ARRAY STACK IMPLEMENTATION ===");

        // Create a stack with capacity 5
        ArrayStack stack = new ArrayStack(5);

        System.out.println("\n1. Initial Stack State:");
        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Is full: " + stack.isFull());

        // Test push
        System.out.println("\n2. Pushing elements:");
        try {
            stack.push("kappa");
            stack.push("keepo");
            stack.push("jerry");
            stack.push("bondy");
            stack.push("flafel");
        } catch (StackFullException e) {
            System.out.println("Error: " + e.getMessage());
        }

        stack.display();
        System.out.println("Current size: " + stack.size());
        System.out.println("Is full: " + stack.isFull());

        // Test top
        System.out.println("\n3. Top element:");
        try {
            System.out.println("Top element: " + stack.top());
        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test pop
        System.out.println("\n4. Popping elements:");
        try {
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        stack.display();
        System.out.println("Final size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());

        // Test error conditions
        System.out.println("\n5. Testing error conditions:");

        // Test popping from empty stack
        try {
            while (true) {
                stack.pop();
            }
        } catch (StackEmptyException e) {
            System.out.println("Expected error: " + e.getMessage());
        }

        // Test pushing to full stack
        ArrayStack smallStack = new ArrayStack(2);
        try {
            smallStack.push("One");
            smallStack.push("Two");
            //smallStack.push("Three"); // This should cause error
        } catch (StackFullException e) {
            System.out.println("Expected error: " + e.getMessage());
        }
    }
}