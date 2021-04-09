package accessModifier;

public class GetterAndSetter {

	public static void main(String[] args) {
		//getter and setter allows the private "variable" to be used in a different class.
		
		GetAndSet obj = new GetAndSet();
		obj.setName("rubina");
		System.out.println(obj.getName());	
	}
}
class GetAndSet {

	private String name;

	public void setName(String x) {

		name = x;
	}

	public String getName() {

		return name;
	} 
	
}