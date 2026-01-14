package pkg.typeCasting;

//Super Class
class Sample1
{
	void disp() {
		System.out.println("I am Super Class Type.");
	}
}
//Sub Class
class Demo1 extends Sample1
{
	void disp123() {
		System.out.println("I am Sub Class Type.");
	}
}

public class DownCasting {
	public static void main(String[] args) {
		
		//Up Casting
		Sample1 s = new Demo1();
		
		//Down casting:  Converting Super class obj into sub class type
		Demo1 d = (Demo1) s;
		d.disp();
		d.disp123();
	}
}
