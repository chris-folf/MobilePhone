package phone;

public class cellPhone {
	// ALl of the attributes
	private String Manufacture;
	private String Model;
	private int Price;
	private String Carrier;
	
	// Constructor
	public cellPhone(String Maufacure, String Model, int Price, String Carrier) {
		this.Manufacture = Maufacure;
		this.Model = Model;
		this.Price = Price;
		this.Carrier = Carrier;
	}
	
	// Getter.
	public String getManufacture() {
		return Manufacture;
	}

	public String getModel() {
		return Model;
	}

	public int getPrice() {
		return Price;
	}

	public String getCarrier() {
		return Carrier;
	}
	
	//Return string methods
	
	// Return string with "I am calling" follower by phone number
	public String call(String phoneNumber) {
		return "I am calling " + phoneNumber;
	}
	
	//Return whatever is string is sent in
	public String text(String Text) {
		return Text;
	}
	
	//Return all the attributes nicely in a string
	public String toString() {
		return "Phone made by: " + Manufacture +
				"\nModel is: " + Model +
				"\nPrice is: $" + Price +
				"\nThe Carrier is: " + Carrier;
	}


}
