public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        var solution = new MergeTwoSortedLinkedLists();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode output = solution.mergeTwoLists(list1, list2);

        // Output: [1,1,2,3,4,5]
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode list3 = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                list3.next = new ListNode(list1.val);
                list3 = list3.next;
                list1 = list1.next;
            } else {
                list3.next = new ListNode(list2.val);
                list3 = list3.next;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            list3.next = new ListNode(list1.val);
            list3 = list3.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            list3.next = new ListNode(list2.val);
            list3 = list3.next;
            list2 = list2.next;
        }

        return dummy.next;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
