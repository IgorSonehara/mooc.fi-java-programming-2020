 
import java.util.ArrayList;
 
public class PrintInRange {
 
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
 
        // Try your method here
        printNumbersInRange(numbers, 0, 5);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int num: numbers) {
            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }
        }
    }
    
}
