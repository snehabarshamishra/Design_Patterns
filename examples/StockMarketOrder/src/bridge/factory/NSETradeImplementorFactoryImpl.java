package bridge.factory;

import bridge.NSETradeImplementor;
import bridge.TradeImplementor;

public class NSETradeImplementorFactoryImpl extends TradeImplementorFactory {

	@Override
	public TradeImplementor createTradeImplementor() {
		
		return new NSETradeImplementor();
	}

}
