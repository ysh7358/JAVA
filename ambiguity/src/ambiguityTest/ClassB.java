package ambiguityTest;

public class ClassB extends ClassA implements InterA{
	//Ŭ���� B�� ClassA�� ��ӹް� InterA�κ��� implements ����
	@Override
	public void printData() {
		InterA.super.printData();
	}
}
