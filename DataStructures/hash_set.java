import java.util.HashSet;

public class hash_set {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Sona");
        names.add("Beki");
        names.add("Sona");

        System.out.println(names);
    }
}
