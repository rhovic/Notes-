
public class Testing {
	
	public static void main(String[] args) {
		
		//1st Computer
		Computert wat = new Computert();
		wat.harddiskSize = "1 TERRABYTE";
		wat.screenSize = 21.00;
		wat.screenResolution = "3840 x 2160";
		wat.addTwoNums(5, 10);
		wat.displayTwoNums(1, 4);
		System.out.println("1st Computer");
		System.out.println("Resolution: " + wat.screenResolution);
		
		//2nd Computer
		Computert wat2 = new Computert();
		wat.screenResolution = "1920 x 1080";
		System.out.println("\n2nd Computer");
		System.out.println("Resolution: " + wat.screenResolution + "\n NANAY MO");
	}
}
