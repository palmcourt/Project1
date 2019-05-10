package roughfile;

import java.io.BufferedWriter;
//import java.io.BufferWriter;
//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Witingtxt {

	public static void main(String[] args) throws IOException {
	  File f = new File("c:\\priyafile\\textfile.txt");
	  FileWriter fw = new FileWriter(f);
	  BufferedWriter bw = new BufferedWriter(fw);
	  bw.write("name");
	  bw.newLine();
	  bw.write("id");
	  bw.newLine();
	  bw.write("gender");
	  bw.newLine();
	  
	  bw.close();
	
		
	}

}
