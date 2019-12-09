package misc;


@interface Enhancement{
	String SC();
	String Feature();
}
public class TestAnnotation {

	public static void main(String[] args) {
		enhancement1();

	}
	
	@Enhancement(SC = "bbt-230", Feature = "12345")
	public static void enhancement1() {
		System.out.println("Enhancement 1");
	}

}
