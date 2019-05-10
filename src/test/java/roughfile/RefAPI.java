package roughfile;

import java.lang.reflect.Method;

public class RefAPI {

	public static void main(String[] args) {

		ExApi api = new ExApi();
		Class clazz =api.getClass();
		System.out.println(clazz.getSimpleName());
		Method[] array = clazz.getDeclaredMethods();
		System.out.println(array.length);
		for(Method m:array)
		{
			System.out.println(m.getName()+ m.getParameterTypes());
		}
		
		
	}

}
