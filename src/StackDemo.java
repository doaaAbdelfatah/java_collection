import javax.swing.*;
import  java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        // Last In First Out (LIFO)
        Stack stack = new Stack();
        stack.push("ahmed");
        stack.push("dina");
        stack.push("sara");
        stack.push("mona");
        stack.push(new JButton("Hello"));
        stack.push(new JFrame());
        stack.push(new Person("Morad" ,30));
        stack.push(10);
        stack.push(555);

        System.out.println("search : " + stack.search("dina"));

//        System.out.println(stack.pop()); // 10
//        System.out.println(stack.pop()); // Person
//        System.out.println(stack.pop()); // mona


        Stack<Person> stack1 = new Stack<Person>();
        stack1.push(new Person("doaa" , 43));
        stack1.push(new Person("dalia" , 33));
        stack1.push(new Person("ahmed" , 20));
        stack1.push(new Person("sara" , 18));
        stack1.push(new Student("Malak" , 12));
        stack1.push(new Employee1("Moahemd" , 33));

        System.out.println("peek : "  +stack1.peek()); //Person{name='Moahemd', age=33.0}

        System.out.println(stack1.pop()); //  System.out.println("peek : "  +stack1.peek());
        System.out.println("peek : "  +stack1.peek()); // Person{name='Malak', age=12.0}
        Stack<JButton> stack2 = new Stack<>();
        stack2.push(new JButton("Hello"));
        System.out.println(stack2.empty());
        System.out.println( stack2.pop());

        System.out.println(stack2.empty());
        if (! stack2.empty() )
            System.out.println( stack2.pop());

    }
}


class Person{
    String name;
    double age;

    public Person(String name, double age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person{
    public Student(String name, double age) {
        super(name, age);
    }
}

class  Employee1 extends Person{
     Employee1(String name, double age) {
        super(name, age);
    }
}