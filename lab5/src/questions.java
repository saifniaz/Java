import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class questions {
	
	void q1()
	{
		int[] counts = new int[26];
		Scanner scan = new Scanner(System.in);
		
		//get word from user
		System.out.print("Enter a single word(letters only, please)");
		String word = scan.nextLine();
		
		//convert to all upper case
		word = word.toUpperCase();
		
		try{
			//count frequency of each letter in string
			for(int i=0; i < word.length(); i++)
			{
				counts[word.charAt(i) - 'A']++;
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Not a letter");
		}
		
		//print frequencies
		System.out.println();
		for(int i=0; i < counts.length; i++)
		{
			if(counts[i] != 0)
			{
				System.out.println((char)(i+'A')+":" + counts[i]);
			}
		}
		scan.close();
}

	void q2()
	{
		int creditHrs;  // number of semester hours earned
		double qualityPts; // number of quality points earned
		double gpa; // grade point (quality point) average
		
		String line, name, inputName = "students.txt";
		String outputName = "warning.txt";
		
		// Please uncomment the this code block 
		try
		{
			//Set up scanner to input file
			Scanner x = new Scanner(new File(inputName));
			
			//Set up output file stream
			PrintWriter outfile = new PrintWriter(outputName);
			
			
			//Print a header to the output file
			outfile.println();
			outfile.println("Student on Academic Warning");
			outfile.println();

			//Process the input file, one token at a time
			while(x.hasNext())
			{
				// Get the credit hours and quality points and
				 name = x.next();
				 creditHrs = Integer.parseInt(x.next());
				 qualityPts = Double.parseDouble(x.next());
	            // determine if the student is on warning. If so,
				 gpa = qualityPts/creditHrs;
	            // write the student data to the output file.
				 if(gpa < 2){
					 outfile.println(name + "\t" + creditHrs + "\t" + gpa);
				 }
			}
			
			outfile.close();
			
			
		}
		catch(FileNotFoundException e){
			System.out.println("File out Found");
		}catch(NumberFormatException e1){
			System.out.println("Numbers were cant be parsed properly");
		}catch(IOException e2){
			System.out.println("Problem with input and outputing file");
		}
		
		x.close()
		
	}
	
	void q3()
	{
		//-------Please uncomment this block-------------
		Node node0 = new Node(0, "value0");
		Node node1 = new Node(1, "value1");
		Node node2 = new Node(2, "value2");
		Node node3 = new Node(3, "value3");
		Node node4 = new Node(4, "value4");
		Node node5 = new Node(5, "value5");
		Node node6 = new Node(6, "value6");
		
		//System.out.println(node0.value + " " + node6.value);
		
		DoubleLinkedList dll = new DoubleLinkedList(node0);
		dll.insert(node1, 1);
		dll.insert(node2, 2);
		dll.insert(node3, 3);
		dll.insert(node4, 4);
		dll.insert(node5, 5);
		dll.insert(node6, 6);
		
		//System.out.println(dll.isEmpty());
		
		
		
		DoubleLinkedListIterator it = new DoubleLinkedListIterator(dll);
		while(it.hasNext())
		{
			System.out.println(it.getTuple());
		}
		
		//-------------Delete a element from linklist
		dll.remove(node3);
		
		
	}
}