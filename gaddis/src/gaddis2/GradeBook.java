package gaddis2;

public class GradeBook {

	private int [] student1Test=new int[5];
	private int [] student2Test=new int[5];
	private int [] student3Test=new int[5];
	private int [] student4Test=new int[5];
	private int [] student5Test=new int[5];

	private String [] studentName=new String[5];
	private int [][] allScores=new int[5][5];

	public GradeBook(String [] name){;
	for(int i=0; i<name.length; i++){
		studentName=name;
	}
	}

	public void allScores(int [] [] scores, int studentNum){
		for(int i=0; i<studentName.length; i++){
			for(int j=0; j<4; j++){
				allScores[i][j]=scores[i][j]; 
			}
		}
	}

	public void sendScores(int [] scores, int studentNum){
		for(int i=0; i<scores.length; i++){
			if(studentNum==1){
				student1Test[i]=scores[i];
			}
			if(studentNum==2){
				student2Test[i]=scores[i];
			}
			if(studentNum==3){
				student3Test[i]=scores[i];
			}
			if(studentNum==4){
				student4Test[i]=scores[i];
			}
			if(studentNum==5){
				student5Test[i]=scores[i];
			}
		}
	}

	public int computeAverage(int [] scores){
		int total=0; 
		int average=0;
		int numScores=scores.length;

		for(int i=0; i<scores.length; i++){
			total+=scores[i];
		}
		average=total/numScores;

		return average;
	}

	public int getAverage(int [] scores, int studentNum){

		int average=0;
		switch(studentNum){

		case 1: studentNum=1;
		average=computeAverage(scores);
		break;
		case 2: studentNum=2;
		average=computeAverage(scores);
		break;
		case 3: studentNum=3;
		average=computeAverage(scores);
		break;
		case 4: studentNum=4;
		average=computeAverage(scores);
		break;
		case 5: studentNum=5;
		average=computeAverage(scores);
		break;

		}
		return average;
	}

	public String getMyAverages(int [][] allAves, int numTests){

		int [] studente=new int[5];
		int [] temp=new int[5];
		int average=0;
		int total=0;
		String output="";
		

		for(int i=0; i<studentName.length; i++){
			for(int j=0; j<4; j++){
				total+=allAves[i][j];
				
				
			}
			studente[i]=total;
			total=0;
			System.out.print(studente[i]);
			average=studente[i]/numTests;
			temp[i]=average;
			output+=temp[i]+"\n";
		}
		return output;


	}

	public String toString(){

		String student1 = " ";
		String student2 = " ";
		String student3 = " ";
		String student4 = " ";
		String student5 = " ";

		int testScore=0;
		String studentAverage="";

		System.out.println("Here are the test scores:\n\t "+ "test1\t"+"test2\t"+"test3\t"+"test4\t"+"test5");

		student1=studentName[0]+"\t";
		student2=studentName[1]+"\t";
		for(int i=0; i<5; i++){
			student1+=student1Test[i]+"\t";
			student2+=student2Test[i]+"\t";
		}


		for(int i=0; i<studentName.length; i++){
			for(int j=0; j<4; j++){
				System.out.print(allScores[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("And here are the averages: ");
		
		for(int i=0; i<5; i++){
		//System.out.println("help");
				studentAverage=studentName[i]+ " has an average score of "+ getMyAverages(allScores, 4);
			
		}

		return student1+ "\n"+ student2+"\n\n"+ studentAverage;

	}
	
}
