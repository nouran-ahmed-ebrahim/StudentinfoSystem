package Data;

import models.Undergraduated;

public class UndergraduatedStudent {

    public static Undergraduated[] underStudents = new Undergraduated[5];

    public static int numOfUnderStud = 0;

    
    
   public static void displaySpecificUndergraduated(int SSN)
   {
       for(int currentGraduated = 0 ; currentGraduated < numOfUnderStud ;currentGraduated++ )
       {
           if( underStudents [currentGraduated].getSSN()==SSN)
           {
               underStudents [currentGraduated].displayStudentInfo();
           }
       }
   }
}
