import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class questions {
	void q1() 
	{
		System.out.println("Please input (0~2) to select sort reference. ");
		System.out.println("0-----First Name");
		System.out.println("1-----Last Name");
		System.out.println("2-----Grade");
		Scanner input = new Scanner(System.in);
		int ref = input.nextInt();
		//-------------Read Data from sorting.dat and sorting-------------//
		//----------------------------------------------------------------//
		//Open
		Scanner read = null;
		try{
			read = new Scanner(new File("sorting.dat"));
		}catch(FileNotFoundException e){
			System.out.println("File not Found");
		}
		//Read
		ArrayList<Student> a1 = new ArrayList<Student>();
		int i = 0;
		while(read.hasNext()){
			String a = read.next();
			String b = read.next();
			double c = read.nextDouble();
			System.out.println(a + " " + b + " " + c);
			Student d = new Student(a,b,c);
			a1.add(i, d);
		}
		
		iSort(a1, ref);
		PrintList(a1);
		//Close
		input.close();
		read.close();
	}
	
	void q2()
	{
		System.out.println("Please input (0~2) to select sort reference. ");
		System.out.println("0-----First Name");
		System.out.println("1-----Last Name");
		System.out.println("2-----Grade");
		Scanner input = new Scanner(System.in);
		int ref = input.nextInt();
		//-------------Read Data from sorting.dat and sorting-------------//
		//----------------------------------------------------------------//
		//Open
		Scanner read = null;
		try{
			read = new Scanner(new File("sorting.dat"));
		}catch(FileNotFoundException e){
			System.out.println("File not Found");
		}
		//Read
		ArrayList<Student> A1 = new ArrayList<Student>();
		int i = 0;
		while(read.hasNext()){
			String a = read.next();
			String b = read.next();
			double c = read.nextDouble();
			//System.out.println(a + " " + b + " " + c);
			Student d = new Student(a,b,c);
			A1.add(i, d);
		}
		
		PrintList(A1);
		PrintList(oSort(A1, ref));
		System.out.println("=========After Sorting, the original array is =========");
		//Print Original 
		PrintList(A1);
		//Close
		input.close();
		read.close();
	
	
	}
	
	//Bubble Sorting
	void iSort(ArrayList<Student> inArray, int sortRef)
	{	
		System.out.println("=========After Sorting=========");	
		int i, j, comp;
		int n = inArray.size();
		Student temp;
		for(i = 0; i < n-1; i++){
			for(j = 0; j <(n-1-i); j++){
				if(sortRef == 0){
					comp = inArray.get(j).compareFirstName(inArray.get(j+1).firstName);
					if(comp > 0){
						temp = inArray.get(j);
						inArray.set(j, inArray.get(j+1));
						inArray.set(j+1, temp);
					}
				}else if(sortRef == 1){
					comp = inArray.get(j).compareSecondName(inArray.get(j+1).secondName);
					if(comp > 0){
						temp = inArray.get(j);
						inArray.set(j, inArray.get(j+1));
						inArray.set(j+1, temp);
					}
				}else{
					comp = inArray.get(j).compareGrade(inArray.get(j+1).grade);
					if(comp > 0){
						temp = inArray.get(j);
						inArray.set(j, inArray.get(j+1));
						inArray.set(j+1, temp);
				
					}	
				}
			}
		}
	}
	
	//--------out of place sorting--------------
	ArrayList<Student> oSort(ArrayList<Student> inArray, int sortRef)
	{
		ArrayList<Student> inArray1 = new ArrayList<Student>();
		for(int a = 0; a < inArray.size(); a++){
			inArray1.add(inArray.get(a));
		}
		System.out.println("=========After Sorting=========");
		int i, j, comp;
		int n = inArray1.size();
		Student temp;
		for(i = 0; i < n-1; i++){
			for(j = 0; j <(n-1-i); j++){
				if(sortRef == 0){
					comp = inArray1.get(j).compareFirstName(inArray1.get(j+1).firstName);
					if(comp > 0){
						temp = inArray1.get(j);
						inArray1.set(j, inArray1.get(j+1));
						inArray1.set(j+1, temp);
					}
				}else if(sortRef == 1){
					comp = inArray1.get(j).compareSecondName(inArray1.get(j+1).secondName);
					if(comp > 0){
						temp = inArray1.get(j);
						inArray1.set(j, inArray1.get(j+1));
						inArray1.set(j+1, temp);
					}
				}else{
					comp = inArray1.get(j).compareGrade(inArray1.get(j+1).grade);
					if(comp > 0){
						temp = inArray1.get(j);
						inArray1.set(j, inArray1.get(j+1));
						inArray1.set(j+1, temp);
				
					}	
				}
			}
		}
		return inArray1;
	}
	
	
	//----------An auxiliary method used to print array content
	void PrintList(ArrayList<Student> s)
	{
		for(int i=0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
		}			
	}
}