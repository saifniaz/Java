class Node{
	public int id;
	public Node nextNode;
	public Node previousNode;
	public Object value; 

	public Node(int id, Object value){
		this.id=id;
		setValue(value);
	}
	
	public void setNext(Node node){
		nextNode = null;
	}
	
	public void setPrevious(Node node){
		previousNode = null;
	}	
	public void setValue(Object value){
		this.value = value;
	}
}