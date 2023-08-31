import me.refactoring.eventsystem.EventManager;
import me.refactoring.eventsystem.example.AnotherTest;
import me.refactoring.eventsystem.example.TestEvent;

/**
 * @author refactoring
 * @date 01-09-2023
 */
public class Example {
    public static EventManager eventManager;

    public static void main(String[] args) {
        eventManager = EventManager.getInstance();
        eventManager.register(new AnotherTest());
        eventManager.fire(new TestEvent());
    }
}
