package rambda;

public class RunnableExample {

	public static void main(String[] args) {
//		���ٽ�, �����尡 �����ϴ� �ڵ�
		Runnable runnable = () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		};
//������ ���� �� ����
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
