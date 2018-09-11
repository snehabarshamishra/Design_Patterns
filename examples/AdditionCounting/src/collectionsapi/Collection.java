package collectionsapi;

public interface Collection {
	
	public int size();
	public boolean add(Object o);
	public void addAll(Collection c);
	public boolean remove(Object o);

}
