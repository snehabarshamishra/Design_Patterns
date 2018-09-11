package after;

import java.util.HashMap;
import java.util.Map;

import standard.database.access.api.Connection;
import standard.database.access.api.ConnectionHelper;
import standard.database.access.api.DataAccessAPIException;
import standard.database.access.api.ResultSet;
import standard.database.access.api.Statement;

public class EasyDBAccessor {
	
	public Map<Integer,Object> queryForOneRow(String sql){
		Map<Integer,Object> aRow = new HashMap<>();
		try{
			Connection c = ConnectionHelper.getConnection();
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from product");
			while(rs.next()){
				aRow.put(1,rs.getInt(1));
				aRow.put(2,rs.getString(2));
			}
			c.close();
		}catch(DataAccessAPIException e){
			e.printStackTrace();
		}
		return aRow;
	}

}
