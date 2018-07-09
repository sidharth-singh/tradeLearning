package tradeLearning;

public class EliteFeeCalculator implements TradeFeeCalculator {
	
	private double fee = 1.0;
	
	@Override
	public double tradeCalculate(Trade trade) {
		return fee;
	}

}
