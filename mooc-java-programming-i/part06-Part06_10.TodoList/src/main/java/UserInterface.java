
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
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processCommand(command);
        }
    }
 
    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        }
 
    }
    
    public void add() {
        System.out.println("To add:");
        String task = scanner.nextLine();
        this.list.add(task);
    }
    
    public void list() {
        this.list.print();
    }    
    
    public void remove() {
        System.out.println("Which one is removed?");
        int number = Integer.valueOf(scanner.nextLine());
        this.list.remove(number);
    }   
} 
