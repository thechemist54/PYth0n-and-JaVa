// Name: Your Name             Date Assigned: 21 Feb 2017
//
// Course: CSCI 2003 60357     Date Due: 24 Feb 2017
//
// Instructor: Ms. Greer
//
// File name: Dog
//
// Program Description: This class will simulate a dog.

//creating dog class
public class Dog
{

   private String size;
   private String coatLength;
   
   public Dog()
   {
   
      size = "";
      coatLength = "";
      
   }
   
   public Dog(String s, String c)
   {
   
      size = s;
      coatLength = c;
      
   }
   
   public void setSize(String s)
   {
   
      size = s;
      
   }
   
   public void setCoatLen(String c)
   {
   
      coatLength = c;
      
   }
   
   public String getSize()
   {
   
      return size;
      
   }

   public String getCoatLen()
   {
   
      return coatLength;
      
   }
   
   public String getBreed()
   {
   
      String breed;
      
      if (getSize() == "Small")
      {
      
         if (getCoatLen() == "Short")
         {
         
            breed = "Pug";   
         
         }
         
         if (getCoatLen() == "Medium")
         {
         
            breed = "Shiba Inu";   
         
         }
         
         if (getCoatLen() == "Long")
         {
         
            breed = "Cocker Spaniel";   
         
         }


      
      }
   
   }

   
}