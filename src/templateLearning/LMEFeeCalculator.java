package templateLearning;
import tradeLearning.*;

public class LMEFeeCalculator extends FeeCalculator {
	double fee = 10;
	@Override
	public double calcExchangeFee(Trade trade) {
		
		return fee;
		
	}

}
