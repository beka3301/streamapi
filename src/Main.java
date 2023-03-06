import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = asList( 5,67,32,65,78,7,3,4,657,23,4 );
        System.out.println(list.stream().map(x -> x * 2).mapToInt(Integer::intValue).max());
    }
}