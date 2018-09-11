package before;



import collectionsapi.ArrayList;
import collectionsapi.Collection;



public class AdditionCountingArrayList extends ArrayList {
	private int count = 0;
	@Override
	public boolean add(Object o){
		count++;
		return super.add(o);
	}
	@Override
	public void addAll(Collection c){
		count += c.size();
		super.addAll(c);
	}

}
