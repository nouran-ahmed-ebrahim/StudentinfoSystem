

package Util;

import java.sql.Date;
import Data.NoDegreeGraduated;
import models.FreshGraduated;

public class CurrentNDGraduated {

    public static void fillData()
    {
        StudyInfo study = new StudyInfo("Mansoura", "medicine", "surgery", 7);
        
        Date startDate=new Date(112, 8, 25) , Graduationdate = new Date(119, 5, 27) , birthDate = new Date(100, 3, 15);
          
        NoDegreeGraduated.noDegreeGraduates[NoDegreeGraduated.numofNoDegreeGraduates]
              = new FreshGraduated ( 3.7f, Graduationdate, startDate, study, 2016152155, "sama medhat", 
                              "Female", birthDate, "mansoura", "01111111111", "sama@gmail.com", 301040164);
        
        NoDegreeGraduated.numofNoDegreeGraduates++;
        
    }

 }
