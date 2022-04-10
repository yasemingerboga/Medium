
public class Car {
	private String brand;
	private String year;
	private static int numberOfCars;

	public Car(String brand, String year) {
		super();
		this.brand = brand;
		this.year = year;
		numberOfCars++;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}

	public int findNumberOfCars() {
		return numberOfCars;
	}

}
