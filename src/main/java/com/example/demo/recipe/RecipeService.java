package com.example.demo.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;
    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getRecipes() {
        return recipeRepository.findAll();
//        return List.of(
//                new Recipe (
//                        1,
//                        "mutton curry",
//                        "Puja Mukherjee",
//                        Instant.now().toEpochMilli(),
//                        Cuisine.INDIAN_BENGALI,
//                        MealType.LUNCH,
//                        "http://google.com",
//                        List.of("mutton", "turmeric", "salt", "yogurt", "lemon juice"),
//                        List.of("Marinate the mutton with salt, turmeric, yogurt, lemon juice. Cut 2 onions, 1 tomato and saute in pressure cooker with oil for about 20 mins. Add garam masala, turmeric, cumin powder, meat masala,coriander powder, turmeric, whole garlic, red pepper powder. Add 2 potatos sliced in cubes and the mutton and saute for sometime. Put 1 glass water. Put 9 whistles in cooker. Mutton is ready")
//
//                )
//        );
    }
    public Recipe getOneRecipe(Integer id) {
        return recipeRepository.findById(id).get();
        //return recipeRepository.getReferenceById(id);
    }

    public void addNewRecipe(Recipe recipe) {
//       Optional<Recipe> recipeOptional = recipeRepository.findRecipeByname(recipe.getName());
//       if (recipeOptional.isPresent()) {
//           throw new IllegalStateException("name taken");
//       }
       recipeRepository.save(recipe);

//        System.out.println(recipe);

    }
public void deleteRecipe(Integer id) {
//        boolean exists = recipeRepository.exists(Example);
//        if (!exists) {
//            throw new IllegalStateException("Student with id"+ id + "doesn't exist");
//        }
        recipeRepository.deleteById(id);
}

}
