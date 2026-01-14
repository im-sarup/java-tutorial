package pkg.encapsulation;

class Bank
{
	private int atm_pin = 12345;
	int get_atmPin(){
		return atm_pin;
	}
	
	void set_atmPin(int atm_pin){
		this.atm_pin = atm_pin;
	}
	
}
public class Atm_User {
	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println(b.get_atmPin());
		
		b.set_atmPin(54321);
		System.out.println(b.get_atmPin());
	}
}
