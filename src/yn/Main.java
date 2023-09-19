package yn;

public class Main {

	public static void main(String[] args) {
		MessageGenerator mg = new MessageGenerator();
		String msg = mg.getMessage();
		System.out.println("The message(s) is/are: " + msg);

	}

}
