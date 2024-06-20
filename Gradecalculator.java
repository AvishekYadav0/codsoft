import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subject");
        int numSubjects = scanner.nextInt();

        int marks[] = new int[numSubjects];
        int totalMarks= 0;

         System.out.println("Enter the marks obtained mark  for each subject one by one:");
         for (int i = 0; i < numSubjects; i++) {
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        scanner.close();
        double averagePercentage = (double) totalMarks / (numSubjects *100) * 100;
        
       
        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
            System.out.println("Outunderstandin");
        } else if (averagePercentage >= 80) {
            grade = "A";
            System.out.println("Excellent");
        } else if (averagePercentage >= 70) {
            grade = "B+";
            System.out.println("Very good");
        } else if (averagePercentage >= 60) {
            grade = "B";
            System.out.println("Good");

        }
        else if(averagePercentage>=50) {
            grade = "C+"; 
            System.out.println("Sastisfactory");
        } 
        else if(averagePercentage>=40) {
            grade = "C"; 
            System.out.println("Accepatable");
        } 
        else if(averagePercentage>=30) {
            grade = "D+"; 
            System.out.println("Partailly Accepatable");
        } 
        else if(averagePercentage>=30) {
            grade = "D"; 
            System.out.println(" Insufficient ");
        } 
        else {
            grade = "very Insufficient ";
        }
        
        System.out.println("Total Marks: " + totalMarks + " out of " + (numSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);


        
    }
    
}
