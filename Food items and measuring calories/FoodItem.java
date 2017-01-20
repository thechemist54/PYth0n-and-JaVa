
/**
 * FoodItem class
 * This class simulates a food item.
 */

public class FoodItem

{
   private String name;      // name of food
   private int calories;     // amount of calories in food
   private int fatGrams;     // grams of fat in food
   
   //constructor to accept and initialize instance data
   public FoodItem()
   {
      name="California";
      calories = 33;
      fatGrams = 76;
   }
   public FoodItem(String n, int cal, int fat)
   
   {
      name = n;
      calories = cal;
      fatGrams = fat;
   }
   
   /**
    * The setName method accepts an arguement
    * which is stored in the name field.
    */
   
    public void setName(String n)
    
   {
      name = n;
   }
   
   /**
    * The setCalories method accepts an arguement
    * which is stored in the calories field.
    */
   
   public void setCalories(int cal)
   
   {
      calories = cal;
   }
   
   /**
    * The setFatGrams method accepts an arguement
    * which is stored in the fatGrams field.
    */
   
   public void setFatGrams(int fat)
   
   {
      fatGrams = fat;
   }
   
    /**
    * The getName method returns the
    * value in the name field.
    */

   public String getName()
   
   {
      return name;
   }
   
    /**
    * The getCalories method returns the
    * value in the calories field.
    */

   public int getCalories()
   
   {
      return calories;
   }
   
    /**
    * The getFatGrams method returns the
    * value in the fatGrams field.
    */

   public int getFatGrams()
   
   {
      return fatGrams;
   }

   /**
    * The toString returns a one-line description
    * of the item being labelled
    */

   public String toString()
   
   {
      return name + " contains " + calories + " calories and " + fatGrams + " fat grams.";
   }
   
   
    /**
    * The caloriesFromFat returns a calculation
    * of the calories that result from fat
    */
   public int caloriesFromFat()
   
   {
      return fatGrams * 9;
   }
   
   
    /**
    * The percentFat returns a calculation
    * of the percentage of calories that come from fat
    */
   public double percentFat()
   
   {
      double calor = caloriesFromFat();
      return calor/calories;
   }
      

}   
