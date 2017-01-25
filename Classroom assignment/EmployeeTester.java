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
// File name: EmployeeTester
//
// Program Description: Simulate a company roster.


//defining a class

public class EmployeeTester

{

   public static void main (String[] args) //defining main method
   
   {
      
      // creating object using non argument constructor
      
      Employee company1 = new Employee();
      
      //creating object using argument constructor
      
      Employee company2 = new Employee("Tyler Greer",12345,"Computer Science","Instructor");
      
      //Displaying the required outputs
      
      System.out.println("TESTING ARGUMENT CONSTRUCTOR");
      
      System.out.println("----------------------------");
      
      System.out.println("\n"+company2.getName());
      
      System.out.println("Expected: Tyler Greer");
      
      System.out.println("\n"+company2.getID());
      
      System.out.println("Expected: 12345");
      
      System.out.println("\n"+company2.getDepart());
      
      System.out.println("Expected: Computer Science");
      
      System.out.println("\n"+company2.getPos());
      
      System.out.println("Expected: Instructor");
      
      System.out.println("\nTESTING NON-ARGUMENT CONSTRUCTOR");
      
      System.out.println("---------------------------------");
      
      company1.setName("Desiree Wilson");
      
      System.out.println("\n"+company1.getName());
      
      System.out.println("Expected: Desiree Wilson");
      
      company1.setID(45678);
      
      System.out.println("\n"+company1.getID());
      
      System.out.println("Expected: 45678");
      
      company1.setDepart("Orthopaedics");
      
      System.out.println("\n"+company1.getDepart());
      
      System.out.println("Expected: Orthopaedics");
      
      company1.setPos("Registered Nurse");
      
      System.out.println("\n"+company1.getPos());
      
      System.out.println("Expected: Registered Nurse");
      
      
   }   

}
