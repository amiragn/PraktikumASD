public class Swapping {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        // cara 1
        // int tmp = x;
        // x = y;
        // y = tmp;

        // cara 2
        // y = 2 + 3 = 5
        // y = x + y;
        // // x = 5 - 2 = 3
        // x = y - x;
        // // y = 5 - 3 = 2
        // y = y - x;

        // cara 3 (XOR dengan bilangan biner)
        x = x ^ y;
        y = y ^ x;
        x = x ^ y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}