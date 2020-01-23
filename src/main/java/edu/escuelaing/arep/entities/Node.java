package edu.escuelaing.arep.entities;

public class Node<T> {
	
	private T element;
	private Node<T> next; 
	private Node<T> preceding; 
	
	/**
	 * Constructor de nodos
	 * @param preceding: nodo anterior
	 * @param element: elemento del nodo
	 * @param next: nodo siguiente
	 */
	public Node (Node<T> preceding, T element, Node<T> next ) {
		this.element = element;
		this.next = next;
		this.preceding = preceding;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPreceding() {
		return preceding;
	}

	public void setPreceding(Node<T> preceding) {
		this.preceding = preceding;
	}

	

	
}
