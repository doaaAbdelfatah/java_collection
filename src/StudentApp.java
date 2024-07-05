import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student1> studentsList = new ArrayList<>();
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
                    studentsList.add(new Student1(name , g));
                    break;

                case 2:
                    System.out.print("please enter student index start with 1 to  " + (studentsList.size()) + " : ");
                    int x =scanner.nextInt();
                    if (x <= studentsList.size())
                        studentsList.remove( x-1 );
                    else System.out.println("Not Found student at " + x);
                    break;
                case 3:
                    System.out.print("Enter Name : ");
                    name = scanner.next();
                    System.out.print("Enter New Grade : ");
                     g= scanner.nextDouble();
                    for (int i = 0; i < studentsList.size(); i++) {
                        if (studentsList.get(i).getName().equals(name)){
                            studentsList.get(i).setGrade(g);
                            System.out.println("Student " + name + " updated");
                        }
                    }
                    break;
                case 4:
                    int i =1;
                    for (Student1 s : studentsList){
                        System.out.println( i++ +  " - " + s);
                    }

                    break;
                case 5:
                    System.out.print("Please Enter Student Name : ");
                    name = scanner.next();
                    for (Student1 s : studentsList){
                       if(s.getName().equals(name)){
                           System.out.println("Student " + name + " found and Grade = " + s.getGrade());
                       }
                    }

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
