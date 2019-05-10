package roughwork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Notepad {

	public static void main(String[] args) throws IOException {
		File f = new File("c:\\priyafile\\file.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter("c:\\priyafile\\file.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("firstname");
		bw.flush();
	}

}
