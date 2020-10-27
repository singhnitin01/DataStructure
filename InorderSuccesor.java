/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class Tree
{
	public static Node successor;
	
	public Node findMin(Node node){
		if(node.left == null)
			return node;
		return findMin(node.left);
	}

	/*public Node inorderSuccessor(Node root,Node x)
	{
		if(x.right != null){
			return findMin(x.right);
		}
		Node successor = null;

		while(root != x){
			if(x < root.data){
				successor = root;
				root = root.left;
			}
			else 
				root = root.right;
		}
		return successor;
	}
	 Above is iterative version and below is recursive version
	*/
	
	public static void inorderSuccessorUtility(Node root, Node x){
		if(root == null)
			return;
		if(x.data < root.data){
			successor = root;
			inorderSuccessorUtility(root.left, x);	
		}
		else if(x.data > root.data)
			inorderSuccessorUtility(root.right, x);
		else 
			return;
	}
	
	public Node inorderSuccessor(Node root,Node x)
	{
		if(x.right != null)
			return findMin(x.right);
		successor = null;
		inorderSuccessorUtility(root, x);
		return successor;
	}
}

