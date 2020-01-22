package edu.escuelaing.arep;

import java.util.*;

public class LinkedListP<E> implements List<E>  {
	
    private Node<E> head; 
    private Node<E> tail; 
    public int listLenght; 
    //private List<Node<E>> nodes;

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
     * 
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
    
    /**
     * Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right.
     * @param index - index at which the specified element is to be inserted
     * @param element - element to be inserted
     * 
     */
	public void add(int index, E element) {
		if (index < 0 || index > listLenght) {
			//indice fuera del rango
		} else  {
			Node<E> newNode;
			if (index == 0) {
				newNode = new Node<E>(null, element, this.head);
				this.head.setPreceding(newNode);
				this.head = newNode;
			} else if (index == listLenght-1) {
				newNode = new Node<E>(this.tail, element, null);
				this.tail.setNext(newNode);
				this.tail = newNode;
			} else {
				Node<E> nodeElement = this.getNode(index);
				newNode = new Node<E>(nodeElement.getPreceding(), element, nodeElement);
				nodeElement.getPreceding().setNext(newNode);
				nodeElement.setPreceding(newNode);
			}
			listLenght++;
		}
	}
	
	
	/**
	 * Returns the element at the specified position in this list.
	 * @param index - index of the element to return
	 * @return the element at the specified position in this list
	 */
	public E get(int index) {
		if (index < 0 || index > listLenght) {
			//indice fuera del rango
		} else {
			Node<E> nodeElement = this.getNode(index);
			E element = (E) nodeElement.getElement();
			return element;
		}
		return null;
	}
	
	/**
	 * Returns the node of the element at the specified position in this list.
	 * @param index - index at which the specified element is to be inserted
	 * @return
	 */
	private Node<E> getNode (int index) {
		int mid = listLenght/2;
		int pos = 0;
		Node<E> indexNode;
		if (index >= mid) {
			pos = listLenght-1;
			indexNode = this.tail;
			while (pos > index) {
				indexNode=indexNode.getPreceding();
				pos-=1;
			}
			//System.out.println(pos + "pos");
			return indexNode;
		} else {
			pos = 0;
			indexNode = this.head;
			while (pos < index) {
				indexNode=indexNode.getNext();
				pos+=1;
			}
			//System.out.println(pos + "pos");
			return indexNode;
		}
		
	}
	
	/**
	 * Removes all of the elements from this list.
	 */
	public void clear() {
		this.head = null;
		this.tail = null;
		System.gc();
		
	}
	
	public <T> T[] toArray(T[] a) {
		ArrayList<T> likedArrayList = new ArrayList<T>();
		for (int i = 0; i < listLenght; i++) {
			
		}
		return null;
	}
	
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
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




	
	

}
