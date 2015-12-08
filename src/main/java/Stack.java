package main.java;

import java.util.Arrays;

public class Stack {
	private Integer[] theArray = null;
	private int tailleStack;

	
	public Stack(int taille) throws IllegalStateException{
		if(taille<1)
			throw new IllegalStateException("You must have more than one disk, to play !");
		
		tailleStack = taille;
		theArray = new Integer[tailleStack];
		for(int i=0; i<theArray.length; i++){
			theArray[i] = null;
		}
	}
	
	
	public boolean isFull(){
		if(getNumberOfElements() == tailleStack)
			return true;
		else 
			return false;
	}
	

	public void push(int x) throws IllegalStateException{
		
		if(isFull())
			throw new IllegalStateException("Error : Your stack is full !");
		
		for(int i=0; i<theArray.length; i++){
			if(theArray[i] == null){
				theArray[i] = x;
				break;
			}
		}
	}

	public void pop() throws IllegalStateException{
		
		if(isEmpty())
			throw new IllegalStateException("Error : Your stack is empty !");
		
		for(int i=theArray.length-1; i>=0; i--){
			if(theArray[i] != null){
				theArray[i] = null;
				break;
			}
		}
	}
	
	public int head() throws IllegalStateException{
		Integer headInt = null;
		
		if(isEmpty())
			throw new IllegalStateException("Error : Your stack is empty !");
		
		for(int i=theArray.length-1; i>=0; i--){
			if(theArray[i] != null){
				headInt = theArray[i];
				break;
			}
		}
		
		return headInt;
	}
	
	public boolean isEmpty(){
		if(getNumberOfElements() == 0)
			return true;
		else 
			return false;
	}
	
	public int getNumberOfElements(){
		int compteur = 0;
		for(int i=0; i<theArray.length; i++){
			if(theArray[i] != null)
				compteur++;
		}
		
		return compteur;
	}
	
	public Integer[] getTheArray() {
		return theArray;
	}
	
	public int getTailleStack(){
		return theArray.length;
	}
}
