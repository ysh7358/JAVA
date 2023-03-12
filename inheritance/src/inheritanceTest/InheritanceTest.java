package inheritanceTest;

class A{
	String name = "A";
	int data = 10;
	
	public A() {
		System.out.println("부모");
	}
	
	void printName() {
		System.out.println(name);
	}
}

class B extends A{
	
	public B() {
		super();
		name = "B";
		System.out.println("자식");
	}
	
	void printData() {
		System.out.println(data);
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();
		b.printName();
		b.printData();
	}
}












