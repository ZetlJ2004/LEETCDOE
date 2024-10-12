package com.algorithm.BinaryTree;

public class FillRightPointer {
    // 主函数
    public TreeNode connect(TreeNode root) {
        if (root == null) return null;
        // 遍历「三叉树」，连接相邻节点
        traverse(root.left, root.right);
        return root;
    }

    // 三叉树遍历框架
    void traverse(TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) {
            return;
        }
        // *** 前序位置 ***
        // 将传入的两个节点穿起来
        node1.next = node2;

        // 连接相同父节点的两个子节点
        traverse(node1.left, node1.right);
        traverse(node2.left, node2.right);
        // 连接跨越父节点的两个子节点
        traverse(node1.right, node2.left);
    }
}
