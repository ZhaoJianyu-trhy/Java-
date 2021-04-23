import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class _35复杂链表的复制 {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return head;
        Node pre = new Node(head.val), cur = head, ans = pre;
        Map<Node, Node> map = new HashMap<>();
        while (cur != null) {
            if (cur.next != null) {
                Node nextNode = map.get(cur.next);
                if (nextNode == null) {
                    nextNode = new Node(cur.next.val);
                    map.put(cur.next, nextNode);
                }
                pre.next = nextNode;
            }

            if (cur.random != null) {
                if (cur.random != cur) {
                    Node randomNext = map.get(cur.random);
                    if (randomNext == null) {
                        randomNext = new Node(cur.random.val);
                        map.put(cur.random, randomNext);
                    }
                    pre.random = randomNext;
                } else {
                    pre.random = pre;
                }
            }
            map.put(cur, pre);
            pre = pre.next;
            cur = cur.next;
        }
        return ans;
    }

    @Test
    public void test() {
        Node head = new Node(-1);
        head.random = head;
        Node node = copyRandomList(head);
    }
}
