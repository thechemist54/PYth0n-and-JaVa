import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
         
        //Write your code here
        double[] d = new double[n+2];
        
        for (int i = 0;i<n;i++)
        {   
            try
            {   
                d[i] = Double.parseDouble(s[i]);
            }
        
            catch(NumberFormatException e)
            {
            
            }
        }    
       
            for(int i = 0;i<n;i++)
            {
                   
                for (int j = i;j<n;j++)
                {
                   
                    if (d[i]<d[j])
                    {
                        double max1 = d[j];
                        d[j] = d[i];
                        d[i] = max1;
                        
                        String max = s[j];
                        s[j] = s[i];
                        s[i] = max;
                    }
                    
                }
            }
            
              //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
        