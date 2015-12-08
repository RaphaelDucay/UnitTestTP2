package main.java;

public class Queue{
	private Stack stacknbr1 = null;
	private Stack stacknbr2 = null;

	public Queue(int taille){
		stacknbr1 = new Stack(taille);
		stacknbr2 = new Stack(taille);
	}
	
	public int head(){
		return stacknbr1.head();
	}
	
	public boolean isEmpty(){
		return stacknbr1.isEmpty();
	}
	
	
	public int getNumberOfElements(){
		return stacknbr1.getNumberOfElements();
	}
	
	public Integer[] getTheArray() {
		return stacknbr1.getTheArray();
	}
	
	
	public boolean isFull(){
		return stacknbr1.isFull();
	}
	
	public Stack getStackTmp() {
		return stacknbr2;
	}
	
	public void push(int x){
		if(stacknbr1.isFull())
			throw new IllegalStateException("The first stack is full !");
		
		stacknbr1.push(x);
	}

	public void pop(){
		while(!stacknbr1.isEmpty()){
			stacknbr2.push(stacknbr1.head());
			stacknbr1.pop();
		}
		
		stacknbr2.pop();
		
		while(!stacknbr2.isEmpty()){
			stacknbr1.push(stacknbr2.head());
			stacknbr2.pop();
		}
		
	}

}
