package pkg.constructor;

class ConstructorOverload {
	ConstructorOverload(char c, int b){
		System.out.println(c + " " + b);
		
	}
	ConstructorOverload(int a, String msg){
		this('s', 1);
		System.out.println(a + " " + msg);
		
	}
	ConstructorOverload(int x, int y){
		this(20, "Hello");
		System.out.println(x + " " + y);
		
	}
	
	public static void main(String[] args) {
		new ConstructorOverload(10, 20);
	}
}
