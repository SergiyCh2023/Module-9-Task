public class Node <T, V> {
    T value;
    V key;
    Node  prev;
    Node  next;

    public Node(T value) {
        this.value = value;
    }

    public Node (V key, T value) {
        this.value = value;
        this.key = key;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node oNoda = (Node) o;
        boolean qwerty = key.equals(oNoda.key);
        return qwerty;
    }


}
