package test;

public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myfun hi = () -> System.out.println("Hello");
		hi.print();
	}
}

@FunctionalInterface
interface Myfun {
	void print();
}