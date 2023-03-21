public class MainStackArray {
    public static void main(String[] args) {
        StackArray sa = new StackArray();
        sa.push(1);
        sa.push(2);
        sa.push(3);
        sa.print();
        sa.pop();
        sa.print();
    }
}

class StackArray {
    int[] data = new int[5];
    int count = 0;

    public void push(int input) {
        data[count] = input;
        count++;
    }

    public int pop() {
        count--;
        int temp = data[count];
        data[count] = 0;
        return temp;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}