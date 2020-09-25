package algorithms;
import java.util.Iterator;
public class StackofStrings <Item> implements Iterable<Item> {
	
	private Node first=null;
	
	private class Node
	{
		Item item;
		Node next;
	}
	public boolean isEmpty()
	{	return first==null;}
	
	void push(Item item)
	{
		Node oldfirst=first;
		first=new Node();
		first.item=item;
		first.next=oldfirst;
	}
	public Item pop()
	{
		Item tmp=first.item;
		first=first.next;
		return tmp;
	}
	
	protected Iterator <Item> iterator() {return new ListIterator();}
	
	private class ListIterator implements Iterator<Item>
	{
		private Node current = first;
		public boolean hasNext() {return current!=null;}
		public void remove() {}
		public Item next()
		{
			Item item =current.item;
			current=current.next;
			return item;
		}
	}

	public static void main(String[] args) 
	{
		StackofStrings<Integer> s=new StackofStrings<>();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		
		for (Integer x: s)
			System.out.println(x);
	}
}
