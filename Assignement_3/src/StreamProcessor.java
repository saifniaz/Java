/* 
 * Name: MD. Saif Niaz
 * ID# 100555440
 * Assignment-3
 */
class StreamProcessor{
  private int index;
  private BTree storage;
  public String countIndex;
  public int atIndex, tree_height;
  
  // YOU MIGHT HAVE TO MODIF THIS CLASS BY ADDING NEW METHODS AND MEMBERS

  public StreamProcessor() {
    this.index = 0;
    this.storage = new BTree();
  }

  public void consume(int v)
  {
    storage.insert(v, index);
    index++;
  }

  public int[] search(int v) {
    // YOU NEED TO IMPLEMENT THIS METHOD
	  countIndex = "";
	  int[] indexcount;
	  _search(v,storage.root);
	  
	 //System.out.println(countIndex);
	  if(countIndex == ""){
		  indexcount = new int[1];
		  indexcount[0] = -1;
	  }else{
		  String[] strindex = countIndex.split(" ");
		  indexcount = new int[strindex.length];
		  for(int i = 0; i < indexcount.length; i++){
			  indexcount[i] = Integer.parseInt(strindex[i]);
		  }
	  }
    return indexcount;
  }
  
  public void _search(int v, BNode temp){
	  if(temp == null) return;
	  
	 
	  if(temp.value == v) addIndex(temp.index, temp);
	  _search(v, temp.left);
	  _search(v, temp.right);
	  
  }
  
  public void addIndex(int v, BNode node){
	  String x = String.valueOf(v);
	  countIndex = (countIndex + x + " ");
  }

  public int at(int i) {
    // YOU NEED TO IMPLEMENT THIS METHOD
	  atIndex = 0;
	  _at(i, storage.root);
    int temp = this.atIndex;
    return temp;
  }
  
  public void _at(int i, BNode node){
	  if(node == null) return;
	  
	  if(node.index == i) atIndex = node.value;
	  _at(i, node.left);
	  _at(i, node.right);
  }

  public void show() {    
    storage.show();
  }

  public void AVLconsume(int v) {
	  storage.insertAVL(v, index);
	  index++;  
  }
  
  public void violation(){
	  if(storage.root.left != null && storage.root.right != null){
		  violation(storage.root.left, storage.root.left.value);
		  violation(storage.root.right, storage.root.right.value);
	  }
	  violation(storage.root, storage.root.value);
  }
  public void violation(BNode node, int v){
	  //BNode node = storage.root;
	  if((height(node.left) - height(node.right)) == 2){
		  if(v < node.left.value){
			  node = rotateWithLeftChild(node);
		  }else{
			  node = doubleWithLeftChild(node);
		  }
	
  }
  else if((height(node.right) - height(node.left)) == 2){
	  if(v < node.right.value){
		  node = rotateWithRightChild(node);
	  }else{
		  node = doubleWithRightChild(node);
	  }
  }
  }
  
  public BNode rotateWithLeftChild(BNode node){
	  BNode temp = node.left;
	  node.left = temp.right;
	  temp.right = node;
	  node = temp;
	  return node;
  }
  
  public BNode rotateWithRightChild(BNode node){
	  BNode temp = node.right;
	  node.right = temp.left;
	  temp.left = node;
	  node = temp;
	  return node;
  }
  
  public BNode doubleWithLeftChild(BNode node){
	  node.left = rotateWithLeftChild(node.left); 
	  return rotateWithLeftChild(node);
	  
  }
  
  public BNode doubleWithRightChild(BNode node){
	  node.right = rotateWithRightChild(node.right);
	  return rotateWithRightChild(node);
	  
  }
  
  public int height(BNode node) {
	    tree_height = -1;
	    if(node == null){ 
	    	tree_height = 0;
	    }else{
	    	_height(node, 0);
	    }
	   return tree_height;
  }
  
  public void _height(BNode node, int depth) {
	  if (node.left == null && node.right == null) {
		  if (tree_height < depth) tree_height = depth;  
	  }
	
	  if (node.left != null) {     
		  _height(node.left, depth+1);
	  }
	  if (node.right != null) {    
		  _height(node.right, depth+1);
	  }	  
	}
  
}