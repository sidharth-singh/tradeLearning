package tradeLearning;

public class TradeExecution {
	
	private TradeFeeCalculator feeCalculator;
	
	public TradeExecution (TradeFeeCalculator feeCalculator) {
		this.feeCalculator = feeCalculator;
	}
	
	public double doTrade (Trade trade) {
		return feeCalculator.tradeCalculate( trade );
	}

}
