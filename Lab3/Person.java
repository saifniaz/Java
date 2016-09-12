public class Person {
	   private String firstName;
	   private String lastName;
	   private int age;

	   public Person (String newFirstName, String newLastName, int newAge)
	   {
	      firstName = newFirstName;
	      lastName = newLastName;
	      age = newAge;
	   }
	   
	   public String getFirstName() 
	   {
	       return firstName;
	   }
	   
	   public String getLastName() 
	   {
	       return lastName;
	   }
	   
	   public int getAge() 
	   {
	       return age;
	   }
	   
	   //Override equals function here
	   public boolean equals(Person p){
		   boolean index = false;
		   if ((p.firstName == this.firstName) && (p.lastName == this.lastName) && (p.age == this.age)){
			   index = true;
		   }
		    return index;
	   }
	   
	   
	   
}