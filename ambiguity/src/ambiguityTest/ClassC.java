package ambiguityTest;

public class ClassC implements InterA, InterB{
	//classC는 Inter A,B로부터 받음
	@Override
	public void printData() {
		InterA.super.printData();
	}
}
