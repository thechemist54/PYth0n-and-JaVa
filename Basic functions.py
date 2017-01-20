#Give user options
def main():
 print("Math Options")
 print("------------")
 print("1. Add")
 print("2. Subtract")
 print("3. Multiply")
 print("4. Divide")

 option=int(input("\nEnter an option: "))
 while option<1 or option>4:
     option=int(input("\nEnter an option(1-4): "))
 integer1=eval(input("\nEnter an integer: "))
 integer2=eval(input("Enter an integer: "))
 if option==1:
     print("\nThe result of the calculation is ","{0:.2f}".format(add(integer1,integer2)),".",sep="")

 if option==2:
     print("\nThe result of the calculation is ","{0:.2f}".format(subtract(integer1,integer2)),".",sep="")

 if option==3:
     print("\nThe result of the calculation is ","{0:.2f}".format(multiply(integer1,integer2)),".",sep="")

 if option==4:
     if integer2==0:
          integer2=int(input("Enter a nonzero integer: "))
     print("\nThe result of the calculation is ","{0:.2f}".format(divide(integer1,integer2)),".",sep="")
 

def add(integer1,integer2):
    add1 = integer1 + integer2
    return add1

def subtract(integer1,integer2):
    subtract1 = integer1 - integer2
    return subtract1

def multiply(integer1,integer2):
    multiply1 = integer1 * integer2
    return multiply1

def divide(integer1,integer2):
    divide1 = integer1 / integer2
    return divide1

main()
