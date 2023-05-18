package test;

public class LambdaEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10, 20));
		System.out.println(sub(20, 10));
		System.out.println(mul(20, 10));
		SumInnerface sum = (a, b) -> a + b;
		System.out.println("람다 : " + sum.plus(20, 10));

	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sub(int a, int b) {
		return a - b;
	}

	private static int mul(int a, int b) {
		return a * b;
	}
}

@FunctionalInterface
interface SumInnerface {
	int plus(int a, int b);
}
