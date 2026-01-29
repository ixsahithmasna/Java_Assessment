// Given an array of employee names (with duplicates): 
// Convert array → ArrayList
// Remove duplicates using HashSet
// Create a HashMap<String, Integer> for frequency count
// Display data using multiple iteration techniques
// Must Use
// ✔ Arrays
// ✔ ArrayList
// ✔ HashSet
// ✔ HashMap
// ✔ Iterators and enhanced for-loop
// ✔ equals() internally (HashSet behavior)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map;

public class problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        try{
        int n = Integer.parseInt(line);
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        ArrayList<String> list = new ArrayList<>();
        for(String s : arr){
            list.add(s);
            System.out.println(s);
        }
        HashSet<String> set = new HashSet<>(list);
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        // Method 1 : ForEach
        for(Map.Entry<String,Integer> m : map.entrySet()){
            System.out.println(m.getKey()+"->"+m.getValue());
        }
        // Method 2 : Through Iterator
        // ForEachLoop
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry m = (Map.Entry)itr.next();
            System.out.println(m.getKey()+"->"+m.getValue());
        }

        //ForEach Method
        map.forEach((k,v)->System.out.println(k+" "+v));    
        System.out.println(set);
    }
    catch(NumberFormatException e){
        System.out.println("Enter Integer as size of array"+e.getMessage());
    }
    catch(NegativeArraySizeException e){
        System.out.println("Enter the positive Number "+e.getMessage());
    }
    }
}
