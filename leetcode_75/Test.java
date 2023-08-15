import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(8);
// ...

        for (int num : sortedSet) {
            System.out.println(num);
        }
        sortedSet.pollFirst();
        for (int num : sortedSet) {
            System.out.println(num);
        }
    }
}
