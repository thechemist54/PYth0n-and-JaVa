public class House
{
   private double area;
   private String color;
   private int numBeds;
   private int numBaths;
   
   //constructors
   public House()
   {
      area = 0;
      color = "";
      numBeds = 0;
      numBaths = 0;
   }
   
   public House(double newArea, String newColor, int newBeds, int newBaths)
   {
      area = newArea;
      color = newColor;
      numBeds = newBeds;
      numBaths = newBaths;
   }
   
   //setters
   public void setArea(double a)
   {
      area = a;
   }
   
   public void setColor(String c)
   {
      color = c;
   }
   
   public void setBeds(int b)
   {
      numBeds = b;
   }
   
   public void setBaths(int b)
   {
      numBaths = b;
   }
   
   //getters
   public double getArea()
   {
      return area;
   }
   public String getColor()
   {
      return color;
   }
   
   public int getBeds()
   {
      return numBeds;
   }
   
   public int getBaths()
   {
      return numBaths;
   }

   //display house info
   public String toString()
   {
      return "\nThe house is " + color + " with " + area + " sqft " + "and " + numBeds + " beds and " + numBaths + " baths.";
   } 
}