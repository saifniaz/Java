import java.util.Scanner;


public class questions {
	Scanner in = new Scanner(System.in);
	
	void q1()
	{	
		int[] num = new int[9];
		System.out.println("Please enter 9 numbers: ");
		for(int i = 0; i < 9; i++){
			num[i] = in.nextInt();
		}
		
		int[][] arr = new int[3][3];
		int t =0;
		
		for (int r = 0; r < 3; r++){
			  for (int c = 0; c < 3; c++) {
			    arr[r][c] = num[t];
			    t++;
			  }
		}
		for (int r1= 0; r1 < 3; r1++) {
			  for (int c1 = 0; c1 < 3; c1++) {
			    System.out.print(arr[r1][c1] + "\t");
			  }
			  System.out.println("\n");
			} 
		
		//Transpose arr Matrix here
		
		System.out.println("Transpose matrix is shown below:");
		
		int[][] transpose = new int[3][3];
		
		for(int r2 = 0; r2 < 3; r2++){
	        for(int c2 = 0; c2 < 3; c2++){
	            transpose[r2][c2] = arr[c2][r2];
	        }
	    }
		for (int r3= 0; r3 < 3; r3++) {
			  for (int c3 = 0; c3 < 3; c3++) {
			    System.out.print(transpose[r3][c3] + "\t");
			  }
			  System.out.println("\n");
			} 
		
	}
	
	void q2()
	{
		Person p1 = new Person("Tim", "Hortons", 23);
		Person p2 = new Person("Jean", "Hortons", 24);
		Person p3 = new Person("Tim", "Hortons", 23);
		
		System.out.println(p1.equals(p1));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));		
	}
	
	void q3()
	{
		//Dog dog = new Dog("Spike");
		Dog L_dog = new Labrador("Tim", "Yellow");
		Dog Y_dog = new Yorkshire("Joe");
		System.out.println(L_dog.getName() + " says " + L_dog.speak() + ", weight is: " + L_dog.avgBreedWeight());
		System.out.println(Y_dog.getName() + " says " + Y_dog.speak() + ", weight is: " + Y_dog.avgBreedWeight());
	}
	
	void q4()
	{
		//uncomment the following code block, complete it to finish its function
			
		Dog myDog;// Give a correct class to define myDog 
		String ans = "y";
		int choice;
		Scanner scan = new Scanner(System.in);
		while(ans.equalsIgnoreCase("y"))
		{
			System.out.println("Choose a Breed:\n1. Labrador\n2. Yorkshire");
			choice = scan.nextInt();
			
			if(choice == 1)
			{
				System.out.println("I am Labrador, give me a name and color: ");
				String name = scan.next();
				String color = scan.next();
				myDog = new Labrador(name, color); // Select a correct dog class to make a instance
				System.out.println("Your dog's name: " + myDog.name);
			}
			else
			{	
				System.out.println("I am Yorshire, give me a name: ");
				String name = scan.next();
				myDog =	new Yorkshire(name); // Select a correct dog class to make a instance 
				System.out.println("Your dog's name: " + myDog.name);
			}
			
			
			ans = "n";
 	}
			
	}
	
	void q5()
	{	
		double si, l,w;
		Shape[] s = new Shape[2];
		System.out.println("Enter the side of square:");
		si = in.nextDouble();
		
		s[0] = new Square(si);
		
		System.out.println("Enter the length of rectangle:");
		l = in.nextDouble();
		
		System.out.println("Enter the width of rectangle:");
		w = in.nextDouble();
		
		s[1] = new Rectangle(l, w);
		
		System.out.println("This is " + s[0].getName() + ", area is " + s[0].getArea());
		System.out.println("This is " + s[1].getName() + ", area is " + s[1].getArea());
				
		
	}
}