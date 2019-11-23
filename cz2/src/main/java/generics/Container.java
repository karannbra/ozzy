package generics;

import java.util.HashMap;
import java.util.Map;

public class Container<T> {

    private Map<String, T> map = new HashMap<>();

    public void add(String name, T item) {
        map.put(name, item);
    }

    public T get(String name) {
        return map.get(name);
    }
}
