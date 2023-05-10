package com.denisfesenko;

/**
 * From testdome.com
 */
public class BinaryTreeHeight {
    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node node = new Node(leaf1, null);
        Node root = new Node(node, leaf2);

        System.out.println(root.height());
    }

    private static class Node {
        private Node leftChild, rightChild;

        public Node(Node leftChild, Node rightChild) {
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public Node getLeftChild() {
            return this.leftChild;
        }

        public Node getRightChild() {
            return this.rightChild;
        }

        public int height() {
            return maxDepth(this) - 1;
        }

        private int maxDepth(Node node) {
            if (node == null)
                return 0;
            else {
                int lDepth = maxDepth(node.getLeftChild());
                int rDepth = maxDepth(node.getRightChild());

                if (lDepth > rDepth)
                    return (lDepth + 1);
                else
                    return (rDepth + 1);
            }
        }
    }

}
