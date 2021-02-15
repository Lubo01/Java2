package model;

import java.util.ArrayList;

public class Dish {

    private String name;
    private String recipe;
    private ArrayList<String> ingredients = new ArrayList<>();
    private String description;

    public Dish(String name){
        this.name = name;
        this.recipe  = null;
        this.ingredients = null;
        this.description = null;

    }

    public Dish(String name, String recipe, ArrayList<String> ingredients, String description){
        this.name = name;
        this.recipe  = recipe;
        this.ingredients = ingredients;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
