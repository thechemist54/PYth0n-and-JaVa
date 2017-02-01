// Name: Aaman Bhandari            Date Assigned: 31 Jan 2017
//
// Course: CSCI 2003  60357         Date Due: 7 Feb 2017
//
// Instructor: Ms. Greer
//
// File name: Room
//
// Program Description:  Simulate an online store that sells paint.




//declaring class Room

public class Room

{

   private int no_of_walls;
   private double height;               //instance variables
   private double width;
   
   public Room()  //non-argument constructor
   
   {
   
      no_of_walls = 1;
      height = 0;
      width = 0;
   
   }
   
   public Room(int walls,double h,double w)  //argument constructor
   
   {
   
      no_of_walls = walls;
      height = h;
      width = w;
   
   }
   
   //setters
   
   public void setWalls(int walls)
   
   {
   
      no_of_walls = walls;
   
   }
   
   public void setHeight(double h)
   
   {
   
      height = h;
   
   }
   
   public void setWidth(double w)
   
   {
   
      width = w;
   
   }
   
   //getters
   
   public int getWalls()
   
   {
   
      return no_of_walls;
   
   }
   
   public double getHeight()
   
   {
   
      return height;
   
   }
   
   public double getWidth()
   
   {
   
      return width;
   
   }
   
   // method that calculates and returns the total area of the all the walls in the room
   
   public double getArea()
   
   {
   
      return no_of_walls*height*width;
   
   }
   
   //toString method that displays the object’s current data
   
   public String toString()
   
   {
   
      return "Walls:   "+ no_of_walls +"\nHeight:  "+ height +" ft"
      
      +"\nWidth:   "+ width +" ft";
   
   }




   
}