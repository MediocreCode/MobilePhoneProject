import java.util.Scanner;

public class Driver {
	static String maker;
	static String model;
	static String price;
	static String carrier;
	static String stop = "y";
	static String phoneNum;
	static String text;

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		while(stop.equals("y")||stop.equals("yes")) {
			System.out.println("Enter Manufacturer:");
			maker = myScan.nextLine();
			System.out.println("Enter Model:");
			model = myScan.nextLine();
			System.out.println("Enter Price:");
			price = myScan.nextLine();
			System.out.println("Enter Carrier:");
			carrier = myScan.nextLine();
			MobilePhone myPhone = new MobilePhone(maker,model,price,carrier);
			System.out.println(myPhone.toString());
			System.out.println("Enter Your Number: ");
			phoneNum = myScan.nextLine();
			System.out.println(myPhone.call(phoneNum));
			System.out.println("Type in Text Message: ");
			text = myScan.nextLine();
			System.out.println(myPhone.text(text));
			System.out.println("New phone? y/n?");
			stop = myScan.nextLine();

	}
	myScan.close();

}
}
