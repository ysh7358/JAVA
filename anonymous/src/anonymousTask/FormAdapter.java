package anonymousTask;

// Form으로부터 상속받는 formadapter 추상 클래스
public abstract class FormAdapter implements Form{

	@Override
	public String[] getMenu() {return null;}

	@Override
	public void sell(String order) {}

}
