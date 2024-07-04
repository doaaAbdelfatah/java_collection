import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo2 {

    public static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap<>();
        map.put(10 , "Ahmed");
        map.put(20 , "Sara");
        map.put(25 , "Ali");
        map.put(22 , "Ahmed");

        Set<Integer> keys =  map.keySet(); // [10,20,25,22]
        for(Integer i : keys){
            System.out.println(i + " : " + map.get(i));
        }
        Collection<String> names = map.values();
        for (String s :names) System.out.println(s);
    }
}
