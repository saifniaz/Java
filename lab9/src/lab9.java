import java.util.Scanner;


public class lab9 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Please enter a number (1~2) to select a question:");
		
		Scanner scan = new Scanner(System.in);
		questions q = new questions();
		int quest = scan.nextInt();
		switch(quest)
		{
		case 1: q.q1(); break;
		case 2: q.q2(); break;
		}
	}

}