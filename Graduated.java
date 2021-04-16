package models;

import Util.StudyInfo;
import java.sql.Date;

public abstract class Graduated extends Student {

    public Graduated   (     
                         float GPA, Date graduationDate, Date startDate, StudyInfo study,
                          int id, String name, String gender, Date birthDate, String address,
                          String number, String email, int SSN
                        )
    {
        super(GPA, graduationDate, startDate, study, id, name, gender, birthDate, address, number, email, SSN);
    }

   


    @Override
    public abstract void displayStudentInfo() ;
}
