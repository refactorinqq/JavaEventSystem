# JavaEventSystem
simple annotation based event system


`Usage`

`CustomEvent.java`
```java
public class CustomEvent() extends Event {}
```

```java
// in ur start method or similar
private EventManager eventManager = EventManager.getInstance();
eventManager.register(new EventListener()); // Replace with ur class where the event should be called

// when u want to call the event
eventManager.fire(new CustomEvent(data));

// listening for the event
@Subscribe
public static void onCustomEvent(CustomEvent customEvent) {
  // event triggered code
}
```
