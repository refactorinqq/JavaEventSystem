import me.refactoring.eventsystem.EventManager;

/**
 * @author refactoring
 * @date 01-09-2023
 */
public class Test {
    public static EventManager eventManager;

    public static void main(String[] args) {
        eventManager = EventManager.getInstance();
        eventManager.register(new AnotherTest());
        eventManager.fire(new TestEvent());
    }
}
