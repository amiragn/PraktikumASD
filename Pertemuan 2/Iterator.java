import java.util.*;

public class Iterator {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("mira");
        ll.add("shania");
        ll.add("ani");
        ll.add("ina");
        System.out.println(ll);

        java.util.Iterator<String> itr = ll.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}