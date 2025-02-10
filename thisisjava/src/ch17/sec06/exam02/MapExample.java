package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		
		IntStream intstream = Arrays.stream(intArray);
		intstream
			.asDoubleStream()
			.forEach(d -> System.out.println(d));
		
		System.out.println();
		
		intstream = Arrays.stream(intArray);
		intstream
			.boxed()
			.forEach(obj -> System.out.println(obj.intValue()));
	}

}
