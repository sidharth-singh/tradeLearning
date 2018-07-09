package tradeLearning;

public class Application {

	public static void main(String[] args) {
		Trade trade = new Trade(150);
		//trade.setQuantity(150);
		
		TradeExecution tradeExecution1 = new TradeExecution(new RegularFeeCalculator());
		System.out.println("The fees on the trade is: " + tradeExecution1.doTrade(trade));
		
		TradeExecution tradeExecution2 = new TradeExecution(new EliteFeeCalculator());
		System.out.println("The fees on the trade is: " + tradeExecution2.doTrade(trade));
		
		TradeExecution tradeExecution3 = new TradeExecution(new PrimeFeeCalculator());
		System.out.println("The fees on the trade is: " + tradeExecution3.doTrade(trade));

	}

}
