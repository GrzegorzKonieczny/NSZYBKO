package szybko;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MySzybko {
	
	private static final String FILENAME = "C:\\Users\\pl18881\\Documents\\new 1";
	private static final String FILENAME2 = "C:\\Users\\pl18881\\Documents\\new 2";
	
	public static void main(String[] args) {
		BufferedReader br = null;

		BufferedWriter writer = null;
		
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILENAME));
			writer = new BufferedWriter( new FileWriter( FILENAME2));
			
			while ((sCurrentLine = br.readLine()) != null) {
				if( !sCurrentLine.startsWith("*")){
					if (sCurrentLine.length() > 1){
						if (!sCurrentLine.startsWith("\"")){
							writer.write(  sCurrentLine);
							writer.newLine();
							
						}
					}
				}	
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();
					writer.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}
