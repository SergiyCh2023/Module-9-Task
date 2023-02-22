public class MyHashMap <T, V> {
    private   MyHashMap.Node [] array;
    private   T key;
    private   V value;


    public <T, V> MyHashMap() {
        array = new Node[8];
    }

    public void  put(T key, V value) {
        Node node = new Node(key, value);

        if (size()/array.length > 0.7)  changeSizeArray();

        if (checkingAvailability(node) != null) {
            System.out.println("such a key already exists");
            Node temp = checkingAvailability(node);
            temp.value = node.value;
        }
        else {
            int numberInArray = node.key.hashCode()%array.length;
            if (array[numberInArray]==null){
                array[numberInArray] = new Node(key, value);

            }
            else {
                Node temp = array[numberInArray];
                while (temp.next!=null){
                    temp = temp.next;
                }
                temp.next = new Node(key, value);
            }
        }
    }

    private void changeSizeArray() {
        Node[] tempArr = new Node[array.length];
        System.arraycopy(array, 0, tempArr, 0, array.length);
        array = new Node[array.length + 4];
        for (int i = 0; i < tempArr.length; i++) {
            Node temp = tempArr[i];
            while(temp!= null) {
                put((T)temp.key, (V)temp.value);
                temp = temp.next;
            }
        }
    }

    V  get(T key){
        if (array.length!=0) {
            int number = key.hashCode() % array.length;
            Node temp = array[number];
            if (temp != null) {
                while (temp != null) {
                    if (temp.key.equals(key)) return (V) temp.value;
                    temp = temp.next;
                }
            }
        }
        return null;
    }


    void remove(T key) {
        if (array.length!=0) {
            int n = key.hashCode()%array.length;
            Node temp = array[key.hashCode()%array.length];

            int counter =0;
            while(temp!= null) {
                temp = temp.next;
                counter++;
            }

            temp = array[key.hashCode()%array.length];

            Node [] arrayTemp = new Node[counter];
            counter=0;
            while(temp!= null) {
                arrayTemp[ counter++] = temp;
                temp = temp.next;
            }

            for (int i = 0; i < arrayTemp.length; i++) {

                if (arrayTemp[i].key.equals(key) && i==0 && arrayTemp.length==1)   {
                    array[key.hashCode()%array.length] = null;
                    break;
                }
                if (arrayTemp[i].key.equals(key) && i==0 && arrayTemp.length>1)   {
                    array[key.hashCode()%array.length] = arrayTemp[1];
                    break;
                } else if (arrayTemp[i].key.equals(key) && i!=0 && i+1<arrayTemp.length){
                    arrayTemp[i-1].next=arrayTemp[i+1].next;
                    break;
                } else if  (arrayTemp[i].key.equals(key) && i!=0 && i+1==arrayTemp.length) arrayTemp[i-1].next=null;
            }
        } else System.out.println("MyHashMap is empty");

    }

    public void clear() {
        array = new Node[0];
    }


    public int size() {

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                Node temp = array[i];
                while (temp !=null) {
                    counter++;
                    temp = temp.next;
                }
            }
        }
        return counter;
    }

    private Node checkingAvailability (Node node) {
        if (size()==0) {
            return null;
        }
        else {

            for (int i = 0; i < array.length; i++) {
                if (array[i] != null && array[i].next==null) {
                    if (array[i].key.equals(node.key)) return array[i];
                }
                else if (array[i] != null && array[i].next!=null) {
                    Node temp = array[i];
                    while (temp != null) {
                        if (temp.key.equals(node.key)) return temp;
                        temp = temp.next;
                    }

                } else continue;
            }
        }
        return null;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].next==null) {
                sb.append(array[i].key + " " + array[i].value + "\n");
            }
            else if  (array[i] != null && array[i].next != null) {
                Node temp = array[i];
                while (temp!= null) {
                    sb.append(temp.key + " " + temp.value + "\n");
                    temp = temp.next;
                }
            }
        }
        return sb.toString();
    }

    public class Node <T, V> {
        T value;
        V key;
        Node prev;
        Node next;

        public Node(T value) {
            this.value = value;
        }

        public Node (V key, T value) {
            this.value = value;
            this.key = key;
        }
    }



}
