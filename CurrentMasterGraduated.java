package Util;

import java.sql.Date;
import Data.AllMasterGraduated;
import models.MasterGraduated;
        

public class CurrentMasterGraduated {

   
    public static void fillData()
    {
        StudyInfo study = new StudyInfo("Helwan", "fine art", "interior decoration", 4);
        
        Date startDate=new Date(95, 9, 1) , Graduationdate = new Date(99, 6, 25) , birthDate = new Date(82, 1, 1);
      
        
       AllMasterGraduated.mGraduated[AllMasterGraduated.numOfMGraduated]
               = new MasterGraduated( "plastic Art", "Helwan", 4, Graduationdate, startDate,
                       study, 1989212304, "malek ahmed", "male", birthDate, "Giza", "01515142632", "Malek2@gmail.com", 2086298345);
            
       AllMasterGraduated.numOfMGraduated++;
    }

}
