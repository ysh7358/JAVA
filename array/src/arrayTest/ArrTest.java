package arrayTest;

public class ArrTest {
	
	public static void main(String[] args) {
//		2차원 배열 arrData 생성
		int[][] arrData = {{3, 4, 5, 6}, {8, 9, 0, 9}, {1, 2, 3, 4}};
//		int length = arrData.length(열) * arrData[0].length(행);
//		2차원 배열 가져오기 i와 j 두번의 반복문을 돌리면서 arrData[i][j] 출력
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.println(arrData[i][j]);
			}
		}
		
		
//		for (int i = 0; i < length; i++) {
//			System.out.println(arrData[i / 4][i % 4]);
//		}
		
//		System.out.println(arrData.length);
//		System.out.println(arrData[0].length);
		
	}
}
