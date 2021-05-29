package MessageAuthCode;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;

public class msgAuthCode {

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
		// TODO Auto-generated method stub
		//Creating a KeyGenerator object
	      KeyGenerator keyGen = KeyGenerator.getInstance("DES");

	      //Creating a SecureRandom object
	      SecureRandom secRandom = new SecureRandom();

	      //Initializing the KeyGenerator
	      keyGen.init(secRandom);

	      //Creating/Generating a key
	      Key key = keyGen.generateKey();	 
	      //Creating a Mac object
	      Mac mac = Mac.getInstance("HmacSHA256");

	      //Initializing the Mac object
	      mac.init(key);

	      //Computing the Mac
	      String msg = new String("New test");
	      byte[] bytes = msg.getBytes();      
	      byte[] macResult = mac.doFinal(bytes);
	      System.out.println("Input :" +msg);
	      System.out.println("Mac result:"+new String(macResult));
	}

}
