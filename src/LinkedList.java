public class LinkedList<T> {

    private Node<T> first;

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

    private boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

    private void insert(Node<T> newNode) {
        if (isEmpty()) {
            newNode.next = null;
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    private void insert(T data) {
        Node<T> newNode = new Node(data, null);
        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

// Delete, Reverse, PrintAll...
    /*private boolean hasLood() {

        if (isEmpty()) {
            return false;
        }

        Node<T> slow;
        Node<T> fast;
        slow = first;
        fast = first;

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
    }*/

}
