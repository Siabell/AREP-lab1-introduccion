package edu.escuelaing.arep;

import java.util.*;

public class LinkedListP<E> implements List<E>  {
	
    private Node<E> head; 
    private Node<E> tail; 
    private int listLenght; 
    private List<Node<E>> nodes;

    /**
     * Construct an empty Linkedlist
     */
	public LinkedListP() {
    	//this.nodes = new ArrayList<Node>();
    	this.listLenght = 0;
    }
    
    /**
     * 
     * @param n
     */
    public LinkedListP (E Newcollection ) {
    	//
    }

    /**
     * Appends the specified element to the end of this list.
     */
    public boolean add (E objToAdd) {
    	Node<E> newNode;
    	if (listLenght==0) {
    		newNode = new Node<E>(null, objToAdd, null); 
    		this.head = newNode;
    		this.tail = newNode;
    		listLenght++;
    		
    	} else {
    		newNode = new Node<E>(this.tail,objToAdd,null); 
    		this.tail.setNext(newNode);
    		this.tail = newNode;
    		listLenght++;    		
    	}
    	return true;
    }

	public void add(int index, E element) {
		int mid = listLenght/2;
		
		//if ()
		
	}

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
