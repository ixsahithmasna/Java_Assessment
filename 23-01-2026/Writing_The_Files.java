// Writing the Files 
// Method 1 -> Using the BufferedWriter and FileWriter
            // Here Using the BufferedWriter need to use br.flush() and br.close() method. 
            // Because when we use the BufferedReader it stores in the Buffer first.
            // If we call the br.close() || br.flush() it wont stores in the files and results it show empty.


// Method 2 -> Using Files.write() (NIO)

// Method 3 - >Using PrintWriter()
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.*;
public class Writing_The_Files {
    public static void main(String[] args) throws IOException{
        
        //Method 1
        BufferedWriter br = new BufferedWriter(new FileWriter("output.txt"));
        br.write("I'm Backend Developer");
        br.newLine();
        br.write("I Love Playing Cricket");
        br.close();


        // Method 2
        // String s = "Writing the files using NIO";
        // Files.write(Paths.get("nio_output.txt"),s.getBytes());

        // Method 3
        // Using PrintWriter
        // PrintWriter pr = new PrintWriter("Print_output.txt");
        // pr.println("Hi");
        // pr.println("Hello");
        // pr.close();
        
    }
}
