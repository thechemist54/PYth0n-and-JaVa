
#defining the main function
def main():

    print ("Options:")

    print ("Pattern 1")

    print ("Pattern 2")  ##printing the outputs

    print ("Pattern 3")

    print ("Pattern 4")

    

    

    flag = False

    while flag == False: #looping to validate the input given by user

       choice = getChoice() #calling function getChoice

      

       if choice.isdigit():

           if int(choice)>=1 and int(choice)<=4:

                rows=getRows(choice)

           if int(choice)> 5  :

                print("Input must be within choice") #anazyling the data input by user

                 
        
           if int(choice)== 5:

                flag ==True

                break
             
       elif choice.isalpha():

          print("Input must be a number")

           

       elif int(choice) < 1:

          print("Input must be within choice")

           
           
              

def getChoice(): #defining function getChoice() and letting the user input the value inside the function

    g = (input("\nEnter 1, 2, 3, or 4 to choose a pattern to display. Enter 5 to exit. "))

    

    return g

def getRows(choice): #defining function getRows(choice) to find the where choice is the pattern number  
                     #the function is also used to ask rows  
    if int(choice) == 1: #calling getChoice using the variable choice

        rows = int(input("\nPattern 1 How many rows (3-20) "))

        while rows < 3 or rows >20: #validating the input

            print ("Values must be between 3 and 20")

            rows = int(input("\nPattern 1 How many rows (3-20) "))

        Pattern1(rows) #calling the funtion Pattern1(rows)  


     #doing likewise in the lines below as in above lines 

    if int(choice) == 2:

        rows = int(input("\nPattern 2 How many rows (3-20) "))

        while rows < 3 or rows >20:

            print ("Values must be between 3 and 20")

            rows = int(input("\nPattern 2 How many rows (3-20) "))

        Pattern2(rows)

    if int(choice) == 3:

        rows = int(input("\nPattern 3 How many rows (3-20) "))

        while rows < 3 or rows >20:

            print ("Values must be between 3 and 20")

            rows = int(input("\nPattern 3 How many rows (3-20) "))

        Pattern3(rows)

    if int(choice) == 4:

        rows = int(input("\nPattern 4 How many rows (3-20) "))

        while rows < 3 or rows >20:

            print ("Values must be between 3 and 20")

            rows = int(input("\nPattern 1 How many rows (3-20) "))

        Pattern4(rows)

    




    


            
def Pattern1(rows): #defining Pattern1(rows)

 

    for i in range(1,rows+1): #looping through the rows

           for j in range(1, rows+1): #looping through the columns 

               print("*",end="")
                                  #displaying the output
           print()


def Pattern2(rows): #defining Pattern2(rows)

    


    for g in range (1,rows+1): #looping through the rows
    
        for d in range (rows-g): #looping through the columns for the spaces

               print (" ", end = "")

        for f in range (g): #looping through the columns for the "*"

               print ("*", end = "")
                                      #displaying the output
        print()


def Pattern3(rows): #defininig Pattern3(rows)

    

    for y in range(rows,0,-1): #looping through the rows

        for z in range(y,0,-1): #looping through the columns

               print("*",end="")
                                 #displaying the output
        print()        


def Pattern4(rows): #defining Pattern4(rows)

    

    for a in range(1,rows+1): #looping through the rows

        for b in range(1, 3): #looping through the columns

               print("*".ljust(a),end="")
                                        #displaying the output
        print()

main() #calling the main() function

        
    
  
