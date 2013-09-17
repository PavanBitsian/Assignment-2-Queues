import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;




public class RandomizedQueue<Item> implements Iterable<Item> {
	private ArrayList<Item> al;
	public RandomizedQueue(){
		al=new ArrayList<Item>();
	}
	
	public boolean isEmpty(){
		return al.isEmpty();
	}
	
	public int size(){
		return al.size();
	}
	
	public void enqueue(Item item){
		if(item==null)
			throw new NullPointerException("you are trying to add null object");
		al.add(item);
	}

	public Item dequeue(){
		if(al.isEmpty())
			throw new NoSuchElementException("queue is empty");
		return al.remove(StdRandom.uniform(al.size()));
		
	}
	
	public Item sample(){
		if(al.isEmpty())
			throw new NoSuchElementException("queue is empty");
		Item t=al.get(StdRandom.uniform(al.size()));
		return t;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
		
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
	   return dequeue();
	   }
	   }

	
	
}
