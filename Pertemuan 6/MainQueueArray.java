public class MainQueueArray {
    public static void main(String[] args) {
        QueueArray qa = new QueueArray();
        qa.enqueue(1);
        qa.enqueue(2);
        qa.enqueue(3);
        qa.print();
        qa.dequeue();
        qa.print();
    }
}

class QueueArray {
    int[] data = new int[5];
    int count = 0;

    public void enqueue(int input) {
        data[count] = input;
        count++;
    }

    public int dequeue() {
        int temp = data[0];
        for (int i = 0; i < count; i++) {
            data[i] = data[i + 1];
        }
        count--;
        return temp;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}