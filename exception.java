import java.util.Scanner;
import java.util.InputMismatchException;
public class exception
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String num = "";
      double sum = 0;
      int count = 0;
      double rnum = 0;
      int negative = 0;
      
      while(!num.equals("-1"))
      {
         try
         {
            System.out.print("Enter a positive floating point number: ");
            num = in.nextLine();
            
            rnum = Double.parseDouble(num);
            if(rnum<0)
            {
               count+=1;
               if(rnum==-1);
               {
                  break;
               }

               
               if(count<2)
               {
                  sum+=rnum;
                  continue;
                  

               }
               if(count>2)
               {
                  break;
               }
            }
            sum+=rnum;
                                   
           
            
            
            
         }
         catch(NumberFormatException except)
         {
            count+=1;
            if(count<2)
            {
               continue;
            }
            else if(count>2);
            {
               break;
            }
         }
      }
      System.out.println("Sum: "+sum);
   }
}