package misc.fsc3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Session15 {

    public static TreeNode root = null;

    public static void main(String[] args) {

        insert(root, 56);
        insert(root, 26);
        insert(root, 28);
        insert(root, 200);
        insert(root, 27);
        insert(root, 18);
        insert(root, 213);
        insert(root, 24);
        insert(root, 190);


        int x = 100;

        x = x % 1000000007;

        insert(root, 12);

        //preorder(root);

        isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.println(search(root, 300));

        ArrayList<Integer> arrayList = new ArrayList<>(100);
        arrayList.get(5);
        arrayList.add(10);

        Collections.sort(arrayList);
        Stack<Integer> stack = new Stack<>();


        // [2, 3, 4, 5, 6                         ] - size = 5;

        int []arr = new int[10];

        int []copy = new int[100];

        arr = copy;

    }

    // O(ht)
    public static int search(TreeNode node, int key) {
        if (node == null) {
            return -99;
        }

        if (node.data == key) {
            return node.data;
        }

        if (key < node.data) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }

    }

    public static int minimum(TreeNode node) {

        if (node == null) {
            return -99;
        }

        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    public static int noOfChildren(TreeNode node) {
        if (node.left != null && node.right != null) {
            return 2;
        } else if (node.left == null && node.right == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int maximum(TreeNode node) {

        if (node == null) {
            return -99;
        }

        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    public static void insert(TreeNode node, int data) {

        if (root == null) {
            root = new TreeNode(data);
            return;
        }

        if (data <= node.data) {
            //left side
            if (node.left == null) {
                node.left = new TreeNode(data);
            } else {
                insert(node.left, data);
            }
        } else {
            //right side
            if (node.right == null) {
                node.right = new TreeNode(data);
            } else {
                insert(node.right, data);
            }
        }
    }

    public void delete(TreeNode node, int data) {

        if (root == null) {
            return;
        }

        if (node == null) {
            return;
        }

        if (root.left == null && root.right == null && root.data == data) {
            root = null;
            return;
        }

        if (root.data == data) {
            System.out.println("Handle this separately.");
        }

        if (data < node.data) {
            //Left side
            if (node.left.data == data) {
                //Stuff - I am at a node called 'node'. I want to delete its immediate left child.
                int n = noOfChildren(node.left);
                if (n == 0) {
                    node.left = null;
                } else if (n == 1) {
                    if (node.left.right == null) {
                        //The 1 child that is there is the left child
                        node.left = node.left.left;
                    } else {
                        //The 1 child that is there is the right child
                        node.left = node.left.right;
                    }
                } else {
                    TreeNode temp = node.left; // temp -> node to be killed

                    int min = minimum(temp.right); // Finding min in right tree of temp
                    delete(temp, min);
                    temp.data = min;
                }
            } else {
                delete(node.left, data);
            }
        } else {
            //Right side
            if (node.right.data == data) {
                //Stuff - I am at a node called 'node'. I want to delete its immediate right child.
                int n = noOfChildren(node.right);
                if (n == 0) {
                    node.right = null;
                } else if (n == 1) {
                    if (node.right.right == null) {
                        node.right = node.right.left;
                    } else {
                        node.right = node.right.right;
                    }
                } else {
                    TreeNode temp = node.right;

                    int min = minimum(temp.right);
                    delete(temp, min);
                    temp.data = min;
                }
            } else {
                delete(node.right, data);
            }
        }
    }

    // O(n)
    public static boolean isBinarySearchTree(TreeNode node) {
        if (node != null) {

            if (noOfChildren(node) == 0) {
                return true;
            }

            int a = minimum(node.right);
            int b = maximum(node.left);
            if (a > node.data && b <= node.data) {
                return isBinarySearchTree(node.left) && isBinarySearchTree(node.right);
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public static boolean isBST(TreeNode node, int min, int max) {

        if (node == null) {
            return true;
        }

        if (node.data >= min && node.data < max) {
            return isBST(node.left, min, node.data) && isBST(node.right,node.data + 1, max);
        } else {
            return false;
        }

    }

    public static void preorder(TreeNode node) {
        if (node != null) {
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }


    public static void mirror(TreeNode node) {

        if (node != null) {
            mirror(node.left);

            mirror(node.right);

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }

    public static boolean isBST(TreeNode node) {
        return true;
    }


    /*

// 4 1 6 2 3 7 9 -

/ 1 .........
/ 1 2 ........
/ 1 2 3 .......


        Inorder - G || D || H K || B ||  A  || E ||C || F
        Postorder - G ||  K || H || D || B || E ||  F || C || A




        []



     */
}
