package Practisecodes;
/**
 * Palindrome number in java: A palindrome number is a number that is same after reverse. 
 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
 * It can also be a string like LOL, MADAM etc.
 * Palindrome number algorithm
 * <ul> 
 * 	<li>Get the number to check for palindrome</li>
 * 	<li>Hold the number in temporary variable</li>
 * 	<li>Reverse the number</li>
 * 	<li>Compare the temporary number with reversed number</li>
 * 	<li>If both numbers are same, print "palindrome number"</li>
 * 	<li>Else print "not palindrome number"</li>
 * </ul>
 * @author SUBHO
 *
 */
public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*palindromNoOrString pnors = new palindromNoOrString(); 
		pnors.PalNoOrString("madam");*/
		palindromNum pn = new palindromNum();
		pn.palindromeNumber(1221);
		

	}

}
