// Time Complexity: O(M + N), where M and N are the lengths of the two linked lists.
// Space Complexity: O(1), as we use only a constant amount of extra space.


public class Q49 {

    // Definition for singly-linked list
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        // Step 1: Calculate lengths of both linked lists
        int len1 = 0, len2 = 0;
        ListNode curr1 = head1, curr2 = head2;
        
        while (curr1 != null) {
            len1++;
            curr1 = curr1.next;
        }
        
        while (curr2 != null) {
            len2++;
            curr2 = curr2.next;
        }

        // Step 2: Move the pointer of the longer list forward
        curr1 = head1;
        curr2 = head2;
        int diff = Math.abs(len1 - len2);
        
        if (len1 > len2) {
            for (int i = 0; i < diff; i++) {
                curr1 = curr1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                curr2 = curr2.next;
            }
        }

        // Step 3: Iterate and compare nodes
        while (curr1 != null && curr2 != null) {
            if (curr1 == curr2) {
                return curr1; // Intersection found
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return null; // No intersection
    }

    public static void main(String[] args) {
        // Example usage:
        // Create the linked lists:
        // 1 -> 2 -> 3 -> 4 -> 5
        //             ^
        //             |
        // 6 -> 7
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node6.next = node7;
        node7.next = node3;  // intersection at node3

        ListNode intersection = getIntersectionNode(node1, node6);
        
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);  // Output: 3
        } else {
            System.out.println("No intersection");
        }
    }
}
