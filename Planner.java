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
import java.io.FileNotFoundException; //importing the FileNotFoundException class
import java.util.Scanner;  //importing Scanner class
import java.io.PrintWriter;  //importing PrintWriter class


public class Planner
{
    public static void main(String[] args) /*defining main class*/ throws FileNotFoundException        
    { 


        Scanner in = new Scanner(System.in); //object to read from user
       


        System.out.println("Personal Planner");
        System.out.println("================");
        boolean flag = true;


        String date = " ";
        String time = " ";
        String location = "";   //initializing variables
        String event = "";




        while(flag)
        {

            System.out.println("\nOptions:");
            System.out.println("========");
            System.out.println("1. Add Event");
            System.out.println("2. Display Events");  //displaying the options
            System.out.println("3. Quit");            //        to users

            System.out.print("\nEnter options (1, 2, or 3): ");
            int option = in.nextInt();

            System.out.println();





            if (option == 1)
            {

                File l = new File("planner.txt");   //file object
                Scanner infile = new Scanner(l);  //object to read from file

                //object to write to a file records
                PrintWriter ofile = new PrintWriter("records.txt");

                //writing from the planner file to temporary file
                while (infile.hasNextLine())
                {
                    ofile.println(infile.nextLine());
                }

                ofile.close();   //closing the opened files
                infile.close();

                //object to write to the file planner
                PrintWriter outfile = new PrintWriter("planner.txt");

                System.out.print("Enter date (MM/DD/YY): ");
                in.nextLine();
                date = in.nextLine();

                System.out.print("Enter time (HH:MM): ");
                time = in.nextLine();                     //asking user for input

                System.out.print("Enter location: ");
                location = in.nextLine();

                System.out.print("Enter event: ");
                event = in.nextLine();

                File k = new File("records.txt");  //file object
                Scanner ifile = new Scanner(k);            //object to read from file

                //writing from the temporary file to planner file
                while (ifile.hasNextLine())
                {
                    outfile.println(ifile.nextLine());
                }


                outfile.println(date);
                outfile.println(time);
                outfile.println(location);
                outfile.println(event);
                outfile.println(" ");


                outfile.close();
                ifile.close();

            }

            else if(option == 2)
            {


                File k = new File("planner.txt");   //file object
                Scanner infile = new Scanner(k);  //object to read from file

                if(infile.hasNextLine())
                {

                    //displaying the events

                    while (infile.hasNextLine())
                    {
                        System.out.println(infile.nextLine());
                    }



                }

                else
                {

                    System.out.println("No events added!");

                }

                infile.close(); //closing the opened files
            }

            else if (option == 3)
            {
                flag = false; //ending the loop using flag
            }



        }


    }

}
