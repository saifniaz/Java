public class Yorkshire extends Dog{
	
	private static int breedWeight = 20;
	public Yorkshire(String name)
	{
		super(name);
	}
	
	//Small bark -- override speak method in Dog
	public String speak()
	{
		return "woof";
	}
	 public int avgBreedWeight(){
		 return breedWeight;
	 }
}