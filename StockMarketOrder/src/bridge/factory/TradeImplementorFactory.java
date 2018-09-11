package bridge.factory;

import java.util.ResourceBundle;

import bridge.TradeImplementor;

public abstract class TradeImplementorFactory {
	
	
	public static TradeImplementorFactory newInstance(){
		TradeImplementorFactory creator = null;
		try{
			ResourceBundle rb = ResourceBundle.getBundle("config");
			String creatorClass = rb.getString("tradeImplementorFactory");
			creator = (TradeImplementorFactory) 
					Class.forName(creatorClass).newInstance();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return creator;
	}
	
	
	public abstract TradeImplementor createTradeImplementor();

}
