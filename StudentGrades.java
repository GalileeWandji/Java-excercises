package Grades;

import java.util.Scanner;

public class StudentGrades {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the score");
		int mark = input.nextInt();
		
		char grade = (mark >= 90) ? 'A' :
			(mark >= 80) ? 'B' :
				(mark >= 70) ? 'C' :
					(mark >= 60) ? 'D' :
						'F';
		
		System.out.println("The grade of the student is: " +grade);	
			
	}

}
