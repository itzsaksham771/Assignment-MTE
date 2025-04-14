// Algorithm:
// 1. Create a dummy node as the head of the merged list.
// 2. Use pointers to traverse both lists.
// 3. Compare the values at the current nodes of the two lists.
// 4. Append the smaller value node to the merged list and move the pointer of the
// list from which the smaller element was taken.
// 5. If one list is exhausted, append the remaining nodes of the other list to the
// merged list.
// 6. Return the next of the dummy node

// Time and Space Complexities:
// ● Time Complexity: O(m + n), where m and n are the lengths of the two lists.
// ● Space Complexity: O(1), as we use only a constant amount of extra space.

class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Q13 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        if (l1 != null) {
            tail.next = l1;
        } else if (l2 != null) {
            tail.next = l2;
        }
        
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        // Create sorted linked lists: 1->2->4, 1->3->4
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        
        ListNode mergedList = mergeTwoLists(l1, l2);
        
        // Print the merged list (1->1->2->3->4->4)
        printList(mergedList);
    }
}
