import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private Scanner scan;
    private RecipeManager manager;
    
    public UI(Scanner scanner) {
        this.scan = scanner;
        this.manager = new RecipeManager();
    }

    public void start() {
        this.readRecipeFile();
        this.readCommand();
    }

    public void readRecipeFile() {
        while(true) {
            System.out.print("File to read: ");
            String recipesFile = this.scan.nextLine();
        
            if(recipesFile.isEmpty()) {
                continue;
            }
        
            this.manager.assembleRecipesList(recipesFile);
            break;
        }
    }

    public void printCommandList() {
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }

    public void readCommand() {
        this.printCommandList();

        while(true) {
            System.out.print("Enter command: ");
            String command = this.scan.nextLine();
    
            if(command.equals("stop")) {
                break;
            }
    
            if(command.isEmpty()) {
                continue;
            }
    
            commandExec(command);
            System.out.println("");
        }
    }
    
    public void commandExec(String command) {
        if(command.equals("list")) {
            this.list();
        }

        if(command.equals("find name")) {
            System.out.print("Searched word: ");
            String name = this.scan.nextLine();

            printByName(name);
        }

        if(command.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            int cookingTime = Integer.valueOf(this.scan.nextLine());

            printByCookingTime(cookingTime);
        }

        if(command.equals("find ingredient")) {
            System.out.print("Ingredient: ");
            String ingredient = this.scan.nextLine();

            printByIngredient(ingredient);
        }
    }

    public void list() {
        this.printRecipes(this.manager.getRecipes());
    }

    public void printByName(String name) {
        ArrayList<Recipe> recipes = this.manager.getRecipesByName(name);
        printRecipes(recipes);
    }

    public void printByCookingTime(int cookingTime) {
        ArrayList<Recipe> recipes = this.manager.getRecipesByCookingTime(cookingTime);
        printRecipes(recipes);
    }

    public void printByIngredient(String ingredient) {
        ArrayList<Recipe> recipes = this.manager.getRecipesByIngredient(ingredient);
        printRecipes(recipes);
    }

    public void printRecipes(ArrayList<Recipe> recipes) {
        if(recipes.isEmpty()) {
            return;
        }
        
        System.out.println("\nRecipes:");

        int index = 0;
        while(index < recipes.size()) {
            System.out.println(recipes.get(index));
            index++;
        }
    }
}
