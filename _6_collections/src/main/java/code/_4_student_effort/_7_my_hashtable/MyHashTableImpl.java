package code._4_student_effort._7_my_hashtable;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashTableImpl<K,V> implements MyHashTable<K,V> {
    private ArrayList<V> elements;
    private int tableLength;
    private int size;

    public MyHashTableImpl() {
        size = 0;
        tableLength = 100;
        this.elements = new ArrayList<>();
        for (int i = 0; i < tableLength; i++) {
            elements.add(null);
        }
    }

    @Override
    public V get(K key) {
        return elements.get(key.hashCode()%tableLength);
    }

    @Override
    public void put(K key, V value) {
        elements.set(key.hashCode()%tableLength, value);
        size++;
    }

    @Override
    public void remove(K key) {
        elements.remove(key.hashCode()%tableLength);
        size--;
    }

    @Override
    public boolean containsKey(K key) {
        return elements.get(key.hashCode()%tableLength) != null;
    }

    @Override
    public int size() {
        return size;
    }
}
