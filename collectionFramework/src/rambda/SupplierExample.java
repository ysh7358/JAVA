package rambda;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
//		Supplier �Լ��� �������̽� intSupplier�̿� �߻� �޼��� int getAsint() / int���� �����Ѵ�.
//		���ٽ� �̿�
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random()*6)+1;
			return num;
		};
		int num = intSupplier.getAsInt();
		System.out.println("���� ��: " + num);
	}
}
