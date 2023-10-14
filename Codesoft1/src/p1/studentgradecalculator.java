package p1;
import java.util.Scanner;

public class studentgradecalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("******WELCOME TO THE STUDENT GRADE CALCULATOR******");
        System.out.print("\nEnter the student's name: ");
        String studentName = sc.next();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        double totalMarks = 0;
        double average, avgper;
        for (int i=1;i<=numSubjects;i++) 
        {
            System.out.print("Enter the marks for Subject(out of 100) " + i + ": ");
            double subjectMarks = sc.nextDouble();
            totalMarks += subjectMarks;
        }
        average = totalMarks / numSubjects;
        avgper = (totalMarks / (numSubjects * 100)) * 100; 
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Average Percentage: " + avgper);
        System.out.println("Average Grade: " + calculateGrade(average));
    }
    // Function to calculate the grade based on the average
    public static String calculateGrade(double avgper) 
    {
        if (avgper >= 90)
        {
            return "A+";
        } 
        else if (avgper >= 80) 
        {
            return "A";
        } 
        else if (avgper >= 70) 
        {
            return "B";
        } 
        else if (avgper >= 60) 
        {
            return "C";
        }
        else if (avgper >= 50)
        {
            return "D";
        } 
        else 
        {
            return "F";
        }
    }
}

