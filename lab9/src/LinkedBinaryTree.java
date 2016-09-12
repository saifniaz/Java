
public class LinkedBinaryTree
{
	protected BTNode<String> root;
	
	//Create an empty binary tree
	public LinkedBinaryTree()
	{
		root = null;
	}
	
	//Create a binary tree with specified element as root
	public LinkedBinaryTree(String element)
	{
		root = new BTNode<String>(element);
	}
	
	//Create a binary tree with two specified subtrees
	public LinkedBinaryTree(String element, LinkedBinaryTree left, LinkedBinaryTree right)
	{
		root = new BTNode<String>(element);
		root.setLeft(left.root);
		root.setRight(right.root);
	}
	
	public BTNode<String> getRootElement() throws Exception
	{
		if(root == null)
			throw new Exception("Get root operation failed. The tree is empty");
		return root;
	}
	
	public LinkedBinaryTree getLeft() throws Exception
	{
		if(root == null)
			throw new Exception("Get Left tree failed. The tree is empty.");
		LinkedBinaryTree result = new LinkedBinaryTree();
		result.root = root.getLeft();
		return result;
	}
	
	public LinkedBinaryTree getRight() throws Exception
	{
		if(root == null)
			throw new Exception("Get right tree failed. The tree is empty.");
		LinkedBinaryTree result = new LinkedBinaryTree();
		result.root = root.getRight();
		return result;
	}
	
	//-------------Calculate height of tree--------------
	public int height()
	{
		int height = -1;
		int leftHeight = 0 , rightHeight = 0;
		if(root == null) height = 0;
		
		if(root.getLeft() != null && root.getRight() != null){
			leftHeight = root.height(root.getLeft());
			rightHeight = root.height(root.getRight());
		}
		
		
		if(leftHeight > rightHeight){
			 height = leftHeight + 1;
		}else{
			height = rightHeight + 1;
		}
	
		return height;
	}
	
	//--------------Spin a tree here---------------------//
	public void spin(){	
		_spin(root);
	}
	public void _spin(BTNode<String> node){
		BTNode<String> temp = null;
		
		if(node == null) return;
		
		if(node.getLeft() != null && node.getRight() != null){
			_spin(node.getLeft());
			_spin(node.getRight());
		}
		//Swap
		temp = node.getRight();
		node.setRight(node.getLeft());
		node.setLeft(temp);
	}
	
	public void print(){
		_print(root);
	}
	
	//Just to see, if  node is spinning properly//
	public void _print(BTNode<String> node){
		if(node == null) return;
		_print(node.getLeft());
		System.out.println(node.getElement());
		_print(node.getRight());
	}
	//--------------------------------------------------//
}