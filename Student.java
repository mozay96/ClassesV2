/**
 * @(#)Student.java
 * @author Mohammed Zayed
 * @version 1.00 2019/05/03 10:15 AM
 */

public class Student
{
  private static int count = 0;
  private String bannerID;
  private String studentName;
  private double gpa;
  
  public Student()
  {
    ++count;  
  }//END Default constructor
  
  public Student(String bannerID, String studentName, double gpa)
  {
    this.bannerID = bannerID;
    this.studentName = studentName;
    this.gpa = gpa;
    ++count;
  }//END Overloaded Constructor
  
  public String toString()
  {
    return String.format("%nBanner ID:  @%s" +"%nStudent Name:  %s" +"%nGPA:  %.2f%n", bannerID, studentName, gpa);
    
  }//END toString()
  
  public static int getCount()
  {
    return count; 
  }//END getCount()
}//END APPLICATION CLASS Student

