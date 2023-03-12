package ambiguityTest;

public class ClassB extends ClassA implements InterA{
	//클래스 B는 ClassA를 상속받고 InterA로부터 implements 받음
	@Override
	public void printData() {
		InterA.super.printData();
	}
}
