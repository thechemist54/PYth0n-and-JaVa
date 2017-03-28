// Name: Aaman Bhandari        Date Assigned: 24 Mar 2017
//
// Course: CSCI 2003 60357     Date Due: 28 Mar 2017
//
// Instructor: Ms. Greer
//
// File name: Planner
//
// Program Description: A program that simulates a planner.

import java.io.File;  //importing File class
import java.io.FileNotFoundException;
import java.util.Scanner;  //importing Scanner class
import java.io.PrintWriter;  //importing PrintWriter class


public class Planner
{
    public static void main(String[] args) /*defining main class*/ throws FileNotFoundException        
    { 
        File k = new File("records.txt");   //file object
        Scanner ifile = new Scanner(k);  //object to read from file

        File l = new File("planner.txt");   //file object
        Scanner infile = new Scanner(l);  //object to read from file
        
        PrintWriter outfile = new PrintWriter("planner.txt"); //open writing
        PrintWriter ofile = new PrintWriter("records.txt");
 


        Scanner in = new Scanner(System.in); //object to read from user
       


        System.out.println("Personal Planner");
        System.out.println("================");
        boolean flag = true;


        String date = "";
        String time = "";
        String location = "";
        String event = "";


        while(flag)
        {

            System.out.println("\nOptions:");
            System.out.println("========");
            System.out.println("1. Add Event");
            System.out.println("2. Display Events");
            System.out.println("3. Quit");

            System.out.print("\nEnter options (1, 2, or 3): ");
            int option = in.nextInt();




            if (option == 1)
            {
                
                System.out.print("\nEnter date (MM/DD/YY): ");
                date = in.next();

                System.out.print("Enter time (HH:MM): ");
                time = in.next();

                System.out.print("Enter location: ");
                location = in.next();

                System.out.print("Enter event: ");
                event = in.next();


                outfile.println(date);
                outfile.println(time);
                outfile.println(location);
                outfile.println(event);
                outfile.println(" ");






            }

            else if(option == 2)
            {



                if(ifile.hasNextLine())
                {


                    while (infile.hasNextLine())
                    {
                        System.out.println(ifile.nextLine());
                    }

                }

                else
                {

                    System.out.println("\nNo events added!");

                }
            }

            else if (option == 3)
            {
                flag = false;
            }



        }


        ofile.close();
        outfile.close();
        ifile.close();
        infile.close();




        
        



    }

}
