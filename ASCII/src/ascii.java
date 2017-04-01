/**
 * Created by thechemist on 4/1/2017.
 */
import java.util.Scanner;
public class ascii
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("");
        String word= in.nextLine();
        word = word.toLowerCase();
        String tword = "";

        for (int a=0;a<word.length();a++)
        {
            if(word.charAt(a)=='a')
            {
                tword+="@";
            }

            else if(word.charAt(a)=='b')
            {
                tword+="8";
            }

            else if(word.charAt(a)=='c')
            {
                tword+="(";
            }

            else if(word.charAt(a)=='d')
            {
                tword+="|)";
            }

            else if(word.charAt(a)=='e')
            {
                tword+="3";
            }

            else if(word.charAt(a)=='f')
            {
                tword+="#";
            }

            else if(word.charAt(a)=='g')
            {
                tword+="6";
            }

            else if(word.charAt(a)=='h')
            {
                tword+="[-]";
            }

            else if(word.charAt(a)=='i')
            {
                tword+="|";
            }

            else if(word.charAt(a)=='j')
            {
                tword+="_|";
            }

            else if(word.charAt(a)=='k')
            {
                tword+="|<";
            }

            else if(word.charAt(a)=='l')
            {
                tword+="1";
            }

            else if(word.charAt(a)=='m')
            {
                tword+="[]\\/[]";
            }

            else if(word.charAt(a)=='n')
            {
                tword+="[]\\[]";
            }

            else if(word.charAt(a)=='o')
            {
                tword+="0";
            }

            else if(word.charAt(a)=='p')
            {
                tword+="|D";
            }

            else if(word.charAt(a)=='q')
            {
                tword+="(,)";
            }

            else if(word.charAt(a)=='r')
            {
                tword+="|Z";
            }

            else if(word.charAt(a)=='s')
            {
                tword+="$";
            }

            else if(word.charAt(a)=='t')
            {
                tword+="']['";
            }

            else if(word.charAt(a)=='u')
            {
                tword+="|_|";
            }

            else if(word.charAt(a)=='v')
            {
                tword+="\\/";
            }

            else if(word.charAt(a)=='w')
            {
                tword+="\\/\\/";
            }

            else if(word.charAt(a)=='x')
            {
                tword+="}{";
            }

            else if(word.charAt(a)=='y')
            {
                tword+="`/";
            }

            else if(word.charAt(a)=='z')
            {
                tword+="2";
            }

            else if(word.charAt(a)==' ')
            {
                tword+=" ";
            }

            else
            {
                tword+=word.charAt(a);
            }

        }

        System.out.println(tword);

    }
}
