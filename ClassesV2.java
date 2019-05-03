/**
 * @(#)ClassesV2.java
 * @author Mohammed Zayed
 * @version 1.00 2019/05/03 10:12 AM 
 * 
 */
public class ClassesV2
{
    public static void main(String[] args)
    {
        //INSTANTIATE STUDENT1 OBJECT
        Student student1 = new Student("12345678","Billy Holiday", 3.78);
        
        //INSTANTIATE STUDENT2 OBJECT
        Student student2 = new Student("2345789","Norman Biddles", 3.75);
        
        //PRINT FINAL OUTPUT HEADER
        System.out.printf("%n%nSTUDENT INFO%n");
        
        //FORLOOP TO PRINT EACH OBJECTS CONTENTS
        
        for(int i = 1; i <= student1.getCount(); i++)
        {
            System.out.printf("%s", i == 1 ? student1.toString(): student2);
        }//END for i through student1.getCount()
       System.exit(0); 
    }//END MAIN
}//END APPLICATION CLASSESV2

