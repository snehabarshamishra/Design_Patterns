package before;

import standard.database.access.api.Connection;
import standard.database.access.api.ConnectionHelper;
import standard.database.access.api.DataAccessAPIException;
import standard.database.access.api.ResultSet;
import standard.database.access.api.Statement;

public class Client {

	public static void main(String[] args) {
		try{
			Connection c = ConnectionHelper.getConnection();
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from product");
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			c.close();
		}catch(DataAccessAPIException e){
			e.printStackTrace();
		}
	}

}
