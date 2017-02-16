// Name: Aaman Bhandari    
//
// Course: CSCI 2003     
//

//
// File name: ThemeParkOrder
//
// Program Description: Simulate an order for tickets to a theme park.

//creating a public class named ThemeParkOrder
public class ThemeParkOrder
{
    //instance variables
    private String name;
    private double a_tickets;
    private int no_a_tickets;
    private double c_tickets;
    private int no_c_tickets;

    //no-argument constructor
    public ThemeParkOrder()
    {
        name = "";
        a_tickets = 0;
        no_a_tickets = 0;
        c_tickets = 0;
        no_c_tickets = 0;
    }

    //argument constructor
    public ThemeParkOrder(String nam, double a_tick, int no_a_tick, double c_tick, int no_c_tick)
    {
        name = nam;
        a_tickets = a_tick;
        no_a_tickets = no_a_tick;
        c_tickets = c_tick;
        no_c_tickets = no_c_tick;

    }

    /**
     Sets name variable
     @param nam value to set to name
     */
    public void setName(String nam)
    {
        name = nam;
    }

    /**
     Sets a_ticket variable
     @param a_tick value to set to a_ticket
     */
    public void setA_tickets(double a_tick)
    {
        a_tickets = a_tick;
    }

    /**
     Sets no_a_ticket variable
     @param no_a_tick value to set to no_a_ticket
     */
    public void setNo_a_tickets(int no_a_tick)
    {
        no_a_tickets = no_a_tick;
    }

    /**
     Sets c_tickets variable
     @param c_tick value to set to c_tickets
     */
    public void setC_tickets(double c_tick)
    {
        c_tickets = c_tick;
    }

    /**
     Sets no_c_tickets variable
     @param no_c_tick value to set to no_c_tickets
     */
    public void setNo_c_tickets(int no_c_tick)
    {
        no_c_tickets = no_c_tick ;
    }

    /**
     Gets the current themepark name
     @return the themepark name
     */
    public String getName()
    {
        return name;
    }

    /**
     Gets the price of adult ticket
     @return the price of adult ticket
     */
    public double getA_tickets()
    {
        return a_tickets;
    }

    /**
     Gets the num of adult tickets purchased
     @return the number of adult tickets purchased
     */
    public int getNo_a_tickets()
    {
        return no_a_tickets;
    }

    /**
     Gets the price of child tickets
     @return the price of child tickets
     */
    public double getC_tickets()
    {
        return c_tickets;
    }

    /**
     Gets the num of child tickets purchased
     @return the number of child tickets purchased
     */
    public int getNo_c_tickets()
    {
        return no_c_tickets;
    }

    String x;

    /**
     Gets the amount of discount
     @return the amount of discount
     */
    public String getDiscount()
    {
        //if statements for the required discount
        if ((getNo_a_tickets() + getNo_c_tickets())< 3)
        {
            x = "0%";
        }

        if((getNo_a_tickets() + getNo_c_tickets())==3)
        {
            x = "5%";
        }

        if((getNo_a_tickets() + getNo_c_tickets())==4)
        {
            x = "10%";
        }

        if((getNo_a_tickets() + getNo_c_tickets())==5)
        {
            x = "15%";
        }

        if((getNo_a_tickets() + getNo_c_tickets())>5)
        {
            x = "20%";
        }

        return x;

    }

    double y;
    /**
     Gets the subtotal after applying discount
     @return the subtotal
     */
    public double getSubtotal()
    {
        //if statement for returning the subtotal
        if (getDiscount()=="0%")
        {
            y = (getNo_a_tickets() * getA_tickets())+(getNo_c_tickets() * getC_tickets());
        }

        if (getDiscount()=="5%")
        {
            y = ((getNo_a_tickets() * getA_tickets())+(getNo_c_tickets() * getC_tickets()))
                    - (0.05) * ((getNo_a_tickets() * getA_tickets())+(getNo_c_tickets() * getC_tickets()));
        }

        if (getDiscount()=="10%")
        {
            y = ((getNo_a_tickets() * getA_tickets())+(getNo_c_tickets() * getC_tickets())
                    - (0.1) * ((getNo_a_tickets() * getA_tickets())+(getNo_c_tickets() * getC_tickets())));
        }

        if (getDiscount()=="15%")
        {
            y =  ((getNo_a_tickets() * getA_tickets())+(getNo_c_tickets() * getC_tickets())
                    - (0.15) * ((getNo_a_tickets() * getA_tickets())+(getNo_c_tickets() * getC_tickets())));
        }

        if (getDiscount()=="20%")
        {
            y = ((getNo_a_tickets() * getA_tickets())+(getNo_c_tickets() * getC_tickets()))
                    -(0.2) * ((getNo_a_tickets() * getA_tickets())+(getNo_c_tickets() * getC_tickets()));
        }

        return y;

    }

    //method to display the complete order

    public void completeOrder()
    {
        //printing the required output using printf
        System.out.println("\n"+getName()+" Ticket Order");
        System.out.println("------------------------------------");
        System.out.printf("Discount:%19s",getDiscount());

        System.out.printf("\n\nAdult:%10s x $%8.2f",getNo_a_tickets(),getA_tickets());
        System.out.printf("\nChild:%10s x $%8.2f",getNo_c_tickets(),getC_tickets());

        System.out.println("\n------------------------------------");
        System.out.printf("Subtotal:%10s$%8.2f","",getSubtotal());
        System.out.printf("\nTax:%15s$%8.2f","",(0.11*getSubtotal()));
        System.out.printf("\nTotal:%13s$%8.2f","",getSubtotal()+(0.11*getSubtotal()));
    }

}
