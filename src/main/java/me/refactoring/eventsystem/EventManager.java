package me.refactoring.eventsystem;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author refactoring
 * @date 01-09-2023
 */
public class EventManager {
    private static final EventManager instance = new EventManager();

    public static EventManager getInstance() {
        return instance;
    }

    public Map<Class<?>, Object> targetClasses = new HashMap<>();

    public void register(Object object) {
        if(targetClasses.containsKey(object.getClass())) return;
        targetClasses.put(object.getClass(), object);
    }

    public void unregister(Object object) {
        targetClasses.remove(object.getClass());
    }

    public void clearTargets() {
        targetClasses.clear();
    }

    public void fire(Event event) {
        targetClasses.forEach((clazz, object) -> {
            for (Method method : clazz.getDeclaredMethods()) {
                if(method.isAnnotationPresent(Subscribe.class) && method.getAnnotation(Subscribe.class).target().equals(event.getClass())) {
                    try {
                        method.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
    }
}