package templateLearning;

import tradeLearning.*;
	

	public abstract class FeeCalculator {
	
		boolean validate ( Trade trade ) {
			
			if ( trade.getQuantity() >= 0 && trade.getQuantity() <= 1000) {
				return true;
			}
			else {
				return false;
			}
			
		}
		
		/*
		double calcTradeFee(Trade trade, TradeFeeCalculator userTradeFee) {
		
		TradeExecution trade1 = new TradeExecution(userTradeFee);
		return trade1.doTrade(trade);
		
	}
	*/
	
	protected abstract double calcExchangeFee(Trade trade);
	
	//
	public final double calculate(Trade trade) {
		
		if ( validate(trade)) {
			
			//double tradeFee = calcTradeFee(trade);
			
			double exchangeFee = calcExchangeFee(trade);
			
			//return (tradeFee + exchangeFee)
			return (exchangeFee);
			
			}
			
			else {
				System.out.println("Trade not validate!!!");
				return 0;
			}
		
	}

}
