package after;

import collectionsapi.Collection;



public class AdditionCountingCollection implements Collection{
	
	Collection wrappee;
	int count;
	
	
	public int getCount() {
		return count;
	}


	public AdditionCountingCollection(Collection wrappee){
		this.wrappee = wrappee;
	}


	public int size() {
		return wrappee.size();
	}


	public boolean add(Object e) {
		count++;
		return wrappee.add(e);
	}


	public boolean remove(Object o) {
		return wrappee.remove(o);
	}


	


	public void addAll(Collection c) {
		count += c.size();
		 wrappee.addAll(c);
	}


	

}
