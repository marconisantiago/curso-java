package entities;

public class Rectangule {
	
	public double width;
	public double heigth;
	
	public double area() {
		return width * heigth;
	}
	public double perimeter () {
		return  (width  * 2.00 + heigth *2.00);
	}
	public double diagonal() {
		 return Math.sqrt((Math.pow(width, 2)) + (Math.pow(heigth, 2)));
	}
	



}
