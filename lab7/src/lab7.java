import java.util.Scanner;


public class lab7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number (1~4) to select a question:");
		Scanner scan = new Scanner(System.in);
		questions q = new questions();
		int quest = scan.nextInt();
		switch(quest)
		{
		case 1: q.q1(); break;
		case 2: q.q2(); break;
		case 3: q.q3(); break;
		case 4: q.q4(); break;
		}
		
		scan.close();
	}

}