package templateLearning;
import tradeLearning.*;

public class CMEEliteFeeCalculator extends FeeCalculator {
	double fee = 1.2;
	
	@Override
	public double calcExchangeFee(Trade trade) {
		
		return fee;
		
	}

}
