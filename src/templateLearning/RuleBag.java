package templateLearning;

import java.util.HashMap;
import java.util.Map;

public class RuleBag {
	
	Map <String, Map<String , FeeCalculator>> bag = new HashMap <String, Map<String , FeeCalculator>>();
	
	public Map<String, Map<String, FeeCalculator>> getBag() {
		return bag;
	}
	public void register(String ExchangeType,String UserType , FeeCalculator calculator) {
		Map <String , FeeCalculator> mp = new HashMap <String , FeeCalculator>() ;
		
		mp.put(UserType, calculator);
		
		if(bag.get(ExchangeType) != null) {
			bag.get(ExchangeType).put(UserType, calculator);
		}
		
		else {
			bag.put(ExchangeType, mp);
		}
		//bag.put(quantity, calculator);
	}
	
}
