import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int totalSubjects=sc.nextInt();
        int totalMarks=0;
        for(int i=1;i<=totalSubjects;i++){
            System.out.print("Enter marks obtained in subject "+ i +": ");
            totalMarks=totalMarks+sc.nextInt();
        }
        float percentage=(float)totalMarks/(totalSubjects)*100;
        char grade;
        if(percentage>=90){
            System.out.println("grade A");
        }
        else if(percentage>=80){
            System.out.println("grade B");
        }
        else if(percentage>=70){
            System.out.println("grade C");
        }
       else if(percentage>=60){
            System.out.println("grade D");
        }
        else if(percentage>=50){
            System.out.println("grade E");
        }
        else{
            System.out.println("Grade F");
        }
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Average Percentage: "+percentage);
       
        
    }   
}

