package roughfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writinghtml {

	public static void main(String[] args) throws IOException {
		 File f = new File("c:\\priyafile\\txtfilehtml.html");
		  FileWriter fw = new FileWriter(f);
		  BufferedWriter bw = new BufferedWriter(fw);
		  bw.write("<html><body><title>Learning</title><h>core java</h></body></html>");
		  bw.close();
	}

}
