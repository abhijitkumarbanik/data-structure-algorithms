package list;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	public void addToFront(int data)
	{
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		
		if(this.head == null)
			this.tail = newNode;
		else
			this.head.setPreviousNode(newNode);
		this.head = newNode;
		length++;
	}
	
	public void addToEnd( int data)
	{
		Node newNode = new Node(data);
		this.tail.setNextNode(newNode);
		newNode.setPreviousNode(this.getTail());
		tail = newNode;
		length++;
	}
	
/*	public void remove(int data)
	{
		if(this.head.getData() == data)
		{
			this.head = this.head.getNextNode();
			
		}
		
		Node currentNode = this.head;
		
		while (currentNode != null)
		{
			if (currentNode.getNextNode()!=null && currentNode.getNextNode().getData()== data)
			{
				currentNode.setNextNode(currentNode.getNextNode().getNextNode());
				
			}
			currentNode = currentNode.getNextNode();

		}
		
	}*/
	
	public int removeAtEnd()
	{
		if (getLength()== 0)
		{
			return -1;
		}
		
		Node toBeRemoved = this.tail;
		
		if (this.tail.getPreviousNode() == null)
			this.head = null;
		else
			this.tail.getPreviousNode().setNextNode(null);
		
		this.tail = this.tail.getPreviousNode();
		length--;
		toBeRemoved.setPreviousNode(null);
		return toBeRemoved.getData();
	}
	
	public int removeFromFront()
	{
		if (getLength()== 0)
		{
			return -1;
		}
		Node tobeRemoved = this.head;
		if (this.head.getNextNode() == null)
			this.tail = null;
		else 
		{
			this.head.getNextNode().setPreviousNode(null);
		}
		this.head = this.head.getNextNode();
		tobeRemoved.setNextNode(null);
		length--;
		
		return tobeRemoved.getData();
	}
	
	public void find()
	{
		
	}
	
	public void printLinkedList()
	{
		Node currentNode = this.head;
		while (currentNode != null)
		{
			System.out.print(currentNode);
			currentNode = currentNode.getNextNode();
		}
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	


}
