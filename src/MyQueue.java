public class MyQueue <T> {

  private   MyQueue.Node first;
  private   MyQueue.Node last;


    public  void add(T value) {
        MyQueue.Node node = new Node((T) value);
        if (first==null){
            first = node;
            last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
    }


     public T peek() {
        if (size()==0) return null;
        return (T)first.value;
    }


      public T  poll() {
                if (size()==0) return null;
                T value1 = (T)first.value;
                first = first.next;
                return value1;
        }


        public  void clear() {
            first = null;
            last = null;
        }

      public int size() {
       int counter =0;
       var temp = first;
       while (temp !=null) {
           counter++;
           temp = temp.next;
       }
       return counter;
        }


        @Override
        public String toString () {
            StringBuilder sb = new StringBuilder();
            Node temp = first;
            for (int i = 0; i < size(); i++) {
                sb.append(temp.value.toString() + ", ");
                temp = temp.next;
            }
            return sb.toString();
        }


    public class Node <T> {
        T value;
        Node prev;
        Node next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyLinkedList.Node oNoda = (MyLinkedList.Node) o;
            boolean qwerty = value.equals(oNoda.value);
            return qwerty;
        }
    }
}
