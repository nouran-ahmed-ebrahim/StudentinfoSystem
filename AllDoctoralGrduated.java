package Data;

import models.DoctoralGraduated;

public class AllDoctoralGrduated {

    public static DoctoralGraduated [] DGaduated = new DoctoralGraduated[5];

    public static int numOfDGraduated = 0;

     public static void displaySpecificUndergraduated(int SSN)
   {
       for(int currentGraduated = 0; currentGraduated < numOfDGraduated ; currentGraduated++ )
       {
           if( DGaduated [currentGraduated].getSSN()==SSN)
           {
               DGaduated[currentGraduated].displayStudentInfo();
           }
       }
   }
}
