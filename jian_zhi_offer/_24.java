/*public class _24 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public static  ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = reverseList(head.next);
        //head.next.next = head;
        cur.next = head;
        head.next = null;
        return cur;
    }

    public static void showListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        //构造1->2->3->4->5测试链表
        ListNode l5 = new ListNode(5);
        ListNode l4 = new ListNode(4) {{setNext(l5);}};
        ListNode l3 = new ListNode(3) {{setNext(l4);}};
        ListNode l2 = new ListNode(2) {{setNext(l3);}};
        ListNode l1 = new ListNode(1) {{setNext(l2);}};

        ListNode head = reverseList(l1);
        showListNode(head);
    }
}*/
