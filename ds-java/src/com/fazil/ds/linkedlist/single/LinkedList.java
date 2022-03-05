package com.fazil.ds.linkedlist.single;

public class LinkedList<E> {

	Node<E> head;
	Node<E> tail;
	int size;
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public void add(E data) {
		Node<E> newNode = new Node<E>(data, null);
		size++;
		if (isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node<E> currentLastNode = this.tail;
			currentLastNode.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void add(int index, E data) {
		if (isEmpty() || index > size - 1) {
			add(data);
		} else {
			Node<E> newNode = new Node<E>(data, null);
			Node<E> currentNode = this.head;
			Node<E> previousNode = null;
			for (int i = 0; i <= index; i++) {
				if (i == index) {
					newNode.setNext(currentNode);
					if (previousNode != null) {
						previousNode.setNext(newNode);
					}
					size++;
					if (this.head.equals(currentNode)) {
						this.head = newNode;
					}
					if (this.tail.equals(currentNode)) {
						this.tail = newNode;
					}
					
					break;
				}
				previousNode = currentNode;
				currentNode = currentNode.getNext();
				if (currentNode == null) {
					break;
				}
			}
		}
	}
	
	public void remove(E data) {
		if (!isEmpty()) {
			Node<E> node = this.head;
			Node<E> prevNode = null;
			while (node != null) {
				if (node.getData() == data) {
					delteNode(prevNode, node);
					size--;
					break;
				}
				prevNode = node;
				node = node.getNext();
			}
		}
	}
	
	private void delteNode(Node<E> previosNode, Node<E> currentNode) {
		if (previosNode == null && !currentNode.hasNext()) {
			this.head = null;
			this.tail = null;
		} else if (previosNode == null){
			this.head = currentNode.getNext();
		} else {
			previosNode.setNext(currentNode.getNext());
		}
		if (this.tail.equals(currentNode)) {
			this.tail = previosNode;
		}
	}
	
	public void print() {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			Node<E> node = this.head;
			while(node != null) {
				System.out.print("["+node.getData()+"],");
				node = node.getNext();
			}
		}
	}
	
	public int getSize() {
		return this.size;
	}
}
