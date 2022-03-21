
public class Main {

	public static void main(String[] args) {

		Transportation transportationBicycle = new Transportation(new Bicycle());
		Transportation transportationCar = new Transportation(new Car());

		System.out.println(transportationBicycle.getName());

		System.out.println(transportationCar.getName());

	}

}


