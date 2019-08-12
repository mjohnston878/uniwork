/**
 * 
 */
package examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author matthew
 *
 */
public class ReadFromFile {

	/**
	 * 
	 */
	public ReadFromFile() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String line;

		// create a file object
		File file = new File("Teams.txt");

		// create a file reader
		FileReader fileReader;

		try {
			fileReader = new FileReader(file.getName());

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
			bufferedReader.close();
			fileReader.close();
			System.out.println("All done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
