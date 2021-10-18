import java.util.ArrayList;

public class BTPath {

    static class TreeNode {
        int data;
        TreeNode leftNode;
        TreeNode rightNode;

        TreeNode(int d) {
            this.data = d;
            leftNode = null;
            rightNode = null;
        }
    }

    public static ArrayList traverseTree(TreeNode node) {
        if (node == null) {
            System.out.println("Null tree...");
            System.out.println(node);
        }

        ArrayList rightTree = traverseTree(node.rightNode);
        ArrayList leftTree = traverseTree(node.leftNode);

        if (rightTree.size() < leftTree.size()) {
            leftTree.add(node.data);
        } else {
            rightTree.add(node.data);
        }

        if (leftTree.size() > leftTree.size())
            return leftTree;
        return rightTree;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(100);
        root.leftNode = new TreeNode(20);
        root.rightNode = new TreeNode(130);
        root.leftNode.leftNode = new TreeNode(10);
        root.leftNode.rightNode = new TreeNode(50);
        root.leftNode.leftNode.leftNode = new TreeNode(5);
        root.rightNode.leftNode = new TreeNode(110);
        root.rightNode.rightNode = new TreeNode(140);

        System.out.println(root);
        ArrayList longestPath = traverseTree(root);
        int len = longestPath.size();

        for (int i = 0; i < len; i++) {
            System.out.println(longestPath.get(i) + "->");
        }
    }
}
