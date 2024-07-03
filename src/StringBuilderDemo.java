public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Doaa");
        StringBuilder s2 = new StringBuilder("Doaa Ahmed");
        System.out.println(s1.compareTo(s2));


        StringBuilder s3 = new StringBuilder("ABC");
        s3.appendCodePoint(68); // D
        s3.appendCodePoint(69); // E
        StringBuilder s4 = new StringBuilder();
        for (int i = 65; i <=90 ; i++) {
            s4.appendCodePoint(i);
        }
        for (int i = 97; i <=122 ; i++) {
            s4.appendCodePoint(i);
        }
        System.out.println(s4);

        System.out.println(s2); //Doaa Ahmed
//        s2.delete(1,3 );
//        System.out.println(s2); //

        s2.replace(1,3 ,"xxxxxxxxxxxxxxxx");

        System.out.println(s2); //

    }
}
