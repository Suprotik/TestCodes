package Practisecodes;

public class palindromNoOrString {
	
	public void PalNoOrString(String input) {
		int lenOfString = input.length();
		String reverse="";
		for(int i=lenOfString-1;i>=0;i--) {
			reverse=reverse+input.charAt(i);
		}
		if(reverse.equals(input)) {
			System.out.println("palindrom Number");
		}else {
			System.out.println("Not palindrom Number");
		}
	}
}
