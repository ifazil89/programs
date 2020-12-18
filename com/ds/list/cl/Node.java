package com.ds.list.cl;

public class Node<E> {
    private E data;
    private Node next;
    public Node(E data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return this.next;
    }
    public void setData(E data) {
        this.data = data;
    }
    public E getElement() {
        return this.data;
    }
}
