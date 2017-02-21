package io.github.santiagoangel.algorithms.model;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Base<E> implements Iterable<E>{
	
	private ArrayDeque<E> storage;
	
	
	
	public Base() {
		storage= new ArrayDeque<E>();
	}

	
	
	public boolean isEmpty(){
		return storage.isEmpty();
		
	}
	
	public int size(){
		return storage.size();
		
	}

	
	public Iterator<E> iterator() {
		return storage.iterator();
	}



	public ArrayDeque<E> getStorage() {
		return storage;
	}



	public void setStorage(ArrayDeque<E> storage) {
		this.storage = storage;
	}

			

}
