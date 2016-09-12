import java.util.Scanner;

public class Lab2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter question number: ");
		question q = new question();
		Scanner scan = new Scanner(System.in);
		
		int opt = scan.nextInt();
		switch(opt) {
		case 0:
			q.q0();
			break;
		case 1:
			q.q1();
			break;
		case 2:
			q.q2();
			break;
		case 3:
			q.q3();
			break;
		case 4:
			q.q4();
			break;
		case 5:
			q.q5();
			break;	
		}
		scan.close();
	}

}
