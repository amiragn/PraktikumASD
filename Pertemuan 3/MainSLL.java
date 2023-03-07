public class MainSLL {
    public static void main(String[] args) {
        SLL contoh = new SLL();
        // contoh.addFirst(1);
        // contoh.addFirst(0);
        // contoh.print();
        // contoh.addFirst(1);
        // contoh.addLast(0);
        // contoh.print();
        // contoh.addLast(1);
        // contoh.addLast(0);
        // contoh.print();
        contoh.addFirst(1);
        contoh.addLast(2);
        contoh.addFirst(3);
        contoh.addLast(4);
        contoh.print();
        contoh.removeFirst();
        contoh.print();
        contoh.removeLast();
        contoh.print();
        // contoh.removeFirst();
        // contoh.removeFirst();
        // contoh.removeFirst();
        boolean b = contoh.isExists(5);
        if(b) System.out.println("angka ditemukan");
        else System.out.println("angka tidak ditemukan");
        System.out.println(b);
        //contoh.print();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {
    Node head, tail;
    int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int data) {
        Node input = new Node(data);  
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            input.next = head;
            head = input;
        }
        size++;
    }

    public void addLast(int data) {
        Node input = new Node(data);  
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    public void removeFirst() {
        head = head.next;
        size--;
    }

    public void removeLast() {
        Node pointer = head;
        while (pointer.next != tail) {
            pointer = pointer.next;
        }
        pointer.next = null;
        tail = pointer;
        size--;
    }

    public boolean isExists(int data) {
        Node pointer = head;
        while (pointer != null) {
            if (pointer.data == data) return true;
            pointer = pointer.next;
        }
        return false;
    }

    public void print() {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }
}