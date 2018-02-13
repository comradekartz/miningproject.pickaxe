package miningproject.pickaxe;

import java.io.IOException;

import org.json.JSONObject;

public class App {
    public static void main( String[] args ){
    	
    	RequestJSON reqJson = new RequestJSON("https://bittrex.com/api/v1.1/public/getmarketsummary?market=btc-ltc");
    	
    	try {
			reqJson.requestData();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	System.out.println();
    	
    	
    }
}
