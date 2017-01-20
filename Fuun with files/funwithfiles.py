
#defining main function

def main():

    inFile = open("numbers.txt",'r') #reading a file and asigning variable inFile
                                     #to that file
    smallest = 1000

    largest = 1

    for line in inFile: #looping to determine the largest and smallest value

        n = int(line)

        if smallest > n :

            smallest = n

        if largest < n:

            largest = n

    print ("Smallest: ",smallest,sep="")

    print ("Largest: ",largest,sep="")

    inFile.close() #closing the file inFile



    openFile = open("numbers.txt",'r') #opening the file numbers.txt and assigning it to variable openFile

    print("Sum: ",getSum(openFile),sep="")#calling the getSum function and printing the respective output

    openFile.close() #closing the openFile



    lastFile = open("numbers.txt",'r')#opening the file numbers.txt and assigning it to variable lastFile

    getAverage(lastFile) #calling getAverage

    lastFile.close() #closing the last file
    

    
def getSum(openFile): #defining getSum(openFile) to get the sum of the numbers in the numbers.txt

    sum = 0

    for line in openFile: 

        num = int(line)

        sum+=num
        

    return sum #returning the value to the getSum(openFile)

def getAverage(lastFile): #defining getAverage(lastFile) to get the Average of the numbers in the numbers.txt

    total = 0

    count = 0

    

    for line in lastFile:

        num = int(line)

        total += num

        count += 1

    average = total/count

    print("Average: ",round(average,1) ,sep="") #printing the value after processing the Average
    

main() #calling the main() function



