package threadTest1;

public class Animal implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {Thread.sleep(300);} catch (InterruptedException e) {;}
		}
	}
}
