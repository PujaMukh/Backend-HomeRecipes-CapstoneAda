package com.example.demo.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/recipe")
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
    @GetMapping(path="/{recipeId}")
    public Recipe getRecipeByID(@PathVariable("recipeId") Integer id) {
        return recipeService.getOneRecipe(id);
    }
    @PostMapping
    public void registerNewRecipe(@RequestBody Recipe recipe) {
        recipeService.addNewRecipe(recipe);
    }
}
