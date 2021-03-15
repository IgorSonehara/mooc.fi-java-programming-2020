 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Items {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
        
        // implement here your program that uses the class Item
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            items.add(new Item(name));
        }
        
        
        for (Item item: items) {
            System.out.println(item);
        }
 
        
        
 
    }
}

