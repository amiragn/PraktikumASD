public class Generic {
    public static void main(String[] args) {
        Printer<Integer> p = new Printer<>(1);
        p.print();

        Printer<Double> p1 = new Printer<>(1.5);
        p1.print();
    }
}