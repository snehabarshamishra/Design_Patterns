package after;

import java.util.Map;

public class Client {

	public static void main(String[] args) {
		EasyDBAccessor facade = new EasyDBAccessor();
		Map<Integer,Object> aRow = facade.queryForOneRow("select * from product where id=1");
		System.out.println(aRow.get(1));
		System.out.println(aRow.get(2));

	}

}
