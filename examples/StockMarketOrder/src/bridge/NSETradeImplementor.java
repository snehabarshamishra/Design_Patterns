package bridge;

public class NSETradeImplementor extends TradeImplementor {

	@Override
	public Object toStockExchangeFormat() {
		
		Object dataInNSEFormat="<trade>All data goes like this</trade>";
		return dataInNSEFormat;
	}

}
