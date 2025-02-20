class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode current = head;
        int length = 1;

        while (current.next != null) {
            current = current.next;
            length++;
        }

        current.next = head;
        k = k % length;

        for (int i = 0; i < length - k; i++) {
            current = current.next;
        }

        ListNode newHead = current.next;
        current.next = null;

        return newHead;
    }
}
