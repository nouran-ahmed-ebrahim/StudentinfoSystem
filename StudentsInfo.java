
package newpackage;

import java.util.Scanner;
import Data.*;
import Util.*;
import java.io.File;


public class StudentsInfo {

 public static void fillData()
 {
      CurrentUnderStud.fillData();
      CurentDGraduated.fillData();
      CurrentNDGraduated.fillData();
      CurrentMasterGraduated.fillData();
 }
    
    public static void main(String[] args)
    {
     fillData();
     
     Scanner input = new Scanner(System.in);
     char continu;
     int SSN, SSS ;
     boolean AOperation = true;
     
     
     do
     {
        AOperation = true;
        System.out.print("Enter student's SSN which you want to show his inforamation : ");
        SSN = input.nextInt();
        System.out.println("Choose student's study state");
        System.out.println("1) undergraduated      2) no degree     3) master degree     4) doctoral degree ");
         System.out.println();
        System.out.print("Enter student's study state :");
        SSS = input.nextInt();
        
        switch (SSS)
        {
            case 1:
                UndergraduatedStudent.displaySpecificUndergraduated(SSN);
                break;
                
            case 2:
                NoDegreeGraduated.displayNDGraduated(SSN);
                break;
                
            case 3:
                AllMasterGraduated.displaySpecificUndergraduated(SSN);
                break;
                
            case 4:
                AllDoctoralGrduated.displaySpecificUndergraduated(SSN);
                break;
                
            default:
                System.out.println("invalid study state");
               
        }
      
         System.out.println("");
         System.out.print("Do want to display anther student info (y/n) ?  ");
         continu = input.next().charAt(0);
         
         if(continu=='n')
         {
           AOperation = false;
         }
         else if (continu != 'y')
         {
             System.out.println("invalid choice");
         }
         
     }while (AOperation);
   
        System.out.println("Closed");
    }
    
}
