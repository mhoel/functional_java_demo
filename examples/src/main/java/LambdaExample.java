import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        helloLambda(new Function<Integer, String>() {
            @Override
            public String apply(Integer number) {
                return String.valueOf(number * 2);
            }
        });

        buttonExample();
    }

    private static void buttonExample() {
        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed");
            }
        });
    }
}
