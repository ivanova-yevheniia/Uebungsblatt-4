
public class Location {
	String street;
	String houseNumber;
	int flat;
	int postalCode;
	
	void setAdress(String newStreet,String newHouseNumber,
			int newFlat, int newPostalCode) {
		this.street = newStreet;
		this.houseNumber = newHouseNumber;
		this.flat = newFlat;
		this.postalCode = newPostalCode;
	}
	
	String getStreet() {
		return street;
	}
	String getHouseNumber() {
		return houseNumber;
	}
	int getFlat() {
		return flat;
	}
	int gerPostalCode() {
		return postalCode;
	}
}
