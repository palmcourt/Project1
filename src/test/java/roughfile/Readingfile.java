package roughfile;


import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readingfile {

	public static void main(String[] args) throws IOException {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\WorkSpace\\git\\Project1\\src\\test\\java\\roughwork\\file.properties");
		prop.load(fis);
	System.out.println(prop.getProperty("id"));

	}

}
