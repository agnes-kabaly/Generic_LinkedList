public class LinkedList<T> {

    private Node<T> first;

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

    public LinkedList() {

    }

    public LinkedList(Node<T>... nodes) {
        for (Node<T> node : nodes) {
            insert(node);
        }
    }

    public LinkedList(T... values) {
        for (T data : values) {
            insert(data);
        }
    }

    public void insert(Node<T> newNode) {
        if (isEmpty()) {
            newNode.next = null;
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public void insert(T data) {

    }


}


//List, Insert, Delete, Reverse, PrintAll...isEmpty...
/* public boolean hasLood(Node first) {
        Node slow;
        Node fast;
        slow = fast = first;
        if (first == null) {
            return false;
        }

        while (true) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }
            if (slow == null || fast == null) {
                return false;
            }
            if (slow == fast) {
                return true;
            }
        }
    }
*/