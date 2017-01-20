

#Requesting the number of bagels

bagels = int(input("Enter number of bagels: "))


#analyzing responses and displaying the cost of bagels

if bagels < 6:

    price_bagels = bagels * 0.75

    print ("Cost is $" , "{0:.2f}".format(price_bagels) ,"." , sep="")

else:

    price_bagels = bagels * 0.6

    print ("Cost is $" , "{0:.2f}".format(price_bagels) , "." , sep="")

    


           

