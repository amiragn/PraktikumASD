public class MainCSLL {
    public static void main(String[] args) {
        CSLL x = new CSLL ();
        x.addFirst(0);
        x.addFirst(1);
        x.addLast(2);
        x.print();
        x.removeLast();
        x.print();
        x.removeFirst();
        x.print();
        boolean b = x.isExists(5);
        if(b) System.out.println("angka ditemukan");
        else System.out.println("angka tidak ditemukan");
    }
}

class NodeCSLL {
    int data;
    NodeCSLL next;

    public NodeCSLL(int data) {
        this.data = data;
        this.next = null;
    }
}

class CSLL {
    NodeCSLL head, tail;
    int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int data) {
        NodeCSLL input = new NodeCSLL(data);  
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            input.next = head;
            head = input;
        }
        tail.next = input;
        size++;
    }

    public void addLast(int data) {
        NodeCSLL input = new NodeCSLL(data);  
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            tail.next = input;
            tail = input;
        }
        input.next = head;
        size++;
    }

    public void removeFirst() {
        head = head.next;
        tail.next = head;
        size--;
    }

    public void removeLast() {
        NodeCSLL pointer = head;
        while (pointer.next != tail) {
            pointer = pointer.next;
        }
        tail = pointer;
        tail.next = head;
        size--;
    }

    public boolean isExists(int data) {
        NodeCSLL pointer = head;
        do {
            if (pointer.data == data) return true;
            pointer = pointer.next;
        }
        while(pointer != head);
        return false;
    }

    public void print() {
        NodeCSLL pointer = head;
        do {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        while(pointer != head);
        System.out.println();
    }
}