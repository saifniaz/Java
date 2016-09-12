/* 
 * Name: MD. Saif Niaz
 * ID# 100555440
 * Assignment-3
 */
class BTree {
  public BNode root;
  int tree_height;

  public BTree() {
    root = null;
  }

  public void insert(int value, int index) {
    if (root == null) {
      root = new BNode(value, index);
    }
    else {
      insert(root, value, index);
    }
  }

  public void insert(BNode node, int value, int index) {
    if (value <= node.value) {
      if (node.left == null) {
        node.left = new BNode(value, index);
      }
      else {
        insert(node.left, value, index);
      }
    }
    else {
      if (node.right == null) {
        node.right = new BNode(value, index);
      }
      else {
        insert(node.right, value, index);
      }
    }

  }

  public void insertAVL(int value, int index) {
    
    // IMPLEMENT THIS METHOD
    // IT WILL INSERT A NODE AND IF THE INSERTION
    // VIOLATES THE AVL CONDITION, THE METHOD WILL
    // BALANCE THE TREE
	  
	  if (root == null) {
	      root = new BNode(value, index);
	    }
	    else {
	     insertAVL(value, index, root);
	    }
  }

  public void insertAVL(int v, int i, BNode node){
	
	  //if(node == null) return new BNode(v, i);
	  
	  if (v <= node.value) {
		  if(node.left == null) {
		        node.left = new BNode(v, i);
		      }
		      else {
		        insertAVL(v, i, node.left);
		      }
	  }else if( v > node.value){
		  if (node.right == null) {
		        node.right = new BNode(v, i);    
		  }    
		  else {
		        insertAVL(v, i, node.right);		
		  }
	  }  	  
  }  
  
  public void show() {
    show(root);
  }

  public void show(BNode node) {
    if (node != null) {
      show(node.left);
      System.out.println(node);
      show(node.right);
    }
  }
}