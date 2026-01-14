package pkg.method;

public class MethodOverload_Whatsapp 
{
	static void send(String text) {
		System.out.println(text);
	}
	static void send(int amount, String msg) {
		System.out.println(amount + "," + msg);
	}
	static void send(char ss, int status) {
		System.out.println("Screenshot:" + ss + "," + "Confirmation: " + status);
	}
	
	public static void main(String[] args) {
		send("Hii Sarup");
		send(20000, "Credited");
		send('S', 1);
	}
}
