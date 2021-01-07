package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node () {
            data = 0;
            left = right = null;
        }

        Node (int d) {
            data = d;
            left = right = null;
        }
    }

    BinaryTree () {
        root = null;
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        } 
        return root;
    }

    public void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> visit_next = new LinkedList<Node>();
        visit_next.add(root);

        while (visit_next.peek()!=null) {
            Node currNode = visit_next.poll();

            System.out.print(currNode.data + " ");

            if (root.left != null) {
                visit_next.add(currNode.left);
            }

            if (root.right != null) {
                visit_next.add(currNode.right);
            }
        }

    }

    public int height (Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeigt = height(root.right);

        return Math.max(leftHeight, rightHeigt) + 1;
    }

    /*
                4             
             /     \
           2        6
        /    \    /   \
      1      3   5     7

      Inorder traversal: 1 2 3 4 5 6 7 
      Preorder traversal: 4 2 1 3 6 5 7
      Postorder traversal: 1 3 2 4 5 7 6  
      Level order traversal : 4 2 6 1 3 5 7   

    */
    public static void main(String[] args) {
        BinaryTree btree = new BinaryTree();
        btree.root = btree.insert(btree.root, 4);
        btree.root = btree.insert(btree.root, 2);
        btree.root = btree.insert(btree.root, 6);
        btree.root = btree.insert(btree.root, 1);
        btree.root = btree.insert(btree.root, 3);
        btree.root = btree.insert(btree.root, 5);
        btree.root = btree.insert(btree.root, 7);

        System.out.println("Height of tree: " + btree.height(btree.root));
        
        System.out.print("Inorder traversal: ");
        btree.inOrderTraversal(btree.root);
        System.out.println();
        System.out.print("Preorder traversal: ");
        btree.preOrderTraversal(btree.root);
        System.out.println();
        System.out.print("Postorder traversal: ");
        btree.postOrderTraversal(btree.root);
        System.out.println();
        System.out.print("Level order traversal: ");
        btree.levelOrderTraversal(btree.root);
        System.out.println();
    }
}
