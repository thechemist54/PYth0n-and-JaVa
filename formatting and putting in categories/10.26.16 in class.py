def main():

    n = input("Which file do you want to open (students or students1)? ")

    if n=="students":

          infile=open("students.txt",'r')

    elif n=="students1":      

          infile=open("students1.txt",'r')

    else:

          print("Input not valid (enter students or students1)")

    readFile(infile)

    

    infile.close()


def readFile(infile):

     print("\nName".ljust(23),"Classification".ljust(21),"ID".ljust(8))

     print("="*53)

     for line in infile:

         
         formatInfo(line)
     
def formatInfo(line):
##        d= line.rstrip()
##
##         m=line.rfind(" ")
##
##         classification = line[m: ]
##
##         n=line.find(" ")
##
##         ID=line[:n]
##
##         name = line[n+1:m]

        
         d= line.rstrip()

         m=d.rfind(" ")

         classification = d[m: ]

         n=d.find(" ")

         ID=d[:n]

         name = d[n+1:m]

         #line = name.ljust(22) + classification.ljust(21) + ID.ljust(8)

             

         print(name.ljust(21),classification.ljust(22),ID.ljust(8))


    
main()


    
