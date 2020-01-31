import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Affine {
	/**
	 * This program takes a message in hexadecimal and decrypts it
	 * using the Affine cipher
	 * @param args
	 */
	public static void main(String args[]) {
		
		String whole = "";
		
		File f = new File(args[0]);
		try {
			Scanner s = new Scanner(f);
			while(s.hasNextLine()) {
				
				whole+=(s.nextLine());
				
			}
			s.close();
			
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		
		String ascii = ("");
		for(int i = 0; i < whole.length(); i = i + 2) {
			String s = whole.substring(i, i + 2);
			int n = Integer.valueOf(s, 16);
			ascii+=((char)n);
		}
		int trueA = 0;
		int trueB = 0;
		int trueInv = 0;
		String found = "";
		char[] asciiChar = ascii.toCharArray();
		for(int i = 3; i < 256; i+= 2) {
			int inverse = BigInteger.valueOf(i).modInverse(BigInteger.valueOf(256)).intValue();
			for(int j = 0; j < 256; j++) {
				String attempt = "";
				for (char y : asciiChar) {
					int value = ((inverse * (y - j)) % 256 +256) % 256;
					
					attempt += (char)value;
					
					
				}
				
				if(attempt.contains("Computer Science")) {
					trueA = i;
					trueB = j;
					trueInv = inverse;
					found = attempt;
				}
				
			}
		}
		
		System.out.println("Message:\n" + found + "\nAffine Cipher Keys\n a	= "+ trueA +"\na^-1 = "+ trueB +"\nb	= " + trueInv);
		
		
		
	}
}
