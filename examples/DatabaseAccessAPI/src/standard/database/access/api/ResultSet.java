package standard.database.access.api;

public interface ResultSet {
	
	public boolean next() throws DataAccessAPIException;
	public int getInt(int colIndex) throws DataAccessAPIException;
	public String getString(int colIndex) throws DataAccessAPIException;
	//and so on

}
