package bridge.factory;

import bridge.BSETradeImplementor;
import bridge.TradeImplementor;

public class BSETradeImplementorFactoryImpl extends TradeImplementorFactory {

	@Override
	public TradeImplementor createTradeImplementor() {
		
		return new BSETradeImplementor();
	}

}
