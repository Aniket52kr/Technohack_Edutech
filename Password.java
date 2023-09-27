package GenerateRandomPassword;

import java.util.Random;
public class Password {

	public static void main(String[] args) {
		System.out.println(generatePassword(8));
		}
	public static char[] generatePassword(int length) {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] Password = new char[length];
		
		Password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	    Password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	    Password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	    Password[3] = numbers.charAt(random.nextInt(numbers.length()));
	    
	    for(int i=4; i< length; i++) {
	    Password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	    }
	    System.out.println("Your Password is: ");
	    return Password;
	}

}
