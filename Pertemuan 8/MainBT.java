public class MainBT {
    public static void main(String[] args) {
        BT bt = new BT();
        bt.add(1);
        bt.add(2);
        bt.add(3);
        bt.add(4);
        bt.add(5);
        bt.add(6);
        bt.add(7);
        System.out.print("preorder: ");
        bt.preorder(bt.root);
        System.out.println("\n");
        System.out.print("inorder: ");
        bt.inorder(bt.root);
        System.out.println("\n");
        System.out.print("postorder: ");
        bt.postorder(bt.root);
    }
}

class NodeBT {
    int data;
    NodeBT left, right;

    public NodeBT(int data) {
        this.data = data;
        left = right = null;
    }
}

class BT {
    NodeBT root;

    public void add(int input){
        if (root == null) {
            root = new NodeBT(input);
            return;
        }
        Queue queue = new Queue();
        queue.enqueue(root);
        while(!queue.isEmpty()){
            NodeBT pointer = queue.dequeue();
            if (pointer.left == null) {
                pointer.left = new NodeBT(input);
                return;
            }
            else {
                queue.enqueue(pointer.left);
            }

            if (pointer.right == null) {
                pointer.right = new NodeBT(input);
                return;
            }
            else {
                queue.enqueue(pointer.right);
            }
        }
    }

    public void preorder(NodeBT current){
        System.out.print(current.data + " ");
        if (current.left != null) {
            preorder(current.left);
        }
        if (current.right != null) {
            preorder(current.right);
        }
    }

    public void inorder(NodeBT current){
        if (current.left != null) {
            inorder(current.left);
        }
        System.out.print(current.data + " ");
        if (current.right != null) {
            inorder(current.right);
        }
    }

    public void postorder(NodeBT current) {
        if (current.left != null) {
            postorder(current.left);
        }
        if (current.right != null) {
            postorder(current.right);
        }
        System.out.print(current.data + " ");
    }
}

class NodeQueue {
    NodeBT data;
    NodeQueue next;

    public NodeQueue(NodeBT data) {
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

    public void enqueue(NodeBT data) {
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

    public NodeBT dequeue() {
        if (!isEmpty()) {
            NodeBT temp = head.data;
            head = head.next;
            size--;
            return temp;
        }
        return null;
    }
}