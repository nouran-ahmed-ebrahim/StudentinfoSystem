
package models;

import Util.StudyInfo;
import java.sql.Date;

public class MasterGraduated extends Graduated {

   protected final String Masterfield;

   protected final String collageName;

    public MasterGraduated  (
                              String Masterfield, String collageName, float GPA, Date graduationDate,
                              Date startDate, StudyInfo study, int id, String name, String gender, 
                              Date birthDate, String address, String number, String email, int SSN
                            )
    {
        super(GPA, graduationDate, startDate, study, id, name, gender, birthDate, address, number, email, SSN);
        this.Masterfield = Masterfield;
        this.collageName = collageName;
    }

   @Override
   public void displayStudentInfo() {
        
        displayPersonInfo();
        study.DisplayStudyInfo();
        
        System.out.println("Study state is Master graduated");
        displayStanderdInfo();
        System.out.println("Graduated date "+graduationDate);
        System.out.println("");
        displayMasterInfo();
    }
   
   public void displayMasterInfo()
   {
        System.out.println("Master info : ");
        System.out.println("");
        System.out.println("Master Field is "+Masterfield);
        System.out.println("Master was taken in "+collageName+" University");
        System.out.println("");
   }
}
