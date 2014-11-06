import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Demo 3:
 * Demo of Streams API and how it can reduce boiler plates with traversing collections
 * <p>
 * Created by mfhoel on 02.11.14.
 */
public class CollectionExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 25, 6, 7, 8, 9, 5);

        Comparator<Integer> ascendingOrder = Integer::compare;
        System.out.println("Even numbers " + oddOld(integers));
        System.out.println("Odd numbers " + getNumbers(integers, ascendingOrder, i -> i % 2 != 0));

        Comparator<Integer> descendingOrder = ascendingOrder.reversed();
        System.out.println("Odd numbers " + evenOld(integers));
        System.out.println("Even numbers " + getNumbers(integers, descendingOrder, i -> i % 2 == 0));


    }

    private static Collection<Number> getNumbers(List<Integer> integers, Comparator<Integer> sortOrder, Predicate<Integer> predicate) {
        return integers.parallelStream().filter(predicate).sorted(sortOrder).collect(Collectors.toList());
    }

    private static Collection<Integer> evenOld(List<Integer> numbers) {
        List<Integer> even = new ArrayList<>();

        for (int i : numbers) {
            if (i % 2 == 0) {
                even.add(i);
            }
        }

        Collections.reverse(even);
        return even;
    }

    private static Collection<Integer> oddOld(List<Integer> integers) {
        List<Integer> odd = new ArrayList<>();

        for (int i : integers) {
            if (i % 2 != 0) {
                odd.add(i);
            }
        }

        Collections.sort(odd);
        return odd;
    }

}
