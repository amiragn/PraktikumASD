public class MainDLL {
    public static void main(String[] args) {
        DLL x = new DLL();
        x.addFirst(0);
        x.addFirst(1);
        x.addLast(2);
        x.printToLast();
        x.printToFirst();
        x.removeLast();
        x.printToLast();
        x.removeFirst();
        x.printToLast();
        boolean b = x.isExist(5);
        if(b) System.out.println("angka ditemukan");
        else System.out.println("angka tidak ditemukan");
    }
}

class NodeDLL {
    int data;
    NodeDLL next;
    NodeDLL prev;

    public NodeDLL(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DLL {
    NodeDLL head, tail;
    int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int data) {
        NodeDLL input = new NodeDLL(data);
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            input.next = head;
            head.prev = input;
            head = input;
        }
        size++;
    }

    public void addLast(int data) {
        NodeDLL input = new NodeDLL(data);
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            input.prev = tail;
            tail.next = input;
            tail = input;
        }
        size++;
    }

    public void removeFirst() {
        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast() {
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public boolean isExist(int data) {
        NodeDLL pointer = head;
        while (pointer != null) {
            if (pointer.data == data) return true;
            pointer = pointer.next;
        }
        return false;
    }

    public void printToLast() {
        NodeDLL pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public void printToFirst() {
        NodeDLL pointer = tail;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.prev;
        }
        System.out.println();
    }
}