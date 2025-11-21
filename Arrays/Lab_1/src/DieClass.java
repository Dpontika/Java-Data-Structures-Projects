public class DieClass {
    public static void main(String[] args) {
        int[] results = new int[13]; // 0-12, we use 2-12

        // Simulate 30000 dice throws
        for (int i = 0; i < 30000; i++) {
            int dice1 = (int)(Math.random() * 6) + 1;
            int dice2 = (int)(Math.random() * 6) + 1;
            int sum = dice1 + dice2;
            results[sum]++;
        }

        // Print results
        System.out.println("Dice Simulation Results (30000 throws):");
        for (int i = 2; i <= 12; i++) {
            System.out.println("Result " + i + " : " + results[i] + " times");
        }
    }
}