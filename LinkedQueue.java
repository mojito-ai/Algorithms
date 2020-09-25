package algorithms;
import java.util.Iterator;

public class LinkedQueue <Item> implements Iterable<Item> {
	
	private Node first;
	private Node last;
	
	private class Node
	{
		Item item;
		Node next;
	}
	
	public boolean isEmpty()
	{	return first==null;	}
	
	public void enqueue(Item item)
	{
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) 
			first = last;
		else 
			oldlast.next = last;
	}
	
	public Item dequeue()
	{
		Item tmp=first.item;
		first=first.next;
		if(isEmpty())
			last=null;
		return tmp;
	}
	
	 public Iterator<Item> iterator()	{ return new ListIterator(); }
	 private class ListIterator implements Iterator<Item>
	 {
		 private Node current = first;
		 
		 public boolean hasNext()	{ return current != null; }
		 public void remove() { }
		 public Item next()
		 {
			 Item item = current.item;
			 current = current.next;
			 return item;
		 }
	 }
	
	public static void main(String[] args) 
	{
		LinkedQueue <String> s=new LinkedQueue<>();
		s.enqueue("sq");
		s.enqueue("qsad");
		s.enqueue("sq");
		s.enqueue("qsd");
		System.out.println(s.dequeue());
		System.out.println(s.isEmpty());
		
		for(String x: s)
			System.out.println(x);
	}

}
