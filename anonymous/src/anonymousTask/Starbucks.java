package anonymousTask;

public class Starbucks {
	//form타입의 form을 가져옴
	public void register(Form form) {
		//form의 getMenu에 문자열 배열(메뉴)를 담음. Form쪽에서 확인가능.
		String[] menus = form.getMenu();
		
		System.out.println("=======硫붾돱========");
		//반복문. 메뉴의 길이만큼 반복을 돌려서 메뉴의 i+1 : i번째 메뉴
//		를 가져오는 반복문(메뉴판)
		for (int i = 0; i < menus.length; i++) {
			System.out.println(i + 1 + ". " + menus[i]);
		}
//		form이 Formadapter와 동일한가요?
		if(form instanceof FormAdapter) {
			System.out.println("臾대즺 �굹�닎 �뻾�궗以�");
			return;
		}
//		form에 등록되어 있는 메뉴가 팔림
		form.sell("移댄뫖移섎끂");
	}
}
