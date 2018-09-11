package standard.database.access.api;


public interface Statement {

	public int executeUpdate(String sql) throws DataAccessAPIException;
	public ResultSet executeQuery(String sql) throws DataAccessAPIException;
}
