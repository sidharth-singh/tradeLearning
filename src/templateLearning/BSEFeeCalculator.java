package templateLearning;
import tradeLearning.*;

public class BSEFeeCalculator extends FeeCalculator {
	double fee = 0.0;
	
	@Override
	public double calcExchangeFee(Trade trade) {
		
		int quantity = trade.getQuantity();
		
		if (quantity <= 100) {
			fee = 0.2 * quantity;
		}
		else {
			fee = 0.18 * quantity;
		}
		
		return fee;
		
	}
}
