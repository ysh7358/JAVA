package arrayListTask;

import java.util.ArrayList;
import java.util.Collections;

public class DateApp {
//love DB 생성 (Arraylist)
	public static ArrayList<Love> loves = new ArrayList<Love>();
	
//add메서드 (러브타입 추가)
	public void add(Love love) {
		loves.add(love);
	}
	

	public ArrayList<Love> getList(int age) {
		ArrayList<Love> selected = new ArrayList<Love>();
		
		for (Love love : loves) {
			if(love.getAge() == age) {
				selected.add(love);
			}
		}
		return selected;
	}
	

	public void update(Love love) {
		for (Love db : loves) {
			if(db.getNumber() == love.getNumber()) {

				loves.set(loves.indexOf(db), love);

				break;
			}
		}
	}
	

	public void sort() {

		ArrayList<Integer> ages = new ArrayList<Integer>();
		

		ArrayList<Love> loves = new ArrayList<Love>();
		
		for (Love love : DateApp.loves) {

			ages.add(love.getAge());
		}
		

		Collections.sort(ages);
		
		for (int i = 0; i < DateApp.loves.size(); i++) {

			for (Love love : DateApp.loves) {
				if(ages.get(i) == love.getAge()) {

					loves.add(love);
				}
			}
		}

		DateApp.loves = loves;
	}
}










