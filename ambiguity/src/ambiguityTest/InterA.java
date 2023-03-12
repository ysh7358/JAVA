package ambiguityTest;

public interface InterA {
	//인터페이스 A에 있는 디폴트 메서드
	default void printData() {
		System.out.println("InterA");
	}
}
