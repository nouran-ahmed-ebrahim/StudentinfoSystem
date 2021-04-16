package Data;

import models.MasterGraduated;

public class AllMasterGraduated {

    public static MasterGraduated[] mGraduated = new MasterGraduated[5];

    public static int numOfMGraduated = 0;

     public static void displaySpecificUndergraduated(int SSN)
   {
       for(int currentGraduated =0 ;currentGraduated < numOfMGraduated ; currentGraduated++)
       {
           if(mGraduated[currentGraduated].getSSN()==SSN)
           {
              mGraduated[ currentGraduated].displayStudentInfo();
           }
       }
   }
}
