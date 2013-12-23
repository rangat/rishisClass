import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ranga_000 on 12/23/13.
 */
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        Random generator = new Random();
        while(!list.isEmpty()) {
            int value = generator.nextInt(list.size());
            System.out.println(list.get(value));
            list.remove(value);
        }
    }
}
