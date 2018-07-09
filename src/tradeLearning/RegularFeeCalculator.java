package tradeLearning;

public class RegularFeeCalculator implements TradeFeeCalculator {
	
	private double fee = 0.0;
	
	@Override
	public double tradeCalculate( Trade trade ) {
		this.fee = trade.getQuantity() * 0.1;
		return this.fee;
	}

}
