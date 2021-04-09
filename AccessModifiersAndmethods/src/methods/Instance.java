package methods;

public class Instance {



	public void instanceMethod() {
		System.out.println("this is instance Method");
	}

	public static void main(String[] args) {
		Instance x = new Instance();
		x.instanceMethod();

	}
}
