public class MyStack <T> {

 private    MyStack.Node first;
 private    MyStack.Node last;


    public  void push(T value) {
        MyStack.Node node = new Node((T) value);
        if (first==null){
            first = node;
            last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
    }

    public  void remove(int index) {
        if (index>=0 && index<=size()-1) {
            if (index==0){
                int counter = size()-1;
                first = first.next;
                var temp2 = last.prev;
                while (temp2 != null) {
                    --counter;
                    if (counter==1) {
                        temp2.prev = null;
                    }
                    temp2 = temp2.prev;

                }
            }
            else if (index==size()-1) {
                int counter = 0;
                last = last.prev;
                var temp = first;
                while (temp != null) {
                    ++counter;
                    if (counter== size()-1) {
                        temp.next = null;
                    }
                    temp = temp.next;
                }
            } else {
                var temp = first;
                Node temp2 = null;
                int counter=0;
                while (temp != null) {

                    if (counter==index-1) {
                        temp2 = temp;
                    }  counter++;
                    temp = temp.next;
                    if (counter==index+1) {
                        temp2.next= temp;
                        temp.prev=temp2;
                    }
                }
            }
        } else System.out.println("can't find this index");
    }


    public T peek() {
        if (size()==0) return null;
        return (T)last.value;
    }


    public T  pop() {
        if (size()==0) return null;
        var temp = first;
        Node temp2 = null;
        while (temp !=last) {
            temp2 = temp;
            temp = temp.next;
            }
        T value1 = (T)temp.value;
        last = temp2;
       return value1;
    }


    public  void clear() {
        first = null;
        last = null;
    }




    public int size() {
        int counter =0;
        var temp = last;
        while (temp !=null) {
            counter++;
            temp = temp.prev;
        }
        return counter;
    }


    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        Node temp = last;
        while (temp != null) {
            if (temp==first) sb.append(temp.value.toString());
            else sb.append(temp.value.toString() + ", ");
            temp = temp.prev;
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
