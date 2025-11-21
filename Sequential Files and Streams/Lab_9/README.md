# **File Processing**



This project contains two Java programs that demonstrate different file processing techniques:



&nbsp;   lab9\_1.java: Binary file operations with integer data



&nbsp;   lab9\_2.java: Text file processing for voting data



## **Classes** 



#### 1\. lab9\_1 Class



Handles binary file operations including creation, merging, and reading of integer data.



Key Methods:



&nbsp;	File Creation Methods:



&nbsp;   		DataOutputStream with FileOutputStream: Creates binary files with integer data



&nbsp;   		writeInt(): Writes 4-byte integers to binary files



&nbsp;   		Multiple file creation: Creates lab9\_1a.txt and lab9\_1b.txt with different integer sets



&nbsp;	File Merging Methods:



&nbsp;   		DataInputStream with FileInputStream: Reads binary files for merging



&nbsp;   		EOFException handling: Detects end of files during read operations



&nbsp;   		Sequential appending: Merges files by copying first file then second file



&nbsp;	File Reading Methods:



&nbsp;   		DataInputStream reading: Reads and displays merged file contents



&nbsp;   		Console output: Displays all integers from the final merged file





#### 2\. lab9\_2 Class



Processes text files containing voting data and separates into YES/NO categories.



Key Methods:



&nbsp;	File Reading Methods:



&nbsp;   		BufferedReader with FileReader: Reads input text file line by line



&nbsp;   		readLine(): Reads individual lines from the text file



&nbsp;   		Alternating line processing: Handles name/vote pattern in input file



&nbsp;	File Writing Methods:



&nbsp;   		BufferedWriter with FileWriter: Writes separated data to output files



&nbsp;   		Multiple output streams: Creates lab9\_2\_yes.txt and lab9\_2\_no.txt simultaneously



&nbsp;   		write() and newLine(): Writes data with proper line separation



&nbsp;	Data Processing Methods:



&nbsp;   		State machine logic: Alternates between storing names and processing votes



&nbsp;   		Vote categorization: Separates "NAI" (YES) and "OXI" (NO) votes



&nbsp;  		 Conditional writing: Routes data to appropriate output file based on vote value

