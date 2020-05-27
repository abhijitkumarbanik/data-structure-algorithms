package tree.archived;

public class BinaryTreeApp {
  public static void main(String[] args) throws Exception {
    BasicBinaryTree<Integer> tree = new BasicBinaryTree<>();

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
    tree.preOrderTraversal();
    System.out.println();
    tree.postOrderTraversal();
    System.out.println();
    System.out.println(tree.contains(88));
    System.out.println(tree.max());
    System.out.println(tree.min());

  }
}
