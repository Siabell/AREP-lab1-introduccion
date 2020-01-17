package edu.escuelaing.arep;

public class Node<E> {
	
	private E element;
	private Node<E> next; 
	private Node<E> preceding; 
	
	/**
	 * Constructor de nodos
	 * @param preceding: nodo anterior
	 * @param element: elemento del nodo
	 * @param next: nodo siguiente
	 */
	public Node (Node<E> preceding, E element, Node<E> next ) {
		this.element = element;
		this.next = next;
		this.preceding = preceding;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	public Node<E> getPreceding() {
		return preceding;
	}

	public void setPreceding(Node<E> preceding) {
		this.preceding = preceding;
	}

	

	
}
