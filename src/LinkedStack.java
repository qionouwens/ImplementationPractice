public class LinkedStack<E> implements Stack<E> {
    private SinglyLinkedList<E> singlyLinkedList;
    public LinkedStack() {
        singlyLinkedList = new SinglyLinkedList<>();
    }
    public int size() {return singlyLinkedList.size();}
    public boolean isEmpty() {return singlyLinkedList.isEmpty();}
    public void push(E e) {
        singlyLinkedList.addFirst(e);
    }
    public E top() {
        return singlyLinkedList.first();
    }

    public E pop() {
        return singlyLinkedList.removeFirst();
    }
}
