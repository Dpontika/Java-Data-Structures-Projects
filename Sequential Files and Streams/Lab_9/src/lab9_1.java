import java.io.*;

/**
 * Binary File Operations
 * This program demonstrates:
 * - Creating binary files with integer data
 * - Merging two binary files into one
 * - Reading and displaying the merged file contents
 */
class lab9_1
{
    public static void main(String[] args)
    {
        // ============ PART A: CREATE FIRST BINARY FILE ============

        // Predefined array of integers for first file
        int[] input = {1, 2, 3, 4, 5};

        try
        {
            // Create DataOutputStream wrapped around FileOutputStream
            // DataOutputStream allows writing primitive data types (like int) to binary file
            DataOutputStream out = new DataOutputStream(new FileOutputStream("lab9_1a.txt"));

            // Write each integer from the array to the binary file
            for(int i = 0; i < input.length; i++)
            {
                out.writeInt(input[i]); // Writes 4-byte integer in binary format
            }

            // Close the output stream to flush buffers and release file handle
            out.close();
            System.out.println("Created first binary file: lab9_1a.txt with " + input.length + " integers");
        }
        catch(IOException e)
        {
            System.out.println("Error creating first file: " + e);
        }

        // ============ CREATE SECOND BINARY FILE ============

        // Predefined array of integers for second file (different numbers)
        int[] input2 = {5, 6, 7, 8, 9};

        try
        {
            // Create second binary file with different integers
            DataOutputStream out2 = new DataOutputStream(new FileOutputStream("lab9_1b.txt"));

            // Write each integer from second array to binary file
            for(int i = 0; i < input2.length; i++)
            {
                out2.writeInt(input2[i]);
            }

            out2.close();
            System.out.println("Created second binary file: lab9_1b.txt with " + input2.length + " integers");
        }
        catch(IOException e)
        {
            System.out.println("Error creating second file: " + e);
        }

        // ============ PART B: MERGE TWO BINARY FILES ============

        try
        {
            // Create input streams for both source files
            DataInputStream inA = new DataInputStream(new FileInputStream("lab9_1a.txt"));
            DataInputStream inB = new DataInputStream(new FileInputStream("lab9_1b.txt"));

            // Create output stream for merged result file
            DataOutputStream outC = new DataOutputStream(new FileOutputStream("final.txt"));

            // ============ COPY FIRST FILE (lab9_1a.txt) ============
            try
            {
                // Read until EOFException is thrown (end of file)
                while(true)
                {
                    // Read integer from first file and write to merged file
                    outC.writeInt(inA.readInt());
                }
            }
            catch(EOFException e)
            {
                // EOFException is expected - it signals we've reached end of first file
                inA.close(); // Close first input file
                System.out.println("Finished reading first file");
            }

            // ============ COPY SECOND FILE (lab9_1b.txt) ============
            try
            {
                // Read until EOFException is thrown (end of file)
                while(true)
                {
                    // Read integer from second file and write to merged file
                    outC.writeInt(inB.readInt());
                }
            }
            catch(EOFException e)
            {
                // EOFException signals end of second file
                inB.close(); // Close second input file
                System.out.println("Finished reading second file");
            }

            // Close the output file
            outC.close();
            System.out.println("Merged files created: final.txt");
        }
        catch(IOException e)
        {
            System.out.println("Error during file merging: " + e);
        }

        // ============ PART C: READ AND DISPLAY MERGED FILE ============

        try
        {
            // Create input stream to read the merged file
            DataInputStream finalOut = new DataInputStream(new FileInputStream("final.txt"));

            System.out.println("Contents of merged file (final.txt):");

            try
            {
                // Read and display all integers from merged file
                while(true)
                {
                    int number = finalOut.readInt();
                    System.out.println(number); // Print each number on new line
                }
            }
            catch(EOFException e)
            {
                // EOFException signals we've read all data from merged file
                finalOut.close(); // Close the input file
                System.out.println("End of merged file reached");
            }
        }
        catch(IOException e)
        {
            System.out.println("Error reading merged file: " + e);
        }
    }
}