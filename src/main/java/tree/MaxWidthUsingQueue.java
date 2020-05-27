package tree;

// Java program to calculate maximum width
// of a binary tree using queue

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthUsingQueue {
    /* A binary tree node has data, pointer to
    left child and a pointer to right child */
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    // Function to find the maximum width of
    // the tree using level order traversal
    static int maxWidth(Node root) {
        // Base case
        if (root == null)
            return 0;

        // Initialize result
        int maxWidth = 0;

        // Do Level order traversal keeping
        // track of number of nodes at every level
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            // Get the size of queue when the level order
            // traversal for one level finishes
            int count = nodes.size();

            // Update the maximum node count value
            maxWidth = Math.max(maxWidth, count);

            // Iterate for all the nodes in
            // the queue currently
            while (count-- > 0) {
                // Dequeue an node from queue
                Node temp = nodes.remove();
                //System.out.println(temp.data + "");
                // Enqueue left and right children
                // of dequeued node
                if (temp.left != null) {
                    nodes.add(temp.left);
                }
                if (temp.right != null) {
                    nodes.add(temp.right);
                }
            }
        }
        return maxWidth;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(8);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(7);

				/* Constructed Binary tree is:
				1
			/ \
			2	 3
		/ \	 \
		4 5	 8
				/ \
				6	 7 */

        System.out.println("Maximum width = " + maxWidth(root));
    }
}

// This code is contributed by Rishabh Mahrsee

