/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode arr;
        if (list1.val > list2.val) {
            arr = new ListNode(list2.val);
            list2 = list2.next;
        } else {
            arr = new ListNode(list1.val);
            list1 = list1.next;
        }
        ListNode start = arr;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                arr.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                arr.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            arr = arr.next;
        }

        if (list1 == null) {
            arr.next = list2;
        } else {
            arr.next = list1;
        }
        return start;
    }
}
