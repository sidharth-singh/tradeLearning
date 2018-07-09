package templateLearning;
import tradeLearning.*;

public class CMEFeeCalculator extends FeeCalculator {
	double fee = 2;
	
	@Override
	public double calcExchangeFee(Trade trade) {
		
		return fee;
		
	}

}
