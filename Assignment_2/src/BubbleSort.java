public class BubbleSort<T> extends ArraySort<T>{
	
	public BubbleSort(T[] inArray){
		iSort((T[]) inArray);
		
	}
	
	public T[] swap(T[] inArray, int v){
		T temp;
		temp = inArray[v];
		inArray[v] = inArray[v+1];
		inArray[v+1] = temp;
		
		return inArray;
		
	}
	
	public void iSort(T[] inArray){
		boolean sort = false;
		int i = 0; 
		while(!sort){
			if(i == (inArray.length-1)){
				break;
			}
			while(i < (inArray.length)){
				 IntegerComparator comp1 = new IntegerComparator(inArray[i], inArray[i+1]);
				 int x = comp1.compare(inArray[i], inArray[i + 1]);
				 if(x == 1){
					 swap(inArray, i);
				 }
				 i++;
			 }
			 for(int a = 0; a < inArray.length; a++){
				 IntegerComparator comp = new IntegerComparator(inArray[a], inArray[a + 1]);
				 int y = comp.compare(inArray[a], inArray[a + 1]);
				 if(y == 1){
					 iSort(inArray);
				 }else{
					 sort = true;
				 }
			 }
			 
		 }
				
	}
	public T[] oSort(T[] inArray){
		
		Object[] inArray1 = new Object[inArray.length];
		
		for(int v = 0; v < inArray.length; v++){
			inArray1[v] = inArray[v];
		}
		
		iSort((T[])inArray1);
		
		return (T[])inArray1;
	}
}