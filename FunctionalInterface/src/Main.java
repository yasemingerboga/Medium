import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		// without Lambda Expressions
		new Runnable() {
			@Override
			public void run() {
				System.out.println("Functional interface runnable");
			}
		}.run();

		// with Lambda Expressions

		Runnable runnable = () -> System.out.println("Functional interface runnable");
		runnable.run();

		// Functional Interfaces

		// 1. Function<T,R>
		// The example takes <T> string and returns its type by converting it to an
		// integer as <R>
		// Or you can return whatever you want (ex. length of the string)
		Function<String, Integer> function = str -> Integer.parseInt(str);
		Integer apply = function.apply("12");
		System.out.println(apply);

		// Consumer
		Consumer<int[]> consumer = array -> {
			for (int i = 0; i < array.length; i++) {
				array[i] = array[i] + 2;
			}
		};
		int[] array = { 5, 8 };
		consumer.accept(array);
		System.out.println(Arrays.toString(array));

		// Supplier
		Supplier<Integer> supplier = () -> {
			Random random = new Random();
			return random.nextInt(500);
		};
		for (int i = 0; i < 2; i++) {
			// It supplies us 2 random number
			System.out.println(supplier.get());
		}

		// Predicate
		Predicate<Integer> isEven = number -> number % 2 == 0;

		System.out.println("11 is even : " + isEven.test(11));
		System.out.println("10 is even : " + isEven.test(10));

	}

}
