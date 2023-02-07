package com.example.demo.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/recipe")
@CrossOrigin
public class RecipeController {
    private final RecipeService recipeService;
    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
	public List<Recipe> getRecipes() {
        return recipeService.getRecipes();

//		return List.of(
//                new Recipe (
//                        "mutton curry",
//                        1,
//                        "Puja Mukherjee",
//                        Instant.now().toEpochMilli(),
//                        Cuisine.INDIAN_BENGALI,
//                        MealType.LUNCH,
//                        "http://google.com",
//                        List.of("mutton", "turmeric", "salt"),
//                        List.of("Marinate the mutton with salt, turmeric. Cut onion and saute in pressure cooker, add masalas. Put 9 whistles in cooker")
//
//                )
//        );
	}
//    @GetMapping(path="/{recipeId}")
//    public Recipe getRecipeByID(@PathVariable("recipeId") Integer id) {
//        return recipeService.getOneRecipe(id);
//    }
    @GetMapping(path="/{mealType}")
    public List<Recipe> getRecipeByMealType(@PathVariable("mealType") String mealType) {
//        System.out.println(mealType);
        List<Recipe> matchingRecipe=new ArrayList<>();
        List<Recipe> recipes = recipeService.getRecipes();


        for (int i=0; i<recipes.size(); i++) {
            Recipe recipe = recipes.get(i);
//            System.out.println(recipe);

            MealType mealType1 = recipe.getMealType();
            if (mealType1.name().equals(mealType)) {
                matchingRecipe.add(recipe);
            }

        }
        return matchingRecipe;




//        return recipeService.getOneRecipe();
    }
    @PostMapping
    public void registerNewRecipe(@RequestBody Recipe recipe) {
        recipeService.addNewRecipe(recipe);
    }
}
