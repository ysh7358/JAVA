package ambiguityTest;

public class ClassC implements InterA, InterB{
	//classC�� Inter A,B�κ��� ����
	@Override
	public void printData() {
		InterA.super.printData();
	}
}
