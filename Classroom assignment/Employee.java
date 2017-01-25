// Name: Aaman Bhandari
//
// Date Assigned: 24 Jan 2017
//
// Course: CSCI 2003 60357 
//
// Date Due: 31 Jan 2017
//
// Instructor: Ms. Greer
//
// File name: Employee
//
// Program Description: Simulate a company roster.


//defining a class

public class Employee

{
   private String name;   //instance variables
   
   private int iD;
   
   private String department;
   
   private String position;
  
  //non-argument constructors 
   
   public Employee()
   
   {
      
      name = "";
      
      iD = 0;
      
      department = "";
      
      position = "";
      
   }
   
   //argument constructor
   
   public Employee(String nam,int eiD,String depart,String pos)
   
   {
   
      name = nam;
      
      iD = eiD;
      
      department = depart;
      
      position = pos;
   
   }
   
   //setters
   
   public void setName(String nam)
   
   {
      name = nam;   
   
   }
   
   public void setID(int eiD)
   
   {
      iD = eiD;   
   
   }
   
   public void setDepart(String depart)
   
   {
      department = depart;   
   
   }
   
   public void setPos(String pos)
   
   {
      position = pos;   
   
   }
   
   //getters
   
   public String getName()
   
   {
   
      return name;   
   
   }
   
   public int getID()
   
   {
   
      return iD;   
   
   }
   
   public String getDepart()
   
   {
   
      return department;   
   
   }
   
   public String getPos()
   
   {
   
      return position;   
   
   }


   





}
