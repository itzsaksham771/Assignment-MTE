// Time Complexity: O(m + n), where m and n are the lengths of the two lists.
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

public class Q27 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode currA = headA;
        ListNode currB = headB;

        // Find the lengths of the lists
        while (currA != null) {
            lenA++;
            currA = currA.next;
        }

        while (currB != null) {
            lenB++;
            currB = currB.next;
        }

        // Reset the pointers to the heads of the lists
        currA = headA;
        currB = headB;

        // Move the pointer of the longer list forward
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                currA = currA.next;
            }
        } else {
            for (int i = 0; i < lenB - lenA; i++) {
                currB = currB.next;
            }
        }

        // Move both pointers until they meet
        while (currA != null && currB != null && currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }

        return currA; // Or currB, they are the same at the intersection
    }

    public static void main(String[] args) {
        // Create intersecting linked lists:
        // 4->1->8->4->5
        // 2->3->8->4->5
        ListNode common = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode headA = new ListNode(4, new ListNode(1, common));
        ListNode headB = new ListNode(2, new ListNode(3, common));

        // Find the intersection node
        ListNode intersectionNode = getIntersectionNode(headA, headB);

        if (intersectionNode != null) {
            System.out.println("Intersection node value: " + intersectionNode.val); // Output: 8
        } else {
            System.out.println("No intersection");
        }
    }
}
