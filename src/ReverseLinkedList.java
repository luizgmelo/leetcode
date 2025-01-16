public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(new ReverseLinkedList().reverseList(head));
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode newList = null;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = newList;
            newList = current;
            current = next;
        }

        return newList;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }

        @Override
        public String toString() {
            return val + " -> " + next;
        }
    }
}



