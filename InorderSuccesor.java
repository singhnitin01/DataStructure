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
	public Node findMin(Node node){
		if(node.left == null)
			return node;
		return findMin(node.left);
	}

	public Node inorderSuccessor(Node root,Node x)
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
}

