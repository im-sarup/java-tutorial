package pkg.constructor;

class Sample
{
	Sample(int a){
		System.out.println(a);
	}	
}

class Demo extends Sample
{
	Demo(String msg){
		super(20);
		System.out.println(msg);
	}
	
}
public class ConstrucctorChaining
{
	public static void main(String[] args) {
		new Demo("Hello");
		
	}
}
