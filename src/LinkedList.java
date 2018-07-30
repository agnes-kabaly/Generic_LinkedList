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
        if (index == 0) {
            first = first.next;
            leftNode.next = null;
        }
        while (counter != index) {
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

    @Override
    public String toString() {
        String items = "";
        Node<T> node = first;
        int counter = 1;
        while (node.next != null) {
            items += counter + ". Node value: " + node.getData() + "\n";
            node = node.next;
            counter++;
        }
        items += counter + ". Node value: " + node.getData();
        return items;
    }

    public String stringify(LinkedList<T> linkedList) {
        String result = "";
        Node<T> node = first;
        if (first == null) {
            return "null";
        }
        while (node.next != null) {
            result += node.getData() + " -> ";
            node = node.next;
        }
        result += first.getData() + " -> null";
        return result;
    }

    public String stringify(Node first) {
        String result = "";
        if (first == null) {
            return "null";
        }
        while (first.next != null) {
            result += first.getData() + " -> ";
            first = first.next;
        }
        result += first.getData() + " -> null";
        return result;
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node reverse(Node head) {
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
        return first;
    }

    public Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = head;
        Node current = head.next;
        head = current;
        while (true) {
            Node next = current.next;
            current.next = prev;
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }
            prev.next = next.next;
            prev = next;
            current = prev.next;
        }
        return head;
    }


}
