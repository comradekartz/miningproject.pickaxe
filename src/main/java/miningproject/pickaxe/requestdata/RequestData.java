package miningproject.pickaxe.requestdata;


public interface RequestData {
	public void getCurrenciesSummary(); 				// return type TBD, returns back the summary of all currencies
	public void getCurrencyTick(CurrencyTick tick); 	// return type TBD, returns back the requested currency latest price
	public void getCurrencyPairTick(CurrencyPair pair); //return type TBD, returns back the latest tick of currency pair
	
	
}
