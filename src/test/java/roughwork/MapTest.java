package roughwork;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) { 

		Map<String, String> test = new LinkedHashMap<String, String>();

		test.put("A", "1");
		test.put("B", "2");
		test.put("C", "3");
		test.put("D", "4");
		test.put("E", "5");
		test.put("F", "6");

		Set<String> t = test.keySet();

		System.out.println(t);
		
	
		/*for (int i = 0; i < t.size(); i++) {
			t.
		}*/
		
		for (String key : test.keySet()) {

			System.out.println(key+"========"+test.get(key));
		}
	}	
}
