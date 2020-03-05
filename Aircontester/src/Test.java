import com.rhocorp.Aircon;

public class Test {
	
	public static void main(String[] args) {
		Aircon ac1 = new Aircon(3.2,23,"sdfa");
		//ac1.Aircon(2.2, 12, "asdfuoi");
		System.out.println("Object : ac1");
		System.out.println("Aircon Brand: " + ac1.setBrand());
		System.out.println("Thermostat: " + ac1.setThermo());
		System.out.println("Capacity: " + ac1.setHP());
	}
}
