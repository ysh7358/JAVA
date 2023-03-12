package rambda;

public class Student {
//	private
	private String name;
	private int englishScore;
	private int mathScore;
//	생성자
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
//	겟 메서드
	public String getName() {return name;}
	public int getEnglishScore() {return englishScore;}
	public int getMathScore() {return mathScore;}
}
