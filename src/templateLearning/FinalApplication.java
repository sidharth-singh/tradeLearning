package templateLearning;
import tradeLearning.*;

public class FinalApplication {

	public static void main(String[] args) {
		
		Trade trade = new Trade(350);
		RuleBag rulebag = new RuleBag();
		FeeCalculator bseFee = new BSEFeeCalculator();
		FeeCalculator cmeEliteEee = new CMEEliteFeeCalculator();
		FeeCalculator cmeEee = new CMEFeeCalculator();
		FeeCalculator lmeEee = new LMEFeeCalculator();
		
		rulebag.register("BSE", "Elite",bseFee);
		rulebag.register("BSE", "Regular",bseFee);
		rulebag.register("BSE", "Normal",bseFee);
		rulebag.register("CME", "Elite", cmeEliteEee);
		rulebag.register("CME", "Regular",cmeEee);
		rulebag.register("CME", "Normal", cmeEee);
		rulebag.register("LME", "Elite", lmeEee);
		rulebag.register("LME", "Regular", lmeEee);
		rulebag.register("LME", "Normal",lmeEee);

		
		System.out.println("The total fees is USD: " + rulebag.getBag().get("BSE").get("Elite").calculate(trade));
		System.out.println("The total fees is USD: " + rulebag.getBag().get("LME").get("Normal").calculate(trade));
		System.out.println("The total fees is USD: " + rulebag.getBag().get("CME").get("Normal").calculate(trade));
		System.out.println("The total fees is USD: " + rulebag.getBag().get("CME").get("Elite").calculate(trade));
		//FeeCalculator calc1 = new BSEFeeCalculator();
		//TradeFeeCalculator tradeFee1 = new EliteFeeCalculator();
		
		/*
		FeeCalculator calc2 = new CMEEliteFeeCalculator();
		TradeFeeCalculator tradeFee2 = new EliteFeeCalculator();
		System.out.println("The total fees is USD: " + calc2.calculate(trade, tradeFee2));
		
		FeeCalculator calc3 = new LMEFeeCalculator();
		TradeFeeCalculator tradeFee3 = new EliteFeeCalculator();
		System.out.println("The total fees is USD: " + calc3.calculate(trade, tradeFee3));
		*/

	}

}

