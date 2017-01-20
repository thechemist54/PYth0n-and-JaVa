import java.util.Scanner;

public class HouseBuilder
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter the area of the house: ");
      double area = in.nextDouble();
      
      in.nextLine(); //reads the \n whitespace character
      
      System.out.print("Enter the color: ");
      String color = in.nextLine();     
      
      
      System.out.print("Enter the number of beds: ");
      int numBeds = in.nextInt();
      
      System.out.print("Enter the number of baths: ");
      int numBaths = in.nextInt();
      
      House house1 = new House(area, color, numBeds, numBaths);
      house1.setColor("blue");
      
      System.out.println(house1);
      System.out.println("The house is " + house1.getColor() + " with " + house1.getArea() + " sqft " + "and " + house1.getBeds() + " beds and " + house1.getBaths() + " baths.");
      
      System.out.println(house1.getColor());      
      
   }
}