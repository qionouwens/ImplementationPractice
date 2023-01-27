import java.util.Arrays;

public class ArrayQueue<E> implements Queue<E> {
    public static final int capacity = 1000;
    private E[] data;
    private int f;
    private int sz;

    public ArrayQueue() {this(capacity);}
    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
        f = 0;
        sz = 0;
    }

    public int size() {return sz;}
    public boolean isEmpty() {return sz==0;}

    public void enqueue(E e) throws IllegalStateException {
        if (sz == data.length) throw new IllegalStateException("Queue is full");
        int avail = (f + sz) % data.length;
        data[avail] = e;
        sz++;
    }

    public E first() {
        if (isEmpty()) {return null;}
        return data[f];
    }

    public E dequeue() {
        if (isEmpty()) {return null;}
        E answer = data[f];
        data[f] = null;
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }
}
