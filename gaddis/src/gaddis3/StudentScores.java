package gaddis3;

public class StudentScores {

	int [] testScores;
	int [] testNum;
	String studName;

	public StudentScores() {

	}

	public void setScores(String name, int [] _testNum) {
		
		studName = new String();
		testNum=new int[_testNum.length];
		
		testNum = _testNum;
		studName = name;
	}

	public String getStudentScores() {
		String n = studName;
		for (int i = 0; i < testNum.length; i++) {
				studName += " 's score for test " + i + " is: "
						+ testNum[i] + " ";
			}
		return n;

	}
}
