package com.ds.list.sl;

public class SingleLinkedList<E> {

    SingleNode head = null;
    SingleNode tail = null;
    int size = 0;

    public SingleLinkedList() {
        this.head = new SingleNode(null, null);
        this.tail = new SingleNode(null, null);
        this.size = 0;
    }
    //insert into linked list
    public void add(int index, E element) {
        if (size < index) {
            throw new RuntimeException("Index out of bound for size "+this.size);
        }
        if (index == 0) {
            SingleNode node = new SingleNode(element, head.getNext());
            head.setNext(node);
        } else if (index == this.size) {
            SingleNode node = new SingleNode(element, null);
            tail.getNext().setNext(node);
            tail.setNext(node);

        } else {
            SingleNode e = head;
            for (int i = 0; i < index; i++) {
                e = e.getNext();
            }
            SingleNode node = new SingleNode(element, e.getNext());
            e.setNext(node);
        }
        this.size++;


    }

    public void add(E element) {
        if (head.getNext() == null) {
            SingleNode node = new SingleNode(element, null);
            head.setNext(node);
            tail.setNext(node);
        } else {
            SingleNode node = new SingleNode(element, null);
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
        SingleNode node = head.getNext();
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
        SingleNode node = head.getNext();
        for (int i = 1; i <= index; i++) {
            node = node.getNext();
        }
        return (E)node.getElement();
    }

    //deletion
    public void delete(int index) {
        validateList(index);
        if (index == 0) {
            SingleNode node = this.head.getNext();
            this.head.setNext(node.getNext());
            node.setNext(null);
            this.size--;
            if (this.size == 0) {
                tail.setNext(null);
            }
        } else if (index == (this.size - 1)) {
            SingleNode node = this.head.getNext();
            for (int i = 1; i < this.size - 1;i++) {
                node = node.getNext();
            }
            tail.setNext(node);
            node.setNext(null);
            this.size--;
        } else {
            SingleNode node = head.getNext();
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
        SingleNode node = head.getNext();
        while (node != null) {
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
        SingleNode node = head.getNext();
        while(node != null) {
            System.out.print(node.getElement() +" , ");
            node = node.getNext();
        }
    }
}


//deleting for last