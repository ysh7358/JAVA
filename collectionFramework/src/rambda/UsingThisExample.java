package rambda;

public class UsingThisExample {
	public static void main(String[] args) {
//		��ü ����
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
//		�޼��� ȣ��
		inner.method();
	}
}
