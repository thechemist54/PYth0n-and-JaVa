

file = open ("PhoneBook.txt" , "r")


for phone in file : #step through each number in file

    phone = phone.rstrip() #removing all the white spaces

    k = phone.find("-") #finding the first "-" in the phone number

    first = phone [ : k ] #slicing the number until the dash to remove it

    rest_number = phone [ k+1 : ] 

    m = rest_number.find("-")

    second = rest_number [ : m]    #slicing the number until
                                   #dashes are removed
    last =  rest_number [ m+1 : ]

    for n in phone: #step through each line in phone 

        phone = first + second + last

    #printing the required output    

    print("Number without dashes is ", phone , "." , sep="")

file.close() #closing the file
    
    

    

    
