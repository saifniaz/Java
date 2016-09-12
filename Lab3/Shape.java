public abstract class Shape {
	protected String nameShape;
	
	public Shape(String nameShape){
		this.nameShape = nameShape;
	}
	
	
	public String getName(){
		return nameShape;
	}
		
	abstract public double getArea();
}