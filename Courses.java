public class Courses
{
   private String course;
   private int courseNum;
   private int secNum;
   private int seats;
   private int studentsNum;
   
   public Courses()
   {
      course = "Maths";
      courseNum = 0;
      secNum = 0;
      seats = 0;
      studentsNum = 0;
   }
   
   public Courses(String C,int CN,int SN,int S,int STN)
   {
      course = C;
      courseNum = CN;
      secNum = SN;
      seats = S;
      studentsNum = STN;
   }
   
   public void setCourse(String C)
   {
      course = C;
   }
   
   public void setCourseNum(int CN)
   {
      courseNum = CN;
   } 
   
   public void setSecNum(int SN)
   {
     secNum = SN;
   } 
   
   public void setSeats(int S)
   {
     seats = S;
   } 
   
   public void setStudentsNum(int STN)
   {
     studentsNum = STN;
   } 
   
   
   public String getCourse()
   {
      return course;
   }
    
   public int getCourseNum()
   {
      return courseNum;
   }
   
   public int getSecNum()
   {
      return secNum;
   }
   
   public int getSeats()
   {
      return seats;
   }
   
   public int getStudentsNum()
   {
      return studentsNum;
   }
   
   public void addStudent()
   {
     studentsNum = studentsNum+1;
     seats=seats-1;
   }
   
   public void removeStudent()
   {
       studentsNum = studentsNum-1;
       
   }
}
