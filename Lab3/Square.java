public class Square extends Shape{
	private double side;
	
	public Square(double slide){
		super("Square");
		if(slide > 0){
			this.side = slide;
		}
	}
	
	public double getArea(){
		double area = side*side;
		return area;
	}
	
	
	
	
}
