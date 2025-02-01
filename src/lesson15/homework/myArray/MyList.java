package lesson15.homework.myArray;

public interface MyList<T> {

    void add(T t);
    T get(int index);
    void remove(int index);
    boolean isElementInTheList(int element);
    boolean isEmpty();
    void clear();
    void printList();

}
