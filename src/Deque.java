public interface Deque<E> {
    /** returns the number of elements in the deque. */
    int size();
    boolean isEmpty();
    E first();
    E last();
    void addFirst(E e);
    void addLast(E e);
    E removeFirst();
    E removeLast();

}
