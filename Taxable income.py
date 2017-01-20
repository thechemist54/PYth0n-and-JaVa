

#Asking the user for taxable income

income = eval(input("Enter your taxable income (-1 to quit): "))

#introducing while loops and analyzing data until income is -1

while income != -1 :

    #introducing if statements to determine the amount of taxes

    if income <= 20000 :

        tax = 0.02 * income

    elif income <= 50000 :

        tax = 400 + 0.025 * (income - 20000)

    else:

        tax = 1150 + 0.035 * (income - 50000)

    #displaying the amount of tax the user pays

    print ("Your tax is $", "{0:,.0f}".format(tax) ,".", sep="")

    #Again ask the user for the taxable income

    income = eval(input("\nEnter your taxable income (-1 to quit): "))

