package gaddis2;

public class DriversLicense {

	String [] correctAns={"A", "B", "C", "D","E"};
	String [] studScores=new String[correctAns.length];
	int wrong=0;
	private boolean passed=false;
	private int totalCorrect=0;
	private int [] temp;
	int passing=0;

	public DriversLicense(String [] studentScores){
		studScores=studentScores;
		totalCorrect();
	}

	public boolean passed(){
		if(passing<.6){
			passed=true;
		}else{
			passed=false;
		}
		
		questionsMissed();
		return passed;
	}

	public int totalCorrect(){
		for(int i=0; i<studScores.length; i++){

			if(studScores[i].equals(correctAns[i])){
				totalCorrect++;

			}else{
				wrong++;
			}
		}
		//System.out.println(totalCorrect);
		passing=totalCorrect/5;
		
		totalIncorrect();
		passed();

		return totalCorrect;
	}


	public int totalIncorrect(){
		int totalIncorrect=0;
		totalIncorrect=correctAns.length-totalCorrect;
		//passed();
		return totalIncorrect;
	}

	public int [] questionsMissed(){
		int questionNum=0;
		int m=0;
		temp=new int[totalIncorrect()];
		for(int i=0; i<correctAns.length; i++){
			
			if(!studScores[i].equals(correctAns[i])){
				questionNum=i;
				temp[m]=questionNum+1;
				m++;
				
			}
		}
	
		return temp;
	}


	public String toString(){
		String m="";
		for(int i=0; i<totalIncorrect(); i++){
			System.out.println("hey " + temp[i]);
			m+=temp[i]+ " ";
		}
		String s="";
		
		if(passed())
			s=" you passed!";
		else
			s=" you failed!";

		return "Dude, " +s+ " and have "+ totalIncorrect()+ " incorrect, and you missed these: " + m;
	}

}
