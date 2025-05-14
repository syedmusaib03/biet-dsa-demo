package LinkedList;

 class SinglyLinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Musaib");
        list.addFirst("Syed");
        list.addLast("CSE");

        list.printList(); // Expected: Syed->Musaib->CSE->null
        System.out.println();

        list.deleteHead();
        list.printList(); // Expected: Musaib->CSE->null
        System.out.println();

        System.out.println("Size of the list: " + list.getSize()); // Expected: 2
    }
}

class LL {
    private Node head;
    private int size;

    LL() {
        size = 0;
    }

    // Make Node static as it doesn't use LL's instance members
    public static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        head = head.next;
        size--;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    public int getSize() {
        return size;
    }
}
