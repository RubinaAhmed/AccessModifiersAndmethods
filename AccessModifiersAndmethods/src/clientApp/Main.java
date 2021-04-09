package clientApp;

import accessModifier.EvaluateModifiers;

public class Main {

	public static void main(String[] args) {
		
		EvaluateModifiers em1 = new EvaluateModifiers();
	    em1.publicMethod();
	    //The private keyword is an access modifier used for attributes, methods and constructors, 
	    //making them only accessible within the declared class.
	     //private method can not be used anywhere else 
	    // cannot be accessed outside its own class
	
		

		// obj.defaultMethod(); cannot be accessed outside its own package
		// because it is a 'default' method.
	    //Default methods are also known as defender methods or virtual extension methods.

		// obj.protectedMethod(); cannot be accessed outside its own package due
		// to the fact that there is no parent/child relationship created through 'inheritance' 
		// it is used between the class 'Main' and the class 'EvaluateModifiers'.
		
		// The 'publicMethod' can be accessed from everywhere because its a "public"method. 

	}

}
