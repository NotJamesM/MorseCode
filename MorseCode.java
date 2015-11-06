package morseCode;

import java.util.List;
import java.util.Arrays;

public class MorseCode {
	private static List<String> morseCharactersList = Arrays.asList(
	        "-.--.-","-.--.-","","","--..--",
	        "-....-",".-.-.-","-..-.","-----",".-----",
	        "..---","...--","....-","-....","--...",
	        "---..","----.","","","",
	        "","","..--..","",".-",
	        "-...","-.-.","-..",".","..-.",
	        "--.","....","..",".---","-.-",
	        ".-..","--","-.","---",".--.",
	        "--.-",".-.","...","-","..-",
	        "...-",".--","-..-","-.--","--.."

	    );
	
	public static void main(String[] args) {
		MorseCode m = new MorseCode();
		m.toEnglish("... --- ...");
		m.toMorse("s o s");
	}
	
	private void toEnglish(String text){
		String[] morseCode= text.split(" ");
		char[] englishChar=new char[morseCode.length];
		
		for(int i=0;i<morseCode.length;i++){
			if(morseCode[i].isEmpty()){
				englishChar[i]=' ';
			
			}else{
				englishChar[i] = (char)(morseCharactersList.indexOf(morseCode[i])+41);
				
			}
		}
		String output = new String(englishChar).replace("  ", " ");
		System.out.println(output);
	}
	
	private void toMorse(String text){
		char[] englishChars = text.toUpperCase().toCharArray();
		StringBuilder s = new StringBuilder();
		for(char c:englishChars){
			if(c == ' '){
				s.append(" ");
			}else{
				
				s.append(morseCharactersList.get((int)c-41));
			}
			
		}
		System.out.println(s);
	}
}
