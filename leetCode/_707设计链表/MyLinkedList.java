package leetCode._707设计链表;

class MyLinkedList {
    int size = 0;
    ListNode start;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        start = new ListNode(0);
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode ans = start;
        while (index >= 0) {
            ans = ans.next;
            index--;
        }
        return ans.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        size++;
        ListNode tmp = start.next;
        ListNode add = new ListNode(val);
        start.next = add;
        add.next = tmp;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        size++;
        ListNode cur = start;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(val);
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size - 1) return;
        else if (index < 0) addAtHead(val);
        else if (index == size) addAtTail(val);
        else {
            int help = 0;
            ListNode cur = start;
            while (help < index) {
                cur = cur.next;
                help++;
            }
            ListNode tmp = cur.next;
            ListNode add = new ListNode(val);
            cur.next = add;
            add.next = tmp;
            size++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        ListNode cur = start, tmp = null;
        int help = 0;
        while (help < index) {
            cur = cur.next;
            help++;
        }
        tmp = cur.next.next;
        cur.next = tmp;
        size--;
    }
}
