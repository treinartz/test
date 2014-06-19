package gaddis;

public class DriverLicense {
	
	String [] correctScores={"a", "b", "c", "d", "e"};
	int [] wrongArray;
	int counter=0;
	int wrong=0;
	
	
	public DriverLicense(){
		
		
	}
	
	public void gradeExam(String [] scores){
		String [] wrongScores;
		for(int i=0; i<scores.length; i++){
			if(scores[i].equals(correctScores[i])){
				counter++;
				
			}else{
				wrong++;
				
			}
		}
		wrongArray=new int[wrong];
		passed();
		numsWrong(scores);
		
	}
	public boolean passed(){
		boolean passed=false;
		
		if(counter>=3){
			passed=true;
		}
		else{
			passed=false;
		}
		
		return passed;
	}
	
	public int[] numsWrong(String [] studScores){
		int wrongAnswer=0;
		int [] temp=new int[wrong];
		//System.out.println(temp.length);
		for(int i=0; i<studScores.length; i++){
			
			if(!studScores[i].equals(correctScores[i])){
				temp[wrongAnswer]=(i+1);
				wrongAnswer++;
				
				
			}
			//System.out.println(temp[i]);
		}
		wrongArray=temp;
		
		return wrongArray;
		
		
		
	}
	
	public String toString(){
				for(int i=0; i<wrongArray.length; i++){
			System.out.println(wrongArray[i]);
		}
				
				System.out.println("did you pass?");

		if(passed()==true){
			return "yes, you passed!";
		}else{
			return "no, you failed";
		}

		//return "";
	}
	
	

}
