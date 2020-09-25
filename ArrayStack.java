package algorithms;

import java.util.Iterator;

public class ArrayStack <Item> implements Iterable<Item>{
	
	private int N=0;
	private Object [] arr;
/*
 * The one where you need to the know the size of array before hand	
	ArrayStack(int n)
	{this.arr= (Item[]) new Object[n];}
*/	
	public ArrayStack()
	{this.arr= (Item[]) new Object[1];}
	
	public boolean isEmpty()
	{	return N==0; }
	
	//Double the array when full
	public void push(Item item)
	{	
		if(N==arr.length)
			resize(2*arr.length);
		arr[N++]=item;	
	}
	
	//Half the array when 75% empty
	public Item pop()
	{	
		Item item = (Item) arr[--N]; 
		arr[N]=null;
		if(N>0 && N==arr.length/4)	
			resize(arr.length/2);
		return item;
	} 
	
	private void resize(int capacity)
	{
		Object copy[]=new Object[capacity];
		for(int i=0;i<N;i++)
			copy[i]=arr[i];
		arr=copy;
	}
	
	public Iterator<Item> iterator() {return new ReverseArrayIterator();}
	
	private class ReverseArrayIterator implements Iterator<Item> 
	{
		private int i=N;
		public boolean hasNext() {return i>0;}
		public void remove() { 	}
		public Item next() 	{return (Item)arr[--i];}
	}
	
	public static void main(String[] args) 
	{
		ArrayStack<String> s=new ArrayStack<>();
		s.push("2");
		s.push("3");
		s.push("2");
		s.push("2");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		for (String x: s)
			System.out.println(x);
	}

}
