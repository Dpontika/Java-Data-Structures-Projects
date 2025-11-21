import java.io.*;

/**
 * Voting Data Processor
 * This program processes a text file containing MP voting data and separates
 * "YES" and "NO" voters into two different files.
 *
 * File format expected:
 * - MP name on one line
 * - Vote ("NAI" or "OXI") on the next line
 * - Repeated for all MPs
 */
class lab9_2
{
    public static void main(String[] args)
    {
        try
        {
            // Create BufferedReader to read the input file with MP voting data
            BufferedReader input = new BufferedReader(new FileReader("lab9_2.txt"));

            // Create two BufferedWriter objects for output files:
            // - One for MPs who voted YES (NAI)
            // - One for MPs who voted NO (OXI)
            BufferedWriter outputYes = new BufferedWriter(new FileWriter("lab9_2_yes.txt"));
            BufferedWriter outputNo = new BufferedWriter(new FileWriter("lab9_2_no.txt"));

            // Variables to store:
            // - name: current MP name being processed
            // - line: current line read from file
            String name = "";
            String line = "";

            // Read the input file line by line until end of file (null is returned)
            while((line = input.readLine()) != null)
            {
                // Check if the current line is a vote ("NAI" or "OXI")
                if(line.equals("NAI"))
                {
                    // If vote is YES, write the stored name to YES file
                    outputYes.write(name);
                    outputYes.newLine(); // Add line separator after each name
                }
                else if(line.equals("OXI"))
                {
                    // If vote is NO, write the stored name to NO file
                    outputNo.write(name);
                    outputNo.newLine(); // Add line separator after each name
                }
                else
                {
                    // If line is not a vote, it must be an MP name
                    // Store the name for when we encounter the vote on next line
                    name = line;
                }
            }

            // Close all file streams to release resources and ensure data is written
            input.close();
            outputYes.close();
            outputNo.close();

            System.out.println("Voting data processing completed!");
            System.out.println("YES voters saved to: lab9_2_yes.txt");
            System.out.println("NO voters saved to: lab9_2_no.txt");
        }
        catch(IOException e)
        {
            // Handle any input/output errors that occur during file operations
            System.out.println("Error processing files: " + e);
        }
    }
}