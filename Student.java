package models;

import Util.StudyInfo;
import java.sql.Date;


public abstract class Student extends Person {

   protected final float GPA;

   protected final Date graduationDate;

   protected final Date startDate;

   protected final StudyInfo study;

   protected final int id;

    public Student( 
                      float GPA, Date graduationDate, Date startDate, StudyInfo study,
                      int id, String name, String gender, Date birthDate, String address,
                      String number, String email, int SSN
                    )
    {
        super(name, gender, birthDate, address, number, email, SSN);
        this.GPA = GPA;
        this.graduationDate = graduationDate;
        this.startDate = startDate;
        this.study = study;
        this.id = id;
    }

    @Override
    protected void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Helllllloo");
    }
    
    
//    int countChar(String s, char c) {
//        
//    }
    
    public void displayStanderdInfo()
    {
        
        System.out.println("Student id : "+id);
        System.out.println("Current GPA : "+GPA);
        System.out.println("Start date : "+startDate);
     }
    
    
    public abstract void displayStudentInfo();
}
