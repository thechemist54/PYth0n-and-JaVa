

#asking the user for the number of rows in pattern 1

rows = int(input("Pattern 1 How many rows (3-20)? "))

for i in range(1,rows+1): #looping through the rows

        for j in range(1, rows+1): #looping through the columns 

               print("*",end="")
                                  #displaying the output
        print()

#asking user for number of rows in pattern 2

rows = int(input("Pattern 2 How many rows (3-20)? "))

for g in range (1,rows+1): #looping through the rows
    
        for d in range (rows-g): #looping through the columns for the spaces

               print (" ", end = "")

        for f in range (g): #looping through the columns for the "*"

               print ("*", end = "")
                                      #displaying the output
        print()

#asking the user number of rows in pattern 3

rows = int(input("Pattern 3 How many rows (3-20)? "))

for y in range(rows,0,-1): #looping through the rows

        for z in range(y,0,-1): #looping through the columns

               print("*",end="")
                                 #displaying the output
        print()        

#asking the user number of rows in pattern 4

rows = int(input("Pattern 4 How many rows (3-20)? "))

for a in range(1,rows+1): #looping through the rows

        for b in range(1, 3): #looping through the columns

               print("*".ljust(a),end="")
                                        #displaying the output
        print()        
        
    
  
