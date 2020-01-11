package iterator;

public class Iterator<T> {

    private IteratorItem head;
    private IteratorItem tail;

    private IteratorItem current;

    private boolean isCurrentIsInitialized;

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

        if (isCurrentIsInitialized == false) {
            if (head != null) {
                return true;
            }
        }

        if (current == null) {
            return false;
        }

        if (current.next == null) {
            return false;
        }

        return true;
    }

    public T next() {

        if (isCurrentIsInitialized == false) {
            current = head;
            isCurrentIsInitialized = true;
            return current.item;
        }

        if (hasNext()) {
            current = current.next;
            T result = current.item;
            return result;
        }

        return null;
    }

    public void initialize() {
        isCurrentIsInitialized = false;
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
