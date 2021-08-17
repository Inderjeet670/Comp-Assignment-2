/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/

package tracker.objects;

import java.util.*;

public class Person {
	
	private int identity;
	private String name;
	private double age;
	private Sex sex = Sex.UNKNOWN;
	private List<Address> addresses = new ArrayList<Address>();
	private Status status = Status.UNKNOWN;
	
	//constructors
	public Person() {
		//INSERT YOUR CODE
		/*default constructor to initialze the variables*/
		identity = 0;
		name = "";
		age = 0.0;

	}
	
	public Person( int identity, String name, double age, Sex sex, Status status, List<Address> addresses ) {
		//INSERT YOUR CODE
		/*parametrized constructor to set respective values of instance variables*/
		this.identity = identity;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.addresses = addresses;
		this.status = status;
	}
	
	
	//Implementations of accessor methods
	public String getName() {
		//INSERT YOUR CODE
		return this.name;//returns name
	}
	
	public double getAge() {
		//INSERT YOUR CODE
		return this.age;//returns age
	}
	
	public String getSex() {
		return sexToString();//returns sex
	}
	
	public String getStatus() {
		return statusToString();//returns status
	}
	
	public List<Address> getAddresses() {
		//INSERT YOUR CODE
		return this.addresses;//returns address or addresses
	}
	
	public int getIdentity() {
		//INSERT YOUR CODE
		return this.identity;//returns identity
	}
	
	public void setName( String name ) {
		//INSERT YOUR CODE
		this.name = name;//sets the value of name
	}
	
	public void setAge( double age ) {
		//INSERT YOUR CODE
		this.age = age;//sets the value of age
	}
	
	public void setSex( Sex sex ) {
		//INSERT YOUR CODE
		this.sex = sex;//sets sex
	}
	
	public void setStatus( Status status ) {
		//INSERT YOUR CODE
		this.status = status;//sets status
	}
	
	public void setAddresses( List<Address> addresses ) {
		//INSERT YOUR CODE
		this.addresses = addresses;//setst address or addresses
	}
	
	public void setIdentity( int identity ) {
		//INSERT YOUR CODE
		this.identity = identity;//sets identity
	}
	
	public enum Status { 
		POSITIVE, NEGATIVE, SYMPTOMATIC, ASYMPTOMATIC, UNKNOWN 
	}
	
	public enum Sex { 
		MALE, FEMALE, UNKNOWN 
	}
	
	private String sexToString() {
		
		switch( sex ) {
			case MALE : return "MALE";
			case FEMALE : return "FEMALE";
			default : return "UNKNOWN";
		}
	}
	
	private String statusToString() {
		
		switch( status ) {
			case POSITIVE : return "POSITIVE";
			case NEGATIVE : return "NEGATIVE";
			case SYMPTOMATIC : return "SYMPTOMATIC";
			case ASYMPTOMATIC : return "ASYMPTOMATIC";
			default : return "UNKNOWN";
		}
	}

	
	public boolean equals( Person person ) {
		
		//INSERT YOUR CODE
		if(person == null){//if object is null false is returned
			return false;
		}
		else{//if object is not null, then the values of the current object are compared to the values of the input object and the result which could be true or false is returned.
			return this.getName().equals(person.getName()) && this.getAge() == person.getAge() && this.getSex() == person.getSex() &&this.addresses.equals(person.getAddresses()) && this.getStatus() == person.getStatus();

		}
	}
	
	public String toString() {
		
		//INSERT YOUR CODE

		/*default string method. \n is used to create a new line*/

		return "\nFull Name: " +this.getName() +"\nAge: " + this.getName()
				+ "\nSex: " +this.getSex() + "\nCovid-19 Status: " + this.getStatus()
				+ "\nContact Address(es): " + "\n" + this.addresses.get(0) + "\n" + this.addresses.get(1);
	}
}