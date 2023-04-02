package MyArray;

import java.util.Iterator;

public class MyArray<T> {
    private T[] localArray;
    private int length;
    private int size = 10;

    public MyArray() {
        localArray = (T[]) new Object[size];
        length = 0;
    }

    public MyArray(T arr[]) {
        localArray = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            localArray[i] = arr[i];
        }
        localArray = arr;
        length = arr.length;
    }

    public void addElement(T elem) {
        if (size == length) {
            enlargeArray();
        }
        localArray[length++] = elem;
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
            if (localArray[index].equals(elem)) {
                return index;
            }
        }
        return -1;
    }

    public boolean isInArray(T element) {
        for (int index = 0; index < length; index++) {
            if (localArray[index].equals(element)) {
                return true;
            }
        }
        return false;
    }


    public void insertElement(int index, T elem) {
        if (index < length) {
            if (size == length) {
                enlargeArray();
            }
            T[] newArray = (T[]) new Object[size];
            int j = 0;
            for (int i = 0; i < length; i++) {
                if (i == index) {
                    newArray[j++] = elem;
                } else {
                    newArray[j++] = localArray[i];
                }
            }
            localArray = newArray;
            length++;
        } else {
            System.out.println("Индекс за пределами массива");
        }
    }

    public void setElement(int index, T elem) {
        if (index < length) {
            localArray[index] = elem;
        } else {
            System.out.println("Индекс за пределами массива");
        }
    }

    public void deleteArrayElement(int index) {
        T[] newArray = (T[]) new Object[size];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (i == index)
                continue;
            else {
                newArray[j++] = localArray[i];
            }
        }
        localArray = newArray;
        length--;
    }

    public void deleteElements(T element) {
        T[] newArray = (T[]) new Object[size];
        int j = 0;
        int previousLength = length;
        for (int i = 0; i < previousLength; i++) {
            if (localArray[i].equals(element)) {
                length--;
            } else {
                newArray[j++] = localArray[i];
            }
        }
        localArray = newArray;
        if (size / length > 2) {
            reduceArray();
        }
    }

    public void showArray() {
        for (int index = 0; index < length; index++) {
            System.out.println(localArray[index]);
        }
    }

    private void enlargeArray() {
        T[] enlargedArray = (T[]) new Object[length * 2];
        for (int i = 0; i < localArray.length; i++) {
            enlargedArray[i] = localArray[i];
        }
        localArray = enlargedArray;
    }

    public void reduceArray() {
        T[] reducedArray = (T[]) new Object[size / 2];
        for (int i = 0; i < localArray.length; i++) {
            reducedArray[i] = localArray[i];
        }
        localArray = reducedArray;
    }
}