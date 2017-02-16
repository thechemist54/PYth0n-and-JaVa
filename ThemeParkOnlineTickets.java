// Name: Aaman Bhandari 
//
// Course: CSCI 2003      
//

//
// File name: ThemeParkOnlineTickets
//
// Program Description: Simulate an order from a theme park ticket website


//importing Scanner object

import java.util.Scanner;

//creating ThemeParkOnlineTickets class
public class ThemeParkOnlineTickets
{
    public static void main(String[] args) //creating main class
    {
        //non argument constructor
        ThemeParkOrder theme1 = new ThemeParkOrder();

        Scanner key = new Scanner(System.in); //creating scanner object

        //creating the required format of output
        System.out.println("         Welcome! Please complete your ticket order below!");
        System.out.println("=================================================================");
        System.out.println("    +-----------------------+-----------------+-----------------+");
        System.out.println("    |      THEME PARK       |   ADULT TICKET  |   CHILD TICKET  |");
        System.out.println("+---+-----------------------+-----------------+-----------------+");
        System.out.println("| 1 |    Universal Studios  |      $105.00    |      $100.00    |");
        System.out.println("+---+-----------------------+-----------------+-----------------+");
        System.out.println("| 2 |      Magic Kingdom    |      $124.00    |      $118.00    |");
        System.out.println("+---+-----------------------+-----------------+-----------------+");
        System.out.println("| 3 |          Epcot        |      $114.00    |      $108.00    |");
        System.out.println("+---+-----------------------+-----------------+-----------------+");

        System.out.print("\nChoose a Theme Park (1 - 3): ");
        int choose = key.nextInt(); /*allowing user to choose the theme park
                                    and storing it in choose*/

        //showing the output based on the users choice
        if (choose == 1)
        {
            theme1.setName("Universal Studios");
            System.out.println("\n\n+-----------------------+-----------------+-----------------+");
            System.out.println("|      THEME PARK       |   ADULT TICKET  |   CHILD TICKET  |");
            System.out.println("+-----------------------+-----------------+-----------------+");
            System.out.println("|    Universal Studios  |      $105.00    |      $100.00    |");
            System.out.println("+-----------------------+-----------------+-----------------+");
            theme1.setA_tickets(105);
            theme1.setC_tickets(100);
        }

        if (choose == 2)
        {
            theme1.setName("Magic Kingdom");
            System.out.println("\n\n+-----------------------+-----------------+-----------------+");
            System.out.println("|      THEME PARK       |   ADULT TICKET  |   CHILD TICKET  |");
            System.out.println("+-----------------------+-----------------+-----------------+");
            System.out.println("|     Magic Kingdom     |      $124.00    |      $118.00    |");
            System.out.println("+-----------------------+-----------------+-----------------+");
            theme1.setA_tickets(124);
            theme1.setC_tickets(118);
        }

        if (choose == 3)
        {
            theme1.setName("Epcot");
            System.out.println("\n\n+-----------------------+-----------------+-----------------+");
            System.out.println("|      THEME PARK       |   ADULT TICKET  |   CHILD TICKET  |");
            System.out.println("+-----------------------+-----------------+-----------------+");
            System.out.println("|         Epcot         |      $114.00    |      $108.00    |");
            System.out.println("+-----------------------+-----------------+-----------------+");
            theme1.setA_tickets(114);
            theme1.setC_tickets(108);
        }

        System.out.print("\nNumber of Adult Tickets: ");
        int a_ti = key.nextInt();

        System.out.print("Number of Child Tickets: ");
        int c_ti = key.nextInt();

        theme1.setNo_a_tickets(a_ti);
        theme1.setNo_c_tickets(c_ti);

        theme1.completeOrder(); //calling the completeOrder method




    }

}
