public class Printer <T> {
    T something;

    public Printer(T something) {
        this.something = something;
    }

    public void print() {
        System.out.println(something);
    }
}