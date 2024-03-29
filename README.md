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
### Open with IntelliJ
Open the repo in intelliJ, it should be recognized as idea project.
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
4. After choosing the basic ingredient, commit your changes to your feature branch and then push them to your remote branch:
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

### PLay with Rebase 
Even though in git projects, the rebase usually happens after main branch, you can rebase 
your smoothie after your friend's. Ask your friend to push their changes 
in their branch and after you fetch, rebase with:
   ```
      git rebase -i origin/friendName-smoothie
   ```
After running the command, an editor will open with a list of your commits. To continue your rebase use:
   ```
      :qa <ENTER>
   ```
You will be logged with what **merge conflicts** there are (if there are so). In this case:
If there are conflicts during the rebase, Git will pause the rebase process and notify you.

1. Open the conflicted file(s) in your code editor. You will see conflict markers like:

   ```
   <<<<<<< HEAD
   This is the content of the file on your branch.
   =======
   This is the conflicting content from the branch you are rebasing onto.
   >>>>>>> parent-branch
   ```

   - `<<<<<<< HEAD`: This marks the beginning of the conflicting changes on your branch _(yours)_.
   - `=======`: Separates your changes from the incoming changes.
   - `>>>>>>> parent-branch`: This marks the end of the conflicting changes from the branch you are rebasing onto _(others)_.

2. Resolve the conflict by editing the file to keep the changes you want. Remove the conflict markers (`<<<<<<<`, `=======`, `>>>>>>>`) and any unnecessary code.

3. After resolving conflicts, add the resolved files:

   ```
   git add <resolved-file>
   ```
Then continue your rebase with:
   ```
      git rebase --continue
   ```
This also is needed when there are no conflicts, to finalize your rebase.

To have your changes in the remote repo, push them with:
   ```
      git push -f origin
   ```
_The -f (--force) flag, overrides the remote branch's history, so 
in other cases you have tobe sure for your changes before using it._

## Additional Notes
- Resolve conflicts: Learn how Git helps manage conflicts when merging branches.
- Pull/Merge Requests: Use these to review changes before merging.
- Have fun experimenting with different smoothie recipes!

---