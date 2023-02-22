public class MyLinkedList <T> {


  private     MyLinkedList.Node first;
  private     MyLinkedList.Node last;

    public void add(T value) {

        MyLinkedList.Node node = new Node((T) value);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next=node;
            node.prev = last;
            last = node;
        }
    }

    public  void remove(int index) {

        if (index>=0 && index<size()) {
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


    public int size() {
       int counter =0;
       var temp = first;
       while (temp !=null) {
           counter++;
           temp = temp.next;
       }
       return counter;
    }


    public  T get(int index){
     if (index>=0 && index<size()) {
         T result = null;
         Node temp = first;
         for (int i = 0; i < size(); i++) {
             if (i==index) {
                 result = (T)temp.value;
                 break;
             }
             else temp = temp.next;
         }
         return result;
     }  else System.out.println("can't find this index");
      return null;
    }

    public void clear() {
        this.first = null;
        this.last = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = first;
        for (int i = 0; i < size(); i++) {
            sb.append(temp.value.toString() + " ");
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
            Node oNoda = (Node) o;
            boolean qwerty = value.equals(oNoda.value);
            return qwerty;
        }
    }
}