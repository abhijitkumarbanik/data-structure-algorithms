package tree.archived;

public class TreeNode {

	private int data;
	private TreeNode leftNode;
	private TreeNode rightNode;

	public TreeNode(int data) {
		this.data = data;
	}

	public void insert(int value) {
		if (value == data) {
			System.out.println("Duplicate value found : " + value);
		}

		if (this.getData() > value) {
			if (this.getLeftNode() == null) {
				this.setLeftNode(new TreeNode(value));
			} else {
				this.getLeftNode().insert(value);
			}
		} else {
			if (this.getRightNode() == null) {
				this.setRightNode(new TreeNode(value));
			} else {
				this.getRightNode().insert(value);
			}
		}
	}

	public void inOrderTraversal() {
		
		if (this.getLeftNode() != null) {
			getLeftNode().inOrderTraversal();
		}
		
		System.out.print(this.data + " , ");

		if (this.getRightNode() != null) {
			getRightNode().inOrderTraversal();
		}
	}
	
	public TreeNode get(int value) {
		if (this.data == value)
			return this;
		if (this.data > value) {
			if (getLeftNode() != null) {
				return getLeftNode().get(value);
			}

		} else {
			if (getRightNode() != null) {
				return getRightNode().get(value);
			}

		}
		return null;
	}
	
	public int min()
	{
		if (this.getLeftNode() == null)
		{
			return this.data;
		}
		else
		{
			return this.getLeftNode().min();
		}
	}
	
	public int max()
	{
		if (this.getRightNode() == null)
		{
			return this.data;
		}
		else
		{
			return this.getRightNode().max();
		}
	}


	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

	@Override
	public String toString() {
		return "data=" + data + " , ";
	}
	

	public TreeNode mirror(TreeNode node) {
		if (node == null)
			return null;
		TreeNode left = mirror(node.getLeftNode());
		TreeNode right = mirror(node.getRightNode());
		this.setLeftNode(right);
		this.setRightNode(left);
		return node;
	}


}
