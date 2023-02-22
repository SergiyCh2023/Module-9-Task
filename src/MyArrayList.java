import java.util.Arrays;

public class MyArrayList<T> {

  private  T [] t;
  private int counter;

    public MyArrayList() {
        this.t = (T[])new Object[5];
    }

    public void add (T value) {
        if (counter<t.length) {
             t[counter++] = (T)value;
        }
        else {
           t = Arrays.copyOf(t, t.length+1);
           add(value);
        }

    }


    public  void remove(int index) {
        if (index>=0 && index<size()) {
            int localCounter =0;
            for (int i = 0; i < t.length-1; i++) {
                if (i==index) {
                    ++localCounter;
                    t[i] = t[i+localCounter];
                } else {
                    t[i] = t[i+localCounter];
                }
            }
            t = Arrays.copyOf(t, t.length-1);
            counter--;
        } else System.out.println("can't find this index");
    }


    public  void clear() {
        T [] t1 = (T[]) new Object [0];
        t=t1;
    }


    public int size() {
        return this.counter;
    }

    public  T get(int index) {
        if (index>=0 && index<size() && t[index]!=null) return t[index];
        else System.out.println("can't find this index");
        return null;
    }

    @Override
    public String toString() {
        if (t.length==0) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < t.length; i++) {
            if (i<t.length-1) sb.append(t[i].toString() + ", ");
            else sb.append(t[i].toString() + "]");
        }
        return sb.toString();
    }
}
