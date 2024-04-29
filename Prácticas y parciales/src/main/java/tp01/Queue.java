package tp01;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> elements;

    public Queue() {
        elements = new ArrayList<>();
    }

    public void enqueue(T dato) {
        elements.add(dato);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elements.remove(0);
    }

    public T head() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elements.get(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public String toString() {
        return elements.toString();
    }
}