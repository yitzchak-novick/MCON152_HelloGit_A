package yn;

public class MessageGenerator {
	public String getMessage() {
		return "Once upon a time";
	}
	
	public void foo() {
		System.out.println("foo");
	}
	
	public void bar() {
		String msg = "bar";
		for(int i = 0; i < 5; i++)
			System.out.println(msg);
	}
}
