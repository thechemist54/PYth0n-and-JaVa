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
// File name: Company
//
// Program Description: Simulate 3 employees.


//defining a class

public class Company

{

   public static void main (String[] args) //defining main method
   
   {
      
      // creating 2 objects using non argument constructor
      
      Employee company1 = new Employee("Susan Meyers",47899,"Accounting","Vice President");
      
      Employee company2 = new Employee("Mark Jones",39119,"IT","Programmer");
      
      // creating object using argument constructor 
      
      Employee company3 = new Employee();
      
      // printing the required output 
      
      System.out.printf("\n%-20s%-20s%-20s%-20s","Name","ID Number","Department","Position");
      
      System.out.println("\n-----------------------------------------------------------------------------");
      
      System.out.printf("%-20s%-20s%-20s%-20s",company1.getName(),company1.getID(),company1.getDepart(),company1.getPos());
      
      System.out.printf("\n%-20s%-20s%-20s%-20s",company2.getName(),company2.getID(),company2.getDepart(),company2.getPos());       
      
      company3.setName("Joy Rogers");
      
      company3.setID(81774);
      
      company3.setDepart("Manufacturing");
      
      company3.setPos("Engineer");
      
      System.out.printf("\n%-20s%-20s%-20s%-20s",company3.getName(),company3.getID(),company3.getDepart(),company3.getPos());     

   }

}