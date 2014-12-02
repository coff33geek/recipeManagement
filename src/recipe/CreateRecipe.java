package recipe;

import java.util.Arrays;

/**
 * Class to Create new Recipes, based on the correct format for the txts. 
 * @author cstra_000
 *
 */
public class CreateRecipe{
	String instructions;
	String [] ingredients = new String [15];
	String picturePath;
	String title; 
	
	private void createInstructions(){
	
	}

	private void createIngredients(){
		
	}
	private void importPicture(){
		
	}
	private void createTitle(){
		
	}
	public void createTxt(){
		
		}
	/**
	 * Getter und Setter
	 * @return
	 */
	public String getInstructions() {
		return instructions;
	}
	
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	public String[] getIngredients() {
		return Arrays.copyOf(ingredients, ingredients.length);
	}
	public void setIngredients(String[] ingredients) {
		this.ingredients = Arrays.copyOf(ingredients, ingredients.length);
	}
	
	public String getPicturePath() {
		return picturePath;
	}
	
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	
}
