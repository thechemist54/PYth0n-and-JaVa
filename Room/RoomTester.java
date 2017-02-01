// Name: Aaman Bhandari            Date Assigned: 31 Jan 2017
//
// Course: CSCI 2003  60357         Date Due: 7 Feb 2017
//
// Instructor: Ms. Greer
//
// File name: RoomTester
//
// Program Description:  Simulate an online store that sells paint.

public class RoomTester //defining RoomTester class

{

   public static void main(String[] args) //defining the main class
   
   {
   
      Room room1 = new Room(3,15,12); // calling argument constructor
      
      Room room2 = new Room(); //calling the non-argument constructor
      
      //printing the required output
      
      System.out.println("TESTING ARGUMENT CONSTRUCTOR");
      
      System.out.println("----------------------------");
      
      System.out.println("\n"+room1.getWalls());
      System.out.println("Expected: 3");
      
      System.out.println("\n"+room1.getHeight());
      System.out.println("Expected: 15.0");
      
      System.out.println("\n"+room1.getWidth());
      System.out.println("Expected: 12.0");
      
      System.out.println("\n"+room1.getArea());
      System.out.println("Expected: 540.0");
      
      System.out.println("\nTesting toString Method");
      System.out.println("-----------------------");
      System.out.println(room1.toString());
      
      System.out.println("\nTESTING NO-ARGUMENT CONSTRUCTOR");
      
      System.out.println("-------------------------------");
      
      //calling all the setter methods and printing the required output
      
      room2.setWalls(5);
      System.out.println("\n"+room2.getWalls());
      System.out.println("Expected: 5");
      
      room2.setHeight(8);
      System.out.println("\n"+room2.getHeight());
      System.out.println("Expected: 8.0");
      
      room2.setWidth(11);
      System.out.println("\n"+room2.getWidth());
      System.out.println("Expected: 11.0");
      
      
      System.out.println("\n"+room2.getArea());
      System.out.println("Expected: 440.0");
      
      System.out.println("\nTesting toString Method");
      System.out.println("-----------------------");
      System.out.println(room2.toString());

      
      
      
     }

}