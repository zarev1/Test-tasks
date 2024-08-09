package org.example;

import org.example.list.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test12 {
    @Test
    public void test12() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);

        assertFalse(hasCycle(node), "This list hasn't cycle");

        node.next.next.next = node;

        assertTrue(hasCycle(node), "This list has cycle");
    }

    public boolean hasCycle(ListNode node) {
        if (node == null) return false;

        ListNode slow = node;
        ListNode fast = node;

        try {
            while (slow != null && fast != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) return true;
            }
        } catch (NullPointerException e) {
            return false;
        }

        return false;
    }
}
