// Name: Aaman Bhandari       Date Assigned: 27 April 2017
//
// Course: CSCI 2003 60357    Date Due: 2 May 2017
//
// Instructor: Ms. Greer
//
// File name: Student
//
// Program Description: Create a program that allows teachers to access and/or update course information for the Computer Science Department.

public class Student
{
    private String name;   //declaring instance variable
    private int id;

    /**
     Initializes the values of the instance variables to default values.
     */
    public Student()      //non-argument constructor
    {
        name = "";
        id = 0;
    }

    /**
     Initializes the values of the instance variables to user's chosen values.
     @param studentName value to initialize to name
     @param studentId value to initialize to id
     */
    public Student(String studentName, int studentId)   //argument constructor
    {
        name = studentName;
        id = studentId;
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
    Sets id variable
    @param Id value to set to id
   */
    public void setId(int Id)
    {
        id = Id;
    }

    /**
     Gets the current student name
     @return the student name
     */
    public String getName()
    {
        return name;
    }

    /**
     Gets the current student id
     @return the student id
     */
    public int getId()
    {
        return id;
    }


}
