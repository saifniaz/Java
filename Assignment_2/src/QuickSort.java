public class QuickSort<T> extends ArraySort<T>{
	public QuickSort(T[] inArray){
		iSort(inArray);
		
	}
	
	@SuppressWarnings("unchecked")
	public T[] quickSort(T[] inArray){
		
		//concat(inArray);
		
		//return null;
		//System.out.println(" Check: " + inArray[0]);
		
		int n = inArray.length;
        if (n <= 1) {
            return inArray;
        }
        int p = 0;
        T v = inArray[p];
        int nl = 0;
        int i;
        for (i=0; i<n; ++i) {
        	IntegerComparator comp = new IntegerComparator(inArray[i], v);
            if ((comp.compare(inArray[i], v) == 1) && i != p) {
                nl++;
            }
        }
        Object[] l = new Object[nl];
        Object[] r = new Object[n - nl - 1];
        int il = 0;
        int ir = 0;
        for (i=0; i<n; ++i) {
            if (i == p) continue;
            IntegerComparator comp1 = new IntegerComparator(inArray[i], v);
            if (comp1.compare(inArray[i], v) == 1) {
                l[il++] = inArray[i];
            }
            else {
                r[ir++] = inArray[i];
            }

        }
        
        return concat(quickSort((T[])l), v, quickSort((T[])r));
	}
	
	public T[] concat(T[] l, T v, T[] r) {
        int na = l.length;
        int nb = r.length;
        //System.out.println("na="+na+", nb="+nb);

        Object[] concatlist = new Object[na+nb+1];
        int i;
        for (i=0; i<na; ++i) {
            //System.out.println("i="+i);
            concatlist[i] = l[i];
        }
        //System.out.println("i="+i+", v="+v);
        concatlist[i] = v;
        for (i=na+1; i<na+nb+1; ++i) {
            //System.out.println("i="+i);
            concatlist[i] = r[i-na-1];
        }

        //return oSort((T[])concatlist);
		
        for(int r1 = 0; r1 < na + nb; r1++){
			System.out.println(concatlist[r1]);
		}
		
		//oSort(inArray);
		return null;
    }


	
	
	public void iSort(T[] inArray){
		quickSort(inArray);
		
	}
		

	public T[] oSort(T[] inArray){
		
		return null;
	}
}
