public class StringRevers2 {
    public static void main(String[] args) {
        String name ="doaa";
        String nameUpper = name.toUpperCase();
        System.out.println(nameUpper);
        System.out.println(name + " Mohamed");

        name += " Mohamed";
        StringBuilder name2 = new StringBuilder("Sara");
        StringBuilder lastName = new StringBuilder(" Moahmed Abd Elfatah");
//        lastName.reverse();
        System.out.println(name2);
        name2.append(lastName);
        System.out.println(name2); // sara mohamed
        System.out.println(lastName);
//        name2.reverse();
//        System.out.println(name2);
//

        StringBuilder s2 = new StringBuilder("Doaa");
        s2.setCharAt(2 , '3');
        System.out.println(s2);

    }
}
