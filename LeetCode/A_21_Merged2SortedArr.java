//public class A_21_Merged2SortedArr {
//
//    // Recursive merge method
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        // Base cases
//        if (list1 == null) return list2;
//        if (list2 == null) return list1;
//
//        // Compare current nodes and recurse
//        if (list1.val < list2.val) {
//            list1.next = mergeTwoLists(list1.next, list2);
//            return list1;
//        } else {
//            list2.next = mergeTwoLists(list1, list2.next);
//            return list2;
//        }
//    }
//
//    // Optional: helper method to print the list
//    public void printList(ListNode head) {
//        ListNode current = head;
//        while (current != null) {
//            System.out.print(current.val + " -> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//
//    // Test example
//    public static void main(String[] args) {
//        A_21_Merged2SortedArr solution = new A_21_Merged2SortedArr();
//
//        // Create first list: 1 -> 3 -> 5
//        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
//
//        // Create second list: 2 -> 4 -> 6
//        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));
//
//        // Merge lists
//        ListNode merged = solution.mergeTwoLists(list1, list2);
//
//        // Print result
//        solution.printList(merged);
//    }
//}

//
//public class A_21_Merged2SortedArr {
//
//    public static class ListNode {
//        int val;
//        ListNode next;
//        ListNode(int v) { val = v; }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        // Создаём входные списки
//        ListNode list1 = node(1, node(2, node(4, null)));
//        ListNode list2 = node(1, node(3, node(4, null)));
//
//        animateMerge(list1, list2);
//    }
//
//    static ListNode node(int v, ListNode next) {
//        return new ListNode(v) {{ this.next = next; }};
//    }
//
//    static void animateMerge(ListNode list1, ListNode list2) throws InterruptedException {
//        ListNode dummy = new ListNode(-1);
//        ListNode current = dummy;
//
//        int step = 0;
//
//        printFrame(step++, list1, list2, dummy, current, "Начальное состояние");
//
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                current.next = list1;
//                list1 = list1.next;
//                current = current.next;
//                printFrame(step++, list1, list2, dummy, current,
//                        "Взяли из list1 (" + current.val + ")");
//            } else {
//                current.next = list2;
//                list2 = list2.next;
//                current = current.next;
//                printFrame(step++, list1, list2, dummy, current,
//                        "Взяли из list2 (" + current.val + ")");
//            }
//        }
//
//        if (list1 != null) {
//            current.next = list1;
//            printFrame(step++, list1, list2, dummy, current,
//                    "Прикрепили остаток list1");
//        }
//        if (list2 != null) {
//            current.next = list2;
//            printFrame(step++, list1, list2, dummy, current,
//                    "Прикрепили остаток list2");
//        }
//
//        printFrame(step, null, null, dummy, current,
//                "Готово! Итоговый список построен");
//    }
//
//    static void printFrame(int step, ListNode list1, ListNode list2,
//                           ListNode dummy, ListNode current, String title)
//            throws InterruptedException {
//
//        System.out.println("\n\n===== ШАГ " + step + " — " + title + " =====");
//        System.out.println("list1: " + listToString(list1));
//        System.out.println("list2: " + listToString(list2));
//        System.out.println("dummy→ " + listToString(dummy));
//        System.out.println("current находится на: " + current.val);
//
//        Thread.sleep(1000); // задержка 1 сек — для «анимации»
//    }
//
//    static String listToString(ListNode head) {
//        if (head == null) return "null";
//        StringBuilder sb = new StringBuilder();
//        while (head != null) {
//            sb.append(head.val);
//            if (head.next != null) sb.append(" → ");
//            head = head.next;
//        }
//        return sb.toString();
//    }
//}}

import java.util.Arrays;

public class A_21_Merged2SortedArr {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int v) {
            this.val = v;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode mergetwoSortedList(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(-1);
            ListNode current = dummy;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    current.next = list1;
                    list1 = list1.next;

                } else {
                    current.next = list2;
                    list2 = list2.next;

                }
                current = current.next;
            }
            if (list1 != null) current.next = list1;
            if (list2 != null) current.next = list2;
            return dummy.next;
        }


    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));

        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));

        ListNode result = ListNode.mergetwoSortedList(list1, list2);
        ListNode temp = result;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }













    public static ListNode mergeTwoL(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                current.next = list2;
                list2 = list2.next;
            }else {
                current.next = list1;
                list1 = list1.next;
            }
            current = current.next;
        }
        if(list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;
        return dummy.next;
    }

}
