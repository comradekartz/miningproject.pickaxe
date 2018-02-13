package miningproject.pickaxe;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONObject;

public class RequestJSON {
	private String url;
	private JSONObject json;
	
	public RequestJSON(String url) {
		this.url=url;
	}
	
	public void requestData() throws IOException {
		URL url = new URL(this.url);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("GET");
		
		System.out.println("connecting to bitrex api...");
		
		System.out.println("responsecode from bitrex: " + con.getResponseCode());
		if (con.getResponseCode()==200) {
			con.connect();
			System.out.println(con.getContentType());
			
			
			con.disconnect();
		}
		
	}

	public JSONObject getJSON() {
		return json;
	}
}
