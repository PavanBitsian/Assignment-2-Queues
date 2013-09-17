import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;


public class Deque<Item> implements Iterable<Item> {

	private List<Item> al;
	public Deque(){
		al=new LinkedList<Item>();
	}
	
	public boolean isEmpty(){
		return al.isEmpty();
	}
	
	public int size(){
		return al.size();
	}

	public void addFirst(Item item){
		if(item==null)
			throw new NullPointerException("you are trying to add null object");
		al.add(0, item);
	}
	
	public void addLast(Item item){
		if(item==null)
			throw new NullPointerException("you are trying to add null object");
		al.add(item);
	}
	
	public Item removeFirst(){
		if(al.isEmpty())
			throw new NoSuchElementException("deque is empty");
		Item t=al.get(0);
		al.remove(0);
		return t;
	}
	
	public Item removeLast(){
		if(al.isEmpty())
			throw new NoSuchElementException("deque is empty");
		Item t=al.get(al.size()-1);
		al.remove(al.size()-1);
		return t;
	}
	
	public Iterator<Item> iterator(){
		
		return new ListIterator();  // return an iterator over items in order from front to end
	   }
	private class ListIterator implements Iterator<Item>
	   {
	   //int index=0;
	
	   public boolean hasNext() { 
		   return !al.isEmpty(); 
		  }
	   
	   public void remove() { 
		   throw new UnsupportedOperationException("remove method is not supported");/* not supported */ }
	   
	   public Item next()
	   {
		   if(al.isEmpty())
			throw new NoSuchElementException("deque is empty");
	      
	   //Item item = al.get(index++);
	   return removeFirst();
	   }
	   }
	
	
	
}
