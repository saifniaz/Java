
public interface Comparator<T> {
	public int compare(T a, T b);
}

class IntegerComparator implements Comparator{
	public boolean ascend;
	
	/*public IntegerComparator(String ascend){
		if(ascend == "ascend"){
			this.ascend = true;
		}else{
			this.ascend = false;
		}
	}*/
	
	public <T> IntegerComparator(T a, T b) {
		// TODO Auto-generated constructor stub
		compare(a, b);
	}

	public int compare(Object a, Object b){
		//if(ascend){
			if((int) a < (int) b){
				return -1;
			}else if( a == b){
				return 0;
		}else{
			return 1;
		}
		
		/*}else{
			if((int) b < (int) a){
				return -1;
			}else if( a == b){
				return 0;
		}else{
			return 1;
		
		}*/
	}

	
}

/*class StringComparator<T> implements Comparator<T>{

	@Override
	public int compare(T a, T b) {
		// TODO Auto-generated method stub
		if((int) a < (int) b){
			return -1;
		}else if( a == b){
			return 0;
		}else{
			return 1;
		}
	}
	
}

class FloatComparator implements Comparator{

	@Override
	public int compare(Object a, Object b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}*/