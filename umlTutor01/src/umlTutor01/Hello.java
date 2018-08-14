package umlTutor01;

public class Hello {
	
	private int a;
	private int b;
	
	public Hello() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hello(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		A a = new A();
		a.setA(10);
		
		
	}

}
