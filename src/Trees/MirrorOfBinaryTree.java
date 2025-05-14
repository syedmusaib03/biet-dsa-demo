//package Trees;
//
//class TreeNode {
//    int val;
//    TreeNode left, right;
//
//    TreeNode(int val) {
//        this.val = val;
//        left = right = null;
//    }
//}
//
//public class MirrorOfnBinaryTree {
//
//    // Recursive method to mirror the binary tree
//    public static TreeNode mirror(TreeNode root) {
//        if (root == null)
//            return null;
//
//        // Swap left and right
//        TreeNode temp = root.left;
//        root.left = mirror(root.right);
//        root.right = mirror(temp);
//
//        return root;
//    }
//
//    // In-order traversal for testing
//    public static void inOrder(TreeNode node) {
//        if (node != null) {
//            inOrder(node.left);
//            System.out.print(node.val + " ");
//            inOrder(node.right);
//        }
//    }
//
//    public static void main(String[] args) {
//        // Example tree
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//
//        System.out.println("In-order before mirroring:");
//        inOrder(root);
//
//        mirror(root);
//
//        System.out.println("\nIn-order after mirroring:");
//        inOrder(root);
//    }
//}
