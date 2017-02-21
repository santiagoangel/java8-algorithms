package io.github.santiagoangel.algorithms.model;

public class Queue<E> extends Base<E>{
	
public void enqueue(E e){
	getStorage().addLast(e);
}

public E dequeue(){
	return getStorage().removeFirst();
}

}
