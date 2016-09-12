
public class MergeSort<T> extends ArraySort<T>{
	
	public MergeSort(T[] inArray){
		iSort((T[]) inArray);
		
	}
	
	@SuppressWarnings("unchecked")
	protected T[] sublist(T[] inArray, int i, int j) {
        int n = j - i + 1;
        if (n <= 0) return inArray;

        Object[] slist = new Object[n];
        for (int k=i; k<=j; ++k) {
            slist[k-i] = inArray[k];
        }
        return (T[])slist;
    }
	public T[] divide(T[] inArray) {
		int n = inArray.length;
        if (n <= 1) {
            return (inArray);
        }
        return merge(divide(sublist(inArray,0,-1+n/2)), divide(sublist(inArray,n/2,-1+n)));
    }
	
	@SuppressWarnings("unchecked")
	public T[] merge(T[] inArray, T[] inArray1){
		int na = inArray.length;
        int nb = inArray1.length;
        

        Object[] mergedlist = new Object[na+nb];
        
        int i=0;
        int ia=0;
        int ib=0;
        for (i=0; i<na+nb; ++i) {
            //System.out.println("i="+i+", ia="+ia+", ib="+ib);

            if (ia >= na && ib >= nb) {
                break;
            }
            else if (ia >= na && ib < nb) {
                mergedlist[i] = inArray1[ib];
                ib++;
            }
            else if (ia < na && ib >= nb) {
                mergedlist[i] = inArray[ia];
                ia++;
            }
            else { 
            	IntegerComparator comp1 = new IntegerComparator(inArray[ia], inArray1[ib] );
            	if (comp1.compare(inArray[ia], inArray1[ib]) == 1) {
                    mergedlist[i] = inArray[ia];
                    ia++;
                }
                else {
                    mergedlist[i] = inArray[ib];
                    ib++;
                }
            }
        }
        return ((T[])mergedlist);
	}
	
	public void iSort(T[] inArray){
		divide(inArray);
		
		oSort(inArray);
		
	}

	
	public T[] oSort(T[] inArray){
		return inArray;
	}
}
	

