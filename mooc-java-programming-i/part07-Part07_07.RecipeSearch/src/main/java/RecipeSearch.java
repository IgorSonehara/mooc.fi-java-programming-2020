 
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class RecipeSearch {
 
    public static void main(String[] args) {
        ArrayList<Recipe> recipes = new ArrayList<>();
 
        Scanner scan = new Scanner(System.in);
        
        System.out.print("File to read: ");
        String file = scan.nextLine();
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        System.out.println("");
        try (Scanner scanner = new Scanner(Paths.get(file))) {
           
            while (scanner.hasNextLine()) {
                
                String line = scanner.nextLine();      
                String name = line;
                line = scanner.nextLine();
                int cookingTime = Integer.valueOf(line);
                Recipe recipe = new Recipe(name, cookingTime);
                recipes.add(recipe);
               
                while (true) {
                    line = scanner.nextLine();
 
                    if (line.isEmpty()) {
                        
                        break;
                    } 
                    recipe.addIngredient(line);     
                }
            }
        } catch (Exception e) {
             System.out.println("Error: " + e.getMessage());
        }
        
        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scan.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    System.out.println(recipe);
                }
            }
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scan.nextLine();
                System.out.println("");
                System.out.println("Recipes: ");
                for (Recipe recipe: recipes) {
                    if (recipe.getName().contains(word)) {
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scan.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.getCookingTime() <= time) {
                        System.out.println(recipe);
                    }
                }                
            }
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scan.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe);
                    }
                }                
            }
        }   
    }
}
