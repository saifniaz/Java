import java.util.Scanner;

public class questions {
	
	public int count = 0;
	
	void q1()
	{
		String arr;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number array, make sure the elements is in order");
		
		arr = scan.nextLine();
		
		String[] strarr = arr.split(" ");
		int[] temp = new int[strarr.length];
		int i = 0;
		while(i < strarr.length){
			temp[i] = Integer.parseInt(strarr[i]);
			i++;
		}
		
		System.out.println("Please enter a number to search:");
		
		int search = scan.nextInt();
		int bsearch = binarySearch(temp, 0, temp.length -1, search);
		int count = this.count;
		
		if(bsearch != -1){
			System.out.println("I find it! Its index is " + bsearch + " in " + count + " steps");
		}else{
			System.out.println("I cannot find it!!");
		}
		scan.close();
		
	}	
	
	
	public int binarySearch(int anArray[], int first, int last, int value)
	{
		this.count = this.count +1;
		if(first == last){
			if(anArray[first] == value){
				return first;
			}else{
				return -1;
			}
		}
			int m = (first+last)/2;
			
			if (value == anArray[m]) {
				return m;
			}
			if(value < anArray[m]){
				return binarySearch(anArray, first, m-1, value);
			}else{
				return binarySearch(anArray, m+1, last, value);
			}
	}
}