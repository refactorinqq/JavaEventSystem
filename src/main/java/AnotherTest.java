import me.refactoring.eventsystem.Subscribe;

/**
 * @author refactoring
 * @date 01-09-2023
 */
public class AnotherTest {
    @Subscribe
    public static void onTestEvent(TestEvent testEvent) {
        System.out.println("Test Event Triggered");
    }

    @Subscribe
    public static void onFalseTestEvent(String falseTestEvent) {
        System.out.println("This event will never be triggered.");
    }
}
