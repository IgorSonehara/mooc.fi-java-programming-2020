 
import java.util.Scanner;
 
public class FirstWords {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
 
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                return;
            }
            
            String[] pieces = input.split(" ");
            
            System.out.println(pieces[0]);
        
        }
    }
}
