// ● Time Complexity: O(L), where L is the length of the linked list.
// ● Space Complexity: O(1), as we use only a constant amount of extra space.


class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Q26 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;

        // Move fast pointer n nodes ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both fast and slow pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        // Create the linked list: 1->2->3->4->5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;

        // Call the function to remove the nth node from the end
        ListNode newHead = removeNthFromEnd(head, n);

        // Print the modified list: 1->2->3->5
        while (newHead != null) {
            System.out.print(newHead.val + "->");
            newHead = newHead.next;
        }
        System.out.println("None");
    }
}
