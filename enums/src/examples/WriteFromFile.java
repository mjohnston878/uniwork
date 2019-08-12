package examples;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFromFile {

	public WriteFromFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		
		String teamToAdd = "\nWales";

		try {
			File file = new File("Teams.txt");
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file, true);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(teamToAdd);

			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
