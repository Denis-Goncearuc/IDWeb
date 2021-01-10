import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(15);
        list.add(1);
        list.add(2);
        list.add(15);

        list.forEach(integer -> {
            if(!set.contains(integer))
                set.add(integer);
            else
                set.remove(integer);
        });
        System.out.println(set);


    }
}
