 
import java.nio.file.Paths;
import java.util.Scanner;
 
public class IsItInTheFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
 
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        boolean contains = false;
        
        try (Scanner f = new Scanner(Paths.get(file))) {
 
            // we read the file until all lines have been read
            while (f.hasNextLine()) {
                // we read one line
                String row = f.nextLine();
                if (row.equals(searchedFor)) {
                    contains = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }        
        if (contains == true) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
