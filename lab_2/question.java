import java.util.Scanner;
import java.util.Random;


public class question {
	
		//This is an example
	Scanner scan = new Scanner(System.in) ;
		void q0()
		{
			System.out.println("Hello World!");
		}
		
		void q1()
		{
			int val1, val2, val3;
			double average;
			//Scanner scan = new Scanner(System.in) ;

	       // get three values from user
			System.out.println("Please Enter the 3 numbers " + "I will calculate the average - ");
			val1 = scan.nextInt();
			val2 = scan.nextInt();
			val3 = scan.nextInt();
	       //Calculate average here
	       average = (val1 + val2 + val3)/3.0;
			
	       //Print it out here
	      System.out.println("Average is = " + average);
	      
		}
		
		void q2()
		{
			System.out.println("//////////////////\\\\\\\\\\\\\\\\\\\\");
			System .out.println("==          Student Points          ");
			System.out.println("\\\\\\\\\\\\\\\\\\\\//////////////////");
			
			String name1 = "Joe", name2 = "William", name3 =  "Mary Sue";
			int lab1 = 43, lab2 = 50, lab3 = 39, bonus1 = 7, bonus2 = 8, bonus3 = 10;
			int total1 = (lab1 + bonus1), total2 = (lab2 + bonus2), total3 = (lab3 + bonus3);
			
			System.out.println("Name" + "\t\t" + "Lab" + "\t" + "Bonus" + "\t" + "Total");
			System.out.println("----" + "\t\t" + "---" + "\t" + "-----" + "\t" + "-----");
			System.out.println(name1 + "\t\t" + lab1 + "\t" + bonus1 + "\t" + total1);
			System.out.println(name2 + "\t\t" + lab2 + "\t" + bonus2 + "\t" + total2);
			System.out.println(name3 + "\t" + lab3 + "\t" + bonus3 + "\t" + total3);
		}
		
		void q3()
		{
			int[] num = new int[5];
			System.out.println("Please enter 5 different intergers: ");
			
			for(int i = 0; i <5; i++){
				num[0] = scan.nextInt();
				
				if(num[i] < 10){
					i --;
				System.out.println("The number must be in range of 10 and 100");
				}else if(num[i] > 100){
					i--;
					System.out.println("The number must be in range og 10 and 100");	
				}else if(i > 0){
				if(num[i] == num[i - 1]){
					i = i - 1;
					System.out.println("Duplicate input:");
				}
				}
			}
			
			
		}
		
		void q4()
		{	
			
		    String college = new String ("PoDunk College");		
		    // part (a)
		    String town = new String("Anytown, USA");
			
		    int stringLength;
		    String change1, change2, change3; 	    
		    // part (b)
		    stringLength = college.length();
		    
		    
		    System.out.println (college + " contains " + stringLength + " characters.");
		    change1 =  college.toUpperCase();    	//part (c)
		    change2 =  change1.replace('O','*');	// part (d)
		    change3 =  college.concat(" " +town);	// part (e)
		    System.out.println("The final string is " + change3);
		}
		
		void q5()
		{
			System.out.println("Please enter R(ock), S(cissor) or P(aper)");		
			//Scanner scan = new Scanner(System.in);		
			
			String personPlay;
			
			String computerPlay;
			int computerInt; //Randomly generate number used to determine computer's play
			
		//Get player's play -- note that this is stored as a string
			personPlay = scan.next();
		//Make player's play uppercase for ease of comparison
		
			switch (personPlay){
			case "r":
				personPlay = personPlay.toUpperCase();
				break;
			case "p":
				personPlay = personPlay.toUpperCase();
				break;
			case "s":
				personPlay = personPlay.toUpperCase();
				break;
			}
		
		//Generate computer's play (0,1,2)
			Random rand = new Random();
			computerInt = rand.nextInt(3);
		//Translate computer's randomly generated play to string
			if(computerInt == 0){
				computerPlay = "Rock";
			}else if(computerInt == 1){
				computerPlay = "Paper";
			}else{
				computerPlay = "Scissor";
			}
		System.out.println("Computer===" + computerPlay);
		
		switch (personPlay){
		case "R":
			if(computerInt == 1){
			System.out.println("I win! paper defeats rock");
		}else if(computerInt == 2){
			System.out.println("You win! rock defeats scissor");
		}else{
			System.out.println("Tie game!");
		}
			break;
		case "P":
			if(computerInt == 2){
				System.out.println("I win! scissor defeats paper");
			}else if(computerInt == 0){
				System.out.println("You win! paper defeats rock");
			}else{
				System.out.println("Tie game!");
			}
			break;
		case "S":
			if(computerInt == 0){
				System.out.println("I win! rock defeats scissor");
			}else if(computerInt == 1){
				System.out.println("You win! scissor defeats paper");
			}else{
				System.out.println("Tie game!");
			}
			break;
		}
		
		
			
		}
	}

