public abstract class ArraySort<T> {
	
	abstract public void iSort(T[] inArray);
	abstract public T[] oSort(T[] inArray);
	
	public long iSortTimed(T[] inArray) { 
		long time1 = System.currentTimeMillis();
		iSort(inArray);
		long time2 = System.currentTimeMillis();
		long total = time2 - time1;
		return total;
	}
	
	public void setComparator(Comparator<T> comparator) {
		
	}
		
}