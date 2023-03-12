package anonymousTask;

public class Building {
	public static void main(String[] args) {

		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();
		
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				String[] menus = {"아메리카노", "카페라떼", "허브티"};
				return menus;
			}
		});
		
		
		gangnam.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(order.equals(menus[i])) {
						System.out.println("�뙋留� �셿猷�");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String[] menus = {"아메리카노", "카페라떼", "허브티"};
				return menus;
			}
		});
	}
}
