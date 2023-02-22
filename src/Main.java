import java.util.*;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String> myList = new MyArrayList<>();
       // List<String> myList = new ArrayList<>();


        myList.add("first");
        myList.add("second");
        myList.add("third");
        myList.add("fourth");
        System.out.println(myList.size());
        myList.add("five");

        System.out.println(myList.size());

        System.out.println(myList.get(8));
        myList.remove(-12);
        myList.remove(5);
        System.out.println(myList);

        myList.clear();
        System.out.println(myList);


//
//        LinkedList<String> lList = new LinkedList<>();
//
//        MyLinkedList<String> llist = new MyLinkedList<>();
//
//        llist.add("397");
//        llist.add("398");
//        llist.add("399");
//        llist.add("400");
//        llist.add("401");
//
//        llist.remove(5);
//        ////llist.remove(4);
//        //llist.remove(3);
//        System.out.println(llist);
//
//        System.out.println(llist.get(0));
//        System.out.println(llist.get(3));
//        llist.clear();
//        System.out.println(llist);

//
//
//         MyStack <String> llist = new MyStack<>();
//
//        System.out.println(llist.peek());
//        System.out.println(llist.pop());
//
//        llist.push("397");
//        llist.push("398");
//        llist.push("399");
//        llist.push("400");
//        llist.push("401");
//        System.out.println(llist);
//        System.out.println(llist.peek());
//        System.out.println(llist.pop());
//        System.out.println(llist.size());
//        System.out.println(llist);
//        System.out.println(llist.pop());
//        System.out.println(llist);
//        System.out.println(llist.size());//3
//        System.out.println(llist.peek());
//        System.out.println(llist.pop());
//        System.out.println(llist);
//        System.out.println(llist.size());//3
//        System.out.println(llist.pop());
//        System.out.println(llist);
//        System.out.println(llist.size());//3
//        System.out.println(llist.pop());
//        System.out.println(llist.size());//3
//        System.out.println(llist.pop());
//        llist.remove(1);
//        System.out.println(llist);

//        MyHashMap <Fruits, Integer> myHashMap = new MyHashMap<Fruits, Integer>();
//
//        Fruits apple = new Fruits("яблоко");
//        Fruits plum = new Fruits("слива");
//        Fruits banana = new Fruits("банан");
//
//        myHashMap.put(apple, 15);
//        myHashMap.put(plum, 55);
//        myHashMap.put(banana, 75);
//        myHashMap.put(plum, 115);
//
//
//        System.out.println(myHashMap);
//        System.out.println(myHashMap.size());
//        myHashMap.remove(banana);
//        System.out.println(myHashMap);
//        System.out.println(myHashMap.get(apple));
//        System.out.println(myHashMap.get(new Fruits("персик")));
//        myHashMap.clear();
//        System.out.println(myHashMap.size());
//        System.out.println(myHashMap);
//        myHashMap.remove(plum);



    }
}
