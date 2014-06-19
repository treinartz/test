package gaddis3;

import java.util.Scanner;

public class GradesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studNumber = 0;
		int numTest=0;
		String[] name;
		int [] numTests;
		
		Grades myGrades;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		studNumber = scan.nextInt();
		name=new String[studNumber];
		
		System.out.println("Enter names of students: ");
		for (int i = 0; i < studNumber; i++) {
			name[i] = scan.next();
		}
			
		System.out.println("Enter how many tests for each student: ");
		numTest=scan.nextInt();
		numTests=new int[numTest];
		
		

		for (int i = 0; i < name.length; i++) {
			System.out.println("Enter score for test number:  "+ (i+1));
			numTests[i]=scan.nextInt();
			
		}
		myGrades = new Grades(numTests, studNumber, name);
		myGrades.fillTestScores(numTests);
		
		System.out.println(myGrades);
	}
}
