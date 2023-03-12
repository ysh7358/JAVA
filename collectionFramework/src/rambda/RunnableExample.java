package rambda;

public class RunnableExample {

	public static void main(String[] args) {
//		람다식, 쓰레드가 실행하는 코드
		Runnable runnable = () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		};
//쓰레드 생성 및 시작
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
