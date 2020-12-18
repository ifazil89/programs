package com.ds.list.cl;

public class CircleLinkedList<E> {

    Node head = null;
    Node tail = null;
    int size = 0;

    public CircleLinkedList() {
        this.head = new Node(null, null);
        this.tail = new Node(null, null);
        this.size = 0;
    }
    //insert into linked list
    public void add(int index, E element) {
        if (size < index) {
            throw new RuntimeException("Index out of bound for size "+this.size);
        }
        if (index == 0) {
            Node node = new Node(element, head.getNext());
            head.setNext(node);
        } else if (index == this.size) {
            Node node = new Node(element, head.getNext());
            tail.getNext().setNext(node);
            tail.setNext(node);
        } else {
            Node e = head;
            for (int i = 0; i < index; i++) {
                e = e.getNext();
            }
            Node node = new Node(element, e.getNext());
            e.setNext(node);
        }
        this.size++;

    }

    public void add(E element) {
        if (head.getNext() == null) {
            Node node = new Node(element, null);
            head.setNext(node);
            tail.setNext(node);
        } else {
            Node node = new Node(element, head.getNext());
            tail.getNext().setNext(node);
            tail.setNext(node);
        }
        this.size++;
    }


    //searching
    public boolean isPresent(E element) {
        return getIndex(element) >=0 ? true : false;
    }

    //get index by value
    public int getIndex(E element) {
        if (head.getNext() == null) {
            return -1;
        }
        Node node = head.getNext();
        for (int i = 0; i < this.size; i++) {
            if (node.getElement().equals(element)) {
                return i;
            }
            node = node.getNext();
        }
        return -1;
    }

    //get value in index
    public E get(int index) {
        validateList(index);
        Node node = head.getNext();
        for (int i = 1; i <= index; i++) {
            node = node.getNext();
        }
        return (E)node.getElement();
    }

    //deletion
    public void delete(int index) {
        validateList(index);
        if (index == 0) {
            Node node = this.head.getNext();
            this.head.setNext(node.getNext());
            node.setNext(null);
            this.size--;
            if (this.size == 0) {
                tail.setNext(null);
            }
        } else if (index == (this.size - 1)) {
            Node node = this.head.getNext();
            for (int i = 1; i < this.size - 1;i++) {
                node = node.getNext();
            }
            tail.setNext(node);
            node.setNext(null);
            this.size--;
        } else {
            Node node = head.getNext();
            for (int i = 1; i < index; i++) {
                node = node.getNext();
            }
            node.setNext(node.getNext().getNext());
            node.getNext().setNext(null);
            this.size--;
        }

    }

    //traversal
    public void traverse() {
        System.out.println("Size: "+size);
        Node node = head.getNext();
        for (int i = 0; i < size; i++) {
            System.out.println(node.getElement());
            node = node.getNext();
        }

    }

    private boolean validateList(int index) {
        if (this.size == 0 ) {
            throw new RuntimeException("List is Empty: Size "+this.size);
        }
        if (index >= this.size) {
            throw new RuntimeException("Index out of bounds. size is "+this.size+" but index is "+index);
        }
        return true;
    }

    public int getSize() {
        return size;
    }

    public void printByHeadTail() {
        Node node = head.getNext();
        while(node != null) {
            System.out.print(node.getElement() +" , ");
            node = node.getNext();
        }
    }
}
