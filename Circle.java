/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/

package tracker.shapes;


import tracker.objects.*;
import tracker.shapes.Rectangle;


public class Circle extends Shape {
	
	private double radius;
	private static final double PI = 3.142; 
	
	public Circle() {
	
		//INSERT YOUR CODE
		this.radius = 0;//initializes radius
	} 
	
	public Circle( double radius, Location centrePoint ) {
		
		//INSERT YOUR CODE
		this.radius = radius;//sets radius equal to the parameter
		this.setCentrePoint(centrePoint);//sets the centrepoint according to the parameter
	}
	
	public void setRadius( double radius ) {
		
		//INSERT YOUR CODE
		this.radius = radius;//sets radius
	}

	public double getRadius() {
		
		//INSERT YOUR CODE
		return this.radius;//returns radius
	}
	
	public double area() {
		
		//INSERT YOUR CODE
		/*calculates and returns the area of the circle*/
		double ar = PI * radius * radius;
		return Math.round(ar * 100)/100.0;
	}
	
	public double perimeter() {
		
		//INSERT YOUR CODE
		/*calculates and returns the area of the perimeter*/
		double per = (2 * PI * radius);
		return Math.round(per * 100)/100.0;
	}
	
	public Rectangle boundingRectangle() {
		
		//INSERT YOUR CODE
		Rectangle dimensions = new Rectangle();//a  new Rectangle object
		dimensions.setWidth(2* radius);//sets the width
		dimensions.setLength(2 * radius);//sets the length
		return dimensions;
	}
	
	public boolean equals( Circle other ) {
		
		//INSERT YOUR CODE
		if(other == null){
			return  false;//if object is null, false is returned
		}
		else{
			/*if its not null, then parameter object is compared with the current objec and it returns either true or false*/
			return other.radius == this.radius && other.perimeter() == this.perimeter() && other.area() == this.area();
		}
	}
	
	public String toString() {
		//INSERT YOUR CODE
		/*default string method*/
		double latitude = getCentrePoint().getLatitude();//latitude value
		double longitude = getCentrePoint().getLongitude();//logitude value
		return "Circle: [radius: " + this.radius +", Located at: [longitude: "+ longitude+", latitude: "+latitude+"]]";
	}
}