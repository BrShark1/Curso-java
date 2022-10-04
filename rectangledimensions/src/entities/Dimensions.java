package entities;

public class Dimensions {
	
	public double width;
	public double height;
	
		
	public double area(double area) {
		return area = width * height;
		
	}
	public double perimeter(double perimeter) {
		return perimeter = 2 * (width + height);
		
	}
	public double diagonal(double diagonal) {
		return diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
