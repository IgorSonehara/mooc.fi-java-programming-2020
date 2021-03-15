 
import java.util.ArrayList;
import java.util.Scanner;
 
public class mainProgram {
 
    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
 
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Bird> birds = new ArrayList<>();
        
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                Bird bird = new Bird(name, latinName);
                birds.add(bird);
            }
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                int i = 0;
                for (Bird bird: birds) {
                    if (bird.getName().equals(birdName)) {
                        bird.addObservation();
                        i++;
                        break;
                    }
                }
                if (i == 0) {
                    System.out.println("Not a bird!");
                }
            }
            if (command.equals("All")) {
                for (Bird bird: birds) {
                    System.out.println(bird);
                }
            }
            if (command.equals("One")) {
                if (!birds.isEmpty()) {
                    System.out.print("Bird? ");
                    String birdName = scan.nextLine();
                    for (Bird bird: birds) {
                        if (bird.getName().equals(birdName)) {
                            System.out.println(bird);
                            break;
                        }
                    }
                }
            }
        }
 
    }
 
}