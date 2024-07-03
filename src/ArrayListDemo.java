import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println(list.isEmpty());
        list.add("Ahmed"); // 0
        list.add(10); // 1
        list.add(new StringBuilder("Test")); // 2
        System.out.println(list.isEmpty());
        System.out.println(list.get(2));
        System.out.println(list.size());

        System.out.println(list.contains("Ahmed"));
        System.out.println(list.contains("Ali"));


        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("Sara");
        names.add("Ahmed");
        names.add("Dina");
        names.add("Sara");

        System.out.println(names);
        System.out.println(names.size());

        for (String s : names) System.out.println(s);
        System.out.println(names.get(3));
        System.out.println("-----------------");
        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));
        }
    }
}
