import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.add(9);


        HashSet set2 = new HashSet();
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(9);

//        set1.addAll(set2);

//        System.out.println(set1); // [1, 2, 3, 4, 5, 9]
        set1.retainAll(set2);

        System.out.println(set1); //[2, 5, 9]

        for (Object i : set1) System.out.println(i);

        HashSet<String> names = new HashSet<>();
        names.add("Sara");
        names.add("Ahmed");
        names.add("Dina");
        names.add("Mona");
        names.add("Mai");
        names.add("Mohamed");

        for (String n :names) System.out.println(n);

        HashSet<String> names2 = new HashSet<>();
        names2.add("Ahmed");
        names2.add("Dina");
        names2.add("Mona");
        System.out.println(names);
//        names.remove("Ahmed");
        names.removeAll(names2);

        System.out.println(names);




    }
}
