import java.util.Scanner;
public class Pantry
{
   //driver program for FoodItem class

   public static void main (String args[])
   {
      //Declare variables
      Scanner keyboard = new Scanner(System.in);
      String name;
      int calories;
      int fatGrams;
   
      //Prompt user to input name of food item, total calories, and fat grams
      
      System.out.print("Name of food item: ");
      name = keyboard.nextLine();
      
      System.out.print("Number of calories in food item: ");
      calories = keyboard.nextInt();
      
      System.out.print("Number of fat grams in food item: ");
      fatGrams = keyboard.nextInt();
      
      System.out.println();
   
      //Call constructor method to instantiate a new FoodItem object
      FoodItem fries = new FoodItem(name,calories,fatGrams);
   
      //Call toString to output a description of the FoodItem object
      System.out.println(fries.toString());
      
   
      //Call the percentFat method to calculate the total fat percentage
      System.out.printf("The percent of fat is %.1f%%.\n", fries.percentFat());
      System.out.println();
   
      //Call the getName method to output the name of the FoodItem
      System.out.println("The name of the item is " + fries.getName() + ".");
      
      System.out.println(fries);
     
   
      /**** add calls like the ones above to test all your setters and getters ****/
   
   } //end main
} //end class