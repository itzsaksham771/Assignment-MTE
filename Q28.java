public class Q28 {
    private int[] array;
    private int size;
    private int top1;
    private int top2;

    // Constructor to initialize the stacks
    public Q28(int n) {
        array = new int[n];
        size = n;
        top1 = -1;
        top2 = n;
    }

    // Push element into Stack 1
    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            array[top1] = x;
        } else {
            System.out.println("Stack 1 Overflow");
        }
    }

    // Push element into Stack 2
    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            array[top2] = x;
        } else {
            System.out.println("Stack 2 Overflow");
        }
    }

    // Pop element from Stack 1
    public Integer pop1() {
        if (top1 >= 0) {
            int x = array[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack 1 Underflow");
            return null;
        }
    }

    // Pop element from Stack 2
    public Integer pop2() {
        if (top2 < size) {
            int x = array[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack 2 Underflow");
            return null;
        }
    }

    // Peek the top element of Stack 1
    public Integer peek1() {
        if (top1 >= 0) {
            return array[top1];
        } else {
            System.out.println("Stack 1 is empty");
            return null;
        }
    }

    // Peek the top element of Stack 2
    public Integer peek2() {
        if (top2 < size) {
            return array[top2];
        } else {
            System.out.println("Stack 2 is empty");
            return null;
        }
    }

    public static void main(String[] args) {
        Q28 stacks = new Q28(6);
        stacks.push1(1);
        stacks.push1(2);
        stacks.push2(6);
        stacks.push2(5);

        System.out.println("Stack 1 top: " + stacks.peek1()); // Output: 2
        System.out.println("Stack 2 top: " + stacks.peek2()); // Output: 5

        System.out.println("Popped from Stack 1: " + stacks.pop1()); // Output: 2
        System.out.println("Popped from Stack 2: " + stacks.pop2()); // Output: 5
    }
}
