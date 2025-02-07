package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {

	public static int sum;

	public static void main(String[] args) {
		IntStream intstream = IntStream.rangeClosed(1, 100);
		intstream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
	}

}
