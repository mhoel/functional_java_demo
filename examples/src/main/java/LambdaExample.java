import java.awt.*;
import java.util.function.Function;

/**
 * Demo 2:
 * This is what Lambdas look like and compare it to anonymous classes
 * <p>
 * Created by mfhoel on 04.11.14.
 */
public class LambdaExample {

    public static void helloLambda(Function<Integer, String> function) {
        System.out.println("Hello Lambda " + function.apply(5));
    }

    public static void main(String[] args) {
        helloLambda(number -> String.valueOf(number * 2));

        buttonExample();
    }

    private static void buttonExample() {
        Button button = new Button();
        button.addActionListener(e -> System.out.println("Button pressed"));
    }
}
