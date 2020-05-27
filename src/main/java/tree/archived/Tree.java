package tree.archived;

public class Tree {
	
	private TreeNode root;
	
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public void insert(int value) 
	{
		if (this.getRoot() == null)
		{
			this.setRoot(new TreeNode(value));
		}
		else
		{
			this.getRoot().insert(value);
		}
	}
	
	
	public TreeNode get(int value)
	{
		if (this.getRoot().getData() == value)
			return getRoot();
		else
		{
			return getRoot().get(value);
		}
	}
	
	
	public void inOrderTraversal() 
	{
		if (this.getRoot() != null)
		{
			this.getRoot().inOrderTraversal();
		}
	}
	

	public void mirror() 
	{
		if (this.getRoot() != null)
		{
			this.getRoot().mirror(root);
		}
	}
	
	public int min()
	{
		if (this.getRoot()!= null)
		{
			return this.getRoot().min();
		}
		return Integer.MIN_VALUE;
	}
	
	public int max()
	{
		if (this.getRoot()!= null)
		{
			return this.getRoot().max();
		}
		return Integer.MAX_VALUE;
	}
	
	public void delete(int data)
	{
		root =  delete(getRoot(), data);
	}
	
	private TreeNode delete(TreeNode subTreeNode, int data) {
		if (subTreeNode == null)
			return null;

		if (data < subTreeNode.getData()) {
			subTreeNode.setLeftNode(delete(subTreeNode.getLeftNode(), data));
		} 
		else if (data > subTreeNode.getData()) {
			subTreeNode.setRightNode(delete(subTreeNode.getRightNode(), data));
		} 
		else {
			if (subTreeNode.getLeftNode() == null)
			{
				return subTreeNode.getRightNode();
			}
			else if(subTreeNode.getRightNode() == null)
			{
				return subTreeNode.getLeftNode();
			}
			else
			{
				/*Setting up the value for the smallest node in right side*/
				subTreeNode.setData(subTreeNode.getRightNode().min()); 
				
				/*Setting the same data to the right sub tree */ 
				subTreeNode.setRightNode(delete(subTreeNode.getRightNode(), subTreeNode.getData()));
			}
		}

		return subTreeNode;
	}

}
