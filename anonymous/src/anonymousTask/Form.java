package anonymousTask;
//인터페이스 Form 생성
public interface Form {
	//문자열 배열로 메뉴들을 받아옴.
	public String[] getMenu();
	//String order(주문받은 것)을 sell(판매함)
	public void sell(String order);
}
