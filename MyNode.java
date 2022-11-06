package Stack_queues;

public class MyNode<K> implements Stack_queues.INode<K> {
    private K key;

    @Override
    public K getKey() {
        return null;
    }

    @Override
    public void setKey(K key) {
        this.key=key;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }

    private INode next;

    public MyNode(K key) {
        this.key = null;
        this.next = null;
    }
}