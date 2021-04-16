package models;

import Util.StudyInfo;
import java.sql.Date;

public class Undergraduated extends Student {

    protected final int numOfCompletedSemester;

    protected final float remainingYears;

    public Undergraduated (
                             int numOfCompletedSemester, float GPA, Date graduationDate, Date startDate,
                             StudyInfo study, int id, String name, String gender, Date birthDate, 
                             String address, String number, String email, int SSN
                          )
    {
        super(GPA, graduationDate, startDate, study, id, name, gender, birthDate, address, number, email, SSN);
        this.numOfCompletedSemester = numOfCompletedSemester;
        remainingYears = ( this.study.getDuration()*2)- numOfCompletedSemester;
    }

    @Override     //how it useful
    public void displayStudentInfo() {
        
        displayPersonInfo();
        study.DisplayStudyInfo();
        
        System.out.println("this student  is ungraduated");
        displayStanderdInfo();
        
        System.out.println("Number of completed semster : "+numOfCompletedSemester );
        System.out.println("remaning years : "+remainingYears/2+remainingYears%2);
        System.out.println("Expected Graduated date "+graduationDate);
        System.out.println("");
    
    }
}
