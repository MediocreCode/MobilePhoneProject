
public class MobilePhone {
	String maker;
	String model;
	String price;
	String carrier;
	
	public MobilePhone(String maker,String model,String price,String carrier) {
		this.maker=maker;
		this.model=model;
		this.price=price;
		this.carrier=carrier;	
	}
	public String call(String phoneNum) {
	return "I am calling: "+phoneNum;
}
	public String text(String mes) {
		return "Sending: \""+mes+"\"";
	}
	public String toString() {
		String str = "Manufactuer: "+maker+"\nModel: "+model+"\nPrice: $"+price+"\nCarrier: "+carrier;
		return str;
	}
}