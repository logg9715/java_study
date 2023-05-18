package test;

public class TestRunnableEx implements Runnable {
	private int n = 0;

	public static void main(String[] args) {
		Thread th = new Thread(new TestRunnableEx());
		th.start();
	}

	@Override
	public void run() {
		while (true) {

			// TODO Auto-generated method stub
			System.out.println(n++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	
	
}
