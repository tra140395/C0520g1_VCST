package b10danhsach.baitap;

public class MyArrayList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        }else
            throw new IllegalArgumentException("capacity: " + capacity);
    }

    private int size(){
        return this.size;
    }

    private void clear(){
        size = 0;
        for(int i = 0; i<elements.length;i++){
            elements[i] = null;
        }
    }



}
