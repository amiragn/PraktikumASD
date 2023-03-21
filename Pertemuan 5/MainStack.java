public class MainStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.print();
        System.out.println(s.top());
        s.pop();
        s.print();
        s.pop();
        s.print();
    }
}

class NodeStack {
    int data;
    NodeStack next;

    public NodeStack(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    NodeStack head, tail;
    int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int data) {
        NodeStack input = new NodeStack(data);  
        if (isEmpty()) {
            head = tail = input;
        }
        else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    public void pop() {
        if (size == 1) {
            head = head.next;
            size--;
        }
        else if (!isEmpty()) {
            NodeStack pointer = head;
            while (pointer.next != tail) {
                pointer = pointer.next;
            }
            pointer.next = null;
            tail = pointer;
            size--;
        }
    }

    public int top() {
        return tail.data;
    }

    public boolean isExists(int data) {
        NodeStack pointer = head;
        while (pointer != null) {
            if (pointer.data == data) return true;
            pointer = pointer.next;
        }
        return false;
    }

    public void print() {
        NodeStack pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }
}