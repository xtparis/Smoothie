# Smoothie
Let's create a smoothie...yammm

Welcome to Smoothie Git Mini Project!
This project aims to help you understand the basics of Git through a fun analogy of making a smoothie.
Follow the steps below to create your own smoothie recipe, commit changes and learn about merging and resolving conflicts.

## Getting Started

### Clone the Repository
1. Clone this repository to your local machine using the following command:
   ```
   git clone <repository_url>
   ```

### Create a Feature Branch
2. Create a feature branch for your smoothie recipe. Name it in the format `yourName-smoothie`.
   ```
   git checkout -b yourName-smoothie
   ```

## How It Works

### Smoothie Class Methods
In the `Smoothie` class, you will find the following methods:

- `addYourBase()`: This method is used to add the base ingredient to the smoothie.
    - Basic ingredients are commented out initially. Uncomment the ingredient you want to use.
- `addBasicIngredient(String ingredient)`: Add basic ingredients to the smoothie.
- `addExtraIngredient(String ingredient)`: Add extra ingredients to the smoothie.

### Main Program
In the `main` method:
1. Create a `Smoothie` object (`mySmoothie`).
2. Call `mySmoothie.addYourBase()` to choose the base ingredient.
3. Call `mySmoothie.addBasicIngredient("")` to exit the method and prompt you to add your desired basic ingredient.

### Commit Changes
4. After choosing the basic ingredient, commit your changes to your feature branch:
   ```
   git add .
   git commit -m "Added basic ingredient to my smoothie"
   git push origin yourName-smoothie
   ```

### Open a Merge Request
5. Open a merge request (MR) to the main branch to see conflicts:
    - This simulates reviewing your changes before merging.
    - Resolve any conflicts that arise.

### Add Extra Ingredient
6. In the `main` method, call `mySmoothie.addExtraIngredient("YOUR EXTRA");`.
7. Commit these changes to your feature branch:
   ```
   git add .
   git commit -m "Added extra ingredient to my smoothie"
   git push origin yourName-smoothie
   ```
8. Open another merge request (MR) to the main branch to see new conflicts.

## Additional Notes
- Resolve conflicts: Learn how Git helps manage conflicts when merging branches.
- Pull/Merge Requests: Use these to review changes before merging.
- Have fun experimenting with different smoothie recipes!

---
