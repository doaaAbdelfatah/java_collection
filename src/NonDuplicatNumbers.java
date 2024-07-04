import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class NonDuplicatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers of Integers : ");
        int c = scanner.nextInt(); // 5

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            System.out.print("N " + (i+1) + " : ");
            list.add(scanner.nextInt());
        }
        System.out.println(list);

        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set);

    }
}
