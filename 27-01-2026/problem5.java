// PROBLEM-5
// Write a Java program that reads student details from a text file, processes the data, and writes the results to another file.

// Each line in the input file contains:
// id,name,age

// The program should:
// Read the file line by line
// Clean and format the data
// Ignore duplicate student entries
// Handle invalid data without stopping the program
// Store and display processed data
// Write valid and invalid records to separate files
// Log important steps during execution

// Expected Behavior
// Extra spaces in names should be removed
// Student age must be 18 or above
// Invalid records should be skipped and recorded
// Duplicate students should be removed
// Final valid students should be printed and saved
// Use proper data types while reading numeric values
// Compare objects correctly when removing duplicates
// Ensure the program continues even if one record is invalid
// Use efficient string manipulation for formatting
// Do not use System.out.println for regular messages

// Must Use
// ✔ String and common string methods
// ✔ StringBuilder
// ✔ Wrapper classes
// ✔ Autoboxing / Unboxing
// ✔ Arrays (for input parsing)
// ✔ Collections framework
// ✔ List, Set, Map
// ✔ ArrayList, HashSet, HashMap
// ✔ Iteration techniques (for-each / iterator)
// ✔ Proper object comparison
// ✔ Exception handling using try-catch-finally
// ✔ throw and throws
// ✔ At least one custom exception
// ✔ File input/output
// ✔ Reading and writing files
// ✔ Logging (no System.out.println)

// Input Example (students.txt)
// 1, Ram ,22
// 2, Ravi,17
// 3, Raju ,22
// 4, John,25

// Output Files
// valid.txt → valid student records
// invalid.txt → invalid or failed records

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class InvalidNameException extends Exception {
    public InvalidNameException(String s) {
        super(s);
    }
}

public class problem5 {

    private static final Logger logger = Logger.getLogger(problem5.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler handler = new FileHandler("process.log", true);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);

        ArrayList<String> rawList = new ArrayList<>();
        ArrayList<String> validList = new ArrayList<>();
        ArrayList<String> invalidList = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("input1.txt"))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line.trim());
                rawList.add(sb.toString());
                sb.setLength(0);
            }
            logger.info("File read successfully");

        } catch (FileNotFoundException e) {
            logger.severe("Input file not found");
            return;
        }
        set.addAll(rawList);
        logger.info("Duplicate entries removed");
        ArrayList<String> ac = new ArrayList<>(set);
        for (String s : ac) {
            try {
                String parts[] = s.split(",");

                if (parts.length != 3)
                    throw new Exception("Invalid format");
                String idStr = parts[0].trim();
                String name = parts[1].trim().replaceAll("\\s+", "");
                String ageStr = parts[2].trim();
                int id = Integer.parseInt(idStr);
                logger.info("ID Validated: " + id);
                validateName(name);
                logger.info("Name Validated: " + name);
                int age = Integer.parseInt(ageStr);
                validateAge(age);
                logger.info("Age Validated: " + age);
                validList.add(id + "," + name + "," + age);

            } catch (Exception e) {
                invalidList.add(s);
                logger.warning("Invalid record: " + s + " | Reason: " + e.getMessage());
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("valid.txt"))) {
            for (String v : validList) {
                bw.write(v);
                bw.newLine();
            }
            logger.info("Valid records written.");

        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("invalid.txt"))) {
            for (String x : invalidList) {
                bw.write(x);
                bw.newLine();
            }
            logger.info("Invalid records written.");
        }

        logger.info("Processing completed.");
    }
    public static void validateName(String s) throws InvalidNameException {
        if (!s.matches("[A-Za-z]+")) {
            throw new InvalidNameException("Invalid Name: " + s);
        }
    }
    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }
    }
}
