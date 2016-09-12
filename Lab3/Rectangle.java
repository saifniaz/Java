public class Rectangle extends Shape{
	private double length, width, area;
	
	public Rectangle(double width, double length){
		super("Rectangle");
		if(length > 0 && width > 0){
			this.length = length;
			this.width = width;
		}
	}
	public double getArea(){
			
		area = (length)*(width) ;
		return area;
	}
	
	
	
	
}