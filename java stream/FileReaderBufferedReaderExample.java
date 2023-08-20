public import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferedReaderExample {
    public static void main(String[] args) {
        String inputFile = "input.txt"; // Path to the input file
        
        try {
            // Create FileReader object to read data from input file
            FileReader fileReader = new FileReader(inputFile);
            
            // Wrap the FileReader in a BufferedReader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            
            // Read lines from the input file using the BufferedReader
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print each line to the console
            }
            
            // Close the BufferedReader and FileReader
            bufferedReader.close();
            fileReader.close();
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while reading the file.");
        }
    }
}
 {
    
}
