import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Demo 1:
 * <p>
 * This is an example of what a Class method Reference looks like
 * <p>
 * Created by mfhoel on 04.11.14.
 */
public class MethodReference {
    public static void example(Supplier<Double> supplier, Consumer<String> consumer) {
        consumer.accept(supplier.get().toString());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            example(Math::random, System.out::println);
        }
    }


}
