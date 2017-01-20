
/**
 * The Circle class stores and manipulates
 * data for a circle.
 */

public class Circle

{
   private double radius;

 /**
  * The setRadius method accepts an argument
  * which is stored in the radius field.
  */
  
   public void setRadius(double r)
  
   {
      
      radius = r;
   
   }

    
 /**
  * The getRadius method returns the value
  * stored in the radius field.
  */
   
   public double getRadius()
   
   {
      
      return radius;
   
   }

 /**
  * The getArea method returns the value
  * stored in the radius to the power 2 field times PI.
  */
   
   public double getArea()
   
   {
      
      return (Math.PI * Math.pow(radius,2));
      
   }   
     
 /**
  * The getCircumference method returns the value of the
  * 2 times PI times radius.
  */
   
   public double getCircumference()
  
  {
       
       return (2*Math.PI*radius);
       
  }     

}
