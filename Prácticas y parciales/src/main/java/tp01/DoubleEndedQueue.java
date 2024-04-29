package tp01;

import java.util.LinkedList;

public class DoubleEndedQueue<T> {
    private LinkedList<T> elements;

    public DoubleEndedQueue() {
        elements = new LinkedList<>();
    }

    public void enqueueFirst(T dato) {
        elements.addFirst(dato);
    }
}