package rambda;

public class UsingThisExample {
	public static void main(String[] args) {
//		객체 생성
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
//		메서드 호출
		inner.method();
	}
}
