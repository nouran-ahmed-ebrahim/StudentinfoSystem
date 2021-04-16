package Util;

public class StudyInfo {

    protected  final String collegeName;

   protected final String facultyName;

    protected  final String specialization;

    protected  final int duration;

    public StudyInfo(String collegeName, String facultyName, String specialization, int duration) {
        this.collegeName = collegeName;
        this.facultyName = facultyName;
        this.specialization = specialization;
        this.duration = duration;
    }

   public void DisplayStudyInfo()
   {
    System.out.println("Study info :");
    System.out.println("");
    System.out.println("Studies at college "+collegeName);
    System.out.println("Studies in faculty "+facultyName);
    System.out.println("Specialization is "+specialization);
    System.out.println("Study's duration in this faculty is "+specialization+" years");
   }

    public int getDuration() {
        return duration;
    }

}
