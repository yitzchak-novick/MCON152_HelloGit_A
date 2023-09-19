package yn;

public class MessageGenerator {
	public String getMessage() {
		return "Once upon a time";
	}
	
	public void foo() {
		String msg = "foo";
		int x = 12;
		for (int i = 0; i < x; i++)
			msg += "*";
		System.out.println(msg);
	}
	
	public void bar() {
		String msg = "BAR";
		System.out.println(msg);
	}
	

}
