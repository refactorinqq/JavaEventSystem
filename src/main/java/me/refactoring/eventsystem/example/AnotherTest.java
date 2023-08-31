package me.refactoring.eventsystem.example;

import me.refactoring.eventsystem.Subscribe;

/**
 * @author refactoring
 * @date 01-09-2023
 */
public class AnotherTest {
    @Subscribe(target = TestEvent.class)
    public static void onTestEvent() {
        System.out.println("Example Event Triggered");
    }

    @Subscribe(target = String.class)
    public static void onFalseTestEvent() {
        System.out.println("This event will never be triggered.");
    }
}
