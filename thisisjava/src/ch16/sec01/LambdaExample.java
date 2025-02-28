package ch16.sec01;

public class LambdaExample {

	public static void main(String[] args) {
		action((x,y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		});
		
		action((x,y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
	}
	
	public static void action(Calculable caculable) {
		int x = 10;
		int y = 4;
		caculable.calculate(x, y);
	}

}
