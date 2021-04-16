

package Data;

import models.FreshGraduated;


public class NoDegreeGraduated {

   public static FreshGraduated [] noDegreeGraduates = new FreshGraduated[5];

   public static int numofNoDegreeGraduates=0;

    
   public static void displayNDGraduated(int SSN)
   {
       for(int currentGraduated = 0; currentGraduated < numofNoDegreeGraduates ; currentGraduated++ )
       {
           if( noDegreeGraduates [currentGraduated].getSSN()==SSN)
           {
               noDegreeGraduates [currentGraduated].displayStudentInfo();
           }
       }
   }
}
