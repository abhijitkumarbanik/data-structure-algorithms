package tree.archived;

public class TreeDemo {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
		tree.insert(67);
		tree.insert(128);
		tree.insert(9);
		tree.insert(4);
		tree.insert(-8);
		tree.insert(0);
		tree.insert(-55);
		tree.insert(88);
		tree.insert(10);
		
		tree.inOrderTraversal();
		System.out.println();
		
		tree.mirror();
		System.out.println();

		tree.inOrderTraversal();
		System.out.println();

		
		System.out.println("Min value : "+tree.min());
		System.out.println("Max value : "+tree.max());
		
		
/*		System.out.println("Searched : "+ tree.get(-8));
		System.out.println("Searched : "+ tree.get(0));
		System.out.println("Searched : "+ tree.get(10));
		System.out.println("Searched : "+ tree.get(128));
		System.out.println("Searched : "+ tree.get(9999));*/
		
		/*
		tree.delete(8978);
		tree.delete(-8);
		tree.inOrderTraversal();
		System.out.println();
		*/
		
	}

}
