package Trees;

class BST {
    int data;
    BST left;
    BST right;

    public BST(int data) {
        this.data = data;
        left = right = null;
    }
}

public class AvlTrees {
    public static void inorder(BST root) {
        if(root != null) {
            inorder(root.left);
            System.out.print(root.data +" ");
            inorder(root.right);
        }

    }

    public static BST sortedArrayToBST(int[] arr, int start, int end) {

        if(start > end) {
            return null;
        }
            int mid = start + (end - start) / 2;
            BST root = new BST(arr[mid]);
            root.left = sortedArrayToBST(arr, start, mid - 1);
            root.right = sortedArrayToBST(arr, mid + 1, end);

            return root;


    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
       BST root =  sortedArrayToBST(arr, 0, arr.length - 1);
        inorder(root);
        System.out.print(" ");

    }
}
