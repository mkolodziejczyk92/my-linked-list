package org.example.my_linked_list;


public class Node <T> {

    private T data;
    private Node<T> next;

    public Node(T data) {

        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}

