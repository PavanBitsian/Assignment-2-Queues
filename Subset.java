
public class Subset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=Integer.parseInt(args[0]);
		RandomizedQueue<String> obj=new RandomizedQueue<String>();
		//Deque<String> obj=new Deque<String>();
			//System.out.println(k);
		//System.out.println("enter strings");
		while (StdIn.hasNextLine() && !StdIn.isEmpty()) {
			obj.enqueue(StdIn.readString());
			
		}
		/*
		obj.enqueue("1");
		obj.enqueue("2");
		obj.enqueue("3");
		obj.enqueue("4");
		
			obj.addFirst("1");
			obj.addFirst("2");
			obj.addFirst("3");
			obj.addLast("4");
		*/
		for (int i = 0; i < k; i++) {
			/*
			if(k/2==0)
			System.out.println(obj.removeFirst());
			else System.out.println(obj.removeLast());
			*/
			System.out.println(obj.iterator().next());
		}
		
	}

}
