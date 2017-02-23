// Name: Aaman Bhandari           Date Assigned: 24 Feb 2017
//
// Course: CSCI 2003 60357        Date Due: 28 Feb 2017
//
// Instructor: Ms. Greer
//
// File name: PetStore
//
// Program Description: This class will use the Dog class to simulate an order from the PetStore website.

import java.util.Scanner;   //importing scanner class

//creating PetStore class
public class PetStore
{

    public static void main(String[] args) //creating main class
    {
        Dog pet1 = new Dog(); //creating new object using non argument constructor

        System.out.println("Welcome! Select traits to choose a dog!"); //printing the welcome
        System.out.println("=======================================");
        System.out.println("\n======================");
        System.out.println("|  AVAILABLE PRICES  |");
        System.out.println("======================");
        System.out.println("Small Dog ----- $40.00");
        System.out.println("Medium Dog ---- $60.00");
        System.out.println("Large Dog ----- $80.00");
        System.out.println("\n\n  Sizes");
        System.out.println("=========");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");

        //creating Scanner object
        Scanner key = new Scanner(System.in);

        System.out.print("\nEnter choice (1, 2, or 3): "); //asking user for size
        int choiceS = key.nextInt();                         // of dog

        System.out.println("\n\n  Coats");
        System.out.println("=========");
        System.out.println("1. Short");
        System.out.println("2. Medium");
        System.out.println("3. Long");

        System.out.print("\nEnter choice (1, 2, or 3): ");//asking user for coats
        int choiceC = key.nextInt();

        double price = 0; //initiating price


        if (choiceS == 1) //evaluating the users choices
        {
            price = 40;
            pet1.setSize("Small");

            if (choiceC == 1)
            {
                pet1.setCoatLen("Short");
            }

            else if (choiceC == 2)
            {
                pet1.setCoatLen("Medium");
            }

            else if (choiceC == 3)
            {
                pet1.setCoatLen("Long");
            }
        }

        else if (choiceS == 2)
        {

            price = 60;
            pet1.setSize("Medium");

            if (choiceC == 1)
            {
                pet1.setCoatLen("Short");
            }

            else if (choiceC == 2)
            {
                pet1.setCoatLen("Medium");
            }

            else if (choiceC == 3)
            {
                pet1.setCoatLen("Long");
            }
        }

        else if (choiceS == 3)
        {

            price = 80;
            pet1.setSize("Large");

            if (choiceC == 1)
            {
                pet1.setCoatLen("Short");
            }

            else if (choiceC == 2)
            {
                pet1.setCoatLen("Medium");
            }

            else if (choiceC == 3)
            {
                pet1.setCoatLen("Long");
            }

        }

        System.out.println("\n\nBased on your responses, we suggest a "+pet1.getBreed()+"!");

        System.out.printf("\nWould you like to adopt a "+pet1.getBreed()+" for $%.2f? (y/n): ",price);
        String adopt = key.next();

        if (adopt.equals("y")) //printing the price
        {
            System.out.printf("\n\nBreed:%21s",pet1.getBreed());
            System.out.println("\n---------------------------");
            System.out.printf("Subtotal:%13s%4.2f","$",price);
            System.out.printf("\nTax:%18s%5.2f","$",price*0.11);
            System.out.printf("\nTotal:%16s%.2f","$",price+(price*0.11));
            System.out.println("\n\nPlease come again!");

        }

        else if (adopt.equals("n"))
        {
            System.out.println("\nPlease come again!");
        }


    }

}
