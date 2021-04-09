package accessModifier;

class Example {
	
}

public class EvaluateModifiers {

	public static void publicMethod(){
		System.out.println("this is public method");

	}
	protected void protectedMethod() {
		System.out.println("this is protected method");
	}
	void defaultMethod() {
		System.out.println("this is default method");
	}
	
	private void privateMethod() {
		System.out.println("this is private method");
	}
	public static void main(String[] args) {
		publicMethod();
		EvaluateModifiers em = new EvaluateModifiers();
		em.privateMethod();
		
	}
}
