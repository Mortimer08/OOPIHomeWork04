public class Element<T> {
    public T value;
    public static int counter = 0;
    public int index;

    public Element(T elem) {
        value = elem;
        index = counter++;
    }

    public String toString() {
        return value.toString();
    }

    // @Override
    // public boolean equals(Element<T> obj) {
    //     return this.value.equals(obj);
    // }
}
