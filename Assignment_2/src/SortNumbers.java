import java.util.Scanner;
import java.util.Random;

public class SortNumbers {
	
	/*public SortNumbers(String Method,String Order){
		
		System.out.println(Method + " " + Order);
		
	}*/
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		String method, order;
		int index;
		System.out.print("Enter Array-Length, Method and Order: " );
		Scanner scan = new Scanner(System.in);
		index = scan.nextInt();
		method = scan.next();
		order = scan.next();
		
		
		Object[] input = new Object[index];
		
		for(int i = 0; i < index; i++){
			if(index < 10){
			input[i] = rand.nextInt(index);
			System.out.println(input[i]);
			}else{
				input[i] = rand.nextInt(index);
			}
			
		}
		
		if(method == "bubble"){
			BubbleSort bub = new BubbleSort(input);
		}else if(method == "merge"){
			MergeSort mer = new MergeSort(input);
		}else{
			QuickSort qik = new QuickSort(input);
		}
		
		
		
		scan.close();
		
	}
}