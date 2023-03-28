public class MainQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.print();
        System.out.println(q.peek());
        q.dequeue();
        q.print();
        q.dequeue();
        q.print();
    }
}

class NodeQueue {
    int data;
    NodeQueue next;

    public NodeQueue(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    NodeQueue head, tail;
    int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        NodeQueue input = new NodeQueue(data);  
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    public void dequeue() {
        if (!isEmpty()) {
            head = head.next;
            size--;
        }
    }

    public int peek() {
        return head.data;
    }

    public boolean isExists(int data) {
        NodeQueue pointer = head;
        while (pointer != null) {
            if (pointer.data == data) return true;
            pointer = pointer.next;
        }
        return false;
    }

    public void print() {
        NodeQueue pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }
}