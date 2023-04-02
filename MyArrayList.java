/*
import java.util.Iterator;

public class MyArrayList<Integer> implements Iterator<T>, Iterable<T> {

    private T[] localArray;
    private int length;
    private int size = 10;
    private int iterateIndex = 0;

    public MyArrayList() {
        localArray = new T[size];
        length = 0;
    }

    public MyArrayList(T arr[]) {
        localArray = new Object[arr.length * 2];
        for (int index = 0; index < arr.length; index++) {
            localArray[index] = arr[index];
        }
        length = arr.length;
    }

    public int getArrayLength() {
        return length;
    }

    public T getArrayElement(int index) {
        length--;
        return localArray[index];
    }

    public int getArrayIndex(T elem) {
        for (int index = 0; index < length; index++) {
            if (localArray[index].value.equals(elem)) {
                return index;
            }
        }
        return -1;
    }

    public boolean isInArray(T element) {
        for (int index = 0; index < length; index++) {
            if (localArray[index].value.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void addElement(T elem) {
        if (size == length) {
            enlargeArray();
        }
        localArray[length++] = new Object<T>(elem);
    }

    public void insertElement(int index, T elem) {

        if (index < length) {
            if (size == length) {
                enlargeArray();
            }
            Object<T>[] refrashedArray = new Object[size + 1];
            int j = 0;
            for (int i = 0; i < length; i++) {
                if (i == index) {
                    refrashedArray[j++] = new Object<T>(elem);
                    refrashedArray[j++] = localArray[i];

                } else {
                    refrashedArray[j++] = localArray[i];
                }
            }
            localArray = refrashedArray;
            length++;
        }

    }

    public void deleteArrayElement(int index) {
        Object<T>[] reducedArray = new Object[size];
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

    public void deleteArrayElements(T element) {
        Object<T>[] reducedArray = new Object[size];
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

    public void showArray() {
        for (int index = 0; index < length; index++) {
            System.out.println(localArray[index]);
        }
    }

    private void enlargeArray() {
        Object<T>[] enlargedArray = new Object[length * 2];
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
                return getArrayElement(i);
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
*/