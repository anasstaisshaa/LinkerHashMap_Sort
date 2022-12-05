import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(0, 1);
        map.put(1, 2);
        map.put(2, 5);
        map.put(3, 1);
        map.put(4, 1);
        map.put(5, 5);
        map.put(6, 2);
        map.put(7, 7);
        map.put(8,9);
        map.put(9,1);

        Map<Integer, Integer> result = new LinkedHashMap<>();

        System.out.println(map.values());

        for (Integer value : map.values()) {
            int sum = 0;
            for (Integer integer : map.values()) {
                if(value.equals(integer)){
                    sum++;
                }
            }
            result.put(value, sum);
        }
        System.out.println(result);
        result.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }

}
