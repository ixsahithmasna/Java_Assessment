// Create a program that:
// Reads a paragraph from a file.
// Performs the following:
// Count total words, sentences, and characters (excluding spaces).
// Find the top 5 most frequent words (case-insensitive).
// Replace multiple spaces with a single space.
// Reverse each sentence without changing word order.
// Compare strings using both == and equals() and print results with explanation.
// Must Use
// ✔ String class
// ✔ StringBuilder
// ✔ Common String methods (split, toLowerCase, trim, replace)
// ✔ equals() vs ==
// ✔ File reading
// ✔ Exception handling (try-catch)


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Pair {
    String s;
    int val;
    Pair(String s, int val) {
        this.s = s;
        this.val = val;
    }
}

public class Reading_File {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append(" ");
            }
            String s = sb.toString().trim();
            s = s.replaceAll("\\s+", " ");
            String arr[] = s.split(" ");
            int words_Count = arr.length;
            int total_sentences = Sentences(s);
            int total_Characters = T_Characters(s);

            ArrayList<String> top_5 = Top_5(arr);
            for (int i = 0; i < top_5.size(); i++) {
                System.out.println(top_5.get(i));
            }
            ArrayList<String> sen = Reverse_Sentences(s);
            for (int i = sen.size() - 1; i >= 0; i--) {
                System.out.println(sen.get(i));
            }
            System.out.println(words_Count);
            System.out.println(total_sentences);
            System.out.println(total_Characters);

            String a ="Sahith";
            String b ="Sahith";
            boolean flag = a==b;
            if(flag){
                System.out.println("Both String pointing to same reference beacause as first store in the string pool and after while creation of string2 it checks first in the string pool if it is there it will directly refer to that if not it will take new string with different reference");
            }
            if(a.equals(b)) {
                System.out.println("Both String are equals");
            }
            String aa = new String("Sahith");
            String bb = new String("Sahith");
            boolean flagg = aa==bb;
            if(!flag){
                System.out.println("Both String refer to different "+flag)
            }

        } 
        catch(FileNotFoundException e){
            System.out.println("File is Not There in the Laptop"+e.getMessage());
        }
        catch (IOException e) {
            System.out.println("File is Empty " + e.getMessage());
        }

    }

    public static ArrayList<String> Reverse_Sentences(String s) {
        ArrayList<String> ans = new ArrayList<>();
        String[] parts = s.split("[.!?]");
        for (String x : parts) {
            x = x.trim();
            if (x.length() > 0) ans.add(x + ".");
        }

        return ans;
    }
    public static ArrayList<String> Top_5(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            s = s.toLowerCase().replaceAll("[^a-z]", "");
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.val - a.val);
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            pq.add(new Pair(m.getKey(), m.getValue()));
        }
        ArrayList<String> ans = new ArrayList<>();
        int idx = 5;
        while (idx > 0 && !pq.isEmpty()) {
            Pair p = pq.poll();
            ans.add(p.s);
            idx--;
        }
        return ans;
    }

    public static int Sentences(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '.' || c == '!' || c == '?') count++;
        }
        return count;
    }

    public static int T_Characters(String s) {
        s = s.replaceAll(" ", "");
        return s.length();
    }
}
