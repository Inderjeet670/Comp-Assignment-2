/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/

package tracker.objects;

public class Address {
	
	private int unit, streetNumber;
	private String streetName, postalCode, city, province;
	public enum Type { BUSINESS, OFFICE, HOME }
	Type type;
	
	//Constructors
	public Address() {
		//INSERT YOUR CODE HERE
		/*default constructor to initialize the values*/
		unit = 0;
		streetNumber = 0;
		streetName = " ";
		city = "";
		province = "";
		type = Type.HOME;
	}
	
	public Address( int streeNumber, String streetName, String postalCode, String city, String province, Type type ) {
		//INSERT YOUR CODE HERE
		/*parametrized constructor sets the values of the instance variables accordingly*/
		unit = 0;
		this.streetNumber = streeNumber;
		this.streetName = streetName;
		this.postalCode = postalCode;
		this.city = city;
		this.province = province;
		this.type = type;
	}
	
	public Address( int unit, int streeNumber, String streetName, String postalCode, String city, String province, Type type ) {
		//INSERT YOUR CODE HERE
		/*parametrized constructor sets the values of the instance variables accordingly*/
		this.unit = unit;
		this.streetNumber = streeNumber;
		this.streetName = streetName;
		this.postalCode = postalCode;
		this.city = city;
		this.province = province;
		this.type = type;
	}
	
	//Accessor methods
	public int getStreetNumber() {
		//INSERT YOUR CODE HERE
		return streetNumber;//returns street number
	}
	
	public int getUnit() {
		
		//INSERT YOUR CODE HERE
		return unit;//returns unit
	}
	
	public String getType() {
		return typeToString();//returns type
	}
	
	public String getStreetName() {
		//INSERT YOUR CODE HERE
		return streetName;//returns street name
	}
	
	public String getPostalCode() {
		//INSERT YOUR CODE HERE
		return postalCode;//returns postal code
	}
	
	public String getCity() {
		//INSERT YOUR CODE HERE
		return city;//returns city
	}
	
	public String getProvince() {
		//INSERT YOUR CODE HERE
		return province;//returns province
	}
	
	public void setStreetNumber( int number ) {
		//INSERT YOUR CODE HERE
		this.streetNumber = number;//sets street number
	}
	
	public void setUnit( int unit ) {
		//INSERT YOUR CODE HERE
		this.unit = unit;//sets  unit number
	}
	
	public void setStreetName( String name ) {
		//INSERT YOUR CODE HERE
		this.streetName = name;//sets streetname
	}
	
	public void setPostalCode( String code ) {
		//INSERT YOUR CODE HERE
		this.postalCode = code;//sets postal code
	}
	
	public void setCity( String city ) {
		//INSERT YOUR CODE HERE
		this.city = city;//sets city
	}
	
	public void setProvince( String province ) {
		//INSERT YOUR CODE HERE
		this.province = province;//sets province
	}
	
	public void setType( Type type ) {
		//INSERT YOUR CODE HERE
		this.type = type;//sets type
	}
	
	private static String formatProvince( String provinceOrFederal ) {
			
		provinceOrFederal = provinceOrFederal.toLowerCase();
		if( provinceOrFederal.equals( "ontario" ) || provinceOrFederal.equals( "on" ) ) {
			return "ON";
		} else if( provinceOrFederal.equals( "Manitoba" ) || provinceOrFederal.equals( "mb" ) ) {
			return "MB";
		} else if( provinceOrFederal.equals( "british columbia" ) || provinceOrFederal.equals( "bc" ) ) {
			return "BC";
		} else if( provinceOrFederal.equals( "new brunswick" ) || provinceOrFederal.equals( "nb" ) ) {
			return "NB";
		} else if( provinceOrFederal.equals( "alberta" ) || provinceOrFederal.equals( "ab" ) ) {
			return "AB";
		} else if( provinceOrFederal.equals( "saskatchewan" ) || provinceOrFederal.equals( "sk" ) ) {
			return "SK";
		} else if( provinceOrFederal.equals( "nova scotia" ) || provinceOrFederal.equals( "ns" ) ) {
			return "NS";
		} else if( provinceOrFederal.equals( "quebec" ) || provinceOrFederal.equals( "qc" ) ) {
			return "QC";
		} else {
			return "federal";
		}
	}
	
	private String typeToString() {

		switch( type ) {
			case BUSINESS : return "BUSINESS";
			case OFFICE : return "OFFICE";
			case HOME : return "HOME";
			default : return "";
		}
	}
	
	public boolean equals( Address address ) {
		//INSERT YOUR CODE HERE
		if(address == null){//if object is null, false is returned
			return false;
		}
		else{
			/*if object is not null, then respective instance variables of current object are compared to the respective instance variable values of the input object*/
			return this.getType() == address.getType() && this.getUnit() == address.getUnit() && this.getStreetNumber() == address.getStreetNumber() && this.getCity() == address.getCity() && formatProvince(this.getProvince()) == formatProvince(address.getProvince()) && this.getPostalCode() == address.getPostalCode() && this.getStreetName() == address.getStreetName();
		}
	}
	
	public String toString() {
		//INSERT YOUR CODE HERE
		/*default string method*/
		if(this.getUnit() == 0){//in case there's no unit number this is executed
			return this.getType()+": " + this.getStreetNumber() + ", " + this.getStreetName() + ", " + this.getCity() + ", " + formatProvince(this.getProvince()) + " " + this.getPostalCode();
		}
		else{//else this is executed.
			return this.getType()+": " + this.getUnit() + "-" + this.getStreetNumber() + ", " + this.getStreetName() + ", " + this.getCity() + ", " + formatProvince(this.getProvince())+ " " + this.getPostalCode();

		}
	}
}