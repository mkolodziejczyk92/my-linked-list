package org.example.my_linked_list;

public interface MyLinkedListMethods<T> {

    int size();
    void add (T data);
    void remove (T data);
    void putAt (T dataFromList, T newData);
    void clear();
    void printList();
}
