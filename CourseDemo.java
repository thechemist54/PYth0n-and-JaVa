public class CourseDemo
{
   public static void main (String[] args)
   {
      Courses course1 = new Courses("Computer",2004,45,20,4);
      
      Courses course2 = new Courses();
      
      course1.addStudent();
      course1.addStudent();
      course1.addStudent();
      course1.addStudent();
      course1.addStudent();
      course1.addStudent();
      course1.addStudent();
      course1.addStudent();
      course1.addStudent();
      course1.addStudent();
      course2.addStudent();
      course2.addStudent();
      course2.addStudent();
      course2.addStudent();
      course2.addStudent();
      course2.addStudent();
      course2.addStudent();
      course2.addStudent();
      course2.addStudent();
      course2.addStudent();

      
      
     System.out.println("The course for the 1st class is " + course1.getCourse()+
                        ". The course number is " + course1.getCourseNum()+
                        ". The section is " + course1.getSecNum()+
                         " \nSeats available: " + course1.getSeats()+
                         "\nNumber of students: " + course1.getStudentsNum());
                         
     System.out.println("\nThe course for the 2nd class is " + course2.getCourse()+
                        ". The course number is " + course2.getCourseNum()+
                        ". The section is " + course2.getSecNum()+
                         " \nSeats available: " + course2.getSeats()+
                         "\nNumber of students: " + course2.getStudentsNum());                    
      
   }
}
