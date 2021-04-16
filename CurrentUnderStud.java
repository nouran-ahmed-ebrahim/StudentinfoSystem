package Util;

import Data.UndergraduatedStudent;
import java.sql.Date;
import models.Undergraduated;



public class CurrentUnderStud {

    public static void fillData() {
        
        Date startDate=new Date(119, 8, 25) , Graduationdate = new Date(123, 5, 25) , birthDate = new Date(101, 4, 8);
         
        StudyInfo study = new StudyInfo("AinShams", "Coputer and information sience", "Bioinformatics", 4);
        
        UndergraduatedStudent.underStudents[UndergraduatedStudent.numOfUnderStud] 
                = new Undergraduated (1,3.3F ,Graduationdate , startDate, study, 2019120124, "NouranAhmed",
                                      "Female", birthDate, "Cairo", "01094925141", "nourana245@gmail.com", 301050801);
        
        UndergraduatedStudent.numOfUnderStud++;
    }

}
