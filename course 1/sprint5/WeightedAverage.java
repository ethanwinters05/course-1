import java.util.Scanner;

public class WeightedAverage 
{
   public static void calculateWeightedAverage() 
	{
        Scanner average = new Scanner(System.in);

        
		System.out.println("assignment weight :");
        float assignmentWeight=average.nextFloat();
        System.out.println("project weight :");
        float projectWeight=average.nextFloat();
		System.out.println("quiz weight :");
        float quizWeight=average.nextFloat();
		System.out.println("mid term weight :");
        float midTermWeight=average.nextFloat();
		System.out.println("finalexam weight :");
        float finalExamWeight=average.nextFloat();

        System.out.println("assigment score :");
        float assignmentScore=average.nextFloat();
		System.out.println("project score :");
        float projectScore=average.nextFloat();
		System.out.println("quiz score :");
        float quizScore=average.nextFloat();
		System.out.println("midterm score :");
        float midTermScore=average.nextFloat();
		System.out.println("finalexam score :");
        float finalExamScore=average.nextFloat();
		average.close();

        
        float assignmentPercentageScore = (assignmentWeight / 100) * assignmentScore;
        float projectPercentageScore = (projectWeight / 100) * projectScore;
        float quizPercentageScore = (quizWeight / 100) * quizScore;
        float midtermPercentageScore = (midTermWeight / 100) * midTermScore;
        float finalExamPercentageScore = (finalExamWeight / 100) * finalExamScore;

        
        float overallPercentage = assignmentPercentageScore + projectPercentageScore +
                quizPercentageScore + midtermPercentageScore + finalExamPercentageScore;

        
        System.out.println("Weights\t\t% Value of score");
        System.out.println("Assignments\t" + assignmentPercentageScore);
        System.out.println("Projects\t" + projectPercentageScore);
        System.out.println("Quizzes\t\t" + quizPercentageScore);
        System.out.println("Mid term\t" + midtermPercentageScore);
        System.out.println("Final Exam\t" + finalExamPercentageScore);
        System.out.println("The weighted average score is " + overallPercentage + "%");
    }
     public static void main(String[] args)
	{
        calculateWeightedAverage();
    }
}
