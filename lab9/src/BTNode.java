public class BTNode<T>
{
	private BTNode<T> left, right;
	private T element;
	
	public BTNode(T element)
	{
		this.element = element;
	}
	
	public BTNode<T> getLeft() {
		return left;
	}
	public void setLeft(BTNode<T> left) {
		this.left = left;
	}
	public BTNode<T> getRight() {
		return right;
	}
	public void setRight(BTNode<T> right) {
		this.right = right;
	}
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}	
	
	public BTNode<T> find(T target)
	{
		BTNode<T> result = null;
		if(element.equals(target))
			result = this;
		else
		{
			if(left != null)
				result = left.find(target);
			if(result == null && right != null)
				result = right.find(target);
		}
		return result;
	}
	
	public int count()
	{
		int result = 1;
		if(left != null)
			result += left.count();
		if(right != null)
			result += right.count();
		return result;
	}
	
	//-------------Calculate height of tree--------------
	public int height(BTNode<T> node)
	{
		int height = 0;
		int leftHeight = 0 , rightHeight = 0;
		
		if(node.left != null && node.right != null){
			leftHeight = height(node.left);
			rightHeight = height(node.right);
		}
		
		if(leftHeight > rightHeight){
			 height = leftHeight + 1;
		}else{
			height = rightHeight + 1;
		}
		return height;
	}
	//--------------------------------------------------*/
}