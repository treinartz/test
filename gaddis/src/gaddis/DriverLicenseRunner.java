package gaddis;

import java.util.*;

public class DriverLicenseRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] studScores=new String[5];
		Scanner scan=new Scanner(System.in);
		DriverLicense testScores=new DriverLicense();
		
		System.out.println("Enter student scores: ");
		
		for(int i=0; i<studScores.length; i++){
			studScores[i]=scan.next();
		}
		testScores.gradeExam(studScores);
		System.out.println("here are the numbers you have wrong: ");
		
		
		testScores.numsWrong(studScores);
		
		
		
		System.out.println(testScores);
		
	}

}
