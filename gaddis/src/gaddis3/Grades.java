package gaddis3;

public class Grades {

	String[] names;
	int numStudents;
	int numScores;
	int [] testNumber;
	int  numTests;
	StudentScores [] allScores;
	int [] tester={3,4, 5};

	public Grades(int [] testNum, int nStudents, String [] name) {
		
		names=new String[nStudents];
		testNumber=new int[nStudents];
		
		testNumber=testNum;

		numStudents=nStudents;
		names=name;
	}
	
	public void fillTestScores(int [] _testScores){
		
		for(int i=0; i<_testScores.length; i++){
			
			testNumber[i]=_testScores[i];
		}
		allScores=new StudentScores[numStudents];
		processTestScores();
	}

	private void processTestScores(){
	
		for(int i=0; i<numStudents; i++){
				allScores[i].setScores(names[i], testNumber);
			
			}
		

		}
	

		public void getStudentData(){
			//allScores=new StudentScores(names, testScores);
		}

		/*public void setScores(int[] studScores, int studNum) {

		for (int i = 0; i < score; i++) {
			if (studNum == 0) {
				student1[i] = studScores[i];
			}
			if (studNum == 1) {
				student2[i] = studScores[i];
			}
			if (studNum == 2) {
				student3[i] = studScores[i];
			}

		}

	}*/

		public String[] getNames() {
			return names;
		}

		public String toString() {
			String n=" ";
			for(int i=0; i<numStudents; i++){
				n+=allScores[i].getStudentScores();

				
			}

			
			return n;
		}
	}
