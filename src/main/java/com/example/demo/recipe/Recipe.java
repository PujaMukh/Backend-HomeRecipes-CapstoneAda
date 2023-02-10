package com.example.demo.recipe;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Recipe {
    @Id
    @SequenceGenerator(
            name = "recipe_sequence",
            sequenceName = "recipe_sequence",
            allocationSize = 1

    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE,
            generator = "recipe_sequence"
    )
    private Integer id;
    private String name;
    private String description;


    private String madeBy;
    private Long publishedDate;
    private Cuisine cuisine;
    private MealType mealType;

     private String picLink;
    @ElementCollection

    private List<String>ingredients;
    @ElementCollection

    private List<String>directions;



//    public void setDescription(String description) {
//        this.description = description;
//    }

    public Recipe(String name, String description, String madeBy, Cuisine cuisine, MealType mealType, String picLink, List<String> ingredients, List<String> directions) {
        this.name = name;
        this.description = description;
        this.madeBy = madeBy;
        this.publishedDate = Instant.now().toEpochMilli();
        this.cuisine = cuisine;
        this.mealType = mealType;
        this.picLink = picLink;
        this.ingredients = ingredients;
        this.directions = directions;
    }

    public Recipe() {

    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }



    public String getMadeBy() {
        return madeBy;
    }

    public Long getPublishedDate() {
        return publishedDate;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public MealType getMealType() {
        return mealType;
    }

    public String getPicLink() {
        return picLink;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public List<String> getDirections() {
        return directions;
    }


    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", madeBy='" + madeBy + '\'' +
                ", publishedDate=" + publishedDate +
                ", cuisine=" + cuisine +
                ", mealType=" + mealType +
                ", picLink='" + picLink + '\'' +
                ", ingredients=" + ingredients +
                ", directions=" + directions +
                '}';
    }
}
