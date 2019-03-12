package utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class RandomUtil {

	
	public static int getRandomNumberByNofDigits(final int nofDigits){


		int randomNumber = 0;

		switch (nofDigits) {

			case 1:

				randomNumber = RandomUtils.nextInt(1, 10);
				break;

			case 2:

				randomNumber = RandomUtils.nextInt(10, 100);
				break;

			case 3:

				randomNumber = RandomUtils.nextInt(100, 1000);
				break;

			case 4:

				randomNumber = RandomUtils.nextInt(1000, 10000);
				break;

			case 5:

				randomNumber = RandomUtils.nextInt(10000, 100000);
				break;

			case 6:

				randomNumber = RandomUtils.nextInt(100000, 1000000);
				break;

			case 7:

				randomNumber = RandomUtils.nextInt(1000000, 10000000);
				break;

			case 8:

				randomNumber = RandomUtils.nextInt(10000000, 100000000);
				break;

			case 9:

				randomNumber = RandomUtils.nextInt(100000000, 1000000000);
				break;

		}

		return randomNumber;
	}
	
	public static String randomStringByNofChars(int length, boolean mixwithNumbers) {
		
	    String randomString = RandomStringUtils.random(length, true, mixwithNumbers);
		
		return randomString;
	}

}
