
public class Labrador extends Dog{
	
	private String color;
	private static int breedWeight = 50;
	
	public Labrador(String name, String color) {
		super(name);
		this.color = color;
	}
	
	//Big bark -- override speak method in Dog
	public String speak()
	{
		return "WOOF";
	}
	
	public int avgBreedWeight(){
		 return breedWeight;
	 }
}