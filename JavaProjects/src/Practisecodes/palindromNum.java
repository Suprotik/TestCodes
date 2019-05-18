package Practisecodes;

public class palindromNum {

	public void palindromeNumber(int input) {
		// TODO Auto-generated method stub
		int a = input;
		int r,s=0;
		while(a>0) {
			r=a%10;
			s=(s*10)+r;
			a=a/10;
		}
	
		if(input == s) {
			System.out.println("palindrom number");
		}else {
			System.out.println("not palindrom");
		}
		
	}

}
