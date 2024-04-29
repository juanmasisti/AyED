package tp01;

public class CircularQueue<T> extends Queue<T> {
    public T shift() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T first = dequeue();
        enqueue(first);
        return first;
    }
}