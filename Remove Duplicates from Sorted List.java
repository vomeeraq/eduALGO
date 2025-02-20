class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode tail = head;

        while (tail.next != null) {
            if (tail.val == tail.next.val) {
                tail.next = tail.next.next;
            } else {
                tail = tail.next;
            }
        }
        return head;
    }
}
