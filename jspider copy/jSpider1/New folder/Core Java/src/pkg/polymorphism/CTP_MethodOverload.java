package pkg.polymorphism;

public class CTP_MethodOverload {
	static void send(String text) {
		System.out.println(text);
	}
	
	static void send(int amt, String msg) {
		System.out.println("Amount:" + amt + " " + msg);
	}
	
	static void send(char ss, int sts) {
		System.out.println("Screenshot:" + ss + " Status: " + sts);
	}
	
	public static void main(String[] args) {
		send("Hii Sarup");
		send(2000, "Credited");
		send('S', 1);
	}
}
