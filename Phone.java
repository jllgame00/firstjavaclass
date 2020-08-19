package class_object;

public class Phone {
	String func1 = "음성통화기능";	//초기값 정해주기
	String func2 = "영상통화기능";
	String func3;

	//다형성
	public Phone() {
	}
	public Phone(String function1, String function2, String function3) {
		this.func1 = function1;
		this.func2 = function2;
		this.func3 = function3;
	}
	public Phone(String functionA, String functionB) {
		this.func1 = functionA;
		this.func3 = functionB;
	}
	public static void main(String[] args) {
		new Phone();
		
		Phone ggujinPhone1 = new Phone("","","MP3");
		Phone ggujinPhone2 = new Phone("","DMB");
		Phone ggujinPhone3 = new Phone();
		Phone igunmonya = new Phone();
		
		System.out.println("꾸진폰1의 기능 : "+ ggujinPhone1.func1 + ", " + ggujinPhone1.func2 + ", "+ggujinPhone1.func3);
		System.out.println("꾸진폰2의 기능 : "+ ggujinPhone2.func1 + ", " + ggujinPhone2.func2 + ", "+ggujinPhone2.func3);
		System.out.println("꾸진폰3의 기능 : "+ ggujinPhone3.func1 + ", " + ggujinPhone3.func2);
		System.out.println("이거 폰맞냐? : "+ igunmonya.func1 + ", " +"면도기기능");
	}

}
