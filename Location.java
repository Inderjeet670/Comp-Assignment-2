/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/

package tracker.objects;

public class Location {
	
	double longitude, latitude;
	
	public Location() {
		//INSERT YOUR CODE
		/*sets the default values of longitude and latitude to 0 and initializes the variables*/
		longitude = 0.0;
		latitude = 0.0;
	}
	
	
	public Location( double longitude, double latitude ) {
		//INSERT YOUR CODE
		/*parametrized constructor used to set values of latitude and longitude*/
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public double getLongitude() {
		//INSERT YOUR CODE
		//returns longitude
		return longitude;
	}


	public double getLatitude() {
		//INSERT YOUR CODE
		//returns latitude
		return latitude;
	}
	
	public void setLongitude( double longitude ) {
		//INSERT YOUR CODE
		//used to set the value or change the value of longitude
		this.longitude = longitude;
	}
	
	public void setLatitude( double latitude ) {
		//INSERT YOUR CODE
		//used to set the value or change the value of latitude
		this.latitude = latitude;
	}
	
	public boolean equals( Location other ) {
		
		//INSERT YOUR CODE
		if(other == null){
			return false;//returns false if parameter is null
		}
		else{
			//if object isn't null, the it is compared to the current object and returns true or false.
			return longitude == other.getLongitude() && latitude == other.getLatitude();// returns true or false according to the return statement after making comparisons
		}
	}
	
	public String toString() {
		//INSERT YOUR CODE
		//the default string method
		return "Located at: [longitude: " + longitude + ", latitude: "+ latitude+']' ;//defauilt "to string" method that is returned when we simply try to print a class
	}
}