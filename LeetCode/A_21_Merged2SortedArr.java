public class A_21_Merged2SortedArr {

    // Recursive merge method
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Base cases
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Compare current nodes and recurse
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    // Optional: helper method to print the list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Test example
    public static void main(String[] args) {
        A_21_Merged2SortedArr solution = new A_21_Merged2SortedArr();

        // Create first list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));

        // Create second list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        // Merge lists
        ListNode merged = solution.mergeTwoLists(list1, list2);

        // Print result
        solution.printList(merged);
    }
}
