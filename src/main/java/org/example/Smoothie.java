package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smoothie {
    private List<String> basicIngredients;
    private List<String> extraIngredients;

    public Smoothie() {
        basicIngredients = new ArrayList<>();
        extraIngredients = new ArrayList<>();
    }

    public void addYourBase() {
//        basicIngredients.add("Almond Milk");
//        basicIngredients.add("Cow Milk 20%");
//        basicIngredients.add("Cow Milk 5%");
//        basicIngredients.add("Coconut Milk");
    }

    public void addBasicIngredient(String ingredient) {
        basicIngredients.add(ingredient);
        System.out.println("Added basic ingredient: " + ingredient);
    }

    public void addExtraIngredient(String ingredient) {
        extraIngredients.add(ingredient);
        System.out.println("Added extra ingredient: " + ingredient);
    }

    public void makeSmoothie() {
        System.out.println("\nMaking Smoothie...");
        System.out.println("Basic Ingredients:");
        for (String basic : basicIngredients) {
            System.out.println("- " + basic);
        }

        if (!extraIngredients.isEmpty()) {
            System.out.println("\nExtra Ingredients:");
            for (String extra : extraIngredients) {
                System.out.println("- " + extra);
            }
        }

        System.out.println("\n Yammm smoothie is ready!");
    }

    public static void main(String[] args) {
        Smoothie mySmoothie = new Smoothie();


        mySmoothie.addYourBase();

        mySmoothie.addBasicIngredient("ADD YOUR FRUIT");


        // Make the smoothie
        mySmoothie.makeSmoothie();
    }
}
