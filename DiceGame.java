// Name: Aaman Bhandari           Date Assigned: 16 Mar 2017
//
// Course: CSCI 2003 60357        Date Due: 23 Mar 2017
//
// Instructor: Ms. Greer
//
// File name: DiceGame
//
// Program Description: A dice game called “Run for it!”.



import java.util.Random;    //importing Random class
import java.util.Scanner;   //importing Scanner class

public class DiceGame   //defining class name
{
    public static void main(String[] args) //main class
    {
        //Welcome and rules for the game
        System.out.println("Run For It! - A Dice Game");
        System.out.println("\nRules");
        System.out.println("=====");
        System.out.println("1. 2 players take turns rolling 6 dice.");
        System.out.println("\n2. Get points if roll contains one or more sequences.");
        System.out.println("\n\t1. Sequence must start from 1 and not skip any numbers.");
        System.out.println("\n\t2. Get 5 points for each number in the sequence(s).");
        System.out.println("\n3. Get no points if roll contains no sequences.");
        System.out.println("\n4. First player to get to 100 points wins.");
        System.out.println("\n=======================================");

        Random generator = new Random();     // creating object using random class
        Scanner in = new Scanner(System.in); // creating new object using Scanner class

        int player = 1;
                            //initializing some variables
        int score1=0;
        int score2 = 0;

        while(score1 < 100 && score2< 100)  //condition for the loop to work
        {
            while(player == 1)  //for player 1
            {
                System.out.print("\nPlayer "+player+" - Enter R to roll: ");
                String roll = in.nextLine();  //input from user

                int k = generator.nextInt(6) + 1;
                int l = generator.nextInt(6) + 1;
                int m = generator.nextInt(6) + 1;
                int n = generator.nextInt(6) + 1;  //generating random values
                int o = generator.nextInt(6) + 1;
                int p = generator.nextInt(6) + 1;

                //storing the random value in a string
                String d = k + " " + l + " " + m + " " + n + " " + o + " " + p;


                System.out.println("\nRoll: "+d);

                String r1="";
                String r2="";
                String r3="";  //initializing strings
                String r4="";
                String r5="";
                String r6="";
                int sq = 0;

                //doing the required calculation for the roll of dice
                for(int a=0;a<d.length();a+=1)
                {
                    if (d.charAt(a)=='1')
                    {
                        r1 = d.substring(0, a) + d.substring(a + 1);
                        break;

                    }



                }

                for(int b=0;b<r1.length();b+=1)
                {
                    if (r1.charAt(b)=='2')
                    {
                        r2 = r1.substring(0,b)+r1.substring(b+1);
                        score1+=5;
                        sq=1;
                        break;

                    }


                }

                for(int c=0;c<r2.length();c+=1)
                {
                    if (r2.charAt(c)=='3')
                    {
                        r3 = r2.substring(0,c)+r2.substring(c+1);
                        score1+=5;
                        sq = 2;
                        break;


                    }
                }

                for(int f=0;f<r3.length();f+=1)
                {
                    if (r3.charAt(f)=='4')
                    {
                        r4 = r3.substring(0,f)+r3.substring(f+1);
                        score1+=5;
                        sq = 3;
                        break;

                    }
                }

                for(int g=0;g<r4.length();g+=1)
                {
                    if (r4.charAt(g)=='5')
                    {
                        r5 = r4.substring(0,g)+r4.substring(g+1);
                        score1+=5;
                        sq=4;
                        break;


                    }
                }

                for (int h=0;h<r5.length();h+=1)
                {
                    if (r5.charAt(h)=='6')
                    {
                        r6 = r5.substring(0,h)+r5.substring(h+1);
                        score1+=5;
                        sq=5;
                        break;


                    }
                }

                //checking to display the sequences
                if(sq==0)
                {
                    System.out.println("\nNo Sequence!");
                }

                else if(sq==1)
                {
                    System.out.println("\nSequence 1: 12");
                }

                else if(sq==2)
                {
                    System.out.println("\nSequence 1: 123");
                }

                else if(sq==3)
                {
                    System.out.println("\nSequence 1: 1234");
                }

                else if(sq==4)
                {
                    System.out.println("\nSequence 1: 12345");
                }

                else if(sq==5)
                {
                    System.out.println("\nSequence 1: 123456");
                }


                System.out.println("\nPlayer 1 Score: "+score1);
                System.out.println("Player 2 Score: "+score2);
                System.out.println("\n=======================================");
                player = 2;


            }

            while(player==2) //similar to player 1
            {
                System.out.print("\nPlayer "+player+" - Enter R to roll: ");
                String roll = in.nextLine();
                int k = generator.nextInt(6) + 1;
                int l = generator.nextInt(6) + 1;
                int m = generator.nextInt(6) + 1;
                int n = generator.nextInt(6) + 1;
                int o = generator.nextInt(6) + 1;
                int p = generator.nextInt(6) + 1;

                String d = k + " " + l + " " + m + " " + n + " " + o + " " + p;
                player = 1;

                System.out.println("\nRoll: "+d);

                String r1="";
                String r2="";
                String r3="";
                String r4="";
                String r5="";
                String r6="";

                int sq = 0;


                for(int a=0;a<d.length();a+=1)
                {
                    if (d.charAt(a)=='1')
                    {
                        r1 = d.substring(0, a) + d.substring(a + 1);
                        break;

                    }


                }

                for(int b=0;b<r1.length();b+=1)
                {
                    if (r1.charAt(b)=='2')
                    {
                        r2 = r1.substring(0,b)+r1.substring(b+1);
                        score2+=5;
                        sq=1;
                        break;


                    }
                }

                for(int c=0;c<r2.length();c+=1)
                {
                    if (r2.charAt(c)=='3')
                    {
                        r3 = r2.substring(0,c)+r2.substring(c+1);
                        score2+=5;
                        sq=2;
                        break;

                    }
                }

                for(int f=0;f<r3.length();f+=1)
                {
                    if (r3.charAt(f)=='4')
                    {
                        r4 = r3.substring(0,f)+r3.substring(f+1);
                        score2+=5;
                        sq=3;
                        break;

                    }
                }

                for(int g=0;g<r4.length();g+=1)
                {
                    if (r4.charAt(g)=='5')
                    {
                        r5 = r4.substring(0,g)+r4.substring(g+1);
                        score2+=5;
                        sq=4;
                        break;

                    }
                }

                for (int h=0;h<r5.length();h+=1)
                {
                    if (r5.charAt(h)=='6')
                    {
                        r6 = r5.substring(0,h)+r5.substring(h+1);
                        score2+=5;
                        sq=5;
                        break;

                    }
                }

                if(sq==0)
                {
                    System.out.println("\nNo Sequence!");
                }

                else if(sq==1)
                {
                    System.out.println("\nSequence 1: 12");
                }

                else if(sq==2)
                {
                    System.out.println("\nSequence 1: 123");
                }

                else if(sq==3)
                {
                    System.out.println("\nSequence 1: 1234");
                }

                else if(sq==4)
                {
                    System.out.println("\nSequence 1: 12345");
                }

                else if(sq==5)
                {
                    System.out.println("\nSequence 1: 123456");
                }


                System.out.println("\nPlayer 1 Score: "+score1);
                System.out.println("Player 2 Score: "+score2);
                System.out.println("\n=======================================");
                player = 1;
            }



        }

        if (score1>score2) //displaying who won the game
        {
            System.out.println("\t\n       Player 1 Wins!");
            System.out.println("\n=======================================");
        }

        else if(score1<score2)
        {
            System.out.println("\t\n       Player 2 Wins!");
            System.out.println("\n=======================================");
        }


    }
}
