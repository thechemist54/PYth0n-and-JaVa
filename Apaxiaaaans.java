/**
 * Created by thechemist on 4/1/2017.
 */
import java.util.Scanner;


public class Apaxiaaaans
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("");
        String word = in.next();
        char previous = ' ';
        String tword = "";
        for(int a=0;a<word.length();a++)
        {

            if (word.charAt(a)!=previous)
            {
                tword+=word.charAt(a);
            }

            else
            {
                continue;
            }
            previous=word.charAt(a);
        }

        System.out.println(tword);


    }

}
