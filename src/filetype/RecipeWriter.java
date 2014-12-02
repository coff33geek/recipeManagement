package filetype;

import recipe.CreateRecipe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by cstra_000 on 02.12.2014.
 */
public class RecipeWriter {
    FileWriter writer;
    File file;
    String fileName;
    String test;
    String[] ingredients = new String[15];

    public void writeRecipe(){
        file = new File(fileName);


        try{
            writer = new FileWriter(file);
            CreateRecipe recipe = new CreateRecipe();

            String instructions = recipe.getInstructions();
            writer.write(instructions);

            String[] ingredients = new String[15];
            ingredients = recipe.getIngredients();

            for(int i = 0; i < recipe.getIngredients().length; i++){
                test += ingredients[i];
                System.out.println(test);
            }

        }catch(IOException ioe){
            ioe.printStackTrace();
        }

    }
}
