public class Fruits {

    String name;
    public Fruits(String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruits oNoda = (Fruits) o;
    //    System.out.println("This is equals the Friut)))))");
        return name.equals(oNoda.name);
    }

}
