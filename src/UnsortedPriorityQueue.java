import java.util.Comparator;

public class UnsortedPriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {
    private PositionalList<Entry<K, V>> list = new LinkedPositionalList<>();

    public UnsortedPriorityQueue() {super();}
    public UnsortedPriorityQueue(Comparator<K> comp) {super(comp);}

    private Position<Entry<K, V>> findmin() {
        Position<Entry<K, V>> small = list.first();
        for (Position<Entry<K, V>> walk : list.positions()) {
            if (compare(walk.getElement(), small.getElement()) < 0) {
                small = walk;
            }
        }
        return small;
    }

    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K, V> newest = new PQEntry<>(key, value);
        list.addLast(newest);
        return newest;
    }

    public Entry<K, V> min() {
        if (list.isEmpty()) {return null;}
        return findmin().getElement();
    }

    public Entry<K, V> removeMin() {
        if (list.isEmpty()) {return null;}
        return list.remove(findmin());
    }

    public int size() {return list.size();}
}
