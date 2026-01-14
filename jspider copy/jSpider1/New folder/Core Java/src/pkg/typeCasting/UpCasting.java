package pkg.typeCasting;

//Super Class
class Sample
{
	void disp() {
		System.out.println("I am Super Class Type");
	}
}

//Sub Class
class Demo extends Sample
{
	void disp123() {
		System.out.println("I am Sub Class Type");
	}
}
public class UpCasting {
	public static void main(String[] args) {
//		Demo d = new Demo();
		Sample s = new Demo(); //Converting sub-class object into super class type
		s.disp();
//		s.disp123(); not get output
	}
}
