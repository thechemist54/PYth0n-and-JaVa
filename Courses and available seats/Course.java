// Name: Aaman Bhandari       Date Assigned: 27 April 2017
//
// Course: CSCI 2003 60357    Date Due: 2 May 2017
//
// Instructor: Ms. Greer
//
// File name: Course
//
// Program Description: Create a program that allows teachers to access and/or update course information for the Computer Science Department.

public class Course
{
    //declare instance variables
    private String courseName;
    private String courseCode;
    private int sectionNum;
    private int seats;
    private int size;
    private Student[] studentObject;
    public static int totalEnroll = 0;

    /**
     Initializes the values of the instance variables to default values.
     */
    public Course()
    {
        courseName = "";
        courseCode = "";
        sectionNum = 0;
        seats = 0;
        studentObject = new Student[35];

    }

    /**
     Initializes the values of the instance variables to user's chosen values.
     @param name value to initialize to courseName
     @param cCode value to initialize to courseNum
     @param snum value to initialize to sectionNum
     @param seat value to initialize to seats

     */
    public Course(String name, String cCode, int snum, int seat)
    {
        courseName = name;
        courseCode = cCode;
        sectionNum = snum;
        seats = seat;
        studentObject = new Student[35];

    }

    /**
     Sets courseName variable
     @param cn value to set to courseName
     */
    public void setCourseName(String cn)
    {
        courseName = cn;
    }

    /**
     Sets courseCode variable
     @param cn value to set to courseCode
     */
    public void setCourseCode(String cn)
    {
        courseCode = cn;
    }

    /**
     Sets sectionNum variable
     @param sn value to set to sectionNum
     */
    public void setSectionNum(int sn)
    {
        sectionNum = sn;
    }

    /**
     Sets seats variable
     @param s value to set to seats
     */
    public void setSeats(int s)
    {
        seats = s;
    }

    /**
     Sets studentObject variable
     @param sObject value to set to seats
     */
    public void setSObject(Student[] sObject)
    {
        studentObject = sObject;
    }

    /**
     Gets the current course name
     @return the course name
     */
    public String getCourseName()
    {
        return courseName;
    }

    /**
     Gets the current course code
     @return the course code
     */
    public String getCourseCode()
    {
        return courseCode;
    }

    /**
     Gets the current section num
     @return the section num
     */
    public int getSectionNum()
    {
        return sectionNum;
    }

    /**
     Gets the current number of available seats
     @return the number of available seats
     */
    public int getSeats()
    {
        return seats;
    }

    /**
     Gets the students in a course
     @return the students in a course
     */
    public Student[] getSObject()
    {
        return studentObject;
    }

    /**
     Adds a student to the course, decrements available seats
     @param stobject to set Student name and student Id
     */

    public void addStudent(Student stobject)
    {
        if(seats == 0)
        {
            System.out.println("Class Full!");
        }
        else
        {
            studentObject[size]=stobject;
            seats -= 1;
            totalEnroll += 1;
            size++;

        }
    }

    // displays all the course information

    public void displayCourseInfo()
    {

        System.out.println();
        System.out.print("Name:    "+courseName);
        System.out.printf("\nCourse:%11s",courseCode);
        System.out.printf("\nSection:%6d",sectionNum);
        System.out.printf("\nSeats:%5d",seats);
        System.out.println();
    }

    // Displays all the students in a specific course

    public void displayStudents()
    {
        System.out.println();
        System.out.println(courseCode+" - "+sectionNum+": "+courseName );

        if(seats==35)
        {
            System.out.println("\nNo students enrolled!");
        }

        else
        {


            System.out.println("\nID             Name"+
                               "\n--             ----");



            for(int k=0;k<size;k++)
            {
                System.out.printf("%-15d%-19s",studentObject[k].getId(),studentObject[k].getName());
                System.out.println();

            }




        }
    }



}
