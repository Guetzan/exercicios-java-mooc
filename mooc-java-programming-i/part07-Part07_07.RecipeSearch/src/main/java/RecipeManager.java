import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }

    public ArrayList<Recipe> getRecipesByName(String name) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        int index = 0;

        while(index < this.recipes.size()) {
            Recipe recipe = this.recipes.get(index);

            if(recipe.getName().contains(name)) {
                recipes.add(recipe);
            }

            index++;
        }

        return recipes;
    }

    public ArrayList<Recipe> getRecipesByCookingTime(int cookingTime) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        int index = 0;

        while(index < this.recipes.size()) {
            Recipe recipe = this.recipes.get(index);

            if(recipe.getCookingTime() <= cookingTime) {
                recipes.add(recipe);
            }

            index++;
        }

        return recipes;
    }

    public ArrayList<Recipe> getRecipesByIngredient(String ingredient) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        int index = 0;
        while(index < this.recipes.size()) {
            Recipe recipe = this.recipes.get(index);

            if(recipe.getIngredients().contains(ingredient)) {
                recipes.add(recipe);
            }

            index++;
        }

        return recipes;
    }

    public void assembleRecipesList(String filePath) {
        ArrayList<String> recipeData = new ArrayList<>();
        
        try(Scanner recipesFile = new Scanner(Paths.get(filePath))) {
            while(recipesFile.hasNextLine()) {
                String line = recipesFile.nextLine();
                
                if(line.isEmpty() || !(recipesFile.hasNextLine())) {
                    this.recipes.add(createRecipe(recipeData));
                    recipeData.clear();

                    continue;
                }

                recipeData.add(line);
            }
        } catch(Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public Recipe createRecipe(ArrayList<String> recipeData) {
        String name = recipeData.get(0);
        int cookingTime = Integer.valueOf(recipeData.get(1));

        return new Recipe(name, cookingTime, getIngredients(recipeData));
    }

    public ArrayList<String> getIngredients(ArrayList<String> recipeData) {
        ArrayList<String> ingredients = new ArrayList<>();

        /*due to recipes file formatting, indexes 0 and 1 are 
        reserved for recipe's name and cooking time.
        ingredients start from index 2*/
        int index = 2; 

        while(index < recipeData.size()) {
            ingredients.add(recipeData.get(index));
            index++;
        }

        return ingredients;
    }
}
