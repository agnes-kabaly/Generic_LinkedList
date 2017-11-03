public class LinkedList<T> {

    private Node<T> first;

    public LinkedList() {}

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

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
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

    public Node<T> getNode(int index) {
        Node<T> node = first;
        int counter = 0;
        while (node != null) {
            if (counter == index) {
                return node;
            } else {
                counter++;
                node = node.next;
            }
        }
        return null;
    }

    public void remove(int index) {
        Node<T> leftNode = first;
        Node<T> targetNode;
        int counter = 0;
        while (counter != index) {
            if (index == 0) {
                first = first.next;
                leftNode.next = null;
            }
            if (counter == index-1) {
                targetNode = leftNode.next;
                leftNode.next = leftNode.next.next;
                targetNode.next = null;
            }
            counter++;
            leftNode = leftNode.next;
        }
    }

    public void insert(T data) {
        Node<T> newNode = new Node(data, null);
        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public boolean hasLoop() {
        if (isEmpty()) {
            return false;
        }

        Node<T> slow;
        Node<T> fast;
        slow = first;
        fast = first;

        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public void printNodeList() {
        Node<T> node = first;
        System.out.println(node.toString());
    }

    @Override
    public String toString() {
        String items = "";
        Node<T> node = first;
        while (node.next != null) {
            items += "Node value: " + node.getData() + "\n";
            node = node.next;
        }
        items += "Node value: " + node.getData();
        return items;
    }


}
