package test;

public class TestThreadEx extends Thread {
	private int n = 0;

	@Override
	public void run() {
		while (true) {

			System.out.println(n++);
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	public static void main(String[] args) {
		TestThreadEx th = new TestThreadEx();
		th.start();
	}
}
