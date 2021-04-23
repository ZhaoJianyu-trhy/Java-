import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class _59_2 {

    public class MaxQueue {

        private Deque<Integer> main;
        private Deque<Integer> aux;

        public MaxQueue() {

            main = new LinkedList();
            aux = new LinkedList();
        }

        public int max_value() {
            if (aux.isEmpty()) return -1;
            return aux.getFirst();
        }

        public void push_back(int value) {
            if (aux.isEmpty()) {
                aux.addLast(value);
                main.addLast(value);
                return;
            }
            while (!aux.isEmpty() && aux.getLast() < value) aux.removeLast();
            aux.addLast(value);
            main.addLast(value);
        }

        public int pop_front() {
            if (main.isEmpty()) return -1;
            if (main.getFirst().equals(aux.getFirst())) {
                aux.removeFirst();
            }
            return main.removeFirst();
        }
    }
}
