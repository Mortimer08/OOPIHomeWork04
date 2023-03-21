
public class Program {
    public static void main(String[] args) {
        Cat[] cats = { new Cat("Tima", 15), new Cat("Fyodor", 5), new Cat("Fluffy", 10), };

        // Integer[] i = { 1, 2, 3, 5, 6, 3, 646, 3, 76, 5, 3, 2, 6, 5, 7, 3, 4, 5, 6, 4 };

        // MyArrayList<Integer> al = new MyArrayList<>(i);
        // System.out.println(al.getArrayLength());
        // al.addElement(12);
        // System.out.println(al.getArrayLength());
        // al.addElement(54);
        // System.out.println(al.getArrayLength());
        // al.deleteArrayElement(5);
        // System.out.println(al.getArrayLength());
        // al.showArray();
        MyArrayList<String> st = new MyArrayList<>(new String[] { "String1", "String2", "String3" });
        System.out.println(st.getArrayIndex("String1"));
        // MyArrayList<Cat> ct = new MyArrayList<>(cats);
        // ct.showArray();
        // System.out.println(ct.getArrayLength());
        // System.out.println(ct.getArrayElement(0));
        st.addElement("String4");
        st.showArray();
        System.out.println("-----------");
        // System.out.println(ct.getLength());
        st.insertElement(3, "String1");
        // System.out.println(st.getLength());
        st.showArray();
        System.out.println("-----------");
        st.deleteArrayElements("String1");
        // System.out.println("-----------");
        st.showArray();

    }

}