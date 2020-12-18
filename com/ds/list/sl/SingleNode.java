package com.ds.list.sl;

public class SingleNode<E> {
    private E data;
    private SingleNode next;
    public SingleNode(E data, SingleNode next) {
        this.data = data;
        this.next = next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }
    public SingleNode getNext() {
        return this.next;
    }

    public E getElement() {
        return data;
    }
}
