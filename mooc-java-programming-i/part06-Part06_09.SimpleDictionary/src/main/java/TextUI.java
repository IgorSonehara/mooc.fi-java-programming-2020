
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor
 */
public class TextUI {
    private Scanner scanner = new Scanner(System.in);
    private SimpleDictionary dictionary = new SimpleDictionary();
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) { 
            System.out.println("Command:");
            String word = scanner.nextLine();
            
            
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (word.equals("add")) {
                add();
            } else if (word.equals("search")) {
                search();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
    public void add() {
        System.out.println("Word:");
        String word = scanner.nextLine();
        System.out.println("Translation:");
        String translation = scanner.nextLine();
        dictionary.add(word, translation);        
    }
    
    public void search() {
        System.out.println("To be translated:");
        String word = scanner.nextLine();
        if (dictionary.translate(word) == null) {
            System.out.println("Word " + word + " was not found"); 
        } else {
            System.out.println(dictionary.translate(word)); 
        }       
    }
}
