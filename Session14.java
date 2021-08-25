package misc.fsc3;

public class Session14 {

    private static TreeNode root = null;
    public static void main(String[] args) {

        inorder(root);
    }


    /*

    8 + 4+ 2 + 1 = 16 - 1 = 2^4 - 1 = 2^(h+1) - 1  -> 3
    4 + 2 + 1 = 7 -> 2

    h -> 2^(h) + 1



     */

    public static int inorder(TreeNode node) {

        if (node != null) {
            return Math.max(inorder(node.left), inorder(node.right)) + 1;
        } else {
            return 0;
        }
    }

    public static void preorder(TreeNode node) {
        if (node != null) {
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

    public static void postorder(TreeNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }

// 45 23 56 12 67 34 78

}
