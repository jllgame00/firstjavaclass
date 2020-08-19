package class_object;

public class Boonger {
	String flour; // 밀가루의 양
	String ang; // 앙금 종류
	String how; // 얼마나 구울것인가?

	// Boonger 객체 기본형 , default 생성자는 다른의미이다.
	public Boonger(String B_flour, String B_ang, String B_how) {
		this.flour = B_flour; // 전역변수인 flour가 현재 Boonger객체의 변수와 같음을 명시.
		this.ang = B_ang; // this는 현재 클래스를 가리킴.
		this.how = B_how;
	}

	public static void main(String[] args) {
		Boonger boong1 = new Boonger("최대", "팥", "바싹");
		Boonger boong2 = new Boonger("적당히", "피자", "바싹");
		Boonger boong3 = new Boonger("최대", "민트초코", "설");

		System.out.println("밀가루 양을 " + boong1.flour + "로 " + boong1.ang + "앙금을 사용하여 " + boong1.how + "굽습니다.");
		System.out.println("밀가루 양을 " + boong2.flour + "로 " + boong2.ang + "앙금을 사용하여 " + boong2.how + "굽습니다.");
		System.out.println("밀가루 양을 " + boong3.flour + "로 " + boong3.ang + "앙금을 사용하여 " + boong3.how + "굽습니다.");
	}
}
