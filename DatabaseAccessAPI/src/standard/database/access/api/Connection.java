package standard.database.access.api;

public interface Connection {
	
	public void close() throws DataAccessAPIException;
	public Statement createStatement() throws DataAccessAPIException;

}
