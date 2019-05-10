package roughfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readingtxt {

	public static void main(String[] args) throws IOException {
		File f = new File("c:\\priyafile\\txtfile");
		FileReader fd = new FileReader(f);
		BufferedReader br = new BufferedReader(fd);
		String line=null;
		while((line=br.readLine())!=null)
		{
		//System.out.println("line");
		
		System.out.println(line);
		}
		br.close();
		
	}

}
