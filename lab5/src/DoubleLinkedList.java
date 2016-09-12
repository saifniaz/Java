import java.util.ArrayList;

class DoubleLinkedList{
	public int nextId;
	ArrayList<Node> node = new ArrayList<Node>(); 
	
	public DoubleLinkedList(Node node){
			insert(node, 0);
	}
	
	public void insert(Node node, int index){
		if(isEmpty()){
			nextId = index + 1;
			this.node.add(index, node);
		}else{
			this.node.add(index, node);
			
		}
	}
	
	public void remove(Node node){
		this.node.remove(node);
	}
	
	public void removeAt(int index){
		this.node.remove(index);
		
	}
	
	public boolean isEmpty(){
		
		return node.isEmpty();
	}
	
	public void clear(){
		int x = 0;
		while(x <this.node.size()){
			node.remove(x);
			x++;
		}
	}
	
}