

#printing the options

print("Options:")

print("-"*8)

print("1. Area of Rectangle")

print("2. Area of Triangle")

print("3. Area of Circle")

print("4. Quit")

#assigning a value to flag

flag = False

#analyzing responses and displaying the respective information
#looping statement

while flag == False:
    #asking to make a choice from the option

    choice = int(input("\nMake a selection from the option menu: ")) 

    if choice == 1:
        #asking for height and width
        
        height = float(input ("\nEnter height: "))

        width = float(input ("Enter width: "))

        area_rectangle = (height * width) #calculating area 

        print ("Area of rectangle is","{0:,.2f}".format(area_rectangle))

    elif choice == 2:
        #asking for the base and height

        base = float(input("\nEnter base: "))

        height_triangle = float(input ("Enter height of triangle: "))

        area_triangle = ((1/2) * base * height_triangle) #calculating area

        print ("Area of triangle is","{0:,.2f}".format(area_triangle))

    elif choice == 3:
        #asking for the radius of a circle

        radius = float(input("\nEnter the radius of a circle: "))

        area_circle = (3.141592)*(radius**2)#calculating area of circle

        print ("Area of circle is","{0:,.2f}".format(area_circle))

    elif choice == 4:

        #assigning flag as true

        flag = True

    else:

        #displaying the error message

        print("\nYou did not enter a proper number.")

        

        
        

        

         

        

    
