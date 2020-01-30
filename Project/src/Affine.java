import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Affine {
	/**
	 * This program take a message and encrypts it
	 * @param args
	 */
	public static void main(String args[]) {
		
		String whole = ("");
		
		File f = new File(args[0]);
		try {
			Scanner s = new Scanner(f);
			while(s.hasNextLine()) {
				whole.concat(s.nextLine());
			}
			
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		
		
		
		
	}
}
