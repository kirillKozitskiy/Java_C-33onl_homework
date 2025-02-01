package lesson15.homework.myArray;

public class MyArrayList<T> implements MyList<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size = 0;

    public MyArrayList() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private void resize(){
        T[] newArray = (T[]) new Object[array.length*2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public void add(T element) {
        if(size == array.length){
            resize();
        }
        array[size++] = element;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Wrong index");
        }
        else {
            return array[index];
        }
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Wrong index");
        }
        else {
            for(int i = index; i < size-1; i++){
                array[i] = array[i+1];
            }
            array[--size] = null;
        }
    }

    @Override
    public boolean isElementInTheList(int element) {
        for (int i = 0; i < size; i++) {
            if(array[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public void clear() {
        array = (T[]) new Object[16];
    }
//check this method other works well
    @Override
    public void printList() {
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
}
