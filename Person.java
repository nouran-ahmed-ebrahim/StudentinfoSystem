

package models;
import java.sql.Date;

public abstract class Person {

    protected final String name;

    protected final String gender;

    protected final Date birthDate;

    protected final String address;

    protected final String number;

    protected final String email;

    protected final int SSN;

    public Person(String name,String gender , Date birthDate, String address, String number, String email, int SSN) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
        this.number = number;
        this.email = email;
        this.SSN = SSN;
    }

    public int getSSN() {
        return SSN;
    }

    protected void display() {
        System.out.println(SSN);
    }
    
    protected void displayPersonInfo()
    {
        System.out.println("The personal information : "); 
        System.out.println(); 
        System.out.println("Name is "+name); 
        System.out.println("The gender is "+gender);
        System.out.println("Birth Date : "+birthDate);
        System.out.println("Live in " + address);
        System.out.println("Phone number : "+number);
        System.out.println("Email "+email);
        System.out.println("SSN "+SSN);  
         System.out.println(); 
    
    }
}
