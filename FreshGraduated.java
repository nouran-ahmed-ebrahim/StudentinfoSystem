
package models;

import Util.StudyInfo;
import java.sql.Date;


public class FreshGraduated extends Graduated{

    public FreshGraduated(float GPA, Date graduationDate, Date startDate, StudyInfo study, int id, String name, String gender, Date birthDate, String address, String number, String email, int SSN) {
        super(GPA, graduationDate, startDate, study, id, name, gender, birthDate, address, number, email, SSN);
    }

    @Override
    public void displayStudentInfo() {
          displayPersonInfo();
        study.DisplayStudyInfo();
        
        System.out.println("Study state is graduated");
        displayStanderdInfo();
        
        System.out.println(" Graduated date "+graduationDate);
        System.out.println("");
    }
    
    
}
