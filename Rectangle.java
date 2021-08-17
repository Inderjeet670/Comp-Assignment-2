/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/

package tracker.shapes;

import tracker.objects.*;

public class Rectangle extends Shape {
	
	//instance variable
	private double length, width;
	
	public Rectangle() {
		//INSERT YOUR CODE HERE
		/*initializes the variables*/
		length =0.0;
		width = 0.0;
	} 
	
	public Rectangle( double length, double width, Location centrePoint ) {
		//INSERT YOUR CODE HERE
		/*sets the values of instance variables according to the constructor parameter inputs*/
		this.length = length;
		this.width = width;
		this.setCentrePoint(centrePoint);
	}

	
	public void setLength( double length ) {
		//INSERT YOUR CODE HERE
		/*sets length of this.length*/
		this.length = length;

	}
	
	public void setWidth( double width ) {
		//INSERT YOUR CODE HERE
		/*sets length of this.width*/
		this.width = width;
	}
	
	public double getLength() {
		//INSERT YOUR CODE HERE
		return this.length;//returns length
	}
	
	public double getWidth() {
		//INSERT YOUR CODE HERE
		return this.width;//returns width
	}
	
	public double area() {
		//INSERT YOUR CODE HERE
		double ArrRect = this.length * this.width;//calculates area of teh rectangle
		return Math.round(ArrRect * 100)/100.0;//returns area of rectangle
	}
	
	public double perimeter() {
		//INSERT YOUR CODE HERE
		double peri = 2 * (length + width);//calculates perimeter
		return Math.round(peri * 100)/ 100.0;//returns perimeter
	}
	
	public Rectangle boundingRectangle() {
		//INSERT YOUR CODE HERE
		Rectangle itself = new Rectangle();//new rectangle object
		itself.setLength(this.length);//sets length of the rectangle
		itself.setWidth(this.width);//sets width of the rectangle
		itself.setCentrePoint(this.getCentrePoint());//sets the centre point of this rectangle same as the parameterized constructor input
		return itself;//now we have fully made rectangle object and its returned
	}
	
	public boolean equals( Rectangle other ) {
		//INSERT YOUR CODE HERE
		if(other == null){
			return false;//if object is null then false is returned
		}
		else{
			/*input rectangle is compared to the current rectangle and the final value is returned, which is either true or false*/
			return this.getWidth() == other.getWidth() && this.getLength() == other.getLength();
		}

	}
	
	public String toString() {
		//INSERT YOUR CODE HERE
		/*the default string method*/
		return "Rectangle: [length: " + this.length + ", width: " + this.width + ",Located at: [longitude: " + getCentrePoint().getLongitude() + ", latitude: "  + getCentrePoint().getLatitude() + "]]";
	}
}