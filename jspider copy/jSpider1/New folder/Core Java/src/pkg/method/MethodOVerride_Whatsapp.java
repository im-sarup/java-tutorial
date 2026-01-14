package pkg.method;

//Super Class
class WhatsappV1
{
	void send() {
		System.out.println("Features on v1: Test, Emogi, Image, Video, Documents, Contact");
	}
}

//Sub class
class WhatsappV2 extends WhatsappV1
{
	void send() {
		System.out.println("Features on v2: Test, Emogi, Image, Video, Documents, Contact, location, payment");
	}
}

public class MethodOVerride_Whatsapp 
{
	public static void main(String[] args)
	{
		WhatsappV2 w = new WhatsappV2();
		w.send();
	}
}
