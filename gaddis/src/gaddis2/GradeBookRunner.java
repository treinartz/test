package gaddis2;

import java.util.Scanner;
public class GradeBookRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeBook myGrades;
		int studentNum=0;
		int testNum=0;
		String [] student=new String[5];
		int [] [] testScores=new int[5][5];
		int [] temp=new int[4];
		int value=0;

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter five students: ");
		for(int i=0; i<student.length; i++){
			student[i]=scan.next();
		}
		myGrades=new GradeBook(student);
		System.out.println("Here are your students: ");

		for(int i=0; i<student.length; i++){
			for(int j=0; j<4; j++){

				System.out.println("Enter scores for " + student[i]+ " on test " + (testNum+1));
				testNum++;
				temp[j]=scan.nextInt();
				testScores[i][j]=temp[j];
			}
			
			myGrades.sendScores(temp, studentNum);
			
			testNum=0;
			studentNum++;
			
			
			

		}
		myGrades.allScores(testScores,  studentNum);
		
		
		//System.out.println("here are all scores in a matrix: ");
		
		System.out.println(myGrades);

	}



}
