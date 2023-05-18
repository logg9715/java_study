package test;

public class syncEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShareBoard b1= new ShareBoard();
		
		Thread th1 = new StudentThread("A", b1);
		Thread th2 = new StudentThread("B", b1);
		
		th1.start();
		th2.start();
	}

}

class ShareBoard{
	private int data = 0;
	
	synchronized public void add() {
		int n = data;
		Thread.yield();
		n += 10;
		data = n;
		System.out.println(Thread.currentThread().getName()+ " : " + data);
	}

	public int getData() {
		return data;
	}
}

class StudentThread extends Thread{
	private ShareBoard board;

	public StudentThread(String name, ShareBoard board) {
		super(name);
		this.board = board;
	}
	
	public void run() {
		for (int i = 0; i <10; i++) {
			board.add();
			// 섞이는걸 보기 위해 일부러 딜레이 넣음 
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}