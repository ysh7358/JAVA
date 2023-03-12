package rambda;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
//		Supplier 함수적 인터페이스 intSupplier이용 추상 메서드 int getAsint() / int값을 리턴한다.
//		람다식 이용
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random()*6)+1;
			return num;
		};
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수: " + num);
	}
}
