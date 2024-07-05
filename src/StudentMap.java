import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StudentMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String ,Double> studentsMap = new HashMap<>();
        boolean loop = true;
        do {
            System.out.println("1. Add student\n" +
                    "2. Remove student\n" +
                    "3. Update student grade\n" +
                    "4. Display all students\n" +
                    "5. Find student grade\n" +
                    "6. Exit\n");

            try {
                String name="";
                double g=0;
                int num = scanner.nextInt();  // 1 ,2,3,4,..
                switch (num){
                    case 1:
                        System.out.print("Name : ");
                        name = scanner.next();
                        System.out.print("Grade : ");
                        g = scanner.nextDouble();
                        studentsMap.put(name , g);
                        break;

                    case 2:
                        System.out.print("please enter student name : ");
                        name =scanner.next();
                        studentsMap.remove(name);
                        break;
                    case 3:
                        System.out.print("Enter Name : ");
                        name = scanner.next();
                        System.out.print("Enter New Grade : ");
                        g= scanner.nextDouble();

                        studentsMap.put(name , g);
                        break;
                    case 4:

                        Set<String> names =  studentsMap.keySet();
                        for (String k : names){
                            System.out.println( k  +  " - " +  studentsMap.get(k));
                        }

                        break;
                    case 5:
                        System.out.print("Please Enter Student Name : ");
                        name = scanner.next();
                        System.out.println(studentsMap.get(name));
                        break;
                    case 6 :
                        System.out.println("Good bye");
                        loop =false;
                        break;
                }
            }catch (Exception e){
                System.out.println("Entry Error please Try Again : " + e.getMessage());
                scanner.next();
            }
        }while (loop);


    }
}
