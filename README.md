# Event System
simple annotation based event system


`Usage`

`CustomEvent.java`
```java
public class CustomEvent() extends Event {}
```

`Main class`
```java
// in ur start method or similar
private EventManager eventManager = EventManager.getInstance();
eventManager.register(new EventListener()); // Replace with ur class where the event should be called

// when u want to call the event
eventManager.fire(new CustomEvent(data));
```
`EventListener.java`
```java
public class EventListener {
    // listening for the event
    @Subscribe(target = CustomEvent.class)
    public static void onCustomEvent(CustomEvent event) {
        // event triggered code
    }   
}
```
