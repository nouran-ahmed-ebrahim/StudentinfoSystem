
package Util;

import Data.AllDoctoralGrduated;
import java.sql.Date;
import models.DoctoralGraduated;

public class CurentDGraduated {

  public static void fillData() 
  {
        StudyInfo  study = new StudyInfo("cairo", "Engineering", "coputer science", 5);
      
       Date startDate=new Date(98, 8, 25) , Graduationdate = new Date(103, 5, 25) , birthDate = new Date(80, 9, 18);
      
      AllDoctoralGrduated.DGaduated[AllDoctoralGrduated.numOfDGraduated] 
             = new DoctoralGraduated( "Ciber Security ", "AinShams", "Datacollecting", "Cairo", 3.5f,
                      Graduationdate, startDate, study, 1992120122, "ahmed mohamed", "male", birthDate, "Alex", "01010101010", "Ahmed@gmail.com", 2089145114);
      
      AllDoctoralGrduated.numOfDGraduated++;
    }

   
}
