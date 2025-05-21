import java.util.AbstractList;
import java.util.ArrayList;

public class abstractLit {
    public static void main(String[] args) {

        AbstractList<String> list = new ArrayList<String>();

        list.add("Geek");
        list.add("for");
        list.add("Geeks 10");

        System.out.println("AbstractList: "+list);
        System.out.println();

    }

}