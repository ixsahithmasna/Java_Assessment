// java.io && java.nio are packages that include all the file handling operations in java 
// Stream - > A flow of data. InputStream reads the data and OutputStream write the data.
// ByteStream - > Handles the binary Files ->InputStreamReader and OutputStreamReader

// CharacterStream -> Handles the Text Files. Classes BufferReader,BufferWriter,FileReader,FileWriter

// Reading the Files :
//    Method1 : Using the BufferedReader and FileReader
//    Method2 : Using the Using Files.readAllLines() (NIO)
//    Method3 : Using the Scanner class

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Reading_The_Files{
    public static void main(String[] args) throws IOException{
        //Method 1
        // BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        // String line = br.readLine();
        // if(line!=null){
        //      System.out.println(line);
        // }



        //Method 2 
        // List<String> f = Files.readAllLines(Paths.get("input.txt"));
        // for(String s : f){
        //     System.out.println(s);
        // }


        //Method 3
        // Scanner sc = new Scanner(new File("input.txt"));
        // while(sc.hasNextLine()){
        //     System.out.println(sc.nextLine());
        // }
        // sc.close();
        
    }
}