package org.example.my_linked_list;


public class MyLinkedList<T> implements MyLinkedListMethods<T> {

    private Node<T> head;
    private int size = 0;


    @Override // READY TO USE
    public int size() {
        return this.size;
    }

    @Override // READY TO USE
    public void add(T data) {
        Node<T> node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(node);
        }
        this.size++;
    }

    @Override // READY TO USE
    public void remove(T data) {
        Node lastNode = head;
        Node previousNode = head;

            while (!lastNode.getData().equals(data) && lastNode.getNext() != null) {
                previousNode = lastNode;
                lastNode = lastNode.getNext();
        }

        if (lastNode.getNext() != null) {
            Node nextNode = lastNode.getNext();
            previousNode.setNext(nextNode);
            this.size--;
        }
    }


    @Override // READY TO USE
    public void putAt(T dataFromList, T newItem) {
        Node newNode = new Node(newItem);
        Node lastNode = head;
        Node previousNode = head;
        while (!lastNode.getData().equals(dataFromList) && lastNode.getNext() != null) {
            previousNode = lastNode;
            lastNode = lastNode.getNext();
        }
        if (lastNode.getNext() != null) {
            Node nextForLastNode = lastNode.getNext();
            previousNode.setNext(newNode);
            newNode.setNext(nextForLastNode);
        }
    }

    @Override // READY TO USE
    public void clear() {
        head = null;
        this.size = 0;
    }

    @Override // READY TO USE
    public void printList() {
        if (this.size != 0) {
            Node lastNode = head;
            System.out.print("List:[");
            while (lastNode.getNext() != null) {
                System.out.print(lastNode.getData() + ", ");
                lastNode = lastNode.getNext();
            }
            System.out.println(lastNode.getData() + "]");
        } else {
            System.out.println("Linked list is empty");
        }
    }

}
