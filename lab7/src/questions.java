import java.util.Scanner;


public class questions {
	
	void q1()
	{
	
		System.out.println("Please enter a digital: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(input <= 0)
			System.out.println("Please enter a positive integer:");
		else
		{		
			int result = this.numDigits(input);
			System.out.print("Such input has ");
			System.out.println(result + " digitals");
			System.out.print("The sum is:");
			int sum = this.sumDigits(input);
			System.out.println(sum);
		}
		scan.close();
	}
	
	void q2()
	{
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		temp = scan.nextInt();
		int sum = this.sumDigits(temp);
		int deno = temp%10;
		if((sum%deno) == 0){
			System.out.println("ok");
		}else{
			System.out.println("error");
		}
		scan.close();
	}
	
	void q3()
	{
	
		System.out.println("Please enter a number and a base:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int base = scan.nextInt();
		String cvtNumber = convert(number, base);
		System.out.println("Result is: " + cvtNumber);
		scan.close();
	}
	
	void q4()
	{
	
		System.out.println("Please enter two numbers for m and n: ");
		Scanner scan = new Scanner(System.in);
		
		int m, n;
		m = scan.nextInt();
		n = scan.nextInt();
		System.out.println("Acker(" + m + ", " + n + ")=" + Acker(m, n));
		scan.close();
	}
   // -----------------------------------------------------------
   //  Recursively counts the digits in a positive integer 
   // -----------------------------------------------------------
	public int numDigits(int num)
	{
		if(num < 10)
			return 1;
		else
			return (1 + numDigits(num/10));
	}
	
	// -----------------------------------------------------------
	//  Recursively sum the digits in a positive integer 
	// -----------------------------------------------------------
	public int sumDigits(int num)
	{
		if(num < 10){
			return num;
		}else{
			return ( num%10 + sumDigits(num/10));
		}
	}
	
	// ----------------------------------------------------------
	// Recursively do base conversion
	// ----------------------------------------------------------
	public String convert(int number, int base)
	{
		String remainder = "";
		int quotient = number/base;
		//System.out.println(quotient);
		if((quotient) == 0){
			return remainder += (number%base);
		}else{
			return remainder += convert((quotient), base) + (number%base);
		}
	}
	
	// ----------------------------------------------------------
	// Recursively do base conversion
	// ----------------------------------------------------------
	public int Acker(int m, int n)
	{
		if(m == 0){
			return n+1;
		}else if( m > 0 && n == 0){
			return Acker(m-1, 1);
		}else{
			return Acker(m-1, Acker(m,n-1));
		}			
	}
}