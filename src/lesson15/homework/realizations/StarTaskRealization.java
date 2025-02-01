package lesson15.homework.realizations;

import lesson15.homework.myArray.MyArrayList;
import lesson15.homework.myArray.MyList;

public class StarTaskRealization {

//    /*
//    add element
//    remove element
//    get element
//    isElement
//    clear
//     */


    public StarTaskRealization() {
        MyList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("Is 4 in the list: "+myList.isElementInTheList(4));
        System.out.println("Is 3 in the list: "+myList.isElementInTheList(3));
        System.out.println("Is empty: "+myList.isEmpty());
        System.out.println("index 1: "+myList.get(1));
        System.out.println("index 1: "+myList.get(1));
        System.out.println("PRINT LIST "+myList);
        myList.printList();
        System.out.println();
        myList.remove(2);
        myList.printList();
        System.out.println();
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.printList();
    }



}
