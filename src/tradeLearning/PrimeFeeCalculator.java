package tradeLearning;

public class PrimeFeeCalculator implements TradeFeeCalculator {
	
	private double fee = 1.2;
	
	@Override
	public double tradeCalculate(Trade trade) {
		return fee;
	}

}
