package methods;

public class Mixed {
 

	public void instanceMethod() {
		System.out.println("this is instance Method");
		staticWithinInstance();
	}

	public static void staticMethod()  {
		System.out.println("this is static Method");
		Mixed m = new Mixed();
		m.instanceWithinStatic(); //m is the new instanceWithinStatic.
		
}
	public static void staticWithinInstance() {
		System.out.println("this is a static method within the instance method");
		
	}
	public void instanceWithinStatic() {
		System.out.println("this is a instance within the static method");
	}
	
	public static void main(String[] args) {
		staticMethod();
		Mixed m1 = new Mixed();
		m1.instanceMethod();//m1 is the reference variable.
	}
}