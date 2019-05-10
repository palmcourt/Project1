package roughwork;

import java.util.ArrayList;
import java.util.List;

public class ListTest {


	public static void main(String[] args) { 

		List<String> test = new ArrayList<String>();
		test.add("A");
		test.add("B");
		test.add("C");
		test.add("D");
		test.add("E");
		test.add("F");
		test.add("G");

		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}

		for (String string : test) {
			
		}

		for (String val : test) {
			
			System.out.println(val);
		}


	}

}
