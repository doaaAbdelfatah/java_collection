import java.util.Scanner;
import java.util.Stack;

public class ReversString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter your Message : ");
        String msg = scanner.nextLine(); // Hello

        char [] msgChar = msg.toCharArray(); // [H,e,l,l,o]
        Stack msgStack = new Stack();
        for (char c : msgChar){
            msgStack.push(c);
        }

        while (!msgStack.isEmpty()){
            System.out.print(msgStack.pop());
        }

    }
}
