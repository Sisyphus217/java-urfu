package lr3;

public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
        head = null;
    }

    class Node {
        public int value;
        public Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void createHead(int data) {
        head = new Node(data, head);
    }

    public void addFirst(int data) {
        Node currentHead = head;
        head = new Node(data, currentHead);
    }

    public void addLast(int data) {
        Node newTail = new Node(data, null);
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
    }

    public void add(int orderNumber, int data) {
        Node newNode = new Node(data, null);
        Node ref = head;
        int k = 1;

        if (orderNumber == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        while (ref != null && k < orderNumber - 1) {
            ref = ref.next;
            k++;
        }

        if (ref == null) {
            System.out.println("The list contains less than " + orderNumber + " elements.");
            return;
        }

        newNode.next = ref.next;
        ref.next = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        head = head.next;
    }

    public void removeLast() {
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void remove(int orderNumber) {
        Node ref = head;
        int k = 1;
        while (ref.next != null && k < orderNumber) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
    }

    public void createTail(int data) {
        Node newTail = new Node(data, null);
        if (head == null) {
            head = newTail;
            return;
        }
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.value).append(" ");
            current = current.next;
        }
        return result.toString().trim();
    }


    private Node createHeadRec(Node current, int data) {
        if (current == null) {
            return new Node(data, null);
        }
        current.next = createHeadRec(current.next, data);
        return current;
    }

    private Node createTailRec(Node current, int data) {
        if (current == null) {
            return new Node(data, null);
        }
        if (current.next == null) {
            current.next = new Node(data, null);
        } else {
            createTailRec(current.next, data);
        }
        return current;
    }

    private String toStringRec(Node current) {
        if (current == null) {
            return "";
        }
        if (current.next == null) {
            return String.valueOf(current.value);
        }
        return current.value + " " + toStringRec(current.next);
    }

    public void createHeadRec(int data) {
        head = createHeadRec(head, data);
    }

    public void createTailRec(int data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            createTailRec(head, data);
        }
    }

    public String toStringRec() {
        return toStringRec(head).trim();
    }
}

