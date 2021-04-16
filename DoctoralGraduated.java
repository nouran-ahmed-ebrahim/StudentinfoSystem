package models;

import Util.StudyInfo;
import java.sql.Date;

public class DoctoralGraduated extends MasterGraduated {

    protected final String Doctoralfield;

    protected final String  DoctoralcollageName;

    public DoctoralGraduated (
                                 String Doctoralfield, String DoctoralcollageName, String Masterfield, String collageName,
                                 float GPA, Date graduationDate, Date startDate, StudyInfo study, int id, String name,
                                 String gender, Date birthDate, String address, String number, String email, int SSN
                             )
    {
        super(Masterfield, collageName, GPA, graduationDate, startDate, study, id, name, gender, birthDate, address, number, email, SSN);
        this.Doctoralfield = Doctoralfield;
        this.DoctoralcollageName = DoctoralcollageName;
    }

 
    @Override
    public void displayStudentInfo() 
    {
        displayPersonInfo();
        study.DisplayStudyInfo();
        
        System.out.println("Study state is Doctoral graduated");
        displayStanderdInfo();
        System.out.println("Graduated date "+graduationDate) ;
        System.out.println("");
        displayMasterInfo();
        displayDoctoralInfo();
    }
    
    public void displayDoctoralInfo()
   {
        System.out.println("Doctoral info : ");
        System.out.println("");
        System.out.println("Doctoral Field is "+Doctoralfield);
        System.out.println("Doctoral was taken in "+DoctoralcollageName+" University");
        System.out.println("");
   }
    
   
}
