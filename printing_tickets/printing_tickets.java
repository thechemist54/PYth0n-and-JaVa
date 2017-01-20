

import java.util.Scanner; //import statement

public class printing_tickets //assigning a class

{
  
   public static void main(String []args)//assigning main
    
   {
      //printing the welcome text
      
      System.out.println("Welcome to the Cerebral Stage Online Ticket Service!");
      
      System.out.println("====================================================");
      
      System.out.println("\nEnter your information to start your ticket order.");
      
      System.out.println("--------------------------------------------------");
      
      //Getting input from user
      
      Scanner user = new Scanner(System.in);
      
      System.out.print("\nEnter your first and last name: ");
      
      String name = user.nextLine(); //Getting input from the user
      
      System.out.print("Enter the name of the show: ");
      
      String show = user.nextLine(); //Getting input from user
      
      System.out.print("Enter the date of the show: ");
      
      String date = user.nextLine();
      
      System.out.println("\nSeating Options");
                                                    //Printing the Section
      System.out.println("---------------");        // according to the ticket price  
      
      System.out.println("Section 1 = $20.00");
      
      System.out.println("Section 2 = $40.00");
      
      System.out.println("Section 3 = $60.00");
      
      System.out.print("\nEnter the section number of your choice: "); //Asking the user for the choice
      
      double selection = user.nextInt();
      
      System.out.printf("\nYou selected Section %1.0f for $%5.2f per ticket.",selection,selection*20);
      
      System.out.print("\n\nEnter the number of tickets you want to purchase: ");
      
      double no_of_tickets = user.nextInt();
      
      System.out.println("\nTotal Cost");
      
      System.out.println("----------");
      
      double subtotal = (selection*20)*no_of_tickets;
                                                      //Calculating the price,
      double tax = subtotal * 0.11;                   //tax and total
      
      double total = subtotal+tax;
      
      System.out.printf("Price:\t$%5.2f",subtotal);
      
      System.out.printf("\nTax:\t\t$%5.2f",tax);     //Displaying the price 
      
      System.out.printf("\nTotal:\t$%5.2f",total);
      
      System.out.println("\n\nPlease print out your 2 copies of the ticket below.");
      
      System.out.println("---------------------------------------------------");
      
      System.out.println("\n=====================================================");
      
      System.out.printf("|| Cerebral Stage ||  Show: %-20s\t||",show);
      
      System.out.println("\n||                ||                               ||");
      
      System.out.printf("||    Official    ||  Name: %-20s\t||",name);            
      
      System.out.println("\n||                ||                               ||"); //Printing the ticket
      
      System.out.printf("||     Online     ||  Date: %-20s\t||",date);              
      
      System.out.println("\n||                ||                               ||");
      
      System.out.printf("||     Ticket     ||  Section: %-17.0f\t||",selection);
      
      System.out.println("\n=====================================================");
      
      System.out.println("\nEnjoy the show!");
      
       
   
      
    }
      
}