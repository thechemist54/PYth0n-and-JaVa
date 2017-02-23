// Name: Aaman Bhandari        Date Assigned: 21 Feb 2017
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

    private String size;          //instance variables
    private String coatLength;

    public Dog()  //non argument constructors
    {

        size = "";
        coatLength = "";

    }

    public Dog(String s, String c) //argument constructors
    {

        size = s;
        coatLength = c;

    }


    /**
     Sets size of dog
     @param s value to set to size
     */
    public void setSize(String s)
    {

        size = s;

    }


    /**
     Sets coat length of dog
     @param c value to set to CoatLen
     */
    public void setCoatLen(String c)
    {

        coatLength = c;

    }

    /**
     Gets the size of dog
     @return the size of dog
     */
    public String getSize()
    {

        return size;

    }

    /**
     Gets the coat length of dog
     @return the Coat Length of dog
     */
    public String getCoatLen()
    {

        return coatLength;

    }

    String breed; //initializing breed variable


    /**
     Gets the breed of dog
     @return the breed of dog
     */
    public String getBreed()
    {

        //return the required input based on users choice using the if /elseif conditions

        if (getSize().equals( "Small"))
        {

            if (getCoatLen().equals ("Short"))
            {

                breed = "Pug";

            }

            else if (getCoatLen().equals("Medium"))
            {

                breed = "Shiba Inu";

            }

            else if (getCoatLen().equals("Long"))
            {

                breed = "Cocker Spaniel";

            }

        }

        else if (getSize().equals( "Medium"))
        {

            if (getCoatLen().equals ("Short"))
            {

                breed = "Baset Hound";

            }

            else if (getCoatLen().equals("Medium"))
            {

                breed = "Gordon Setter";

            }

            else if (getCoatLen().equals("Long"))
            {

                breed = "Irish Setter";

            }

        }

        else if (getSize().equals( "Large"))
        {

            if (getCoatLen().equals ("Short"))
            {

                breed = "Weimaraner";

            }

            else if (getCoatLen().equals("Medium"))
            {

                breed = "Goldendoodle";

            }

            else if (getCoatLen().equals("Long"))
            {

                breed = "Belgian Sheepdog";

            }

        }

        return breed;


    }


}