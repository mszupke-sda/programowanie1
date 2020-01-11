package iterator;

public class Iterator<T> {

    private IteratorItem head;
    private IteratorItem tail;

    public void add(T obj) {
        IteratorItem iteratorItem = new IteratorItem(obj);

        if (head == null) {

            head = iteratorItem;
            tail = iteratorItem;

        } else {

            tail.setNext(iteratorItem);
            tail = iteratorItem;

        }
    }

    public boolean hasNext() {
        // TODO
        return false;
    }

    public T next() {
        // TODO
        return null;
    }

    private class IteratorItem {

        private T item;
        private IteratorItem next;

        public IteratorItem(T item) {
            this.item = item;
        }

        public void setNext(IteratorItem next) {
            this.next = next;
        }

    }

}
