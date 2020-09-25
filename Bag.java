package algorithms;
import java.util.Iterator;
public class Bag <Item> implements Iterable<Item> {
	
	private Node pointer;
	private int count=0;
	
	private class Node
	{
		Item item;
		Node next;
	}
	
	public void add(Item x)
	{
		Node oldpoint=pointer;
		Node pointer = new Node();
		pointer.item=x;
		pointer.next=oldpoint;
		count++;
	}
	
	public int size()
	{	return count;	}
	
	public Iterator<Item> iterator()	{	return new ListIterator();	}
	
	private class ListIterator implements Iterator<Item>
	{
		private Node current = pointer;
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
		Bag <Integer> bag=new Bag<>();
		bag.add(1);
		bag.add(2);
		bag.add(3);
		bag.add(4);
		bag.add(5);
		for(Integer a:	bag)
			System.out.println(a);
	}
}
