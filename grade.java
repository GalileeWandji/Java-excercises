package grade;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        char grade;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mark of the student");
        int mark = input.nextInt();

        if (mark >= 90 && mark <= 100) {
            grade = 'A';
        } else if (mark >= 80 && mark < 90) {
            grade = 'B';
        } else if (mark >= 70 && mark < 80) {
            grade = 'C';
        } else if (mark >= 60 && mark < 70) {
            grade = 'D';
        } else if (mark >= 0 && mark < 60) {
            grade = 'F';
        } else {
            System.out.println("Invalid mark entered!");
            return;
        }

        System.out.println("Your grade is " + grade);
    }
}