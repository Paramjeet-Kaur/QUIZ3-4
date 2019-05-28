import java.lang.String;
//Paramjeet Kaur(747429);
public class Quiz3_4 {

	public static void main(String[] args) {
	
		String sentence= "copyandpastecopyandpastecopyandpastecopyandpastecopyandpastecopyandpastecommitandpushcommitandpushcommitandpushcommitandpushpushcccccommmitttsss";
		int numCharInSentence=sentence.length();
		System.out.println("num of characters " +numCharInSentence);
		
		String subString=sentence.substring(sentence.length()-15);
		System.out.println("Last 15 characters of string are:" +subString);
		
		
		
		
		

	}

}
