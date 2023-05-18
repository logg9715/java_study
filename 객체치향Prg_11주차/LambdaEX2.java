package test;

public class LambdaEX2 {

	public static void main(String[] args) {
		CalcInnerface sumC = (a, b) -> a + b;
		System.out.println("calc(+) : " + sumC.calc(10, 20));
		CalcInnerface sub = (a, b) -> a - b;
		System.out.println("calc(-) : " + sub.calc(10, 20));
		CalcInnerface mul = (a, b) -> a * b;
		System.out.println("calc(*) : " + mul.calc(10, 20));
		CalcInnerface rem = (a, b) -> a % b;
		System.out.println("calc(%) : " + rem.calc(10, 20));
		
	}
}

@FunctionalInterface
interface CalcInnerface {
	int calc(int a, int b);
}
