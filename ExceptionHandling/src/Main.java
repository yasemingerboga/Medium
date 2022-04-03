
public class Main {

	public static void main(String[] args) {
		int[] numberArray = new int[5];
		// numberArray size is equals to 5.
		try {
			numberArray[8] = 15;
			// There is no index 8. So, it should throw exception. Catch block should be
			// running.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound.. " + e.toString());
		}

	}

}


