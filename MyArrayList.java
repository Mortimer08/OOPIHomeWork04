import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList<T> implements Iterator<T>, Iterable<T> {
    private ArrayList<T> localList;
    private Element<T>[] localArray;
    private int length;
    private int size = 10;
    private int iterateIndex = 0;

    public MyArrayList() {
        localArray = new Element[size];
        // localList = new ArrayList<>();
        length = 0;
    }

    public MyArrayList(T arr[]) {
        localArray = new Element[arr.length * 2];
        // localList = new ArrayList<T>();
        // for (int index = 0; index < arr.length; index++) {
        // localList.add(arr[index]);
        // }
        // length = localList.size();
        for (int index = 0; index < arr.length; index++) {
            localArray[index] = new Element<T>(arr[index]);
        }
        length = arr.length;
    }

    // public int getLength() {
    // return length;
    // }

    public int getArrayLength() {
        return length;
    }

    // public T getElement(int index) {
    // length--;
    // return localList.get(index);
    // }

    public Element<T> getArrayElement(int index) {
        length--;
        return localArray[index];
    }

    // public int getIndex(T elem) {
    // return localList.indexOf(elem);
    // }

    public int getArrayIndex(T elem) {
        for (int index = 0; index < length; index++) {
            if (localArray[index].value.equals(elem)) {
                return index;
            }
        }
        return -1;
    }

    public void insert(int index, T elem) {
        localList.add(index, elem);
        length++;
    }

    public void addElement(T elem) {
        if (size == length) {
            enlargeArray();
        }
        localArray[length++] = new Element<T>(elem);
    }

    public void insertElement(int index, T elem) {

        if (index < length) {
            if (size == length) {
                enlargeArray();
            }
            Element<T>[] refrashedArray = new Element[size + 1];
            int j = 0;
            for (int i = 0; i < length; i++) {
                if (i == index) {
                    refrashedArray[j++] = new Element<T>(elem);
                    refrashedArray[j++] = localArray[i];

                } else {
                    refrashedArray[j++] = localArray[i];
                }
            }
            localArray = refrashedArray;
            length++;
        }

    }

    public void delete(int index) {
        localList.remove(index);
        length--;
    }

    public void deleteArrayElement(int index) {
        Element<T>[] reducedArray = new Element[size];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (i == index)
                continue;
            else {
                reducedArray[j++] = localArray[i];

            }
        }
        localArray = reducedArray;
        length--;

    }

    public void deleteElement(T element) {
        for (int i = 0; i < length; i++) {
            if (localList.get(i).equals(element)) {
                localList.remove(i);
                length--;
            }
        }
    }

    public void deleteArrayElements(T element) {
        Element<T>[] reducedArray = new Element[size];
        int j = 0;
        int previosLength = length;
        for (int i = 0; i < previosLength; i++) {
            if (localArray[i].value.equals(element)) {
                length--;
            } else {
                reducedArray[j++] = localArray[i];

            }
        }
        localArray = reducedArray;

    }

    // public void show() {
    // for (T t : localList) {
    // System.out.println(t);
    // }
    // }

    public void showArray() {
        for (int index = 0; index < length; index++) {
            System.out.println(localArray[index]);
        }
    }

    private void enlargeArray() {
        Element<T>[] enlargedArray = new Element[length * 2];
        for (int i = 0; i < localArray.length; i++) {
            enlargedArray[i] = localArray[i];
        }
        localArray = enlargedArray;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> myListIterator = new Iterator<T>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return i < length;
            }

            @Override
            public T next() {
                return localList.get(i++);
            }
        };
        return myListIterator;
    }

    @Override
    public boolean hasNext() {
        return iterateIndex < length;
    }

    @Override
    public T next() {
        return (T) getArrayElement(iterateIndex++);
    }

}
