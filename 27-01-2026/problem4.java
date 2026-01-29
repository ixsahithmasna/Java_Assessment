// Problem-4
// Create a program that:
// Accepts numeric input as strings.
// Converts them into appropriate wrapper objects.
// Stores them in a List<Number>.
// Calculates:
// Sum of all integers
// Average of floating-point numbers
// Logs invalid inputs.
// Must Use
// ✔ Wrapper classes (Integer, Double, etc.)
// ✔ Autoboxing / Unboxing
// ✔ ArrayList
// ✔ NumberFormatException


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class problem4 {
    private static final Logger logger = Logger.getLogger(problem4.class.getName());
    public static void main(String[] args) throws IOException{
        FileHandler handler = new FileHandler("app.log",true);
        logger.addHandler(handler);
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        ArrayList<Number> list = new ArrayList<>();
        
            for(int i=0;i<n;i++){
                String s=sc.nextLine();
                try{
                    if(!s.contains(".")){
                        Integer val = Integer.parseInt(s);
                        list.add(val);
                    }
                    else{
                        Double db = Double.parseDouble(s);
                        list.add(db);
                    }
                }
                catch(NumberFormatException e){
                    System.out.println("Invalid input"+e.getMessage());
                }
            }

        int sum=0;
        double double_sum=0;
        int floatCount=0;
        for(Number num : list){
            if(num instanceof Integer){
                sum+=num.intValue();
            }
            else if(num instanceof Double){
                double_sum+=num.doubleValue();
                floatCount++;
            }
        }
        System.out.println(sum+" "+double_sum);
        System.out.println("Average of Floating point Numbers "+(double_sum/floatCount));
    }
}

