import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter your Sentence : ");
        String sentence = scanner.nextLine(); // Ahmed Dina Ahmed Sara

        String [] words =sentence.split(" ");
//        System.out.println(Arrays.toString(words)); // [Ahmed, Dina, Ahmed ,Sara]

        HashSet<String> x = new HashSet<>();
//
        for (String w :words)  x.add(w);
//
        System.out.println(x); // [Ahmed, Dina ,Sara]
        System.out.println(x.size());

    }
}
