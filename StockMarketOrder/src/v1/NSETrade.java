package v1;

public class NSETrade extends Trade {

	@Override
	public Object toStockExchangeFormat() {
		Object dataInNSEFormat="<trade>All data goes like this</trade>";
		return dataInNSEFormat;
	}

}
