// Name: Aaman Bhandari       Date Assigned: 27 April 2017
//
// Course: CSCI 2003 60357    Date Due: 2 May 2017
//
// Instructor: Ms. Greer
//
// File name: CSCIDepartment
//
// Program Description: Create a program that allows teachers to access and/or update course information for the Computer Science Department.

import java.util.Scanner; //importing scanner class

public class CSCIDepartment
{
    public static void main(String[] args) //main class
    {
        //create course object
        Course course1 = new Course("Introduction to Programming","CSCI 2000",60536,35);
        Course course2 = new Course("Intermediate Programming","CSCI 2003",60972,35);

        Scanner in = new Scanner(System.in); //Scanner object

        System.out.println("Course Information Access");
        System.out.println("=========================");
        System.out.println();

        System.out.println("Options");
        System.out.println("=======");
        System.out.println("1. View Available Course Information");
        System.out.println("2. View Students Enrolled in Course");   //opening statements
        System.out.println("3. Add Student to a Course");
        System.out.println("4. View Total Enrollment for Department");
        System.out.println("5. Quit");
        System.out.println();

        boolean flag = true;

        while(flag)
        {
            System.out.print("Enter choice (1 - 5): ");
            int choice = in.nextInt();

            if(choice == 1)     //displaying Available Course Information
            {
                System.out.println("\n----------------------------------------------------");
                System.out.println("\nAvailable Courses");
                System.out.println("=================");
                course1.displayCourseInfo();
                course2.displayCourseInfo();
                System.out.println("\n----------------------------------------------------");

                System.out.println("\nOptions");
                System.out.println("=======");
                System.out.println("1. View Available Course Information");
                System.out.println("2. View Students Enrolled in Course");
                System.out.println("3. Add Student to a Course");
                System.out.println("4. View Total Enrollment for Department");
                System.out.println("5. Quit");
                System.out.println();

            }

            else if (choice == 2)     //displaying the students enrolled
            {
                System.out.println("\n----------------------------------------------------");
                System.out.println("\nCourse Display Options");
                System.out.println("========================");
                System.out.println("1. Introduction to Programming");
                System.out.println("2. Intermediate Programming");

                System.out.print("\nEnter choice (1 or 2): ");
                int choice1 = in.nextInt();
                if(choice1 == 1)
                {
                    course1.displayStudents();
                }

                else if(choice1 == 2)
                {
                    course2.displayStudents();
                }

                System.out.println("\n----------------------------------------------------");

                System.out.println("\nOptions");
                System.out.println("=======");
                System.out.println("1. View Available Course Information");
                System.out.println("2. View Students Enrolled in Course");
                System.out.println("3. Add Student to a Course");
                System.out.println("4. View Total Enrollment for Department");
                System.out.println("5. Quit");
                System.out.println();


            }

            else if(choice == 3)     //Adding student to a course
            {
                System.out.println("\n----------------------------------------------------");
                System.out.println("\nCourse Options");
                System.out.println("==============");
                System.out.println("1. Introduction to Programming");
                System.out.println("2. Intermediate Programming");

                System.out.print("\nEnter choice (1 or 2): ");
                int choice3 = in.nextInt();

                System.out.println("\nAdd a Student");
                System.out.println("=============");

                if(choice3 == 1)
                {
                    System.out.print("\nEnter Student's Name: ");
                    in.nextLine();
                    String sName = in.nextLine();


                    System.out.print("Enter Student's ID: ");
                    int sId = in.nextInt();

                    Student student1 = new Student(sName,sId);

                    course1.addStudent(student1);

                    System.out.println("\n----------------------------------------------------");

                    System.out.println("\nOptions");
                    System.out.println("=======");
                    System.out.println("1. View Available Course Information");
                    System.out.println("2. View Students Enrolled in Course");
                    System.out.println("3. Add Student to a Course");
                    System.out.println("4. View Total Enrollment for Department");
                    System.out.println("5. Quit");
                    System.out.println();


                }

                else if (choice3 == 2)
                {
                    System.out.print("\nEnter Student's Name: ");
                    in.nextLine();
                    String sName = in.nextLine();


                    System.out.print("Enter Student's ID: ");
                    int sId = in.nextInt();

                    Student student1 = new Student(sName,sId);


                    course2.addStudent(student1);

                    System.out.println("\n----------------------------------------------------");

                    System.out.println("\nOptions");
                    System.out.println("=======");
                    System.out.println("1. View Available Course Information");
                    System.out.println("2. View Students Enrolled in Course");
                    System.out.println("3. Add Student to a Course");
                    System.out.println("4. View Total Enrollment for Department");
                    System.out.println("5. Quit");
                    System.out.println();
                }
            }

            else if (choice == 4)
            {
                //displaying the total enrolled students

                System.out.println("\n----------------------------------------------------");
                System.out.println("\nTotal Students Enrolled: "+Course.totalEnroll);
                System.out.println("\n----------------------------------------------------");

                System.out.println("\nOptions");
                System.out.println("=======");
                System.out.println("1. View Available Course Information");
                System.out.println("2. View Students Enrolled in Course");
                System.out.println("3. Add Student to a Course");
                System.out.println("4. View Total Enrollment for Department");
                System.out.println("5. Quit");
                System.out.println();

            }

            else if (choice == 5)    //Quit
            {
                System.out.println("\n----------------------------------------------------");
                flag = false;
                break;
            }

        }

        System.out.println("\nGoodbye!");  //End message

    }
}
