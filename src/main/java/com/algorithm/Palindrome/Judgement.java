package com.algorithm.Palindrome;

public class Judgement {
    // 从左向右移动的指针
    ListNode left;
    // 从右向左移动的指针
    ListNode right;

    // 记录链表是否为回文
    boolean res = true;

    boolean isPalindrome(ListNode head) {
        left = head;
        traverse(head);
        return res;
    }

    void traverse(ListNode right) {
        if (right == null) {
            return;
        }

        // 利用递归，走到链表尾部
        traverse(right.next);

        // 后序遍历位置，此时的 right 指针指向链表右侧尾部
        // 所以可以和 left 指针比较，判断是否是回文链表
        if (left.val != right.val) {
            res = false;
        }
        left = left.next;
    }
}
