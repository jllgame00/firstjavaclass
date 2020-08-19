package class_object;

public class Robot {
	String lArm; // 왼쪽팔
	String rArm; // 오른쪽팔
	String lLeg; // 왼다리
	String rLeg; // 오른다리
	String behav; // 행동

	public Robot() { // default 생성자 (= 기본생성자)
		System.out.println("로봇 가동.");
	}

	public Robot(String leftArm, String rightArm, String leftLeg, String rightLeg, String whattodo) {
		this.lArm = leftArm;
		this.rArm = rightArm;
		this.lLeg = leftLeg;
		this.rLeg = rightLeg;
		this.behav = whattodo;
	}

	public static void main(String[] args) {

		Robot B_boy = new Robot("가슴쪽으로 당기다.", " 가슴쪽으로 당기다.", "45도 각도로 벌리다.", "45도 각도로 벌리다.", "뱅글뱅글 돌다.");
		Robot Sweeper = new Robot("장착된 걸레와 연결된 모터를 돌리다.", "(바퀴모터 30바퀴)이동시마다 스프레이로 물을 뿌리다.", "바퀴모터 10바퀴", "바퀴모터 10바퀴", "바닥을 닦다.");
		Robot Boong_boy = new Robot("팬 뚜겅을 덮다.", "팬을 (일정시간)마다 돌리다.", " 반죽통에 있는 반죽을 팬에 옮기다.", "앙금을 골라서 주문에 맞게 집어넣다.",	"붕어빵을 굽다.");

		// Robot클래스의 B_boy객체
		System.out.print("비보이");
		new Robot(); // default 생성자 호출(기본생성자 호출), Robot(); 일반 함수 호출처럼 new를 붙이지 않으면 객체 생성이 되지 않아 오류가 난다
		System.out.println("왼팔 상태 : " + B_boy.lArm);
		System.out.println("오른팔 상태 : " + B_boy.rArm);
		System.out.println("왼다리 상태 : " + B_boy.lLeg);
		System.out.println("오른다리 상태 : " + B_boy.rLeg);
		System.out.println("행동 : " + B_boy.behav);
		
		System.out.println("--------------------------------------------------");
		
		// Robot클래스의 Sweeper객체
		System.out.print("청소");
		new Robot();
		System.out.println("왼팔 상태 : " + Sweeper.lArm);
		System.out.println("오른팔 상태 : " + Sweeper.rArm);
		System.out.println("왼다리 상태 : " + Sweeper.lLeg);
		System.out.println("오른다리 상태 : " + Sweeper.rLeg);
		System.out.println("행동 : " + Sweeper.behav);
		
		System.out.println("--------------------------------------------------");
		
		//Robot클래스의 Boong_boy 객체
		System.out.print("붕어빵");
		new Robot();
		System.out.println("왼팔 상태 : " + Boong_boy.lArm);
		System.out.println("오른팔 상태 : " + Boong_boy.rArm);
		System.out.println("왼다리 상태 : " + Boong_boy.lLeg);
		System.out.println("오른다리 상태 : " + Boong_boy.rLeg);
		System.out.println("행동 : " + Boong_boy.behav);
	}
}
