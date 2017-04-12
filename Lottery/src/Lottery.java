// Name: Aaman Bhandari          Date Assigned: 6 April, 2017
//
// Course: CSCI 2003 60357       Date Due: 13 April, 2017
//
// Instructor: Ms. Greer
//
// File name: Lottery
//
// Program Description: Simulate a lottery game.

import java.util.Scanner;  //importing Scanner class
import java.util.Random;  // importing random class




public class Lottery       //defining lottery class
{
    public static void main(String[] args)   //defining main class
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();    //creating the random object

        System.out.println("Instant Lottery");
        System.out.println("===============");

        System.out.println("\nOptions:");
        System.out.println("========");
        System.out.println("1. Choose Numbers");
        System.out.println("2. Check Winnings");  //welcome text
        System.out.println("3. Quit");
        System.out.println();




        boolean flag = true;

        int choice = 0;
        int nchoice = 0;
        int matches = 0;
        int parray[] = new int[6];
        int warray[] = new int[6];    //initializing some variables
        double prize = 0;             //and arrays
        double tprize = 0;



        while(choice!=3)   //looping through the choices
        {
            try
            {


                System.out.print("Enter choice (1, 2, or 3): ");
                String chr = in.next();

                choice = Integer.parseInt(chr);  //changing choice to integer

                if(choice<=0 || choice>3)
                {
                    continue;     //validating the input
                }



                if (choice == 1)    //looking at the choices to produce
                                    // respective output
                {
                    nchoice = 0;
                    System.out.println("\n---------------------------------");
                    System.out.println("\nNumber Options:");
                    System.out.println("===============");
                    System.out.println("1. Choose Your Numbers");  //letting user choose options
                    System.out.println("2. Quick Pick");
                    System.out.println();
                    flag = true;
                    while(flag)    //looping through users choice
                    {
                        try
                        {
                            System.out.print("Enter choice (1 or 2): ");

                            String chk = in.next();

                            nchoice = Integer.parseInt(chk);

                            if (nchoice == 1 || nchoice == 2)     /*handling exception and validating the choice*/
                            {
                                flag = false;
                            }
                        }
                        catch (NumberFormatException e)
                        {
                            continue;
                        }
                    }

                    if(nchoice==1)     //if user chooses to choose own numbers
                    {


                        System.out.println("\nChoose 5 Different Numbers");
                        System.out.println("\n1  2  3  4  5  6  7  8  9  10");
                        System.out.println("11 12 13 14 15 16 17 18 19 20");
                        System.out.println();

                        int n = 0;

                        String karray[] = new String[6];  //initializing array


                        while(n<5)
                        {                    //exception handling and input validating
                            try
                            {
                                System.out.print("Number "+(n+1)+": ");
                                karray[n] = in.next();

                                //changing array to integer
                                parray[n] = Integer.parseInt(karray[n]);

                                if(parray[n]<=0 || parray[n]>20)
                                {
                                    continue;
                                }

                                boolean duplicate = false;
                                for(int k =0;k<n;k++)
                                {
                                    if (parray[k] == parray[n])
                                    {
                                        System.out.println("\t      Error! No Duplicates!");
                                        duplicate = true;
                                        break;
                                    }
                                }

                                if (!duplicate)
                                {
                                    n++;
                                }



                            }
                            catch(NumberFormatException d)
                            {
                                continue;
                            }


                        }

                        //printing the required numbers

                        System.out.println("\nYour Numbers: "+parray[0]+" "+ parray[1]+" "+parray[2]+" "+parray[3]+" "+parray[4]);
                        System.out.println("\n---------------------------------");

                        System.out.println("\nOptions:");
                        System.out.println("========");
                        System.out.println("1. Choose Numbers");
                        System.out.println("2. Check Winnings");  //welcome text
                        System.out.println("3. Quit");
                        System.out.println();


                    }

                    else if(nchoice == 2)  //if user chooses quick pick
                    {


                        int k = 0;

                        while(k<5)
                        {
                            int qp = generator.nextInt(20)+1;

                            boolean repeat = false;
                            do {

                                for(int i =0; i<parray.length;i++)
                                {
                                    if(qp==parray[i])
                                    {                  //generating random non duplicate numbers
                                        repeat=true;
                                        break;
                                    }

                                    else if(i==k)
                                    {
                                        parray[k]=qp;
                                        k++;
                                        repeat=true;
                                        break;

                                    }
                                }


                            }while(!repeat);




                        }

                        //printing the required non repeated random numbers

                        System.out.println("\nYour Numbers: "+parray[0]+" "+ parray[1]+" "+parray[2]+" "+parray[3]+" "+parray[4]);
                        System.out.println("\n---------------------------------");

                        System.out.println("\nOptions:");
                        System.out.println("========");
                        System.out.println("1. Choose Numbers");
                        System.out.println("2. Check Winnings");  //welcome text
                        System.out.println("3. Quit");
                        System.out.println();
                    }



                }

                else if (choice == 2)   //if choice is to check winnings
                {

                    int k = 0;

                    while(k<5)
                    {
                        int qp = generator.nextInt(20)+1;

                        boolean repeat = false;
                        do {

                            for(int i =0; i<warray.length;i++)
                            {
                                if(qp==warray[i])    //generating the non duplicate winning numbers
                                {
                                    repeat=true;
                                    break;
                                }

                                else if(i==k)
                                {
                                    warray[k]=qp;
                                    k++;
                                    repeat=true;
                                    break;

                                }
                            }


                        }while(!repeat);

                    }

                    //displaying the winning and the player numbers

                    System.out.printf("\nWinning numbers: %2d %2d %2d %2d %2d",warray[0], warray[1],warray[2],warray[3],warray[4]);
                    System.out.printf("\nPlayer Numbers:  %2d %2d %2d %2d %2d",parray[0], parray[1],parray[2],parray[3],parray[4]);



                    for(int t = 0;t<=(parray.length-2);t++)
                    {
                        for(int w = 0;w<=(warray.length-2);w++)
                        {
                            if (parray[t] == warray[w]) {
                                prize += 10;
                                matches += 1;
                            }

                        }
                    }

                    tprize = tprize+prize;   //calculating the total prize

                    //formatting and displaying the prize won

                    System.out.printf("\n\nMatches:%3d",matches);
                    System.out.printf("\nPrize:    $%.2f",prize);
                    System.out.println("\n");
                    System.out.println("---------------------------------");

                    System.out.println("\nOptions:");
                    System.out.println("========");
                    System.out.println("1. Choose Numbers");
                    System.out.println("2. Check Winnings");  //welcome text
                    System.out.println("3. Quit");
                    System.out.println();

                    prize = 0;
                    matches = 0;

                }
            }

            catch (NumberFormatException except)
            {
               continue;      //exception handling for the first choice
            }

        }
        System.out.println("\n---------------------------------");

        System.out.printf("\nTotal Prize: $%.2f",tprize);
        System.out.println("\n\nThanks for playing!");    //formatting and displaying the end text


    }
}
