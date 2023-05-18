package test;

public class TestRunnableEx2 {
	public static void main(String[] args) {
		Thread th = new Thread(() -> {
			int n = 0;
			while (true) {

				// TODO Auto-generated method stub
				System.out.println(n++);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		th.start();

	}
}
