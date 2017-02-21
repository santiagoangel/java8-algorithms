package io.github.santiagoangel.algorithms.model;



public class Stack<E> extends Base<E>{
	
	public void push(E e){
		getStorage().addFirst(e);
	}
	
	public E pop(){
		return getStorage().removeFirst();
		
	}
	
	
}
