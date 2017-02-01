// Name: Aaman Bhandari            Date Assigned: 31 Jan 2017
//
// Course: CSCI 2003  60357         Date Due: 7 Feb 2017
//
// Instructor: Ms. Greer
//
// File name: PaintStore
//
// Program Description:  Simulate an online store that sells paint.


import java.util.Scanner; //importing Scanner class

public class PaintStore //defining PaintStore class

{

   public static void main(String[] args) //defining main class
   
   {
   
      Scanner key = new Scanner(System.in); //creating a new object using Scanner class
      
      //printing the required output
      
      System.out.println("Welcome to the Paint Store!");
      System.out.println("===========================");
      
      System.out.println("\nStep 1: Choose your paint color");
      System.out.println("-------------------------------");
      
      System.out.println("purple   green");
      System.out.println("blue     teal");
      System.out.println("yellow   red");
      
      System.out.print("\nEnter a paint color: ");
      String color = key.nextLine(); //user inputs color
      
      System.out.println("\n\nStep 2: Tell us about your room");
      System.out.println("-------------------------------");
      
      System.out.print("Enter the number of walls in the room: ");
      int no_of_walls = key.nextInt(); //user enters number of walls to color
      
      //user enters the height and width
      
      System.out.print("Enter the height of one wall: ");
      double height = key.nextDouble();
      
      System.out.print("Enter the width of one wall: ");
      double width = key.nextDouble();
      
      System.out.println("\n\nStep 3: Paint needed");
      System.out.println("--------------------");
      
      Room room3 = new Room(no_of_walls,height,width); //calling the non argument costructor
      
      double cans = Math.ceil((room3.getArea()/250)); //calculating no. of cans
      
      //printing the required outputs
      
      System.out.printf("You need "+"%.0f cans of "+color+" paint to cover "+
      room3.getArea()+" sqft.",cans ); 
      
      System.out.println("\n\n\nStep 4: Final price");
      System.out.println("-------------------");
      
      System.out.printf("Subtotal: $%.2f",(room3.getArea()/250)*8.99);
      System.out.printf("\nTax:      $%.2f",((room3.getArea()/250)*8.99)*0.11);
      System.out.printf("\nTotal:    $%.2f",((room3.getArea()/250)*8.99)+
      (((room3.getArea()/250)*8.99)*0.11));
      
      System.out.println("\n\nThank you for shopping with us!");
      
      
      
      
     }

}