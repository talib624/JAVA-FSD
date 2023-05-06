package method;

public class Method {
	void myMethod() {
		System.out.println("This method is called using object!");
	}
	public static void myMethod1() {
		System.out.println("This method is called using class!");
	}
	public static void main(String args[]) {
		Method obj=new Method();
		obj.myMethod();
		Method.myMethod1();
		
		
	}

}
