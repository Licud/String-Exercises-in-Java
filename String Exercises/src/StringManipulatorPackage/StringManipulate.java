package StringManipulatorPackage;

public class StringManipulate implements IStringManipulate {
	
	@Override
	public boolean isPalindrome(String s) {
		
		String stringToTest = s.toLowerCase();
		boolean palidrome = true;
		
		for(int i = 0, j = s.length() - 1 ; i <= s.length() / 2 && palidrome == true; i++, j--){
			if(stringToTest.charAt(i) != stringToTest.charAt(j)){
				palidrome = false;
			}
		}
		
		return palidrome;
	}

	@Override
	public String reverseString(String s) {
		char[] stringArray = s.toCharArray();
		
		for(int i = 0, j = s.length()- 1; i < s.length() / 2; i++, j--){
			char temp = stringArray[j];
			stringArray[j] = stringArray[i];
			stringArray[i] = temp;
		}
		
		return new String(stringArray);
	}

	@Override
	public String reverseWords(String s) {
		String[] wordArray = s.split("\\s+");
		
		for(int i = 0, j = wordArray.length - 1; i < wordArray.length / 2; i++, j--){
			String temp = wordArray[j];
			wordArray[j] = wordArray[i];
			wordArray[i] = temp;
		}	
		
		String reversed = wordArray[0];
		
		for(int i = 1; i < wordArray.length ; i++){
			reversed = reversed.concat(" " + wordArray[i]);
		}
		
		return reversed;
	}
}
