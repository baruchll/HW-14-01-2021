import java.util.HashMap;
import java.util.Set;

public class Restaurant {
   String resName;
    HashMap<Ingredient,Double> ingredients;

    public Restaurant(String resName){
        this.resName = resName;

        new Restaurant("name");
        if (resName != null){
            HashMap<Ingredient, Double> ingredient = new HashMap<>();
        }
    }
    void addIngredient(Ingredient i, double amount){
        i = new Ingredient( "4534g","cumin", 6.0);
        ingredients.put(i,4.1);
    }
    Double totalCost(){
        Double temp = 0.0;
        int sum = 0;
        for (Double d: ingredients.values()) {
            temp = temp + ingredients.values();
        }

        return temp;
    }
    boolean isAvailable(Dish dish){
        for (dish.getIngredients() :ingredients.values()) {

        }
        if
    }
}
